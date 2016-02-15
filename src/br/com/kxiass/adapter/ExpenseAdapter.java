package br.com.kxiass.adapter;

import br.com.kxiass.activities.MainApp;
import br.com.kxiass.model.Expense;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import org.kairos.components.RippleViewRow;
import org.kairos.layouts.RecyclerView;

import java.time.format.DateTimeFormatter;

public class ExpenseAdapter extends RecyclerView.Adapter<ExpenseAdapter.Holder> {

    @Override
    public Holder onCreateViewHolder(FXMLLoader fxmlLoader) {

        fxmlLoader.setLocation(MainApp.class.getResource("/resources/expenses_item_row.fxml"));
        return new Holder(fxmlLoader);
    }

    @Override
    public RecyclerView.ViewRow call(ListView param) {
        return new RippleViewRow(this);
    }

    @Override
    public void onBindViewHolder(Holder holder, Object object) {

        Expense item = (Expense) object;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String stringDate = item.getDate().format(formatter);

        holder.description.setText(item.getDescription());
        holder.locale.setText(item.getLocale());
        holder.value.setText(String.valueOf(item.getValue()));
        holder.date.setText(stringDate);
    }

    public static class Holder extends RecyclerView.ViewHolder {

        @FXML
        Label description;

        @FXML
        Label locale;

        @FXML
        Label value;

        @FXML
        Label date;

        public Holder(FXMLLoader loader) {
            super(loader);
        }
    }
}

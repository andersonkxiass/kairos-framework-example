package br.com.kxiass.adapter;

import br.com.kxiass.activities.MainApp;
import br.com.kxiass.model.Items;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import org.kairos.components.RippleViewRow;
import org.kairos.layouts.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    @Override
    public Holder onCreateViewHolder(FXMLLoader fxmlLoader) {

        fxmlLoader.setLocation(MainApp.class.getResource("/resources/item_row.fxml"));
        return new Holder(fxmlLoader);
    }

    @Override
    public RecyclerView.ViewRow call(ListView param) {
        return new RippleViewRow(this);
    }

    @Override
    public void onBindViewHolder(Holder holder, Object object) {

        Items item = (Items) object;
        holder.title.setText(item.getTitle());
    }

    public static class Holder extends RecyclerView.ViewHolder {

        @FXML
        Label title;

        public Holder(FXMLLoader loader) {
            super(loader);
        }
    }
}

package br.com.kxiass.fragments;

import br.com.kxiass.model.Expense;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableView;
import org.kairos.core.Fragment;

import java.io.IOException;
import java.time.LocalDate;

public class ListExpenses extends Fragment {

    @FXML
    TableView expensesList;

    private ObservableList<Expense> personData = FXCollections.observableArrayList();

    @Override
    public void onCreateView(FXMLLoader fxmlLoader) {
        fxmlLoader.setLocation(getClass().getResource("/resources/frag_dispenses.fxml"));
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        personData.add(new Expense("movies", "Shopping", 100.0f, LocalDate.of(2016, 2, 15)));
        personData.add(new Expense("movies", "Shopping", 200.0f, LocalDate.of(2016, 2, 5)));
        personData.add(new Expense("movies", "Shopping", 40.0f, LocalDate.of(2016, 2, 4)));
        personData.add(new Expense("movies", "Shopping", 600.0f, LocalDate.of(2016, 2, 8)));
        personData.add(new Expense("movies", "Shopping", 60.0f, LocalDate.of(2016, 2, 25)));
        personData.add(new Expense("movies", "Shopping", 50.0f, LocalDate.of(2016, 2, 19)));

        expensesList.setItems(getExpenses());

        expensesList.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }

    private ObservableList<Expense> getExpenses(){
        return personData;
    }
}

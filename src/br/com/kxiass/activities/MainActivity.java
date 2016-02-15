package br.com.kxiass.activities;

import br.com.kxiass.adapter.Adapter;
import br.com.kxiass.fragments.AddDispense;
import br.com.kxiass.fragments.ListExpenses;
import br.com.kxiass.model.Items;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import org.kairos.ActionBarDrawerToggle;
import org.kairos.Toolbar;
import org.kairos.core.Activity;
import org.kairos.core.Fragment;
import org.kairos.core.FragmentTransaction;
import org.kairos.layouts.DrawerLayout;
import org.kairos.layouts.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andersonacs on 13/02/16.
 */
public class MainActivity extends Activity {

    @FXML
    Toolbar toolbar;

    @FXML
    DrawerLayout drawer;

    @FXML
    RecyclerView<Items> items;

    @Override
    public void onCreate() {
        super.onCreate();
        setContentView(getClass().getResource("/resources/main_activity.fxml"));

        toolbar.setDisplayShowHomeEnabled(true);
        toolbar.setTitle("My APP");

        setActionBar(toolbar);

        drawer.setDrawerListener(new ActionBarDrawerToggle(this, drawer, toolbar));

        drawer.closeDrawer();

        Adapter adapter = new Adapter();
        items.setAdapter(adapter);

        ObservableList<Items> listItems = FXCollections.observableArrayList(getItems());
        items.getItems().addAll(listItems);

        items.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue)->{

            FragmentTransaction transaction = getFragmentManager().beginTransaction();

            try {

                Fragment fragment = (Fragment)newValue.getFragment().newInstance();
                transaction.replace("content", fragment);
                transaction.commit();

                toolbar.setTitle(newValue.getTitle());
                drawer.closeDrawer();

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }

    private List<Items> getItems(){

        List<Items> items = new ArrayList<>();
        items.add(new Items("Expenses", ListExpenses.class));

        return items;
    }
}
package br.com.kxiass.fragments;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import org.kairos.core.Fragment;

import java.io.IOException;

public class AddDispense extends Fragment {

    @FXML
    Label label;

    @Override
    public void onCreateView(FXMLLoader fxmlLoader) {
        fxmlLoader.setLocation(getClass().getResource("/resources/frag_dispenses.fxml"));
        try {

            fxmlLoader.load();
            label.setText("Teste 1");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

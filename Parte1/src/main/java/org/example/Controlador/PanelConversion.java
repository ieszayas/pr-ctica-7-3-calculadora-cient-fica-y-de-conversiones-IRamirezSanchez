package org.example.Controlador;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class PanelConversion implements Initializable {


    @FXML
    private Label label_model;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cargarLabel();
    }

    private void cargarLabel(){

        label_model.setText("USD: Dólar estadounidense - Estados Unidos\n" +
                "GBP: Libra esterlina - Reino Unido.\n" +
                "AUD: Dólar australiano - Australia.\n" +
                "CAD: Dólar canadiense - Canadá.\n" +
                "CHF: Franco suizo - Suiza.\n" +
                "CNY: Yuan chino - República Popular China.\n" +
                "SEK: Corona sueca - Suecia.\n" +
                "NZD: Dólar neozelandés - Nueva Zelanda.\n" +
                "NOK: Corona noruega - Noruega.\n" +
                "SGD: Dólar de Singapur - Singapur.\n" +
                "MXN: Peso mexicano - México.\n" +
                "BRL: Real brasileño - Brasil.\n" +
                "ZAR: Rand sudafricano - Sudáfrica.\n" +
                "HKD: Dólar de Hong Kong - Hong Kong.\n" +
                "DKK: Corona danesa - Dinamarca.");
    }

}
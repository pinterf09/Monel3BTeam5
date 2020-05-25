package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class DetailAktivitaetenController {

    @FXML
    private AnchorPane rootpane;
    @FXML
    private DatePicker dp_datum;
    @FXML
    private TextField tf_startzeit;
    @FXML
    private TextField tf_endzeit;
    @FXML
    private TextField tf_jahr_monat;
    @FXML
    private TextField tf_bezeichnung;
    @FXML
    private TextField tf_stundensatz;
    @FXML
    private TextField tf_fahrtkosten;
    @FXML
    private Text l_header;
    @FXML
    private Button bt_exit;
    @FXML
    private TextArea ta_klient;
    @FXML
    private TextArea ta_mitarbeiter;

    @FXML
    public void exit(ActionEvent event) throws IOException {
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("Aktivitaeten.fxml"));
    	rootpane.getChildren().setAll(pane);
    }

}

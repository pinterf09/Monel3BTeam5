package application;

import java.io.IOException;

import data.Klient;
import data.Mitarbeiter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class AddAktivitaetenController {

	@FXML
    private AnchorPane Klient_APane;
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
    private ComboBox<Klient> cb_klient1;
    @FXML
    private ComboBox<Klient> cb_klient2;
    @FXML
    private ComboBox<Klient> cb_klient3;
    @FXML
    private ComboBox<Klient> cb_klient4;
    @FXML
    private ComboBox<Klient> cb_klient5;
    @FXML
    private ComboBox<Mitarbeiter> cb_mitarbeiter1;
    @FXML
    private ComboBox<Mitarbeiter> cb_mitarbeiter2;
    @FXML
    private ComboBox<Mitarbeiter> cb_mitarbeiter3;
    @FXML
    private ComboBox<Mitarbeiter> cb_mitarbeiter4;
    @FXML
    private Text l_header;
    @FXML
    private Button bt_exit;
    @FXML
    private Button bt_save;
    @FXML
    private Button bt_addKlient;
    @FXML
    private Button bt_addMitarbeiter;

    @FXML
    public void exit(ActionEvent event) throws IOException {
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("Aktivitaet.fxml"));
        Klient_APane.getChildren().setAll(pane);	
    }

    @FXML
    public void save(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Aktivitaet.fxml"));
        	Klient_APane.getChildren().setAll(pane);
        	
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    
    @FXML
    public void addKlient (ActionEvent event) throws IOException {
    	
    }
    
    @FXML
    public void addMitarbeiter (ActionEvent event) throws IOException {
    	
    }
}

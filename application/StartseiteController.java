package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class StartseiteController {
	
	@FXML
    private AnchorPane rootPane;
    @FXML
    private Button bt_klienten;
    @FXML
    private Button bt_mitarbeiter;
    @FXML
    private Button bt_sponsoren;
    @FXML
    private Button bt_aktivitaet;
    @FXML
    private Button bt_gruppensetting;
    
    
    @FXML
    public void toEinzelsetting(ActionEvent event) {

    }

    @FXML
    public void toGruppensetting(ActionEvent event) {

    }

    @FXML
    public void toKlienten(ActionEvent event) throws IOException {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Klient.fxml"));
        	rootPane.getChildren().setAll(pane);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    }

    @FXML
    public void toMitarbeiter(ActionEvent event) throws IOException {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Mitarbeiter.fxml"));
        	rootPane.getChildren().setAll(pane);
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    }
    
    public void toAktivitaet(ActionEvent event) throws IOException {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Aktivitaet.fxml"));
        	rootPane.getChildren().setAll(pane);
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @FXML
    public void toSponsoren(ActionEvent event) {
    	
    }

}

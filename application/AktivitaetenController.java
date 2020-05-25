package application;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import data.Aktivitaet;
import data.AktivitaetDAO;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class AktivitaetenController implements javafx.fxml.Initializable {

    @FXML
    private AnchorPane Klient_APane;
    @FXML
    private Pane p_statusline;
    @FXML
    private Button bt_klienten;
    @FXML
    private Button bt_mitarbeiter;
    @FXML
    private Button bt_sponsoren;
    @FXML
    private Button bt_einzelsetting;
    @FXML
    private TableView<Aktivitaet> tv_aktivitaet;
    @FXML
    private TableColumn<Aktivitaet, LocalDate> tc_datum;
    @FXML
    private TableColumn<Aktivitaet, String> tc_startzeit;
    @FXML
    private TableColumn<Aktivitaet, String> tc_endzeit;
    @FXML
    private TableColumn<Aktivitaet, String> tc_monat_jahr;
    @FXML
    private TableColumn<Aktivitaet, String> tc_aktivitaetsbezeichnung;
    @FXML
    private Button bt_display;
    @FXML
    private Button bt_add;
    @FXML
    private Button bt_delete;
    @FXML
    private Button bt_details;
    @FXML
    private Button bt_edit;

    
    @FXML
    public void add(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("AddAktivitaeten.fxml"));
        	Klient_APane.getChildren().setAll(pane);
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @FXML
    public void delete(ActionEvent event) {
    	tv_aktivitaet.getItems().removeAll(tv_aktivitaet.getSelectionModel().getSelectedItem());
    }

    @FXML
    public void details(ActionEvent event) throws IOException {
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("DetailAktivitaeten.fxml"));
    	Klient_APane.getChildren().setAll(pane);
    }
    
    @FXML
    public void edit(ActionEvent event) throws IOException {
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("EditAktivitaeten.fxml"));
    	Klient_APane.getChildren().setAll(pane);
    }

    @FXML
    public void display(ActionEvent event) {
    	tv_aktivitaet.getItems().clear();
    	tv_aktivitaet.getItems().addAll(AktivitaetDAO.getInstance().getData());
    }

    @FXML
    void toEinzelsetting(ActionEvent event) {

    }

    @FXML
    void toMitarbeiter(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Mitarbeiter.fxml"));
        	Klient_APane.getChildren().setAll(pane);
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    
    @FXML
    void toKlient(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Klient.fxml"));
        	Klient_APane.getChildren().setAll(pane);
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @FXML
    void toSponsoren(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Startseite.fxml"));
        	Klient_APane.getChildren().setAll(pane);
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			tc_datum.setCellValueFactory(new PropertyValueFactory<Aktivitaet,LocalDate>("datum"));
			tc_startzeit.setCellValueFactory(new PropertyValueFactory<Aktivitaet,String>("startzeit"));
			tc_endzeit.setCellValueFactory(new PropertyValueFactory<Aktivitaet,String>("endzeit"));
			tc_monat_jahr.setCellValueFactory(new PropertyValueFactory<Aktivitaet,String>("Jahr_Monat"));
			tc_aktivitaetsbezeichnung.setCellValueFactory(new PropertyValueFactory<Aktivitaet, String>("aktivitaetsbezeichnung"));
			
			tv_aktivitaet.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
			tv_aktivitaet.getSelectionModel().setCellSelectionEnabled(true);
			tv_aktivitaet.getSelectionModel().selectedItemProperty().addListener(
					(ChangeListener<? super Aktivitaet>)new ChangeListener<Aktivitaet>() {

						@Override
						public void changed(ObservableValue<? extends Aktivitaet> arg0, Aktivitaet arg1,
								Aktivitaet arg2) {
														
						}
				
			});
	}
    
    

}


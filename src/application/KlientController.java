package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

import data_layer.Klient;
import data_layer.KlientDAO;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.ComboBox;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;


public class KlientController implements javafx.fxml.Initializable {
	@FXML
	private TableView<Klient> tv_Klient;
	@FXML
	private TableColumn<Klient, Integer> tc_pid;
	@FXML
	private TableColumn<Klient, String> tc_anrede;
	@FXML
	private TableColumn<Klient, String> tc_titel;
	@FXML
	private TableColumn<Klient, String> tc_vorname;
	@FXML
	private TableColumn<Klient, String> tc_nachname;
	@FXML
	private TableColumn<Klient, String> tc_straße_hausnr;
	@FXML
	private TableColumn<Klient, Integer> tc_platz;
	@FXML
	private TableColumn<Klient, String> tc_ort;
	@FXML
	private TableColumn<Klient, String> tc_telefonnummer;
	@FXML
	private TableColumn<Klient, String> tc_email;
	@FXML
	private TableColumn<Klient, String> tc_personentyp;
	@FXML
	private TableColumn<Klient, String> tc_svnr;
	@FXML
	private TableColumn<Klient, String> tc_diagnose;
	@FXML
	private TableColumn<Klient, String> tc_beschaeftigung;
	@FXML
	private TableColumn<Klient, String> tc_sonstiges;
	@FXML
	private TableColumn<Klient, String> tc_allergien;
	@FXML
	private ComboBox<String> cb_anrede;
	@FXML
	private TextField tf_titel;
	@FXML
	private TextField tf_vorname;
	@FXML
	private TextField tf_nachname;
	@FXML
	private TextField tf_straße_hausnr;
	@FXML
	private TextField tf_telefonnummer;
	@FXML
	private TextField tf_email;
	@FXML
	private TextField tf_personentyp;
	@FXML
	private TextField tf_svnr;
	@FXML
	private TextField tf_diagnose;
	@FXML
	private TextField tf_beschäftigung;
	@FXML
	private TextField tf_sonstiges;
	@FXML
	private TextField tf_allergien;
	 @FXML
	private TextField tf_plz;
	 @FXML
	private TextField tf_ort;
	@FXML
	private Label l_statusline;
	@FXML
	private Button bt_anzeigen;
	@FXML
	private Button neu;
	@FXML
	private Button bt_details;
	@FXML
	private Button bt_hinzufügen;
	@FXML
	private Button bt_löschen;
	
	private KlientDAO kdao = KlientDAO.getInstance();

	private ObservableList<String> anreden = null;
	
	
	
	@FXML
	public void anzeigenButton(ActionEvent event) {
		
		tv_Klient.getItems().clear();
		tv_Klient.getItems().addAll(kdao.getData());
		
		
		l_statusline.setText("Klienten werden angezeigt");
	}

	@FXML
	public void neuButton(ActionEvent event) {
		cb_anrede.setValue(null);
		tf_titel.setText(null);
		tf_vorname.setText(null);
		tf_nachname.setText(null);
		tf_straße_hausnr.setText(null);
		tf_plz.setText(null);
		tf_ort.setText(null);
		tf_telefonnummer.setText(null);
		tf_email.setText(null);
		tf_personentyp.setText(null);
		tf_svnr.setText(null);
		tf_diagnose.setText(null);
		tf_beschäftigung.setText(null);
		tf_sonstiges.setText(null);
		tf_allergien.setText(null);
	}
	
	@FXML
	public void detailsButton(ActionEvent event) {
		l_statusline.setText("Detailbutton wurde gedrueckt");
	}
	
	@FXML
	public void hinzufügenButton(ActionEvent event) {
		
		
		Klient k = new Klient (cb_anrede.valueProperty().get(),
							   tf_titel.textProperty().get(),
							   tf_vorname.textProperty().get(),
							   tf_nachname.textProperty().get(),
							   tf_straße_hausnr.textProperty().get(),
							   tf_plz.textProperty().get(),
							   tf_ort.textProperty().get(),
							   tf_telefonnummer.textProperty().get(),
							   tf_email.textProperty().get(),
							   tf_personentyp.textProperty().get(),
							   tf_svnr.textProperty().get(),
							   tf_diagnose.textProperty().get(),
							   tf_beschäftigung.textProperty().get(),
							   tf_sonstiges.textProperty().get(),
							   tf_allergien.textProperty().get()
							   );
		
		tv_Klient.getItems().clear();
		tv_Klient.getItems().addAll(kdao.getData());
		tv_Klient.getItems().add(k);
		l_statusline.setText("Klient hinzugefuegt");
		
		

		//Hinzufï¿½gen zur Datenbank???
	}

	@FXML
	public void löschenButton(ActionEvent event) {
		
		
		tv_Klient.getItems().removeAll(tv_Klient.getSelectionModel().getSelectedItem());
		l_statusline.setText("Klient wurde geloescht");
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		tc_pid.setCellValueFactory(new PropertyValueFactory <Klient, Integer>("pid"));
		tc_anrede.setCellValueFactory(new PropertyValueFactory <Klient, String>("anrede"));
		tc_titel.setCellValueFactory(new PropertyValueFactory <Klient, String>("titel"));
		tc_vorname.setCellValueFactory(new PropertyValueFactory<Klient,String>("vorname"));
		tc_nachname.setCellValueFactory(new PropertyValueFactory<Klient,String>("nachname"));
		tc_straße_hausnr.setCellValueFactory(new PropertyValueFactory <Klient, String> ("straße_hausnr"));
		tc_platz.setCellValueFactory(new PropertyValueFactory <Klient, Integer> ("PLZ"));
		tc_ort.setCellValueFactory(new PropertyValueFactory <Klient, String> ("ort"));
		tc_telefonnummer.setCellValueFactory(new PropertyValueFactory <Klient, String> ("telefonnummer"));
		tc_email.setCellValueFactory(new PropertyValueFactory <Klient, String> ("email"));
		tc_personentyp.setCellValueFactory(new PropertyValueFactory <Klient, String> ("personentyp"));
		tc_svnr.setCellValueFactory(new PropertyValueFactory <Klient, String> ("svnr"));
		tc_diagnose.setCellValueFactory(new PropertyValueFactory <Klient, String>("diagnose"));
		tc_beschaeftigung.setCellValueFactory(new PropertyValueFactory <Klient, String> ("beschaeftigung"));
		tc_sonstiges.setCellValueFactory(new PropertyValueFactory <Klient, String> ("sonstiges"));
		tc_allergien.setCellValueFactory(new PropertyValueFactory <Klient, String> ("allergien"));
		
		tv_Klient.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		tv_Klient.getSelectionModel().setCellSelectionEnabled(true);
		tv_Klient.getSelectionModel().selectedItemProperty().addListener(
				(ChangeListener<? super Klient>)new ChangeListener<Klient>() {

					@Override
					public void changed(ObservableValue<? extends Klient> obs, Klient oldK, Klient newK) {
						l_statusline.setText("Klient mit der ID: " + newK.pidProperty().getValue() + " wurde ausgewaehlt");
						
						cb_anrede.valueProperty().bindBidirectional(newK.anredeProperty());		
						tf_titel.textProperty().bindBidirectional(newK.titelProperty());
						tf_vorname.textProperty().bindBidirectional(newK.vornameProperty());
						tf_nachname.textProperty().bindBidirectional(newK.nachnameProperty());
						tf_straße_hausnr.textProperty().bindBidirectional(newK.straße_hausnrProperty());
						tf_telefonnummer.textProperty().bindBidirectional(newK.telefonnummerProperty());
						tf_email.textProperty().bindBidirectional(newK.emailProperty());
						tf_personentyp.textProperty().bindBidirectional(newK.personentypProperty());
						tf_svnr.textProperty().bindBidirectional(newK.svnrProperty());
						tf_diagnose.textProperty().bindBidirectional(newK.diagnoseProperty());
						tf_beschäftigung.textProperty().bindBidirectional(newK.beschaeftigungProperty());
						tf_sonstiges.textProperty().bindBidirectional(newK.sonstigesProperty());
						tf_allergien.textProperty().bindBidirectional(newK.allergienProperty());
						
					}
					
				});
		
		anreden = (ObservableList<String>) FXCollections.observableArrayList(kdao.getAnrede());
		cb_anrede.getItems().addAll(anreden);
	}
}

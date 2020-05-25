package application;

import java.awt.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import data.Klient;
import data.KlientDAO;
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

public class KlientController implements javafx.fxml.Initializable {
	
	@FXML
    private AnchorPane Klient_APane;
	@FXML
	private TableView<Klient> tv_klient;
    @FXML
    private Button bt_klienten;
    @FXML
    private Button bt_mitarbeiter;
    @FXML
    private Button bt_sponsoren;
    @FXML
    private Button bt_einzelsetting;
    @FXML
    private Button bt_gruppensetting;
    @FXML
    private Pane p_statusline;
    @FXML
    private Label l_statusline_Klient;
    @FXML
    private TableColumn<Klient, String> tc_anrede;
    @FXML
    private TableColumn<Klient, String> tc_vorname;
    @FXML
    private TableColumn<Klient, String> tc_nachname;
    @FXML
    private TableColumn<Klient, String> tc_ort;
    @FXML
    private TableColumn<Klient, String> tc_plz;
    @FXML
    private TableColumn<Klient, String> tc_diagnose;
    @FXML
    private TableColumn<Klient, String> tc_allergien;
    @FXML
    private TableColumn<Klient, String> tc_datenschutz;
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

    
    private KlientDAO kdao = KlientDAO.getInstance();
    
    @SuppressWarnings("unused")
	private ArrayList<Klient> nodummies = new ArrayList<Klient>();
    
    
    @FXML
    public void add(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("AddKlient.fxml"));
        	Klient_APane.getChildren().setAll(pane);
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @FXML
    public void delete(ActionEvent event) {
    	tv_klient.getItems().removeAll(tv_klient.getSelectionModel().getSelectedItem());
    //	l_statusline_Klient.setText("Klient wurde geloescht");
    }

    @FXML
    public void details(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("DetailsKlient.fxml"));
        	Klient_APane.getChildren().setAll(pane);
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @FXML
    public void display(ActionEvent event) {
    	tv_klient.getItems().clear();
		tv_klient.getItems().addAll(kdao.getData());
		
		
	//	l_statusline_Klient.setText("Klienten werden in der Tabelle angezeigt");
    }

    @FXML
    public void toEinzelsetting(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Aktivitaet.fxml"));
    		Klient_APane.getChildren().setAll(pane);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @FXML
    public void toGruppensetting(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Aktivitaet.fxml"));
    		Klient_APane.getChildren().setAll(pane);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @FXML
    public void toMitarbeiter(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Mitarbeiter.fxml"));
        	Klient_APane.getChildren().setAll(pane);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @FXML
    public void toSponsoren(ActionEvent event) {}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		tc_anrede.setCellValueFactory(new PropertyValueFactory <Klient, String>("anrede"));
		tc_vorname.setCellValueFactory(new PropertyValueFactory<Klient,String>("vorname"));
		tc_nachname.setCellValueFactory(new PropertyValueFactory<Klient,String>("nachname"));
		tc_ort.setCellValueFactory(new PropertyValueFactory <Klient, String> ("ort"));
		tc_diagnose.setCellValueFactory(new PropertyValueFactory <Klient, String>("diagnose"));
		tc_allergien.setCellValueFactory(new PropertyValueFactory <Klient, String> ("allergien"));
		tc_plz.setCellValueFactory(new PropertyValueFactory<Klient,String>("PLZ"));
	  //tc_datenschutz.setCellValueFactory(new PropertyValueFactory<Klient,String>("Datenschutz"));
		tv_klient.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		tv_klient.getSelectionModel().setCellSelectionEnabled(true);
		tv_klient.getSelectionModel().selectedItemProperty().addListener(
				(ChangeListener<? super Klient>)new ChangeListener<Klient>() {

					@Override
					public void changed(ObservableValue<? extends Klient> obs, Klient oldK, Klient newK) {
						//l_statusline_Klient.setText(newK.getNachname() + "wurde ausgew�hlt");
					}
						
		});
	
	}
	
	public void Refresh() {
		tv_klient.getItems().clear();
		tv_klient.getItems().addAll(kdao.getData());
	}
	
	public void edit(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("EditKlient.fxml"));
    	Klient_APane.getChildren().setAll(pane);
	}
	
}
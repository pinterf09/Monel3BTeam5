package application;

import java.awt.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import data.Mitarbeiter;
import data.MitarbeiterDAO;
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

public class MitarbeiterController implements javafx.fxml.Initializable{

	@FXML
    private AnchorPane rootpane;
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
    private TableView<Mitarbeiter> tv_mitarbeiter;
    @FXML
    private TableColumn<Mitarbeiter, String> tc_anrede;
    @FXML
    private TableColumn<Mitarbeiter, String> tc_vorname;
    @FXML
    private TableColumn<Mitarbeiter, String> tc_nachname;
    @FXML
    private TableColumn<Mitarbeiter, String> tc_ort;
    @FXML
    private TableColumn<Mitarbeiter, String> tc_plz;
    @FXML
    private TableColumn<Mitarbeiter, String> tc_amt;
    @FXML
    private TableColumn<Mitarbeiter, String> tc_gehaltsstufe;
    @FXML
    private TableColumn<Mitarbeiter, String> tc_wochenstunden;
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
    private Label l_statusline_Mitarbeiter;
    
    private MitarbeiterDAO mdao = MitarbeiterDAO.getInstance();
    
    @FXML
    public void add(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("AddMitarbeiter.fxml"));
        	rootpane.getChildren().setAll(pane);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @FXML
    public void delete(ActionEvent event) {
    	tv_mitarbeiter.getItems().removeAll(tv_mitarbeiter.getSelectionModel().getSelectedItem());
    	//l_statusline_Mitarbeiter.setText("Klient wurde geloescht");
    }

    @FXML
    public void details(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("DetailsMitarbeiter.fxml"));
        	rootpane.getChildren().setAll(pane);
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    @FXML
    public void display(ActionEvent event) {
    	tv_mitarbeiter.getItems().clear();
    	tv_mitarbeiter.getItems().addAll(mdao.getData());
    }

    @FXML
    public void toEinzelsetting(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Aktivitaet.fxml"));
        	rootpane.getChildren().setAll(pane);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    public void toGruppensetting(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Aktivitaet.fxml"));
        	rootpane.getChildren().setAll(pane);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    public void toKlienten(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Klient.fxml"));
        	rootpane.getChildren().setAll(pane);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    public void toMitarbeiter(ActionEvent event) {

    }

    @FXML
    public void toSponsoren(ActionEvent event) {
    	try {
    		AnchorPane pane = FXMLLoader.load(getClass().getResource("Sponsor.fxml"));
        	rootpane.getChildren().setAll(pane);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void edit(ActionEvent event) throws IOException {
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("EditMitarbeiter.fxml"));
    	rootpane.getChildren().setAll(pane);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		tc_anrede.setCellValueFactory(new PropertyValueFactory <Mitarbeiter, String>("anrede"));
		tc_vorname.setCellValueFactory(new PropertyValueFactory<Mitarbeiter,String>("vorname"));
		tc_nachname.setCellValueFactory(new PropertyValueFactory<Mitarbeiter,String>("nachname"));
		tc_ort.setCellValueFactory(new PropertyValueFactory <Mitarbeiter, String> ("ort"));
		tc_plz.setCellValueFactory(new PropertyValueFactory<Mitarbeiter,String>("PLZ"));
		tc_amt.setCellValueFactory(new PropertyValueFactory <Mitarbeiter, String>("amt"));
		tc_gehaltsstufe.setCellValueFactory(new PropertyValueFactory <Mitarbeiter, String>("gehaltsstufe"));
		tc_wochenstunden.setCellValueFactory(new PropertyValueFactory <Mitarbeiter, String>("wochenstunden"));
	
		tv_mitarbeiter.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		tv_mitarbeiter.getSelectionModel().setCellSelectionEnabled(true);
		tv_mitarbeiter.getSelectionModel().selectedItemProperty().addListener(
				(ChangeListener<? super Mitarbeiter>)new ChangeListener<Mitarbeiter>() {

					@Override
					public void changed(ObservableValue<? extends Mitarbeiter> obs, Mitarbeiter oldM, Mitarbeiter newM) {
						
					}
						
		});
	
		
	}
    
    

}

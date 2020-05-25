package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import data.MitarbeiterDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class DetailsMitarbeiterController implements javafx.fxml.Initializable {
	
	@FXML
	private AnchorPane rootpane;
    @FXML
    private TextField tf_email;
    @FXML
    private TextField tf_svnr;
    @FXML
    private ComboBox<String> cb_personentyp;
    @FXML
    private ComboBox<String> cb_amt;
    @FXML
    private ComboBox<String> cb_gehaltsstufe;
    @FXML
    private TextField tf_wochenstunden;
    @FXML
    private TextField tf_einstelldatum;
    @FXML
    private DatePicker dp_vorruecksdatum;
    @FXML
    private DatePicker dp_einstelldatum;
    @FXML
    private TextField tf_titel;
    @FXML
    private TextField tf_vorname;
    @FXML
    private TextField tf_nachname;
    @FXML
    private TextField tf_strasse_hausnr;
    @FXML
    private TextField tf_plz;
    @FXML
    private TextField tf_ort;
    @FXML
    private TextField tf_telefonnummer;
    @FXML
    private DatePicker dp_geburtsdatum;
    @FXML
    private ComboBox<String> cb_anrede;
    @FXML
    private Text l_header;
    @FXML
    private Button bt_save;
    @FXML
    private Button bt_exit;
    
	private MitarbeiterDAO mdao = MitarbeiterDAO.getInstance();
    
    private ObservableList<String> anrede = null;
    private ObservableList<String> personentyp = null;
    private ObservableList<String> amt = null;
    private ObservableList<String> gehaltsstufe = null;

    @FXML
    public void exit(ActionEvent event) throws IOException {
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("Mitarbeiter.fxml"));
		rootpane.getChildren().setAll(pane);
    }

    @FXML
    public void save(ActionEvent event) throws IOException {
    	
    }

	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		anrede = (ObservableList<String>) FXCollections.observableArrayList(mdao.getAnrede());
		cb_anrede.getItems().addAll(anrede);
		
		personentyp = (ObservableList<String>) FXCollections.observableArrayList(mdao.getPersonentyp());
		cb_personentyp.getItems().addAll(personentyp);
		
		amt = (ObservableList<String>) FXCollections.observableArrayList(mdao.getAmt());
		cb_amt.getItems().addAll(amt);
		
		gehaltsstufe = (ObservableList<String>) FXCollections.observableArrayList(mdao.getGehaltsstufe());
		cb_gehaltsstufe.getItems().addAll(gehaltsstufe);
		
	}

}

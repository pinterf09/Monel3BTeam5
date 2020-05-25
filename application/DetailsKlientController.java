package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import data.KlientDAO;
import data.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class DetailsKlientController implements javafx.fxml.Initializable {

    @FXML
    private AnchorPane rootpane;
    @FXML
    private TextField tf_email;
    @FXML
    private TextField tf_svnr;
    @FXML
    private TextField tf_beschaeftigung;
    @FXML
    private ComboBox<String> cb_personentyp;
    @FXML
    private TextArea ta_diagnose;
    @FXML
    private TextArea ta_sonstiges;
    @FXML
    private TextArea ta_allergien;
    @FXML
    private ComboBox<Person> cb_notfallkontakt1;
    @FXML
    private ComboBox<Person> cb_notfallkontakt2;
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
    private Button bt_exit;
    
    
    private ObservableList<String> anreden = null;
    private ObservableList<String> personentypen = null;

    @FXML
    public void exit(ActionEvent event) throws IOException {
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("Klient.fxml"));
		rootpane.getChildren().setAll(pane);
    }

	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		anreden = (ObservableList<String>) FXCollections.observableArrayList(KlientDAO.getInstance().getAnrede());
		cb_anrede.getItems().addAll(anreden);
		
		personentypen = FXCollections.observableArrayList(KlientDAO.getInstance().getPersonentyp());
		cb_personentyp.getItems().addAll(personentypen);
		
	}

}

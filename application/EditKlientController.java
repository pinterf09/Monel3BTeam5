package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import data.Klient;
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

public class EditKlientController implements javafx.fxml.Initializable {

    @FXML
    private AnchorPane addPane;
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
    private ComboBox<Person> cb_notfallkontakt_1;
    @FXML
    private ComboBox<Person> cb_notfallkontakt_2;
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
    @FXML
    private Button bt_save;
    
    private ObservableList<String> anreden = null;
    private ObservableList<String> personentypen = null;
    
    
    @FXML
    public void exit(ActionEvent event) {

    }

    @FXML
    public void save(ActionEvent event) throws IOException {
    	Klient k = new Klient(cb_anrede.getValue(),
				  tf_titel.getText(),
				  tf_vorname.getText(),
				  tf_nachname.getText(),
				  tf_strasse_hausnr.getText(),
				  tf_plz.getText(),
				  tf_ort.getText(),
				  dp_geburtsdatum.getValue(),
				  tf_telefonnummer.getText(),
				  tf_email.getText(),
				  cb_personentyp.getValue(),
				  tf_svnr.getText(),
				  ta_diagnose.getText(),
				  tf_beschaeftigung.getText(),
				  ta_sonstiges.getText(),
				  ta_allergien.getText()
				  );

				KlientDAO.getInstance().addKlient(k);
				
				cb_anrede.setValue(null);
				tf_titel.setText(null);
				tf_vorname.setText(null);
				tf_nachname.setText(null);
				tf_strasse_hausnr.setText(null);
				tf_plz.setText(null);
				tf_ort.setText(null);
				tf_telefonnummer.setText(null);
				tf_email.setText(null);
				cb_personentyp.setValue(null);
				tf_svnr.setText(null);
				ta_diagnose.setText(null);
				tf_beschaeftigung.setText(null);
				ta_sonstiges.setText(null);
				ta_allergien.setText(null);
				
				
				AnchorPane pane = FXMLLoader.load(getClass().getResource("Klient.fxml"));
				addPane.getChildren().setAll(pane);
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

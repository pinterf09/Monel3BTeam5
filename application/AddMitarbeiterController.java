package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import data.Mitarbeiter;
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

public class AddMitarbeiterController implements javafx.fxml.Initializable {
	
	@FXML
	private AnchorPane rootpane;
    @FXML
    private TextField tf_svnr;
    @FXML
    private ComboBox<String> cb_personentyp;
    @FXML
    private DatePicker dp_vorruecksdatum;
    @FXML
    private DatePicker dp_einstelldatum;
    @FXML
    private TextField tf_verwendungsgruppe;
    @FXML
    private TextField tf_bankverbindung;
    @FXML
    private TextField tf_wochenstunden;
    @FXML
    private ComboBox<String> cb_amt;
    @FXML
    private ComboBox<String> cb_gehaltsstufe;
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
    private TextField tf_email;
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
    void save(ActionEvent event) throws IOException {
    	
    	Mitarbeiter m = new Mitarbeiter( cb_anrede.getValue(),
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
										  cb_amt.getValue(),
										  tf_verwendungsgruppe.getText(),
										  cb_gehaltsstufe.getValue(),
										  tf_wochenstunden.getText(),
										  dp_vorruecksdatum.getValue(),
										  tf_bankverbindung.getText(),
										  dp_einstelldatum.getValue()
										  );

		mdao.addMitarbeiter(m);
		
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
		cb_amt.setValue(null);
		tf_verwendungsgruppe.setText(null);
		cb_gehaltsstufe.setValue(null);
		tf_wochenstunden.setText(null);
		dp_vorruecksdatum.setValue(null);
		tf_bankverbindung.setText(null);
		dp_einstelldatum.setValue(null);
		
		AnchorPane pane = FXMLLoader.load(getClass().getResource("Mitarbeiter.fxml"));
		rootpane.getChildren().setAll(pane);
    	 
    }
    
    @FXML
    public void exit(ActionEvent event) throws IOException {
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("Mitarbeiter.fxml"));
        rootpane.getChildren().setAll(pane);
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

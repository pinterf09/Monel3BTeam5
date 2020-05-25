package data;

import java.time.LocalDate;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Klient extends Person {
	
	private final StringProperty svnr = new SimpleStringProperty(this, "svnr");
	private final StringProperty diagnose = new SimpleStringProperty(this, "diagnose");
	private final StringProperty beschaeftigung = new SimpleStringProperty(this, "beschaeftigung");
	private final StringProperty sonstiges = new SimpleStringProperty(this, "sonstiges");
	private final StringProperty allergien = new SimpleStringProperty(this, "allergien");
  //private final StringProperty datenschutz = new SimpleStringProperty(this,"Datenschutz");
		
	
	public Klient (String anrede, String titel, String vorname, String nachname, String strasse_hausnr, String plz, String ort, LocalDate geburtsdatum, String telefonnummer, String email, String personentyp, String svnr, String diagonose, String beschaeftigung, String sonstiges, String allergien, String datenschutz) {
		super(anrede, titel, vorname, nachname, strasse_hausnr, plz, ort, geburtsdatum, telefonnummer, email, personentyp);
		this.svnr.set(svnr);
		this.diagnose.set(diagonose);
		this.beschaeftigung.set(beschaeftigung);
		this.sonstiges.set(sonstiges);
		this.allergien.set(allergien);
	}
	
	public Klient (String anrede, String titel, String vorname, String nachname, String strasse_hausnr, String plz, String ort, LocalDate geburtsdatum, String telefonnummer, String email, String personentyp, String svnr, String diagonose, String beschaeftigung, String sonstiges, String allergien) {
		super(anrede, titel, vorname, nachname, strasse_hausnr, plz, ort, geburtsdatum, telefonnummer, email, personentyp);
		this.svnr.set(svnr);
		this.diagnose.set(diagonose);
		this.beschaeftigung.set(beschaeftigung);
		this.sonstiges.set(sonstiges);
		this.allergien.set(allergien);
	}
	
	public Klient (String anrede,String vorname, String nachname, String strasse_hausnr, String plz, String ort, LocalDate geburtsdatum, String telefonnummer, String email, String personentyp, String svnr, String diagonose, String beschaeftigung, String sonstiges, String allergien) {
		super(anrede, vorname, nachname, strasse_hausnr, plz, ort, geburtsdatum, telefonnummer, email, personentyp);
		this.svnr.set(svnr);
		this.diagnose.set(diagonose);
		this.beschaeftigung.set(beschaeftigung);
		this.sonstiges.set(sonstiges);
		this.allergien.set(allergien);
	}

	public final StringProperty svnrProperty() {
		return this.svnr;
	}
	
	public final String getSvnr() {
		return this.svnrProperty().get();
	}
	
	public final void setSvnr(final String svnr) {
		this.svnrProperty().set(svnr);
	}
	
	public final StringProperty diagnoseProperty() {
		return this.diagnose;
	}
	
	public final String getDiagnose() {
		return this.diagnoseProperty().get();
	}
	
	public final void setDiagnose(final String diagnose) {
		this.diagnoseProperty().set(diagnose);
	}
	
	public final StringProperty beschaeftigungProperty() {
		return this.beschaeftigung;
	}
	
	public final String getBeschaeftigung() {
		return this.beschaeftigungProperty().get();
	}
	
	public final void setBeschaeftigung(final String beschaeftigung) {
		this.beschaeftigungProperty().set(beschaeftigung);
	}
	
	public final StringProperty sonstigesProperty() {
		return this.sonstiges;
	}
	
	public final String getSonstiges() {
		return this.sonstigesProperty().get();
	}

	public final void setSonstiges(final String sonstiges) {
		this.sonstigesProperty().set(sonstiges);
	}

	public final StringProperty allergienProperty() {
		return this.allergien;
	}
	
	public final String getAllergien() {
		return this.allergienProperty().get();
	}
	
	public final void setAllergien(final String allergien) {
		this.allergienProperty().set(allergien);
	}
	


	
}

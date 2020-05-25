package data;

import java.time.LocalDate;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Mitarbeiter extends Person {
	
	private final StringProperty svnr = new SimpleStringProperty(this, "svnr");
	private final StringProperty amt = new SimpleStringProperty(this, "amt");
	private final StringProperty verwendungsgruppe = new SimpleStringProperty(this, "verwendungsgruppe");
	private final StringProperty gehaltsstufe = new SimpleStringProperty(this, "gehaltsstufe");
	private final StringProperty wochenstunden = new SimpleStringProperty(this, "wochenstunden");
	private final ObjectProperty<LocalDate> vorruecksdatum = new SimpleObjectProperty<LocalDate>(this, "vorruecksdatum");
	private final StringProperty bankverbindung = new SimpleStringProperty (this, "bankverbindung");
	private final ObjectProperty<LocalDate> einstelldatum = new SimpleObjectProperty<LocalDate>(this, "einstelldatum");
	
	public Mitarbeiter (String anrede, String titel, String vorname, String nachname, String strasse_hausnr, String PLZ, String ort, LocalDate geburtsdatum, String telefonnummer, String email, String personentyp, String svnr, String amt, String verwendungsgruppe, String gehaltsstufe, String wochenstunden, LocalDate vorruecksdatum, String bankverbindung, LocalDate einstelldatum) { 
		super(anrede, titel, vorname, nachname, strasse_hausnr, PLZ, ort, geburtsdatum, telefonnummer, email, personentyp);
		this.svnr.set(svnr);
		this.amt.set(amt);
		this.verwendungsgruppe.set(verwendungsgruppe);
		this.gehaltsstufe.set(gehaltsstufe);
		this.wochenstunden.set(wochenstunden);
		this.vorruecksdatum.set(vorruecksdatum);
		this.bankverbindung.set(bankverbindung);
		this.einstelldatum.set(einstelldatum);
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
	
	public final StringProperty amtProperty() {
		return this.amt;
	}
	
	public final String getAmt() {
		return this.amtProperty().get();
	}
	
	public final void setAmt(final String amt) {
		this.amtProperty().set(amt);
	}
	
	public final StringProperty verwendungsgruppeProperty() {
		return this.verwendungsgruppe;
	}
	
	public final String getVerwendungsgruppe() {
		return this.verwendungsgruppeProperty().get();
	}
	
	public final void setVerwendungsgruppe(final String verwendungsgruppe) {
		this.verwendungsgruppeProperty().set(verwendungsgruppe);
	}
	
	public final StringProperty gehaltsstufeProperty() {
		return this.gehaltsstufe;
	}
	
	public final String getGehaltsstufe() {
		return this.gehaltsstufeProperty().get();
	}
	
	public final void setGehaltsstufe(final String gehaltsstufe) {
		this.gehaltsstufeProperty().set(gehaltsstufe);
	}
	
	public final StringProperty wochenstundenProperty() {
		return this.wochenstunden;
	}
	
	public final String getWochenstunden() {
		return this.wochenstundenProperty().get();
	}
	
	public final void setWochenstunden(final String wochenstunden) {
		this.wochenstundenProperty().set(wochenstunden);
	}
	
	public final ObjectProperty<LocalDate> vorruecksdatumProperty() {
		return this.vorruecksdatum;
	}
	
	public final LocalDate getVorruecksdatum() {
		return this.vorruecksdatumProperty().get();
	}
	
	public final void setVorruecksdatum(final LocalDate vorruecksdatum) {
		this.vorruecksdatumProperty().set(vorruecksdatum);
	}
	
	public final StringProperty bankverbindungProperty() {
		return this.bankverbindung;
	}
	
	public final String getBankverbindung() {
		return this.bankverbindungProperty().get();
	}
	
	public final void setBankverbindung(final String bankverbindung) {
		this.bankverbindungProperty().set(bankverbindung);
	}
	
	public final ObjectProperty<LocalDate> einstelldatumProperty() {
		return this.einstelldatum;
	}
	
	public final LocalDate getEinstelldatum() {
		return this.einstelldatumProperty().get();
	}
	
	public final void setEinstelldatum(final LocalDate einstelldatum) {
		this.einstelldatumProperty().set(einstelldatum);
	}
	
}

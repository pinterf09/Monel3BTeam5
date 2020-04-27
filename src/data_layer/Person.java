package data_layer;

import java.util.concurrent.atomic.AtomicInteger;

import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Person {
	
	private final ReadOnlyIntegerWrapper pid = new ReadOnlyIntegerWrapper(this, "personId", personSequence.getAndIncrement());
	
	private final StringProperty anrede = new SimpleStringProperty(this, "anrede");
	private final StringProperty titel = new SimpleStringProperty(this, "titel");
	private final StringProperty vorname = new SimpleStringProperty(this, "vorname");
	private final StringProperty nachname = new SimpleStringProperty(this, "nachname");
	private final StringProperty straﬂe_hausnr = new SimpleStringProperty(this, "straﬂe_hausnr");
	private final StringProperty PLZ = new SimpleStringProperty(this, "PLZ");
	private final StringProperty ort = new SimpleStringProperty(this, "ort");
	private final StringProperty telefonnummer = new SimpleStringProperty(this, "telefonnummer");
	private final StringProperty email = new SimpleStringProperty(this, "email");
	private final StringProperty personentyp = new SimpleStringProperty(this, "personentyp");
	
	private static AtomicInteger personSequence = new AtomicInteger(0);
	
	public Person (String anrede, String titel, String vorname, String nachname, String straﬂe_hausnr, String PLZ, String ort, String telefonummer, String email, String personentyp) {
		this.anrede.set(anrede);
		this.titel.set(titel);
		this.vorname.set(vorname);
		this.nachname.set(nachname);
		this.straﬂe_hausnr.set(straﬂe_hausnr);
		this.PLZ.set(PLZ);
		this.ort.set(ort);
		this.telefonnummer.set(telefonummer);
		this.email.set(email);
		this.personentyp.set(personentyp);
	}

	
	
	public final javafx.beans.property.ReadOnlyIntegerProperty pidProperty() {
		return this.pid.getReadOnlyProperty();
	}
	
	public final int getPid() {
		return this.pidProperty().get();
	}
	
	public final StringProperty anredeProperty() {
		return this.anrede;
	}
	
	public final String getAnrede() {
		return this.anredeProperty().get();
	}
	
	public final void setAnrede(final String anrede) {
		this.anredeProperty().set(anrede);
	}
	
	public final StringProperty titelProperty() {
		return this.titel;
	}
	
	public final String getTitel() {
		return this.titelProperty().get();
	}
	
	public final void setTitel(final String titel) {
		this.titelProperty().set(titel);
	}
	
	public final StringProperty vornameProperty() {
		return this.vorname;
	}
	
	public final String getVorname() {
		return this.vornameProperty().get();
	}
	
	public final void setVorname(final String vorname) {
		this.vornameProperty().set(vorname);
	}
	
	public final StringProperty nachnameProperty() {
		return this.nachname;
	}
	
	public final String getNachname() {
		return this.nachnameProperty().get();
	}
	
	public final void setNachname(final String nachname) {
		this.nachnameProperty().set(nachname);
	}
	
	public final StringProperty straﬂe_hausnrProperty() {
		return this.straﬂe_hausnr;
	}
	
	public final String getStraﬂe_hausnr() {
		return this.straﬂe_hausnrProperty().get();
	}
	
	public final void setStraﬂe_hausnr(final String straﬂe_hausnr) {
		this.straﬂe_hausnrProperty().set(straﬂe_hausnr);
	}
	
	public final StringProperty PLZProperty() {
		return this.PLZ;
	}
	
	public final String getPLZ() {
		return this.PLZProperty().get();
	}
	
	public final void setPLZ(final String PLZ) {
		this.PLZProperty().set(PLZ);
	}
	
	public final StringProperty ortProperty() {
		return this.ort;
	}
	
	public final String getOrt() {
		return this.ortProperty().get();
	}
	
	public final void setOrt(final String ort) {
		this.ortProperty().set(ort);
	}
	
	public final StringProperty telefonnummerProperty() {
		return this.telefonnummer;
	}
	
	public final String getTelefonnummer() {
		return this.telefonnummerProperty().get();
	}
	
	public final void setTelefonnummer(final String telefonnummer) {
		this.telefonnummerProperty().set(telefonnummer);
	}
	
	public final StringProperty emailProperty() {
		return this.email;
	}
	
	public final String getEmail() {
		return this.emailProperty().get();
	}
	
	public final void setEmail(final String email) {
		this.emailProperty().set(email);
	}
	
	public final StringProperty personentypProperty() {
		return this.personentyp;
	}

	public final String getPersonentyp() {
		return this.personentypProperty().get();
	}
	
	public final void setPersonentyp(final String personentyp) {
		this.personentypProperty().set(personentyp);
	}
	
	
	

}

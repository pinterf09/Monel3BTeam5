package data;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Aktivitaet {
	
	private ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
	private ArrayList<Klient> klienten = new ArrayList<Klient>();
	private ObjectProperty<LocalDate> datum = new SimpleObjectProperty<LocalDate>(this,"datum");
	private StringProperty startzeit = new SimpleStringProperty(this,"startzeit");
	private StringProperty endzeit = new  SimpleStringProperty(this,"endzeit");
	private StringProperty Jahr_Monat = new SimpleStringProperty(this,"Jahr_Monat");
	private StringProperty aktivitaetsbezeichnung = new SimpleStringProperty(this,"aktivitätsbezeichnung");
	private DoubleProperty stundensatz = new SimpleDoubleProperty(this,"stundensatz");
	private DoubleProperty fahrtkosten = new SimpleDoubleProperty(this,"fahrtkosten");
	
	
	public Aktivitaet(ArrayList<Mitarbeiter> mitarbeiter, ArrayList<Klient> klienten, LocalDate datum,String startzeit, String endzeit, String jahr_Monat, String aktivitaetsbezeichnung, Double stundensatz, Double fahrtkosten) {
		super();
		this.mitarbeiter = new ArrayList<Mitarbeiter>();
		this.klienten = new ArrayList<Klient>();
		this.datum.set(datum);
		this.startzeit.set(startzeit);
		this.endzeit.set(endzeit);
		this.Jahr_Monat.set(jahr_Monat);
		this.aktivitaetsbezeichnung.set(aktivitaetsbezeichnung);
		this.stundensatz.set(stundensatz);
		this.fahrtkosten.set(fahrtkosten);
	}


	public final ObjectProperty<LocalDate> datumProperty() {
		return this.datum;
	}
	
	public final LocalDate getDatum() {
		return this.datumProperty().get();
	}
	
	public final void setDatum(final LocalDate datum) {
		this.datumProperty().set(datum);
	}
	
	public final StringProperty startzeitProperty() {
		return this.startzeit;
	}
	
	public final String getStartzeit() {
		return this.startzeitProperty().get();
	}
	
	public final void setStartzeit(final String startzeit) {
		this.startzeitProperty().set(startzeit);
	}
	
	public final StringProperty endzeitProperty() {
		return this.endzeit;
	}
	
	public final String getEndzeit() {
		return this.endzeitProperty().get();
	}
	
	public final void setEndzeit(final String endzeit) {
		this.endzeitProperty().set(endzeit);
	}
	
	public final StringProperty Jahr_MonatProperty() {
		return this.Jahr_Monat;
	}
	
	public final String getJahr_Monat() {
		return this.Jahr_MonatProperty().get();
	}
	
	public final void setJahr_Monat(final String Jahr_Monat) {
		this.Jahr_MonatProperty().set(Jahr_Monat);
	}
	
	public final StringProperty aktivitaetsbezeichnungProperty() {
		return this.aktivitaetsbezeichnung;
	}
	
	public final String getAktivitaetsbezeichnung() {
		return this.aktivitaetsbezeichnungProperty().get();
	}
	
	public final void setAktivitaetsbezeichnung(final String aktivitaetsbezeichnung) {
		this.aktivitaetsbezeichnungProperty().set(aktivitaetsbezeichnung);
	}
	
	public final DoubleProperty stundensatzProperty() {
		return this.stundensatz;
	}
	
	public final double getStundensatz() {
		return this.stundensatzProperty().get();
	}
	
	public final void setStundensatz(final double stundensatz) {
		this.stundensatzProperty().set(stundensatz);
	}
	
	public final DoubleProperty fahrtkostenProperty() {
		return this.fahrtkosten;
	}
	
	public final double getFahrtkosten() {
		return this.fahrtkostenProperty().get();
	}
	
	public final void setFahrtkosten(final double fahrtkosten) {
		this.fahrtkostenProperty().set(fahrtkosten);
	}
	
	
	
	
	
	
	

}

package data;

import java.time.LocalDate;
import java.util.ArrayList;

public class MitarbeiterDAO {
	
	public final static String female = "Frau";
	public final static String male =  "Herr";
	public final static String keineAngabe = "keine Angabe";
	
	public final static String Typ_1 = "Typ 1";
	public final static String Typ_2 = "Typ 2";
	
	public final static String ehrenamt = "Ehrenamt";
	public final static String hauptamt = "Hauptamt";
	
	public final static String gs1 = "1";
	public final static String gs2 = "2";
	public final static String gs3 = "3";
	public final static String gs4 = "4";
	public final static String gs5 = "5";
	
	private static MitarbeiterDAO instance = new MitarbeiterDAO();
	ArrayList<Mitarbeiter> dummies = new ArrayList<Mitarbeiter>();
	
	private MitarbeiterDAO() {
		
	}
	
	public static MitarbeiterDAO getInstance() {
		return instance;
	}
	
	//Befuellen der TableView mit Dummy-Daten
	public ArrayList<Mitarbeiter> getData() {
		dummies.add(new Mitarbeiter ("Herr", "DR.", "Manuel", "Neuer", "Bayern Strasse 40", "7651", "Muenchen", LocalDate.of(1981, 3, 5), "+43650 658 5412", "ichhaltealles@aon.com","ruhig","AT 1234567890", "Hauptamt", "Tormanntraining", "5", "40", LocalDate.of(2002, 6, 12), "BIC456789", LocalDate.of(2001, 3, 6)));
		return dummies;
	}
	
	public ArrayList<?> getAnrede() {
		ArrayList<String> allAnreden = new ArrayList<String>();
		allAnreden.add(female);
		allAnreden.add(male);
		allAnreden.add(keineAngabe);
			
		return allAnreden;
	}
	
	public ArrayList<?> getPersonentyp() {
		ArrayList<String> allPersonentypen = new ArrayList<String>();
		allPersonentypen.add(Typ_1);
		allPersonentypen.add(Typ_2);
			
		return allPersonentypen;
	}
	
	public ArrayList<?> getAmt() {
		ArrayList<String> allAmt = new ArrayList<String>();
		allAmt.add(hauptamt);
		allAmt.add(ehrenamt);
			
		return allAmt;
	}
	
	public ArrayList<?> getGehaltsstufe() {
		ArrayList<String> allGehaltsstufen = new ArrayList<String>();
		allGehaltsstufen.add(gs1);
		allGehaltsstufen.add(gs2);
		allGehaltsstufen.add(gs3);
		allGehaltsstufen.add(gs4);
		allGehaltsstufen.add(gs5);
			
		return allGehaltsstufen;
	}
		
		public void addMitarbeiter(Mitarbeiter m) {
			dummies.add(m);
		}
}

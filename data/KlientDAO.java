package data;

import java.time.LocalDate;
import java.util.ArrayList;

public class KlientDAO {
	
	public final static String female = "Frau";
	public final static String male =  "Herr";
	public final static String keine_Angabe = "keine Angabe";
	
	private static KlientDAO instance = new KlientDAO();
	private ArrayList<Klient> dummies = new ArrayList<Klient>();
	
	private KlientDAO() {
		
	}
	
	public static KlientDAO getInstance() {
		return instance;
	}
	
	//Befuellen der TableView mit Dummy-Daten
	public ArrayList<Klient> getData() {
		dummies.add(new Klient("Herr", "DR.", "Manuel", "Neuer", "Bayern Strasse 40", "7651", "Muenchen", LocalDate.of(2002, 2, 5), "+43650 658 5412", "ichhaltealles@aon.com","ruhig","AT 1234567890", "Tormann", "Profi", "nichts", "Nussalergie"));
		dummies.add(new Klient("Frau", "Ba.", "Manuela", "Davies", "Muenchen Strasse 40", "7651", "Bayern", LocalDate.of(2001, 12, 16), "+43650 658 5412", "ichhaltealles@aon.com","ruhig","AT 1234567890", "Tormann", "Profi", "nichts", "Nussalergie"));
		dummies.add(new Klient("Herr", "Thomas", "Delaney", "Werder Strasse 60", "7896", "Bremen", LocalDate.of(1999, 2, 8), "+4870 962 5874", "abstiegskampf@gmx.com","laut","AT 9876543210", "Stürmer", "Halbprofi", "nichts", "Erdbeerenalergie"));
		return dummies;
	}
	
	public ArrayList<?> getAnrede() {
		ArrayList<String> allAnreden = new ArrayList<String>();
		allAnreden.add(female);
		allAnreden.add(male);
		allAnreden.add(keine_Angabe);
		
		return allAnreden;
	}
	
	public ArrayList<String> getPersonentyp(){
		ArrayList<String> alltypen = new ArrayList<>();
		alltypen.add("Typ1");
		alltypen.add("Typ2");
		
		return alltypen;
	}
	
	public void addKlient(Klient k) {
		dummies.add(k);
		
		
	}
}

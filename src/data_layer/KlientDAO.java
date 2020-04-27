package data_layer;

import java.util.ArrayList;

public class KlientDAO {
	
	public final static String female = "Frau";
	public final static String male =  "Herr";
	
	private static KlientDAO instance = new KlientDAO();
	
	private KlientDAO() {
		
	}
	
	public static KlientDAO getInstance() {
		return instance;
	}
	
	
	
	//Bef�llen der TableView mit Dummy-Daten
	public ArrayList<Klient> getData() {
		ArrayList<Klient> dummies = new ArrayList<Klient>();
		dummies.add(new Klient("Herr", "Dr", "Manuel", "Neuer", "Soebener Straße 41", "4444", "Bayern", "+43 065088889", "ichhaltealles@fcb.com", "ruhig", "AT123456", "Bauchweh", "Torhüter", "nichts", "Nussalergie"));
		return dummies;
	}
	
	//Bef�llen der ComboBox
	public ArrayList<?> getAnrede() {
		ArrayList<String> allAnreden = new ArrayList<String>();
		allAnreden.add(female);
		allAnreden.add(male);
		
		return allAnreden;
	}
}

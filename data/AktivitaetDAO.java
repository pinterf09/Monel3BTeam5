package data;

import java.util.ArrayList;

public class AktivitaetDAO {

	private static AktivitaetDAO instance = new AktivitaetDAO();
	private ArrayList<Aktivitaet> aktivitaeten = new ArrayList<Aktivitaet>();
	private ArrayList<Aktivitaet> dummies = new ArrayList<Aktivitaet>();
	
	public static AktivitaetDAO getInstance() {
		return instance;
	}
	
	public void addAktivitaet(Aktivitaet a) {
		aktivitaeten.add(a);
	}
	
	public ArrayList<Aktivitaet> getAllAktivitaeten() {
		return aktivitaeten;
	}
	
	public ArrayList<Aktivitaet> getData() {
		//dummies.add();
		
		return dummies;
	}
}

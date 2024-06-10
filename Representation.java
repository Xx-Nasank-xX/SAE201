package SAE201;

import java.util.ArrayList;
import java.util.Objects;

public class Representation {
	
	private String jour;
	private String heure;
	private boolean annulée;
	private Spectacle informations;
	static ArrayList<Reservation> les_reservations = new ArrayList<>();
	
	public Representation(String jour, String heure, boolean annulée,Spectacle infos) {
		super();
		this.jour = jour;
		this.heure = heure;
		this.annulée = annulée;
		this.informations = infos;
	}
	
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public boolean isAnnulée() {
		return annulée;
	}
	public void setAnnulée(boolean annulée) {
		this.annulée = annulée;
	}

	public Spectacle getInformations() {
		return informations;
	}

	public void setInformations(Spectacle informations) {
		this.informations = informations;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Representation other = (Representation) obj;
		return annulée == other.annulée && Objects.equals(heure, other.heure) && Objects.equals(jour, other.jour);
	}

	@Override
	public String toString() {
		return "Representation [jour=" + jour + ", heure=" + heure + ", annulée=" + annulée + ", informations="+ informations + "]";
	}
	
	protected static void ajouterReservation(Reservation r) {
		Representation.les_reservations.add(r);
	}
	
	public static boolean rajouterReservations(Reservation r) {
		if(Representation.les_reservations.contains(r)) {
			System.out.println("La representation a deja cette reservation.");
			return false;
		}else {
			ajouterReservation(r);
			return true;
		}
	}
	
	protected static void enleverReservation(Reservation r) {
		Representation.les_reservations.remove(r);
	}
	
	public static boolean supprimerReservations(Reservation r) {
		if(Representation.les_reservations.size()> 0) {
			enleverReservation(r);
			return true;
		}
		else {
			System.out.println("La réservation n'a qu'un billet.");
			return false;
		}
	}
	
	public void afficherReservations() {
		for(int i=0;i<Representation.les_reservations.size();i++) {
			Representation.les_reservations.get(i).toString();
		}
	}
}

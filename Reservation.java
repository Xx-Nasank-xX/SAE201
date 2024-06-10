package SAE201;

import java.util.*;

public class Reservation {
	private String numero;
	private Date date;
	private Date dateEnvoiConf;
	private Client compte;
	static ArrayList<Billet> billet_commande = new ArrayList<>();
	private Representation larepresentation;
	static int num = 0;
	
	public Reservation(Date date, Date dateEnvoiConf, Client compte,Billet  billet_reserve,Representation larepresentation) {
		super();
		this.numero = Integer.toString(num);
		num++;
		this.date = date;
		this.dateEnvoiConf = dateEnvoiConf;
		this.compte = compte;
		Reservation.billet_commande = new ArrayList<>();
		Reservation.billet_commande.add(billet_reserve);
		this.larepresentation = larepresentation;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDateEnvoiConf() {
		return dateEnvoiConf;
	}

	public void setDateEnvoiConf(Date dateEnvoiConf) {
		this.dateEnvoiConf = dateEnvoiConf;
	}

	public Client getCompte() {
		return compte;
	}

	public void setCompte(Client compte) {
		this.compte = compte;
	}

	public static ArrayList<Billet> getBillet_commande() {
		return billet_commande;
	}

	public static void setBillet_commande(ArrayList<Billet> billet_commande) {
		Reservation.billet_commande = billet_commande;
	}

	public Representation getLarepresentation() {
		return larepresentation;
	}

	public void setLarepresentation(Representation larepresentation) {
		this.larepresentation = larepresentation;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		return Objects.equals(compte, other.compte) && Objects.equals(date, other.date)
				&& Objects.equals(dateEnvoiConf, other.dateEnvoiConf)
				&& Objects.equals(larepresentation, other.larepresentation) && Objects.equals(numero, other.numero);
	}

	public String toString() {
		return "numero=" + numero + ", date=" + date + ", dateEnvoiConf=" + dateEnvoiConf + ", compte="+ compte + ", larepresentation=" + larepresentation;
	}
	
	protected static void ajouterBillet(Billet m) {
		Reservation.billet_commande.add(m);
	}
	
	public static boolean rajouterBillets(Billet m) {
		if(Reservation.billet_commande.contains(m)) {
			System.out.println("Ce billet est deja present pour cette representation.");
			return false;
		}else {
			ajouterBillet(m);
			return true;
		}
		
	}
	
	protected static void enleverBillet(Billet m) {
		Reservation.billet_commande.remove(m);
	}
	
	public static boolean supprimerBillets(Billet m) {
		if(Reservation.billet_commande.size()> 1) {
			enleverBillet(m);
			return true;
		}
		else {
			System.out.println("La réservation n'a qu'un billet.");
			return false;
		}
	}
	
	public void afficherBillets() {
		for(int i=0;i<Reservation.billet_commande.size();i++) {
			Reservation.billet_commande.get(i).toString();
		}
	}
	
	public static void main(String[] args) {
		Client compte = new Client("Potier", "Maëlan","6A Rue des Haras","06 38 63 26 81","maelanpotier05@gmail.com",one);
		Reservation one = new Reservation(new Date(),new Date(),);
	}
	
}

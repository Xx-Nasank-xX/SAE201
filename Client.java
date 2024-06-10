package SAE201;

import java.util.ArrayList;

public class Client {
	public String nom;
	public String prenom;
	public String adresse;
	public String tel;
	public String mail;
	public String numero;
	static int num_automatique = 1;
	static ArrayList<Reservation> mes_reservations = new ArrayList<>();
	
	public Client(String nom, String prenom, String adresse, String tel, String mail,Reservation achat) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
		this.mail = mail;
		this.numero = Integer.toString(num_automatique);
		Client.mes_reservations = new ArrayList<>();
		Client.mes_reservations.add(achat);
		num_automatique++;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	protected static void ajouterReservation(Reservation r) {
		Client.mes_reservations.add(r);
	}
	
	public static boolean rajouterReservations(Reservation r) {
		if(Client.mes_reservations.contains(r)) {
			System.out.println("Le client à deja cette reservation.");
			return false;
		}else {
			ajouterReservation(r);
			return true;
		}
	}
	
	protected static void enleverReservation(Reservation r) {
		Client.mes_reservations.remove(r);
	}
	
	public static boolean supprimerReservations(Reservation r) {
		if(Client.mes_reservations.size()> 1) {
			enleverReservation(r);
			return true;
		}
		else {
			System.out.println("La réservation n'a qu'un billet.");
			return false;
		}
	}
	
	public void afficherReservations() {
		for(int i=0;i<Client.mes_reservations.size();i++) {
			Client.mes_reservations.get(i).toString();
		}
	}
	
}

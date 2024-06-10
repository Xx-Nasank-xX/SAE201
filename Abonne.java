package SAE201;

public class Abonne extends Client{

	public Abonne(String nom, String prenom, String adresse, String tel, String mail,Reservation achat,Reservation achat2,Reservation achat3) {
		super(nom, prenom, adresse, tel, mail,achat);
		Client.mes_reservations.add(achat2);
		Client.mes_reservations.add(achat3);
	}
	
	public static void main(String[] args) {
		
	/*	Client one = new Client("POTTER","HARRY","Quai 9.3/4","118 218","poudelard@gmail.com");	
		Client two = new Client("POTTER","HARRY","Quai 9.3/4","118 218","poudelard@gmail.com");
		Client three = new Client("POTTER","HARRY","Quai 9.3/4","118 218","poudelard@gmail.com");
		Client four = new Abonne("POTTER","HARRY","Quai 9.3/4","118 218","poudelard@gmail.com");
		Client five = new Client("POTTER","HARRY","Quai 9.3/4","118 218","poudelard@gmail.com");
		System.out.println(four.getNumero()); */
	}
	
}

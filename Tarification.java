package SAE201;

import java.util.ArrayList;

public class Tarification {
	
	static ArrayList<Billet> nbre_billets_tarifs = new ArrayList<>();
	
	protected static void ajouterBillet(Billet m) {
		Tarification.nbre_billets_tarifs.add(m);
	}
	
	public static boolean rajouterBillets(Billet m) {
		if(Tarification.nbre_billets_tarifs.contains(m)) {
			System.out.println("Ce billet est deja present.");
			return false;
		}else {
			ajouterBillet(m);
			return true;
		}
	}
	
	protected static void enleverBillet(Billet m) {
		Tarification.nbre_billets_tarifs.remove(m);
	}
	
	public static boolean supprimerBillets(Billet m) {
		if(Tarification.nbre_billets_tarifs.size()> 0) {
			enleverBillet(m);
			return true;
		}
		else {
			System.out.println("Ce tarif n'a pas de billet.");
			return false;
		}
	}
	
	public void afficherBillets() {
		for(int i=0;i<Tarification.nbre_billets_tarifs.size();i++) {
			Tarification.nbre_billets_tarifs.get(i).toString();
		}
	}
	
}

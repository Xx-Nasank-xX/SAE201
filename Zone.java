package SAE201;

import java.util.ArrayList;
import java.util.Objects;

public class Zone {
    
    private String nom;
    static ArrayList<Spectacle> les_spectacles = new ArrayList<>();
    
    
    public Zone(String nom) {
    	super();
    	this.nom = nom;
    	Zone.les_spectacles = new ArrayList<>();
    }
    public Zone(String nom,Spectacle representation) {
   	 	this(nom);
    	Zone.les_spectacles.add(representation);
    }

    public String getNom() {
   	 return nom;
    }

    public void setNom(String nom) {
   	 this.nom = nom;
    }
    
    public String toString() {
   	 return "Zone [nom=" + nom + "]";
    }
    
    public boolean equals(Object obj) {
   	 if (this == obj)
   		 return true;
   	 if (obj == null)
   		 return false;
   	 if (getClass() != obj.getClass())
   		 return false;
   	 Zone other = (Zone) obj;
   	 return Objects.equals(nom, other.nom);
    }

    protected static void ajouterSpectacle(Spectacle s) {
   	 Zone.les_spectacles.add(s);
    }
    
    public static boolean rajouterSpectacles(Spectacle s) {
   	 if(Zone.les_spectacles.contains(s)) {
   		 System.out.println("La zone contient deja ce spectacle.");
   		 return false;
   	 }else {
   		 ajouterSpectacle(s);
   		 return true;
   	 }   	 
    }
    
    protected static void enleverSpectacle(Spectacle s) {
   	 Zone.les_spectacles.remove(s);
    }
    
    public static boolean supprimerSpectacles(Spectacle s) {
   	 if(Zone.les_spectacles.size()> 1) {
   		 enleverSpectacle(s);
   		 return true;
   	 }
   	 else {
   		 System.out.println("La zone n'a qu'une representation.");
   		 return false;
   	 }
    }
    
    public void afficherSpectacles() {
   	 for(int i=0;i<Zone.les_spectacles.size();i++) {
   		 Zone.les_spectacles.get(i).toString();
   	 }
    }
}
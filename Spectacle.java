package SAE201;

import java.util.ArrayList;
import java.util.Objects;

public class Spectacle {
    
    private String nom;
    private Integer duree;
    private Integer nbreMaxSpect;
    private  String genre;
    static ArrayList<Representation> les_representations = new ArrayList<>();
    static ArrayList<Zone> les_zones = new ArrayList<>();
    
    public Spectacle(String nom) {
    	super();
      	this.nom = nom;
      	Spectacle.les_representations = new ArrayList<>();
    }
    
    public Spectacle(String nom,Integer duree, Integer nbreMaxSpect, String genre,Representation represente,Zone salle) {
   	 this(nom);
   	 this.duree = duree;
   	 this.nbreMaxSpect = nbreMaxSpect;
   	 this.genre = genre;
   	 Spectacle.les_representations.add(represente);
   	 Spectacle.les_zones = new ArrayList<>();
   	 Spectacle.les_zones.add(salle);
    }

    public String getNom() {
   	 return nom;
    }

    public void setNom(String nom) {
   	 this.nom = nom;
    }

    public Integer getDuree() {
   	 return duree;
    }

    public void setDuree(Integer duree) {
   	 this.duree = duree;
    }

    public Integer getNbreMaxSpect() {
   	 return nbreMaxSpect;
    }

    public void setNbreMaxSpect(Integer nbreMaxSpect) {
   	 this.nbreMaxSpect = nbreMaxSpect;
    }

    public String getGenre() {
   	 return genre;
    }

    public void setGenre(String genre) {
   	 this.genre = genre;
    }

    public boolean equals(Object obj) {
   	 if (this == obj)
   		 return true;
   	 if (obj == null)
   		 return false;
   	 if (getClass() != obj.getClass())
   		 return false;
   	 Spectacle other = (Spectacle) obj;
   	 return Objects.equals(duree, other.duree) && Objects.equals(genre, other.genre)
   			 && Objects.equals(nbreMaxSpect, other.nbreMaxSpect) && Objects.equals(nom, other.nom);
    }

    public String toString() {
   	 return "Spectacle [nom=" + nom + ", duree=" + duree + ", nbreMaxSpect=" + nbreMaxSpect + ", genre=" + genre+ "]";
    }
    
    protected static void ajouterRepresentation(Representation r) {
   	 Spectacle.les_representations.add(r);
    }
    
    public static boolean rajouterRepresentations(Representation r) {
   	 if(Spectacle.les_representations.contains(r)) {
   		 System.out.println("Le spectacle à deja cette représentation.");
   		 return false;
   	 }
   	 else {
   		 ajouterRepresentation(r);
   		 return true;
   	 }    
    }
    
    protected static void enleverRepresentation(Representation r) {
   	 Spectacle.les_representations.remove(r);
    }
    
    public static boolean supprimerRepresentations(Representation r) {
   	 if(Reservation.billet_commande.size()> 1) {
   		 enleverRepresentation(r);
   		 return true;
   	 }
   	 else {
   		 System.out.println("La réservation n'a qu'un billet.");
   		 return false;
   	 }
    }
    
    public void afficherRepresentations() {
   	 for(int i=0;i<Spectacle.les_representations.size();i++) {
   		 Spectacle.les_representations.get(i).toString();
   	 }
    }
    
    protected static void ajouterZone(Zone r) {
   	 Spectacle.les_zones.add(r);
    }
    
    public static boolean rajouterZones(Zone r) {
   	 if(Spectacle.les_zones.contains(r)) {
   		 System.out.println("La zone existe deja pour ce spectacle.");
   		 return false;
   	 }
   	 else {
   		 ajouterZone(r);
   		 return true;
   	 }   	 
    }
    
    protected static void enleverZone(Zone r) {
   	 Spectacle.les_zones.remove(r);
    }
    
    public static boolean supprimerZones(Zone r) {
   	 if(Spectacle.les_zones.size()> 1) {
   		 enleverZone(r);
   		 return true;
   	 }
   	 else {
   		 System.out.println("Le spectacle n'a qu'une zone.");
   		 return false;
   	 }
    }
    
    public void afficherZones() {
   	 for(int i=0;i<Spectacle.les_zones.size();i++) {
   		 Spectacle.les_zones.get(i).toString();
   	 }
    }
    
}



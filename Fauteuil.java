package SAE201;

import java.util.ArrayList;
import java.util.Objects;

public class Fauteuil {
    
    private String rangée;
    private String numéro;
    private Zone place;
    static ArrayList<Billet> les_billets = new ArrayList<>();
    
    public Fauteuil(String rangée, String numéro) {
    	super();
      	 this.rangée = rangée;
      	 this.numéro = numéro;
    }
    
    public Fauteuil(String rangée, String numéro, Zone place) {
    	this(rangée,numéro);
    	this.place = place;
    }

    public String getRangée() {
   	 return rangée;
    }

    public void setRangée(String rangée) {
   	 this.rangée = rangée;
    }

    public String getNuméro() {
   	 return numéro;
    }

    public void setNuméro(String numéro) {
   	 this.numéro = numéro;
    }

    public Zone getPlace() {
   	 return place;
    }

    public void setPlace(Zone place) {
   	 this.place = place;
    }

    public boolean equals(Object obj) {
   	 if (this == obj)
   		 return true;
   	 if (obj == null)
   		 return false;
   	 if (getClass() != obj.getClass())
   		 return false;
   	 Fauteuil other = (Fauteuil) obj;
   	 return Objects.equals(numéro, other.numéro) && Objects.equals(place, other.place)
   			 && Objects.equals(rangée, other.rangée);
    }

    public String toString() {
   	 return "Fauteuil [rangée=" + rangée + ", numéro=" + numéro + ", place=" + place + "]";
    }
    
    protected static void ajouterBillet(Billet m) {
   	 Fauteuil.les_billets.add(m);
    }
    
    public static boolean rajouterBillets(Billet m) {
   	 if(Fauteuil.les_billets.contains(m)) {
   		 System.out.println("Le billet est en double.");
   		 return false;
   	 }
   	 ajouterBillet(m);
   	 return true;
   	 
    }
    
    protected static void enleverBillet(Billet m) {
   	 Fauteuil.les_billets.remove(m);
    }
    
    public static boolean supprimerBillets(Billet m) {
   	 if(Fauteuil.les_billets.size()> 0) {
   		 enleverBillet(m);
   		 return true;
   	 }
   	 else {
   		 System.out.println("Le fauteuil n'a pas de réservation.");
   		 return false;
   	 }
    }
    
    public void afficherBillets() {
   	 for(int i=0;i<Fauteuil.les_billets.size();i++) {
   		 Fauteuil.les_billets.get(i).toString();
   	 }
    }
    
}



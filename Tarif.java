package SAE201;

import java.util.Objects;

public class Tarif {
	
	private Spectacle le_spectacle;
	private Zone la_zone;
	private double pleinTarif;
	
	public Tarif(Spectacle le_spectacle, Zone la_zone, double pleinTarif) {
		super();
		this.le_spectacle = le_spectacle;
		this.la_zone = la_zone;
		this.pleinTarif = pleinTarif;
	}

	public Spectacle getLe_spectacle() {
		return le_spectacle;
	}

	public void setLe_spectacle(Spectacle le_spectacle) {
		this.le_spectacle = le_spectacle;
	}

	public Zone getLa_zone() {
		return la_zone;
	}

	public void setLa_zone(Zone la_zone) {
		this.la_zone = la_zone;
	}

	public double getPleinTarif() {
		return pleinTarif;
	}

	public void setPleinTarif(double pleinTarif) {
		this.pleinTarif = pleinTarif;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarif other = (Tarif) obj;
		return Objects.equals(la_zone, other.la_zone) && Objects.equals(le_spectacle, other.le_spectacle)
				&& Double.doubleToLongBits(pleinTarif) == Double.doubleToLongBits(other.pleinTarif);
	}

	public String toString() {
		return "Tarif [le_spectacle=" + le_spectacle + ", la_zone=" + la_zone + ", pleinTarif=" + pleinTarif + "]";
	}
}

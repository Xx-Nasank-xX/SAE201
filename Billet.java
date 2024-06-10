package SAE201;

import java.util.Objects;

public class Billet {
	
	private String numero;
	private Tarification promotion;

	public Billet(String numero,Tarification promotion_ajout) {
		super();
		this.numero = numero;
		this.promotion = promotion_ajout;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Tarification getPromotion() {
		return promotion;
	}

	public void setPromotion(Tarification promotion) {
		this.promotion = promotion;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Billet other = (Billet) obj;
		return Objects.equals(numero, other.numero) && Objects.equals(promotion, other.promotion);
	}

	public String toString() {
		return "Billet [numero=" + numero + ", promotion=" + promotion + "]";
	}
	
}

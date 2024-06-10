package SAE201;

public class Groupe extends Tarification{
	
	private double reductionStatic;

	public Groupe(double reductionStatic) {
		super();
		this.reductionStatic = reductionStatic;
	}

	public double getReductionStatic() {
		return reductionStatic;
	}

	public void setReductionStatic(double reductionStatic) {
		this.reductionStatic = reductionStatic;
	}

	public String toString() {
		return "la reduction Groupe est" + reductionStatic;
	}
}

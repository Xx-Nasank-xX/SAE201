package SAE201;

public class Jeune extends Tarification{
	
	private double reductionStatic;

	public Jeune(double reductionStatic) {
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
		return "la reduction Jeune est" + reductionStatic;
	}

}

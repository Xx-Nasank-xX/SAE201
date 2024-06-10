package SAE201;

public class Abonné extends Tarification{
	
	private double reductionStatic;

	public Abonné(double reductionStatic) {
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
		return "la reduction Abonné est" + reductionStatic;
	}
}

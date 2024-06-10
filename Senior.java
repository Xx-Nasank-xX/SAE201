package SAE201;

public class Senior extends Tarification{
	
	private double reductionStatic;

	public Senior(double reductionStatic) {
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
		return "la reduction Senior est" + reductionStatic;
	}
}

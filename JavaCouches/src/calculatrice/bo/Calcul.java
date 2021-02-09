package calculatrice.bo;

public class Calcul {
	private Integer a;
	private Integer b;
	private String op;

	public Calcul() {
	}

	public Calcul(Integer a, Integer b, String op) {
		this.a = a;
		this.b = b;
		this.op = op;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	@Override
	public String toString() {
		return "Calcul [a=" + a + ", b=" + b + ", op=" + op + "]";
	}

}

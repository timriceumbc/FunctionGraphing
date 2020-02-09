
public class PolynomialGrapherTester2 extends PolynomialGrapher{

	public double[] coefficients() {
		return new double[]{1, -3, -4, 12};
	}

	public double xIncrement() {
		return .1;
	}

	public double xRange() {
		return 8;
	}

	public Coordinate xyStart() {
		return new Coordinate(-4,-2);
	}

	public double yRange() {
		return 16;
	}

	public static void main(String[] args) {
		PolynomialGrapherTester2 t=new PolynomialGrapherTester2();
		t.drawGraph(0,0,800,800);
	}

}

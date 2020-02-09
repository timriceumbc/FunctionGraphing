
public class PolynomialGrapherTester3 extends PolynomialGrapher{

	public double[] coefficients() {
		return new double[]{-12, -4, 3, 1};
	}

	public double xIncrement() {
		return .1;
	}

	public double xRange() {
		return 20;
	}

	public Coordinate xyStart() {
		return new Coordinate(-10,-20);
	}

	public double yRange() {
		return 40;
	}

	public static void main(String[] args) {
		PolynomialGrapherTester3 t=new PolynomialGrapherTester3();
		t.drawGraph(0,0,800,800);
	}

}
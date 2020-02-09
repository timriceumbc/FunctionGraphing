
public class PolynomialGrapherTester extends PolynomialGrapher{

	public double xIncrement() {
		return .2;
	}

	public double[] coefficients() {
		return new double[]{4.8,-1.2,.2};
	}

	public double xRange() {
		return 6;
	}

	public Coordinate xyStart() {
		return new Coordinate(0,0);
	}

	public double yRange() {
		return 10;
	}

	public static void main(String[] args) {
		PolynomialGrapherTester t=new PolynomialGrapherTester();
		t.drawGraph(0,0,800,800);
	}

}
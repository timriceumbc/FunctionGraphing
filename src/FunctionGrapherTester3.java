
public class FunctionGrapherTester3 extends FunctionGrapher {

	public double xIncrement() {
		return .1;
	}

	public double yValue(double xValue) {
		return Math.pow(xValue,2)+3;
	}

	public double xRange() {
		return 20;
	}

	public Coordinate xyStart() {
		return new Coordinate(-10,-10);
	}

	public double yRange() {
		return 20;
	}

	public static void main(String[] args) {
		FunctionGrapherTester3 t=new FunctionGrapherTester3();
		t.drawGraph(0, 0, 800, 800);
	}

}
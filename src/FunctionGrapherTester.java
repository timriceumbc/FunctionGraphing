
public class FunctionGrapherTester extends FunctionGrapher {

	public double xIncrement() {
		return .1;
	}

	public double yValue(double xValue) {
		return Math.sin(xValue);
	}

	public double xRange() {
		return 20;
	}

	public Coordinate xyStart() {
		return new Coordinate(0,-1);
	}

	public double yRange() {
		return 2;
	}

	public static void main(String[] args) {
		FunctionGrapherTester t=new FunctionGrapherTester();
		t.drawGraph(0, 0, 800, 800);
	}

}
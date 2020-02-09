
public class FunctionGrapherTester4 extends FunctionGrapher {

	public double xIncrement() {
		return .1;
	}

	public double yValue(double xValue) {
		return (xValue+7)*(xValue+1)*(xValue-5);
	}

	public double xRange() {
		return 20;
	}

	public Coordinate xyStart() {
		return new Coordinate(-10,-250);
	}

	public double yRange() {
		return 500;
	}

	public static void main(String[] args) {
		FunctionGrapherTester4 t=new FunctionGrapherTester4();
		t.drawGraph(0, 0, 800, 800);
	}

}
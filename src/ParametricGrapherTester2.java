
public class ParametricGrapherTester2 extends ParametricGrapher{

	public double tInterval() {
		return .05*Math.PI;
	}

	public double tStart() {
		return 0;
	}

	public double tEnd() {
		return 2*Math.PI;
	}

	public double xValue(double t) {
		return 3*Math.cos(t);
	}

	public double yValue(double t) {
		return .5*Math.sin(t);
	}

	public Coordinate xyStart() {
		return new Coordinate(-5,-5);
	}

	public double xRange() {
		return 10;
	}

	public double yRange() {
		return 10;
	}
	
	public static void main(String[] args) {
		ParametricGrapherTester2 tester=new ParametricGrapherTester2();
		tester.drawGraph(0, 0, 800, 800);
	}

}

public class ParametricGrapherTester extends ParametricGrapher{

	public double tInterval() {
		return .05*Math.PI;
	}

	public double tStart() {
		return Math.PI/2;
	}

	public double tEnd() {
		return (3*Math.PI)/2;
	}

	public double xValue(double t) {
		return Math.cos(t);
	}

	public double yValue(double t) {
		return Math.sin(t);
	}

	public Coordinate xyStart() {
		return new Coordinate(-1,-1);
	}

	public double xRange() {
		return 2;
	}

	public double yRange() {
		return 2;
	}
	
	public static void main(String[] args) {
		ParametricGrapherTester tester=new ParametricGrapherTester();
		tester.drawGraph(0, 0, 800, 800);
	}

}

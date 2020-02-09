
public class GrapherTester2 extends XYGrapher{

	public Coordinate getPoint(int pointNum) {
		Coordinate[] coor={new Coordinate(-5,-3),
				new Coordinate(0,6),
				new Coordinate(5,-3),
				new Coordinate(-5,3),
				new Coordinate(5,3),
				new Coordinate(-5,-3)};
		if(pointNum<coor.length)
			return coor[pointNum];
		else
			return null;
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
		GrapherTester2 t=new GrapherTester2();
		t.drawGraph(0, 0, 800, 800);
	}

}

public class GrapherTester extends XYGrapher{

	public Coordinate getPoint(int pointNum) {
		Coordinate[] coor={new Coordinate(-1,-1),
				new Coordinate(1,-1),
				new Coordinate(1,1),
				new Coordinate(-1,1),
				new Coordinate(-1,-1)};
		if(pointNum<coor.length)
			return coor[pointNum];
		else
			return null;
	}

	public double xRange() {
		return 4;
	}

	public Coordinate xyStart() {
		return new Coordinate(-2,-2);
	}

	public double yRange() {
		return 4;
	}

	public static void main(String[] args) {
		GrapherTester t=new GrapherTester();
		t.drawGraph(0, 0, 800, 800);
	}

}

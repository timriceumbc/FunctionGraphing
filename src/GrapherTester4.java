
public class GrapherTester4 extends XYGrapher{

	public Coordinate getPoint(int pointNum) {
		Coordinate[] coor={
				new Coordinate(-3,5),
				new Coordinate(0,8),
				new Coordinate(3,5),
				new Coordinate(0,2),
				new Coordinate(-3,5,true,false),
				
				new Coordinate(0,2,false,true),
				new Coordinate(0,-3,true,false),
				
				new Coordinate(2,-7,false,true),
				new Coordinate(0,-3,false,true),
				new Coordinate(-2,-7,true,false),

				new Coordinate(-5,0),
				new Coordinate(5,0),
		};
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
		GrapherTester4 t=new GrapherTester4();
		t.drawGraph(0, 0, 800, 800);
	}

}
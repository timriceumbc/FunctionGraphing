
public class DiscontinuousTester extends DiscontinuousFunctionGrapher{

	public boolean exclude(double xValue){
		if(xValue==1)
			return true;
		return false;
	}

	public double xIncrement() {
		return .2;
	}

	public double yValue(double xValue) {
		return (Math.pow(xValue, 2)-1)/(xValue-1);
	}

	public Coordinate xyStart() {
		return new Coordinate(0,0);
	}

	public double xRange() {
		return 3;
	}

	public double yRange() {
		return 5;
	}

	public static void main(String[] args) {
		DiscontinuousTester t=new DiscontinuousTester();
		t.drawGraph(0,0,800,800);
	}

}

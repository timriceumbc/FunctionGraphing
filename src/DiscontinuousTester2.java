
public class DiscontinuousTester2 extends DiscontinuousFunctionGrapher{

	public boolean exclude(double xValue){
		if(xValue==0)
			return true;
		return false;
	}

	public double xIncrement() {
		return .2;
	}

	public double yValue(double xValue) {
		return 1/xValue;
	}

	public Coordinate xyStart() {
		return new Coordinate(-3,-3);
	}

	public double xRange() {
		return 6;
	}

	public double yRange() {
		return 6;
	}

	public static void main(String[] args) {
		DiscontinuousTester2 t=new DiscontinuousTester2();
		t.drawGraph(0,0,800,800);
	}

}

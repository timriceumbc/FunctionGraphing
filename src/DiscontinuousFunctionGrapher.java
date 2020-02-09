
public abstract class DiscontinuousFunctionGrapher extends FunctionGrapher {

	public boolean exclude(double xValue){
		return false;
	}

	public Coordinate getPoint(int pointNum){
		if(exclude(xValue(pointNum))){
			return new Coordinate(0,0,false,false);
		}
		return super.getPoint(pointNum);
	}

}

public abstract class FunctionGrapher extends XYGrapher {

	public abstract double xIncrement();
	public abstract double yValue(double xValue);

	public double xValue(int pointNum){
		double xStart=xyStart().getX();
		return xStart+xIncrement()*pointNum;
	}

	public Coordinate getPoint(int pointNum) {
		double xStart=xyStart().getX();

		if(xValue(pointNum)>=xStart&&xValue(pointNum)<xStart+xRange())
			return new Coordinate(xValue(pointNum),yValue(xValue(pointNum)));

		else if(xValue(pointNum)-xIncrement()<xStart+xRange()&&xValue(pointNum)>=xStart)
			return new Coordinate(xStart+xRange(),yValue(xValue(pointNum)));

		else
			return null;
	}

}
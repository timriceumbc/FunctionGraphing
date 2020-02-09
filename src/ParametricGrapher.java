
public abstract class ParametricGrapher extends XYGrapher{
	
	public abstract double tInterval();
	public abstract double tStart();
	public abstract double tEnd();
	public abstract double xValue(double t);
	public abstract double yValue(double t);
	
	public Coordinate getPoint(int pointNum){
		double t=tStart()+tInterval()*pointNum;
		if(t<tStart()||t>tEnd())
			return null;
		return new Coordinate(xValue(t),yValue(t));
	}

}
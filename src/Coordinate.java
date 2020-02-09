
public class Coordinate {
	private float X,Y;
	private boolean drawTo, drawFrom;

	Coordinate(double x, double y){
		X=(float)x;
		Y=(float)y;
		drawTo=true;
		drawFrom=true;
	}

	Coordinate(double x, double y,boolean from, boolean to){
		X=(float)x;
		Y=(float)y;
		drawTo=to;
		drawFrom=from;
	}

	public double getX(){
		return X;
	}

	public double getY(){
		return Y;
	}

	public boolean drawTo(){
		return drawTo;
	}

	public boolean drawFrom(){
		return drawFrom;
	}

}
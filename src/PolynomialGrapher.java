
public abstract class PolynomialGrapher extends FunctionGrapher {

	public abstract double[] coefficients();
	public double yValue(double xValue){
		double y=0;
		double[] coefficients=coefficients();
		for(int i=0;i<coefficients.length;i++){
			y+=coefficients[i]*Math.pow(xValue, i);
		}
		return y;
	}

}
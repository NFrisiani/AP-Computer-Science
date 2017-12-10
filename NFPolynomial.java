import java.util.Scanner;

public class NFPolynomial {

	static double coefficients[];

	static NFPolyRunner p = new NFPolyRunner();
	

	public NFPolynomial(double[] a)
	{
		coefficients = new double[a.length];
		
		for(int i = 0; i <= a.length -1; i++)
		{
			coefficients[i] = a[i];
		}
	}
	
	
	public static double degree()
	{
		return coefficients.length-1;
	}
	
	
	public static double getValue(double x)
	{
		double value = 0;
		
		for(int k = coefficients.length - 1; k > 0; k--)
		{
			value = (coefficients[k] + value) * x;
		}
		
		value += coefficients[0];
		return value;
	}
	
	
	public String toString()
	{
		String polynomial ="";
		
		for(int j = 0; j <= coefficients.length -2; j++)
		{
			polynomial += (int)coefficients[j] + "X^" + j + " " + "+ ";
		}
		
			polynomial += (int)coefficients[coefficients.length - 1] + "X^" + (coefficients.length -1) + " ";
		
		return polynomial;
	}
	
	
	public static NFPolynomial multiply(NFPolynomial other)
	{	
		double multyPoly[] = new double[(coefficients.length + p.pol2.length) - 1];
		
		for(int k = 0; k <= coefficients.length - 1; k++)
		{
			for(int i = 0; i <= p.pol2.length - 1; i++)
			{
				multyPoly[k+i] += coefficients[k] * p.pol2[i];
			}
		}
		
		
		NFPolynomial productPoly = new NFPolynomial(multyPoly);
		
		
		return productPoly;
		
	}
}

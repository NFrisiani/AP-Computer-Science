
public class NFPolyRunner {


	static double[] pol2 = {3, 5, 2};
	static double[] pol = {2, 4, 3};
	
	
	public static void main(String args[])
	{
		NFPolynomial poly2 = new NFPolynomial(pol2);
		System.out.println(poly2.toString());
		System.out.println();
		System.out.println("The degree is " + poly2.degree() );
		System.out.println("The value if x = to 3 is " + poly2.getValue(3));
		System.out.println();
		System.out.println();
		System.out.println();
		
		NFPolynomial poly = new NFPolynomial(pol);
		System.out.println(poly.toString());
		System.out.println();
		System.out.println("The degree is " + poly.degree() );
		System.out.println("The value if x = to 3 is " + poly.getValue(3));
		System.out.println();
		System.out.println();
		System.out.println();
		
		NFPolynomial mulPol = poly.multiply(poly2);
		System.out.println("The product of the two polynomial is " + mulPol.toString());
		System.out.println();
		System.out.println("The degree of the product is " + mulPol.degree() );
		System.out.println("The value of the product if x = to 3 is " + mulPol.getValue(3));
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
}

import java.util.Scanner;


public class NicoloFrisianiArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double Xab;
		double Yab;
		double Xbc;
		double Ybc;
		double Xac;
		double Yac;
		
		System.out.println("Enter the first x coordinate: ");
		int x1 = input.nextInt();
		
		
		System.out.println("Enter the first y coordinate: ");
		int y1 = input.nextInt();
		
		
		System.out.println("Enter the second x coordinate: ");
		int x2 = input.nextInt();
		
		
		System.out.println("Enter the second y coordinate: ");
		int y2 = input.nextInt();
		
		
		System.out.println("Enter the third x coordinate: ");
		int x3 = input.nextInt();
		
		
		System.out.println("Enter the third y coordinate: ");
		int y3 = input.nextInt();
		
		
		
		
		if(x1>x2) {
			
			Xab = x1 - x2;
			
		}else{
			
			Xab = x2 - x1;
		}
		
		
		if(y1>y2) {
			
			Yab = y1 - y2;
			
		}else{
			
			Yab = y2 - y1;
		}
		
		
		
		
		
		
		if(x2>x3) {
			
			Xbc = x2 - x3;
			
		}else{
			
			Xbc = x3 - x2;
		}
		
		
		if(y2>y3) {
			
			Ybc = y2 - y3;
			
		}else{
			
			Ybc = y3 - y2;
		}
		
		
		
		
		
		
		
	if(x3>x1) {
			
			Xac = x3 - x1;
			
		}else{
			
			Xac = x1 - x3;
		}
		
		
		if(y3>y1) {
			
			Yac = y3 - y1;
			
		}else{
			
			Yac = y1 - y3;
		}
		
		
		
		
		
		
		
		double AB = (double) Math.sqrt((Xab * Xab) + (Yab * Yab) );
		double BC = (double) Math.sqrt((Xbc * Xbc) + (Ybc * Ybc) );
		double AC = (double) Math.sqrt((Xac * Xac) + (Yac * Yac) );
		
		
		
		
		
		double s = (double) (AB + BC + AC)/2;
		
		double Area = (double) Math.sqrt(s * ((s-AB) * (s-BC) * (s-AC)));
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("The area of the triangle is: " + Area);
		
		
	}
}

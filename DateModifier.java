import java.util.Scanner;


public class DateModifier {

	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Insert date to convert: ");
    
	String date = input.nextLine();
	
	System.out.println(dateModifier(date));
	}
	
	
	public static String dateModifier(String date)
	{
		
		String dt1 = date.substring(0, date.indexOf("/"));
		
		if (dt1.length() <2)
		{
			date = "0" + date;
		}
		
		
		String dt2 = date.substring(3, date.indexOf("/"));
		
		if (dt1.length() <2)
		{
			date = date.substring(0, 3) + "0" + date.substring(7);
		}
		
			
			
			
		String date1 = date.replace("/", "-");
		
		String date2 = date1.replaceFirst("-", "");
		
		String realDate = date1.substring(3, 6) + date1.substring(0, 3) + date1.substring(6);
		
		
		return realDate;
	}
}

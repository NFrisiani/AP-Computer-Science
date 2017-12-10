
public class NicoloFrisianiMexicanPopulation {

	public static void main(String[] args)
	{
		
		
	
	double population = 111.2;
	int k = 2010;
	
	while (population < 120) 
	{
		population = population + ((1.13 * population)/100);
		k++;
	}
	
	System.out.println("The population will reach " + (int)population + " in " + k);
	
} }

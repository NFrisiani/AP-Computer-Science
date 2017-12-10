
public class NicoloFrisianiBook {

	
	private int numPages;
	private int currentPages;
	

     public NicoloFrisianiBook(int nP) {
    	 
    
    	 
    	 numPages = nP;
    	 currentPages = 1;
    	
     }
     
     
     
     public void nextPage() {
    	 
    	 
    	 if(currentPages < numPages) {
    	 
    	 currentPages++;
    	 }
    	 
     }
     
     
     public int getCurrentPages(){
    	 
    	 return currentPages;
     }
     }

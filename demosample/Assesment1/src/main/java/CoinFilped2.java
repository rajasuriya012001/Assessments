import java.util.Scanner;

public class CoinFilped2 {
	
    
   
    public static void main(String args[]) {
    	 
		 Scanner src=new Scanner(System.in);
	        int stand = src.nextInt();
	        for(int i=0;i<stand;i++) {
	        	if(Math.random()<0.5) {
	    			System.out.println("head");
	    		}
	    		else {
	    			System.out.println("tails");
	    		}
	}
	        
}
    }
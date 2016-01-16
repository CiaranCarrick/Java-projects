/**
 * @(#)matrix.java
 *
 *
 * @author 
 * @version 1.00 2010/11/3
 */
//Have this to run from the console for the intended effect, simple and awesome.

public class matrix {

    public static void main(String args[]) {
    	
    	//Declare variables
    	int dice;
    	
    	int i=1;//counter for while loop
    	int x;
    	for(x=0; x<10000;x++)
    	
    	//start
    	while(i<10000000){
    		//generate number
    		dice =1+ (int)(Math.random()*8);
    		//print symbol depending on number rolled
    		if (dice==1){
    			System.out.print("&");
    				
    		}
    		else
    			if (dice==2){
    				System.out.print("x");
    				
    			}
    		else
    			if(dice==3){
    				System.out.print("y");
    				
    			}
    		else
    			if(dice==4){
    				System.out.print("z");
    				
    				
    			}
    		else
    			if(dice==5){
    				System.out.print("Q");
    				
    			}
    		else
    			if(dice==6){
    				System.out.print("$");
    				
    			}
    		else
    			if(dice==7){
    			
    			System.out.print("H");
    									
    			}
    		else
    			if(dice==8){
    				System.out.print("w");
    			}
    	//increment i
    	i++;
    	}//end while
    }
    
    
}

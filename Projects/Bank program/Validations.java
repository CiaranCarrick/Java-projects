/**
 * @(#)Validations.java
 *
 *
 * @Ciaran Carrick
 * @version 1.00 2012/4/30
 */

import java.util.Scanner; //Imports Scanner.
public class Validations {
	static Scanner input = new Scanner(System.in);//'static' to make Global
    public static int validate(String x,String y){
		while (!x.matches(y))	{
			System.out.println("Error, re-enter information");
			x=input.next();
		}//end while
		return Integer.parseInt(x);

}//End Validate

	//Account Validation
	public static int validateAccount(String x, String y){
        while(!x.matches("\\d{4}")){
        	System.out.println("error, 4 digits only");
        	x=input.next();
        }//End while
        //Parse
        return Integer.parseInt(x);
	}//end validateAccount

	public static int validateBalance(String x){
        while(!x.matches("\\d+")){
        	System.out.println("Error, Digits only please");
        	x=input.next();
        }//End while
        //Parse
        return Integer.parseInt(x);
	}//end validateBalance
	//ValidateAge
	public static int validateAge(String x) { //Validation method for age
    	int Age;

    	do{ //Start do
    		Age = validateBalance(x); //Validate x for digits only.

    		if(Age<16 || Age>120){ //If age is less than 16 or more than 120
    			System.out.println("Please enter age between 16-120:");
    			x = input.next();
    		}//end if
    	}//end do
    	//Start while
    	while(Age<16 || Age>120); //End loop if entered age is between 16 and 120

    	return Age; //Returns age to class
    }//end validAge method


}//end class
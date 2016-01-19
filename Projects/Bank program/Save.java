/**
 * @(#)Save.java
 *
 *
 * @Ciaran Carrick
 * @version 1.00 2012/4/18
 */
import java.io.*; //Imports library for saving
import java.util.Scanner; //Imports Scanner.
public class Save {

    public static void RunSave() {//Method used to save details as a document

    	int flag = 0; //Flags used to show if info was saved or not
    	Scanner input = new Scanner(System.in);

    	System.out.print("\nEnter the file name you wish to save the account details as\nFile name: ");
    	String SaveFile = input.next();
    	SaveFile = SaveFile + ".doc"; //Creates a .Doc

		//Start try
    	try{
	    	for(int x=0; x<Customertest.cuscounter; x++){ //Start for loop to save customer details
	    		BufferedWriter Information = new BufferedWriter (new FileWriter(SaveFile,true)); //Used to buffer information from user
	    		Information.newLine(); //Makes new line
	    		Information.write(Customertest.customerarray[x].toString()); //writes info using toString
	    		Information.close(); //Closes Information
		    }//end for
    	}//end try

		//Start catch
    	catch(Exception ex){
    		flag = 1;
    	}//end catch

    	if(flag == 0){ //Saved correctly
    		System.out.println("Customer's informaion has been successfully saved to \"" + SaveFile + "\"file.");

    	}//end if
    	else{ //If there was a problem with saving DOC
    		System.out.println("Customer's infomation has not been saved correctly.");

    	}//end else
    }//end run method


}//end class
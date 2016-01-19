/**
 * @(#)customertest.java
 *
 *
 * @Ciaran Carrick
 * @version 1.00 2012/4/18
 */
import java.util.Scanner; //Allows for inputs
public class Customertest {
	//Global variables
	static Scanner input = new Scanner(System.in);
	static int cuscounter=0;
	static customer customerarray[] = new customer[5];
	static String premium;

	public static void main(String args[]) {
    	//Declare Main variables
    	String name[] = new String [5];

    	int age [] = new int [5];
    	int balance[] = new int [5];
    	int salary[] = new int [5];
    	int accountnumber[] = new int [5];
    	int overdraftL[] = new int [5];
    	String overdraft[] = new String [5];

    	int Loginflag=0, Login=0, Choice=0, Currentcustomer=6, Menu=0;
    	int Result=0, Lodge=0, Withdraw=0;
    	String strlodge;
    	String strchoice;
    	String strwithdraw;


		//Secondary variables
    	String strint="";
    	String val1 ="\\d+";


    	//while loop to take in customers
    	while((cuscounter< 5) && (Choice!=-1)){
    		System.out.print("----------Welcome User!----------");
    		System.out.println("\nCustomer" + (cuscounter+1));
    		if (cuscounter<1){
    			System.out.print("\nEnter name: ");
    			name[cuscounter] = input.next();
    		}//End if

    		else{
    			System.out.print("\nEnter name, -1 to quit:");
    			name[cuscounter] = input.next();

    			if (name[cuscounter].matches("-1")){
					break;
    	 		}//End If
    		}//End else

			//ACCOUNT
    		System.out.print("\nEnter Account number:");
			strint = input.next();
    		accountnumber[cuscounter] = Validations.validateAccount(strint,val1); //Validation

			//AGE
    		System.out.print("\nEnter age:" );
    		strint=input.next();
    		age[cuscounter] =  Validations.validateAge(strint);

    		personaldetails pd = new personaldetails (name[cuscounter],age[cuscounter]);

			//SALARY
    		System.out.print("\nEnter Salary: ");
    		strint=input.next();
    		salary[cuscounter] = Validations.validate(strint,val1);//Validation

			//BALANCE
    		System.out.print("\nEnter current balance:");
			strint = input.next();
    		balance[cuscounter] = Validations.validateBalance(strint);//Validation

			//PREMIUM
    		System.out.println("Premium Customer? (Y/N)");
    		premium = input.next();


    		if (premium.matches("y")){
    			System.out.println("Enter overdraft limit:");
    			overdraftL[cuscounter] = input.nextInt();
    			if(overdraftL[cuscounter] > 0 ){
    				overdraft[cuscounter] = "Enabled";
    				customerarray[cuscounter] = new premiumcustomer (pd,salary[cuscounter],balance[cuscounter], accountnumber[cuscounter],overdraft[cuscounter],overdraftL[cuscounter]) ;
    			}//end if
    			else{

    				overdraft[cuscounter] = ("Disabled");
    			}//end else
    		}//end If
    		else if (premium.matches("n")){
 		   		customerarray[cuscounter] = new customer(pd,salary[cuscounter],balance[cuscounter], accountnumber[cuscounter]) ;

 		   		}//end else
 		   	else{

 		   		overdraftL[cuscounter] = Validations.validate(strint,val1);//Validation
 		   	}//end else

 		   	cuscounter++;
		Choice=0;
    	}//End while loop

    	//Being login While loop
    	while (Currentcustomer == 6){

    	System.out.println("Enter your account number to log in");
    	strint = input.next();
    	Login = Validations.validate(strint,val1);//Validation
    	//Start if
    	for (int i=0;i<cuscounter;i++){

    		if (Login == accountnumber[i]){
    			Currentcustomer=i;
    			Loginflag=1;
    			System.out.println("\n*****login successful!*****\n");

    		}//End if
    		else{
    			System.out.println("\nAccount num doesn't match, try again");
    		}//End else


     		}//End for loop
    	}//End While loop

    	//Start do
			do{
				System.out.println("---Account---");
	    		System.out.println("Name: "+ name[Currentcustomer] +"\nAcc Num: " + accountnumber[Currentcustomer] + "\nBalance: " +balance[Currentcustomer] + "\n\n---Select one of the following---" );
	    		System.out.println("\n1.Lodge\n2.Withdraw\n3.Customer details\n4.Other customers details\n5.Quit\n");
	    		System.out.println("\nEnter a choice please: ");
	    		strchoice=input.next();

    			while(!strchoice.matches("[1-5]")){
    				System.out.print("\n\nError,Enter numbers 1-5 only\n");
    				System.out.println("-----Account-----");
    				System.out.println("Name: "+ name[Currentcustomer] +"\nAcc Num: " + accountnumber[Currentcustomer] + "\nBalance: " +balance[Currentcustomer] + "\n\n---Select one of the following---" );
    				System.out.println("\n1.Lodge\n2.Withdraw\n3.Customer details\n4.Other customers details\n5.Quit\n");
    				System.out.println("\nEnter a choice please: ");
    				strchoice=input.next();
    			}//end while
    			//parse
    			Choice= Integer.parseInt(strchoice);

    			//LODGE
    			switch(Choice){ //Start switch to call the right method.
    			case 1: //Lodge.
    			System.out.print("\nLodge amount:");
    			strlodge=input.next();

    			while(!strlodge.matches("\\d+")){
    				System.out.print("Error,Enter numbers only\nLodge amount:");
    				strlodge=input.next();
    			}//end while
    			//parse
    			Lodge= Integer.parseInt(strlodge);

    			balance[Currentcustomer]=balance[Currentcustomer]+Lodge;
    			System.out.println("\n\n"+ Lodge+" Was successful lodged in to account");
    			break;

    			case 2://WITHDRAW

    			System.out.println("\nYour balance is ="+balance[Currentcustomer]+"\nWithdraw amount:");
    			strwithdraw=input.next();
				//Start While
    			while(!strwithdraw.matches("\\d+")){
    				System.out.print("Error,Enter numbers only\nWithdraw amount:");
    				strwithdraw=input.next();
    			}//end while
    			//parse
    			Withdraw=Integer.parseInt(strwithdraw);

    			//Start if
    			if(premium.matches("n") && Withdraw>balance[Currentcustomer]){
				System.out.println("******Insufficient funds******");
    			}//end if

    			//Start else
    			else{
    				balance[Currentcustomer]=(balance[Currentcustomer]-Withdraw);
    				Menu=0;
    				System.out.println("\nBalance updated\n\nYour current balance is "+balance[Currentcustomer]);
    			}//End else

    			case 3://VIEW DETAILS
    			System.out.println("---YOUR DETAILS---");
    			break;


    			case 4://VIEW ANOTHER CUSTOMER
		    		System.out.print("Enter Account num of customer:");
		    		strint = input.next();
	    		Login = Validations.validate(strint,val1);//Validation
	    		for (int i=0;i<cuscounter;i++){

	    		if (Login == accountnumber[i]){
	    			Currentcustomer=i;
	    			Loginflag=1;
	    			System.out.println("\n---login successful!---");
	    		}//End if
	    		else{
	    			System.out.println("\nNo records found");
	    		}//End else
	     		}//End for loop
	    		break;

	    		case 5://Quit choice
	    			System.out.println("\nThank you for using this program");
				} //End switch if choice is 5.

	    	}//End Do
	    	//Start While
	    	while(Choice != 5); //End while loop if while choice == 5


			if(Customertest.cuscounter>0){ //If any customers were added.
	    		Save.RunSave(); //Call save class
	    	}//end if


	}//End Method

}//End Class
























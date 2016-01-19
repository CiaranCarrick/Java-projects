/**
 * @(#)customer.java
 *
 *
 * @Ciaran Carrick
 * @version 1.00 2012/4/18
 */


public class customer {
	private int salary;
	private int balance;
	private int accnum;
	private personaldetails p1;

    public customer(personaldetails p, int s, int b, int a ) {
    	p1=p;
    	salary = s;
    	balance = b;
    	accnum = a;
    }//end constructor

     public int getbal() {
     	return balance;
     }//end getbal

     public void setBalance(int x) { //Method used to set balance
		balance = x;
	}//end setBalance method

	public void lodge(int x) { //Method lodge
		balance = balance + x; //Increase the balance using input
		System.out.println("\n" + x + " lodged.\nYour new balance is: " + balance); //New balance displayed
	}//end lodge method



}//End Class
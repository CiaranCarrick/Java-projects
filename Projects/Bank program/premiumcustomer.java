/**
 * @(#)premiumcustomer.java
 *
 *
 * @Ciaran Carrick
 * @version 1.00 2012/4/18
 */


public class premiumcustomer extends customer {
	private String overdraft;
	private int overdraftlimit;

    public premiumcustomer(personaldetails p, int s, int b, int a, String o, int ol) {
    	super (p,s, b, a);
    	overdraft = o;
    	overdraftlimit= ol;

    }//end main method

//    public string getoverdraft(){

	 //return overdraft;

	 //public int getoverdraftlimit(){


	 //	return overdraftlimitlimit;

  //  }


}//end class


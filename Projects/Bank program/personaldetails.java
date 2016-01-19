/**
 * @(#)personaldetails.java
 *
 *
 * @author
 * @version 1.00 2012/4/18
 */


public class personaldetails {
	private String name;
	private int age;

    public personaldetails(String n, int a) {
    	name = n;
    	age = a;
    }//end constructor
     //public setname {

     //}
     public String getname(){
     return name;
     }
     //public setage{

     //}
     public int getage(){
     	return age;

     }
    public String toString(){
    	return ("name " + name + "age "+ age);
    }//end to String



}//End class
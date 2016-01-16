/**
 * @(#)Gift.java
 *
 *
 * @Ciaran Carrick
 * @version 1.00 2012/02/3
 */

import java.util.Scanner;
public class Gift {
	//User Names/Points
	static public String names[] ={Ciaran","Paul","Dave","Carl","Lenny"};
	static int points[] = {300,400,600,500,800};

	//Item names and there cost
	static String item_names[] = {Alarm","Bike","Fridge","Crayons","Lego"};
	static int item_price[] = {100,150,400,120,300};

	//User choice for menu/items
	static int choice=0, gift_choice;
	static String choice_str, gift_choice_str;//For Validation

	//Prompts the user
	static Scanner input = new Scanner(System.in);

	//Main method
	public static void main(String args[]) {

		//Loop menu with method calls
		while(choice!= 4){
			//Method call menu
			Menu();
			System.out.print("\nEnter a choice please: ");
			choice_str=input.next();

			//Method call to check validation
			choice =MenuValidation(choice_str);

			//Option 1
			if(choice == 1){
				//Method call
				Viewgift();//Display method
			}//End if

			//Option 2
			else if(choice == 2 ){
				//Prompting the user to enter User ID
				System.out.print("Enter User ID please: ");
				choice_str=input.next();

				//Validation
				choice = Validation(choice_str);

				//Take User ID
				user(choice);
			}//End else if

			//Option 3
			else if(choice == 3){

				//View gift method
				Viewgift();

				//Prompt user to choose gift
				System.out.print("Enter Gift ID to buy a gift: ");
				gift_choice_str=input.next();

				//Validation call
				gift_choice = Validation(gift_choice_str);

				//Ask user whos purchasing the gift
				System.out.print("You chose "+item_names[gift_choice]+"\nEnter who wants to buy it: ");
				choice_str=input.next();

				//Validation call
				choice=Validation(choice_str);

				//Method call RETURN
				choice=Buygift(choice, gift_choice);

				//Printing the amount of points left
				System.out.println("You have " +choice+ " left\n");
			}//end else if

			//Option 4
			else{
				System.out.println("Thank you for using the program\nHave a nice day!\n");
				System.exit(0);
			}//end else

		}//end while

	}//end main method


	//Menu method
	public static void Menu(){
		System.out.println("\n------------Gift Shop Menu----------\n");
		System.out.println("1.View all Gifts\n2.Customer Details\n3.Buy a gift\n4.Quit\n");
	}//End menu method

	//Validation method
	public static int MenuValidation(String x){
		while(!x.matches("[1-4]")){
			System.out.print("Error, numbers only please: ");
			x = input.next();
		}//End while
		int y = Integer.parseInt(x);
		return(y);

	}//End Menu Validation method

	//Validation method
	public static int Validation(String x){
		while(!x.matches("[1-5]")){
			System.out.print("Error, 1-5 only please: ");
			x = input.next();
		}//end while
		int y = Integer.parseInt(x);
		return(y);

	}//end validation method

	//Gifts method
	public static void Viewgift(){
		//Gift Menu

		System.out.println("\nItem Num 	 Gift	      Price\n");
		System.out.print("--------------------------------------\n");
		//Skips 0 subscript user
		for(int i=0;i<6;i++){
			if(i==0){
				continue;
			}//End if

			//Items
			System.out.println(i +"\t\t" +item_names[i] + "\t\t" + item_price[i]+ "\n");
		}//End for loop
		System.out.print("--------------------------------------\n");

	}//End view gift method

	//User method
	public static void user(int x){
		//Show the chosen user
		System.out.println("\n\nHello " +names[x] + "\nBalance="+ points[x]);
	}//end user method


	//Buygift method
	public static int Buygift(int x, int y){
		//Notify user they lack the funds to purchase item
		if(points[x] < item_price[y]){
			System.out.print("\nSorry " + names[x] + ", not enough points\n");
			return(points[x]);
		}//end if

		//Notify user they've bought a gift
		else{
			System.out.println("\nItem bought, " + names[x]);
			points[x] = points[x] - item_price[y];
			return(points[x]);
		}//End else if

	}//End buy gift method
}//End class

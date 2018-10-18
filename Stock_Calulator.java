

import java.util.Scanner;

public class Stock_Calulator {

	public static void main(String[] args) {

		/**
		 * 
		 * 
		 * @auther Sam Bauer
		 * 
		 */

			Scanner bread = new Scanner (System.in);
			System.out.print("Please enter you're name: ");
			String Name;
			Name = bread.nextLine();
			
			System.out.println("\n\nHello, " + Name + ", welcome to Stock Calulator!");
			System.out.println("Press enter to continue..");
			bread.nextLine();
			
			System.out.println("\n\nPlease enter the number of shares you purchesed:	");
			String NumSTR  = bread.nextLine();
			
			System.out.println("\nHow much was each share in $:     ");
			String PriceSTR= bread.nextLine();
			
			int NumStock = Integer.parseInt(NumSTR);
			
			double Price = Double.parseDouble (PriceSTR);
			
			System.out.println("\nPlease enter the commisson rate on the purches in decimals:     ");
			String CommissonSTR = bread.nextLine();
			
			System.out.println("\nPlease enter the sale price per share:     ");
			String SaleSTR = bread.nextLine();
			
			double Commisson = Double.parseDouble (CommissonSTR);
			
			double Sales = Double.parseDouble (SaleSTR);

			System.out.println("\nPlease enter the sales commisson rate on the purches in decimals:     ");
			String S_CommissonSTR = bread.nextLine();
		
			double S_Commisson = Double.parseDouble (S_CommissonSTR);

		
			System.out.println("\nResults:");
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}

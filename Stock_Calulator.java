

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
			
			double NumStock = Double.parseDouble(NumSTR);
			
			double Price = Double.parseDouble (PriceSTR);
			
			double StockPrice = (NumStock *  Price);
			
			System.out.println("\nPlease enter the commisson rate on the purches:     ");
			String CommissonSTR = bread.nextLine();
			
			double Commission = Double.parseDouble(CommissonSTR);
			
			double Commission_T = (Commission * StockPrice);
			
			System.out.println("\nPlease enter the sale price per share:     ");
			String SaleSTR = bread.nextLine();
			
			
			double Sales = Double.parseDouble (SaleSTR);
			
			double SalePrice = ( Sales * NumStock );

			System.out.println("\nPlease enter the sales commisson rate on the purches in decimals:     ");
			String S_CommissonSTR = bread.nextLine();
		
			double S_Commisson = Double.parseDouble (S_CommissonSTR);

			double SCommission = (S_Commisson *  SalePrice);
		
			System.out.println("\nResults:");
			
			System.out.println("\nTotal paid for " + NumStock + "shares: $" + StockPrice);
			
			System.out.println("\nCommission on purchase: $" + Commission_T);
			
			System.out.println("\nTotal sale price for " + NumStock + "shares: $" + SalePrice);
		 
			System.out.println("\nCommisson on sales purchase: $" + SCommission);
			
			double Net_Loss = ( StockPrice + Commission_T + SCommission);
			
			double Net_GL = (SalePrice - Net_Loss);
			
			System.out.println("\nYou're net gain/loss is: $" + Net_GL);
			
			System.out.println("\nEnd");
			
			
			
			
			
			
			
			
			
			
	}

}

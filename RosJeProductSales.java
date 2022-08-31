/*
 * Program Name:   RosJeProductSales
 * Author:         Jerrick Rose
 * Date Written:   8/31/22
 * The class name: CIT 149 Java 1
 * Description:    This program accepts the price and quantity of an 
 *                 item being purchased, then outputs the price,
 *                 Quantity, sub total, sales tax, and the total sale.
 */

import java.util.Scanner;

public class RosJeProductSales {
	
		public static void main(String[] args) {
			
		// Identifier Declarations
		final double taxRate=0.06;
		double itemPrice;
		int unitsPurchased;
		double subTotal;
		double salesTax;
		double finalTotal;
		
		 // Creates a Scanner object to read from the keyboard
		 Scanner keyboard=new Scanner(System.in);
		 
		 //Display prompts and gather info
		 		System.out.println("Enter the item price");
		 		itemPrice = keyboard.nextDouble();
		 		System.out.println("Enter the quanity purchased");
		 		unitsPurchased = keyboard.nextInt();
		 		
		  // Calculations
			subTotal = itemPrice * unitsPurchased;
			salesTax = subTotal * taxRate;
			finalTotal = subTotal + salesTax;
			
			//Display results
			  System.out.print("Product price: $" + itemPrice);
			  System.out.print("\nNumber of units purchased: " + unitsPurchased);
			  System.out.print("\nSub-total: $" + subTotal);
			  System.out.print("\nSale tax on purchase: $" + salesTax);
			  System.out.print("\nFinal Sale amount: $" + finalTotal); 
		}
}


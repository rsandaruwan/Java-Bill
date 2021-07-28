package bill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	public class ShoppingBill {
		  public static void main(String[] args) {
		    
		    // variables
		    String productName = null;
		    double peanut = 100.00;
			double whipped = 150.00;
			double hard = 200.00;
		    int quantity = 0;
		    double price = 0.0;
		    double totalPrice = 0.0;
		    double overAllPrice = 0.0;
		    char choice = '\0';

		    // create Scanner class object
		    Scanner scan = new Scanner(System.in);

		    List<Product> product = new ArrayList<Product>();

		    do {
		    	
		    
		      // read input values
		      System.out.println("Enter product details,\n");
		      System.out.print("Peanut - Type(A) \n");
			  System.out.print("Whipped cream - Type(B) \n");
			  System.out.print("Hard Chocolate - Type(C) \n\n");
		      System.out.print("Name: ");
		      productName = scan.nextLine();
		      char aice = productName.charAt(0);
		      System.out.print("Quantity: ");
		      quantity = scan.nextInt();
//		      

		      // calculate total price for that product
		      if(aice =='A'|| aice =='a') {
		    	  totalPrice = peanut * quantity;
		      }
		      else if(aice =='B'||  aice =='b') {
		    	  totalPrice = whipped * quantity;
		      }
		      else if(aice =='C' || aice =='c') {
		    	  totalPrice = hard * quantity;
		      }

		      // calculate overall price
		      overAllPrice += totalPrice;

		      // create Product class object and add it to the list
		      product.add( new Product(
		          productName, quantity, price, totalPrice) );

		      // ask for continue?
		      System.out.print("Want to add more item? (y or n): ");
		      choice = scan.next().charAt(0);

		      // read remaining characters, don't store (no use)
		      scan.nextLine();
		    } while (choice == 'y' || choice == 'Y');

		    // display all product with its properties
		    Product.displayFormat();
		    for (Product p : product) {
		      p.display();
		    }

		    // overall price
		    System.out.println("\nTotal Price = " + overAllPrice);

		    // close Scanner
		    scan.close();
		  }

	}

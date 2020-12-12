
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author op7
 */
public class Order {

    LunchSet lunchset;
    String staffNumber;
    String officeLocation;

    public boolean place(Scanner sc) {
	/**
	 * Check if there is remaining stock. If so, prompt user to enter staff
	 * number and office location, then reduce the item from stock and return true.
	 * Otherwise, prompt user that it's sold out and return false.
	 */
	
	boolean is_successful = false;

	if (lunchset.getMenu().availableCount > 0) {
	    lunchset.placeOrder(sc);
	    System.out.print("Staff Number:");
	    staffNumber = sc.nextLine();
	    System.out.print("Office Location:");
	    officeLocation = sc.nextLine();
	    lunchset.getMenu().availableCount--;
	    is_successful = true;
	} else {
	    System.out.println("Sold out!");
	}
	
	return is_successful;
    }

    public String toString() {
	String msg = String.format("%s: %s, %s, %s", lunchset.getMenu().getCODE(), staffNumber, officeLocation, lunchset.orderDetails());
	return msg;
    }

}


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
public abstract class LunchSet {
    protected Menu menu;

    public Menu getMenu() {
	return menu;
    }
    
    public abstract void placeOrder(Scanner sc);
    
    public abstract String orderDetails();
    
    public abstract String toString();
}

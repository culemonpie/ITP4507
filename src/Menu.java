
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
public abstract class Menu {
    
    /**
     * An abstract class "MENU".
     * When a new type of menu is created, a new subclass extending for this class is to be created.
     */
    

    int price = 0;
    int availableCount = 0;
    String CODE = "";

    // Edit the details of the menu
    public abstract void editMenu(Scanner sc);
    
    // Create a lunchset instance that belong to that type of menu
    public abstract LunchSet createLunchSet();
    
    // Empty constructor
    public Menu(){	
    }
    
    // A short text describing the type of the menu. Will be hard-coded and is read only.
    public abstract String getCODE();


}

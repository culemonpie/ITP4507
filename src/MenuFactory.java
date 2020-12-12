
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
public class MenuFactory {

    //The singleton instance for each type of menu.
    static ChineseMenu chineseMenu = new ChineseMenu();
    static WesternMenu westernMenu = new WesternMenu();
    
    //The list of all menus.
    static private Menu[] menus = {chineseMenu, westernMenu};

    public MenuFactory() {
    }
    
    
    //Prompting user to select the type of menu.
    public static Menu getMenu(Scanner sc) {
	System.out.println("Chinese or Western (c | w):");
	String type = sc.nextLine();
	return getMenu(type);
    } 
    
    //Returning the type of menu by a corresponding String.
    public static Menu getMenu(String type){
	Menu menu = null;
	if (type.equals("c")) {
	    menu = chineseMenu;
	} else if (type.equals("w")) {
	    menu = westernMenu;
	}

	return menu;	
    }

    public static Menu[] getMenus() {
	return menus;
    }

}

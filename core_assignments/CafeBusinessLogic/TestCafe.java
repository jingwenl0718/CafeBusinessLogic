import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        
        CafeUtil appTest = new CafeUtil();

    /* 
      You will need add 1 line to this file to create an instance 
      of the CafeUtil class. 
      Hint: it will need to correspond with the variable name used below..
    */
    	
        /* ============ App Test Cases ============= */
    
        // System.out.println("\n----- Streak Goal Test -----");
        // System.out.printf("Purchases needed by week %d: %s \n\n", 12, appTest.getStreakGoal(14));
    
        // System.out.println("----- Order Total Test-----");
        // double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        // System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        // System.out.println("----- Display Menu Test-----");
        
        // ArrayList<String> menu = new ArrayList<String>();
        // menu.add("drip coffee");
        // menu.add("cappuccino");
        // menu.add("latte");
        // menu.add("mocha");
        // appTest.displayMenu(menu);
    
        // System.out.println("\n----- Add Customer Test-----");
        // ArrayList<String> customers = new ArrayList<String>();
        // // --- Test 4 times ---
        // for (int i = 0; i < 4; i++) {
        //     appTest.addCustomer(customers);
        //     System.out.println("\n");
        // }

        // String product = "Columbian Coffee Grounds";
        // double price = 15;
        // int maxQuantity = 3;
        // appTest.printPriceChart(product, price, maxQuantity);

        // ArrayList<String> menuitems = new ArrayList<String>();
        // menuitems.add("drip coffee");
        // menuitems.add("cappuccino");
        // menuitems.add("latte");
        // menuitems.add("mocha");

        // ArrayList<Double> prices = new ArrayList<Double>();
        // prices.add(1.50);
        // prices.add(3.50);  
        // prices.add(4.50);
        // prices.add(3.50);
        // System.out.println(appTest.displayMenu(menuitems, prices));

        ArrayList<String> customers = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
          appTest.addCustomers(customers);
        }

    }
}
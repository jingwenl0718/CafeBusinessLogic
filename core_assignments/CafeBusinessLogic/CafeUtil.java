import java.util.ArrayList;
import java.text.NumberFormat;

public class CafeUtil {

    // Method1: to get the sum of drinks
    public int getStreakGoal(int numWeeks) {
        int sum = 0;

        /*------using while loop------
        int i = 1;
        while (i < 11) {
            sum += i;
            i++;
        } */

        // ------using for loop------
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    // Method 2: to get the total price of all the drinks
    public double getOrderTotal(double[] prices) {
        double sum = 0;

        /*------using enhanced forloop------
        for (double price: prices) {
            sum += price;
        }
        return sum;*/

        //------using conventional forloop------
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }

    // Method 3: to print out each index and menu item in the ArrayList
    public void displayMenu(ArrayList<String> menuitems) {
        for (int i = 0; i < menuitems.size(); i++) {
            System.out.println(String.format("%d %s ", i, menuitems.get(i)));
        }
    }

    // Method 4: to add customer
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println(String.format("Hello, %s", userName));
        System.out.println(String.format("There are %d people in front of you.", customers.size()));
        customers.add(userName);
        System.out.print(customers);
    }

    // // Method 5: to get the price chart
    // public void printPriceChart(String product, double price, int maxQuantity) {
    //     System.out.println(product);
    //     for (int i = 1; i <= maxQuantity; i++) {
    //         // System.out.println(i + " - " + "$" + (price*i-0.50*(i-1)));
    //         double totalPrice = price*i-0.50*(i-1);
    //         System.out.println(i + " - " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(totalPrice));

    //     }
    // }

    // Method 6: to display menu with prices
    public boolean displayMenu(ArrayList<String> menuitems, ArrayList<Double> prices) {
        if (menuitems.size() != prices.size()) {
            return false;
        } else {
            for (int i = 0; i < menuitems.size(); i++ ) {
                System.out.println(i + " " + menuitems.get(i) + " -- $" + prices.get(i));
            }
            return true;
        }
    }

    // Method 7: to add customers
    public void addCustomers(ArrayList<String> customers) {
        String customerName = System.console().readline();
        while (!customerName.equals("q")) {
            customers.add(customerName);
        }
        System.out.println(customers);
    }

}  
public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 4.0;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)  
        boolean isReadyOrder1 = false;  
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(pendingMessage);
        System.out.println(displayTotalMessage + dripCoffeePrice);
    	// ** Your customer interaction print statements will go here ** //

        // Noah
        if (isReadyOrder4) {
            System.out.println(readyMessage + displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(pendingMessage + " " + customer4);
        }

        // Sam
        System.out.println(displayTotalMessage + lattePrice*2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy
        System.out.println (displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}

import java.util.Date;
import java.text.SimpleDateFormat;  

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %1$s, %2$s, Lovely to see you.", dayPeriod, name);
    }

    // Sensei bonus (use SimpleDateFormat and Format)
    // ------version 1------ (show specific date)
    public String guestGreeting() {
        Date date = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate= formatter.format(date); 
        return String.format("Today is %s! Lovely to see you.", strDate);
    }

    // ------version 2------ (show morning/afternoon/evening)
    // public String guestGreeting() {
    //     Date date = new Date();
    //     int hours = date.getHours();
    //     // int minutes = date.getMinutes();
    //     if (hours < 12) {
    //         return "Good morning!";
    //     } else if (hours < 18) {
    //         return "Good afternoon!";
    //     } else {
    //         return "Good evening! ";
    //     }
    // }

    // write with a random string method
    public String moodSwitcher(String a, String b) {
        if (a.equals(b)) {
            return "Yay, I am so happy!";
        } else {
            return "Oh no...";
        }
    }
    
    public String dateAnnouncement() {
        Date date = new Date();  
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int a = conversation.indexOf("Alexis");
        int b = conversation.indexOf("Alfred");
        if (a != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that";
        } else if (b != -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
    
    
}
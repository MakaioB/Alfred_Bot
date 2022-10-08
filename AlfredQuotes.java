//package Java_Dojo.fundamentals.alfredBot;

import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, " + name + ". Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "I believe that I am more qualified, don't you? I'll handle it.";
        } else if (conversation.contains("Alfred")) {
            return "Of course, Sir. I'll see that it's done perfectly.";
        } else {
            return "Well if there is nothing else, I shall take my leave.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}


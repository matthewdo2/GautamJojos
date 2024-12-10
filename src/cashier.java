import java.util.*;
public class cashier {

    public static void main(String[] args){
        //This is main class, cashier. If it has to be titled main thats chill
        // But having it named cashier is a nice touch
    Scanner in = new Scanner(System.in);
    String input;


    System.out.println("Welcome to Jojo's! Would you like to order? (y or n)");
    input = in.nextLine();
    while (!input.equalsIgnoreCase("n")){
            System.out.println("What would you like to order? ");
                    //Takes order by item (askinge each question such as condiments? or
        // dessert? and just normal cashier upselling and loops until their order is done.
        // First question should ask combo 1, 2, or 3, and we should be able to interpret
        //that with the pool of ingredients  in some way
        }

    // If order was taken, recite order and price. Ask them to pay and calculate a
        // wait time based on items. Sleep for that amnt. of time (in seconds rather
        // than minutes and then give them their order

    System.out.println("Thanks for coming! You have a good day now.");
    }
}

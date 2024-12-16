import java.net.http.HttpClient;
import java.util.*;

/**
 * The cashier for our fine establishment. Run this class to run the program.
 */
public class Cashier {

    static int orderNum = 1;

    /**
     * Initiates an order. Time Complexity: O(n), Ω(n)
     * @param args - None
     * @throws InterruptedException - if the Thread is interrupted.
     */
    public static void main(String[] args) throws InterruptedException {
        //This is main class, cashier. If it has to be titled main thats chill
        // But having it named cashier is a nice touch
        Scanner in = new Scanner(System.in);
        String input;

        System.out.println("Welcome to Jojo's! Would you like to order? [y/n]");
        input = in.nextLine();

        ArrayList<Food> order = new ArrayList<>();

        while (!input.equalsIgnoreCase("n")) {
            System.out.println("Do you want a combo? [y/n]");
            String combo = in.nextLine();

            if (combo.equalsIgnoreCase("y")) {
                System.out.println("Which combo do you want? Combo 1 (two tenders) ($9.98), 2 (two sliders) ($11.98), or 3 (tender + slider) ($10.98)?");
                int num = Integer.parseInt(in.nextLine());

                Entree o1, o2;

                switch (num) {
                    case 2 -> o1 = o2 = new Entree("slider");
                    case 3 -> {
                        o1 = new Entree("tender");
                        o2 = new Entree("slider");
                    }
                    default -> o1 = o2 = new Entree("tender");
                }

                order.add(o1);
                order.add(o2);

                System.out.println("Done! Added a " + o1.getName() + " and " + o2.getName() + " combo (#" + num + ")!");
            }

            System.out.println("Do you want a side? [y/n]");
            String combo1 = in.nextLine();

            if (combo1.equalsIgnoreCase("y")) {
                System.out.println("Which side do you want? 1. Fries ($4.99), 2. Potatoes ($5.99)");
                int num = Integer.parseInt(in.nextLine());

                order.add(new Side(num == 1 ? "fries" : "potatoes"));
                System.out.println("Done! Added a side of " + (num == 1 ? "fries" : "potatoes") + "!");
            }

            System.out.println("Do you want any condiments? [FREE]");
            String combo2 = in.nextLine();

            if (combo2.equalsIgnoreCase("y")) {
                System.out.println("Do you want 1. Pickles, 2. Coleslaw, 3. Sauce, 4. Honey");
                int num = Integer.parseInt(in.nextLine());
                String[] sides = { "pickles", "coleslaw", "sauce", "honey" };

                order.add(new Condiment(sides[num-1]));
                System.out.println("Done! Added " + new Condiment(sides[num-1]).getName() + "!");

            }

            System.out.println("Do you want any desserts? [y/n]");
            String combo3 = in.nextLine();

            if (combo3.equalsIgnoreCase("y")) {
                System.out.println("Do you want 1. Banana Pudding ($4.99), 2. Cinnamon Pudding ($5.99), 3. Oreo Pudding ($5.99), 4. Giga Pudding ($9.99)");

                int num = Integer.parseInt(in.nextLine());
                String[] sides = { "banana pudding", "cinnamon pudding", "oreo pudding", "giga pudding" };

                order.add(new Dessert(sides[num-1]));
                System.out.println("Done! Added " + new Dessert(sides[num-1]).getName() + "!");
            }

            System.out.println("Do you want to keep ordering? [y/n]");
            input = in.nextLine();
        }

        System.out.println("Here's your order:");
        double total = 0;
        for (Food food : order) {
            total += food.getPrice();
            System.out.printf("\t%s - %s: $%.02f\n", food.getType(), food.getName(), food.getPrice());
        }

        System.out.println("Total Cost: $" + total);

        System.out.println("Please enter your credit card info to pay:");
        String enter = in.nextLine();

        System.out.println("Processing...");
        Thread.sleep(5000);

        System.out.println("It will take, at most, 6-8 hours to order. Your order number is: " + orderNum);
        System.out.println("Thanks for coming! You have a good day now.");

        for (Food food : order) {
            Kitchen kit = (Kitchen) food;

            kit.cook();
        }

        System.out.println("Order #" + orderNum++ + " is READY!! Here's your order.");
    }
}

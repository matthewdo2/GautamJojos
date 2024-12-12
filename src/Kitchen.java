/**
 * The Kitchen where food is cooked. This class exists to run the cook() method, which sleeps the thread
 * to 'cook' the food.
 */
public class Kitchen {
    private String name;

    /**
     * Creates the kitchen with the chef's name
     * @param name - the chef's name
     */
    public Kitchen(String name){
        this.name = name;
    }

    /**
     * Cooks the food for 3 seconds - we have REALLY good grills.
     * @throws InterruptedException if the grill explodes
     */
    public void cook() throws InterruptedException {
        System.out.println("cooking " + name);
        Thread.sleep(3000);
    }

    /**
     * Returns the chef's name
     * @return the chef's name
     */
    public String getName(){
        return name;
    }
}

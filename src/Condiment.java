import java.util.TreeMap;

/**
 * A condiment to go on top of your food. FREE!
 * Includes pickles, coleslaw, sauce, or honey.
 */
public class Condiment extends Kitchen implements Food {
    private double price;
    private String type;
    private TreeMap<String,Double> map;

    /**
     * Creates a condiment with a name. Time Complexity: O(log(n)), Ω(log(n))
     * @param name - The name of the condiment, either pickles, coleslaw, sauce, or honey
     */
    public Condiment(String name){
        super(name);
        map = new TreeMap<String,Double>();
        map.put("pickles", 0.00);
        map.put("coleslaw", 0.00);
        map.put("sauce", 0.00);
        map.put("honey", 0.00);
        this.type = "condiment";
        this.price = map.get(name);
    }

    /**
     * The price of the condiment: $0, since it's free
     * @return 0 as a double
     */
    public double getPrice(){
        return price;
    }

    /**
     * The name of the condiment.
     * @return The name of the condiment.
     */
    public String getName(){
        return super.getName();
    }

    /**
     * The type of the food -- condiment.
     * @return The type of the food: condiment.
     */
    public String getType(){
        return type;
    }
}

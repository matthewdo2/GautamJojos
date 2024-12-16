import java.util.*;

/**
 * A dessert, or rather a type of pudding.
 * Either banana ($4.99), cinnamon ($5.99), oreo ($5.99), or giga ($9.99).
 */
public class Dessert extends Kitchen implements Food {
    private double price;
    private String type;
    private TreeMap<String,Double> map;

    /**
     * Creates a Dessert with a name.
     * @param name - The name of the dessert
     */
    public Dessert(String name){
        super(name);
        map = new TreeMap<String,Double>();
        map.put("banana pudding", 4.99);
        map.put("cinnamon pudding", 5.99);
        map.put("oreo pudding", 5.99);
        map.put("giga pudding", 9.99);
        this.type = "dessert";
        this.price = map.get(name);
    }

    /**
     * The price of the pudding.
     * @return The price as a double.
     */
    public double getPrice(){
        return price;
    }

    /**
     * The name of the dessert.
     * @return The name of the dessert.
     */
    public String getName(){
        return super.getName();
    }

    /**
     * The type of the dessert -- dessert.
     * @return the type of the food as a dessert
     */
    public String getType(){
        return type;
    }
}

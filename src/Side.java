import java.util.TreeMap;

/**
 * A Side Food Option. Can be either fries ($4.99) and potatoes ($5.99)
 */
public class Side extends Kitchen implements Food {
    private double price;
    private String type;
    private TreeMap<String,Double> map;

    /**
     * Creates the Side. Name MUST match either 'fries' or 'potatoes'
     * @param name - the Name of the side; either 'fries' or 'potatoes'
     */
    public Side(String name){
        super(name);
        map = new TreeMap<String,Double>();
        map.put("fries", 4.99);
        map.put("potatoes", 5.99);
        this.type = "side";
        this.price = map.get(name);
    }

    /**
     * Returns the price of the side
     * @return the price of the side as a double
     */
    public double getPrice(){
        return price;
    }

    /**
     * Returns the name of the side
     * @return the name of the side
     */
    public String getName(){
        return super.getName();
    }

    /**
     * Returns the type of order
     * @return the type of order
     */
    public String getType(){
        return type;
    }
}
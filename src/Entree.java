import java.util.TreeMap;

/**
 * A main dish. Two of these makes a combo.
 * Either a tender ($4.99) or slider ($5.99)
 */
public class Entree extends Kitchen implements Food {
    private double price;
    private String type;
    private TreeMap<String,Double> map;

    /**
     * Makes the entree.
     * @param name - the name of the entree, either a 'tender' or a 'slider'
     */
    public Entree(String name){
        super(name);
        map = new TreeMap<String,Double>();
        map.put("tender", 4.99);
        map.put("slider", 5.99);

        this.type = "main";
        this.price = map.get(name);
    }

    /**
     * Returns the price of the entree
     * @return the price as a double
     */
    public double getPrice(){
        return price;
    }

    /**
     * Returns the name of the entree
     * @return the name of the entree, either a tender or a slider
     */
    public String getName(){
        return super.getName();
    }

    /**
     * Returns the type of the entree
     * @return the type of the entree - main
     */
    public String getType(){
        return type;
    }
}
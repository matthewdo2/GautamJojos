import java.util.TreeMap;

public class Condiment extends Kitchen implements Food {
    private double price;
    private String type;
    private TreeMap<String,Double> map;

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
    public double getPrice(){
        return price;
    }
    public String getName(){
        return super.getName();
    }
    public String getType(){
        return type;
    }
}

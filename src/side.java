import java.util.TreeMap;

public class side extends kitchen implements food {
    private double price;
    private String type;
    private TreeMap<String,Double> map;

    public side(String name){
        super(name);
        map = new TreeMap<String,Double>();
        map.put("fries", 4.99);
        map.put("potatoes", 5.99);
        this.type = "main";
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
import java.util.TreeMap;

public class entree extends kitchen implements food {
    private double price;
    private String type;
    private TreeMap<String,Double> map;

    public entree(String name){
        super(name);
        map = new TreeMap<String,Double>();
        map.put("tender", 4.99);
        map.put("slider", 5.99);
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
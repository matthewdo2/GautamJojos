import java.util.*;
public class dessert extends kitchen implements food {
    private double price;
    private String type;
    private TreeMap<String,Double> map;

    public dessert(String name){
        super(name);
        map = new TreeMap<String,Double>();
        map.put("banana pudding", 4.99);
        map.put("cinnamon pudding", 5.99);
        map.put("oreo pudding", 5.99);
        map.put("giga pudding", 9.99);
        this.type = "dessert";
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

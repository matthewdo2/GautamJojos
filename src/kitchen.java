
public class kitchen {
    private String name;

    public kitchen(String name){
        this.name = name;
    }
    public void cook() throws InterruptedException {
        System.out.print("cooking " + name);
        Thread.sleep(300);
    }
    public String getName(){
        return name;
    }
}

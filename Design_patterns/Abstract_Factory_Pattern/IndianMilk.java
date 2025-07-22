package Design_patterns.Abstract_Factory_Pattern;

public class IndianMilk implements Milk {
    public void prepareMilk() {
        System.out.println("Preparing milk the Indian way (masala milk!)");
    }
    public void checkMilkTemperature(){
        System.out.println("The milk is prepared to be steaming hot!");
    }
}


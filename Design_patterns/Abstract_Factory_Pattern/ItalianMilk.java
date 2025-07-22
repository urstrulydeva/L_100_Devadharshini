package Design_patterns.Abstract_Factory_Pattern;

public class ItalianMilk implements Milk {
    public void prepareMilk() {
        System.out.println("Preparing frothy Italian milk");
    }

    public void checkMilkTemperature(){
        System.out.println("The milk is determined to be medium hot");
    }
}


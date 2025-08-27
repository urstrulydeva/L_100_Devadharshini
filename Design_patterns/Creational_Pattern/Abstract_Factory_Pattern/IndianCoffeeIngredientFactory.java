package Design_patterns.Creational_Pattern.Abstract_Factory_Pattern;

public class IndianCoffeeIngredientFactory implements CoffeeIngredientFactory {
    public Milk createMilk() {
        return new ItalianMilk();
    }

    public CoffeeBean createBeans() {
        return new ItalianBeans();
    }
}
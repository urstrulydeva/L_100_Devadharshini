package Design_patterns.Abstract_Factory_Pattern;

public class ItalianCoffeeIngredientFactory implements CoffeeIngredientFactory {
    public Milk createMilk() {
        return new ItalianMilk();
    }

    public CoffeeBean createBeans() {
        return new ItalianBeans();
    }
}

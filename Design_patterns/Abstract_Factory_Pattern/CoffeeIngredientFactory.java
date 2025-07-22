package Design_patterns.Abstract_Factory_Pattern;

public interface CoffeeIngredientFactory {
    Milk createMilk();
    CoffeeBean createBeans();
}


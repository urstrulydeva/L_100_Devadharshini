package Design_patterns.Creational_Pattern.Abstract_Factory_Pattern;

public interface CoffeeIngredientFactory {
    Milk createMilk();
    CoffeeBean createBeans();
}


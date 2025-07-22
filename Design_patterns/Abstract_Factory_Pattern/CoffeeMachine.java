package Design_patterns.Abstract_Factory_Pattern;

public class CoffeeMachine {
    private CoffeeIngredientFactory ingredientFactory;

    public CoffeeMachine(CoffeeIngredientFactory factory) {
        this.ingredientFactory = factory;
    }

    public void prepareCoffee() {
        Milk milk = ingredientFactory.createMilk();
        CoffeeBean beans = ingredientFactory.createBeans();

        milk.prepareMilk();
        beans.grindBeans();

        System.out.println("Coffee is ready!\n");
    }
}


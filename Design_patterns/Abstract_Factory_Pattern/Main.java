package Design_patterns.Abstract_Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine indianMachine = new CoffeeMachine(new IndianCoffeeIngredientFactory());
        indianMachine.prepareCoffee();

        CoffeeMachine italianMachine = new CoffeeMachine(new ItalianCoffeeIngredientFactory());
        italianMachine.prepareCoffee();
    }
}


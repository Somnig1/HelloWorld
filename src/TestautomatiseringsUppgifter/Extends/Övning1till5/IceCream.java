package TestautomatiseringsUppgifter.Extends.Övning1till5;

public class IceCream extends Meal{


    public IceCream() {
        price = 20;
    }

    public void serve() {
        System.out.println("It is served in a cone");

    }

    public void kindOfFood() {
        System.out.println();
        System.out.println("Ice cream");
    }

    public void addSprinkles() {
        System.out.println("Adding sprinkles");
        price += 5;
    }


}


package TestautomatiseringsUppgifter.LektionsUppgifter.VehicleÖvning;

public class Race {
    public static void main(String[] args) {

        Car car = new Car();
        car.showSpeed();
        // går också att göra System.out.println(car.getSpeed());
        car.increaseSpeed(50);
        car.showSpeed();

        Bicycle bicycle = new Bicycle();
        bicycle.setCurrentGear(4);
        bicycle.increaseSpeed(5);
        bicycle.showSpeed();

        bicycle.setCurrentGear(7);
        bicycle.increaseSpeed(5);
        bicycle.showSpeed();

    }
}

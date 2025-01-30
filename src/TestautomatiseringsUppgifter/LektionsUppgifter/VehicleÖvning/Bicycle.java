package TestautomatiseringsUppgifter.LektionsUppgifter.VehicleÖvning;

public class Bicycle extends Vehicle{
    private int nbrOfGears=7;
    private int currentGear=1;

    private void nbrOfGears(int nbr){
        this.nbrOfGears = nbr;
    }

    public void increaseSpeed(int force){
        if (currentGear > 0 && currentGear<=nbrOfGears) {
            speed += force*currentGear;
        }
        else {
            System.out.println("Fel: växeln måste vara mellan 1 och " + nbrOfGears);
        }
    }

    public void setCurrentGear(int gear) {
        if (currentGear > 0 && currentGear<=nbrOfGears) {
            currentGear = gear;
            System.out.println("Din nuvarande växel: " + currentGear);
        }
        else {
            System.out.println("Fel: Växeln måste vara mellan 1 och " + nbrOfGears);
        }
    }


}

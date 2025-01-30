package TestautomatiseringsUppgifter.LektionsUppgifter.Animals;

public class Animals {

    protected String name;
    protected int age;
    protected int length;
    protected int ammountOfTimes;

    public Animals(){
        this.name = name;
        this.age = age;
    }

    public String action() {
        return name + "Action";
    }
    public String introduce(){
        return "Hej mitt namn är " + name + " och jag är " + age + " år gammal";
    }

    public void actionInfo(int length, int ammountOfTimes) {
        this.length = length;
        this.ammountOfTimes = ammountOfTimes;
    }

    public String totalLength() {

        return "Det är totalt " + length*ammountOfTimes + " meter";
    }

    public int getLength() {
        return length;
    }

    public int getAmmountOfTimes() {
        return ammountOfTimes;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

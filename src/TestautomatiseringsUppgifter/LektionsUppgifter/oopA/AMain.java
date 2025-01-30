package TestautomatiseringsUppgifter.LektionsUppgifter.oopA;

public class AMain {

    public static void main(String[] args) {
        AClass aClass = new AClass();
        //System.out.println(aClass.text);
        System.out.println(aClass.texPublic);
        aClass.texPublic = "Hörrö, jag vill ha ö";
        System.out.println(aClass.texPublic);
        System.out.println();
        System.out.println(aClass.getTextPrivate());
        aClass.setTextPrivate("Detta är en ny privat text");
        System.out.println(aClass.getTextPrivate());
        aClass.setTextPrivate("Hörrö, Jag vill ha ny privat text");
        System.out.println(aClass.getTextPrivate());
    }

}

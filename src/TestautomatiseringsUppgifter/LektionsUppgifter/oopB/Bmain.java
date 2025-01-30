package TestautomatiseringsUppgifter.LektionsUppgifter.oopB;

import TestautomatiseringsUppgifter.LektionsUppgifter.oopA.AClass;

public class Bmain {
    public static void main(String[] args) {
        AClass aClass = new AClass();
        System.out.println(aClass.texPublic);
        System.out.println(aClass.getTextPrivate());
        // Protected kommer visas här
        // men ej attributet text dvs utan access definierad


    }
    /* Private: visas bara i klassen
    ej def: visas i klassen och i package men ej i subclass
        (dvs BMain pga ligger i annan package)
    (protected) visas i sub klasser och i hela package
    Public visas för alla
     */
}

package TestautomatiseringsUppgifter.LektionsUppgifter.oopC;

public class CSubClass extends C{
    private String cscText;

    CSubClass(){
        System.out.println("Detta skrivs ut vid objekt skapande");
    }

    CSubClass(String cscText){
        System.out.println("Detta skrivs bara om du har en parameter in");
        this.cscText = cscText;
    }

    public String getCscText() {
        return cscText;
    }

    public void setCscText(String cscText) {
        this.cscText = cscText;
    }
}

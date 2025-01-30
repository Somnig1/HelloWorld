package Automation.Switch;

public class Simpsons {

        //Skriv en metod som läser in ett tal (1-11) och skriver ut en Simpson’s catch phrase för olika karaktärer
        //Skriver man fel tal skriver metoden ut “please choose a correct character”
        //Använd en switch

        public void catchPhrase (String name) {
            switch(name){
                case "Homer":
                    System.out.println("D’oh!");
                    break;
                case "Marge":
                    System.out.println("Mmm~mmmmm");
                    break;
                case "Bart":
                    System.out.println("¡Ay, caramba!");
                    break;
                case "Lisa":
                    System.out.println("If anyone wants me, I'll be in my room.");
                    break;
                case "Maggie":
                    System.out.println("(Pacifier Suck)");
                    break;
                case "Ned":
                    System.out.println("Hi-Diddily-Ho!");
                    break;
                case "Burns":
                    System.out.println("Excellent!");
                    break;
                case "Edna":
                    System.out.println("Ha!");
                    break;
                case "Chalmers":
                    System.out.println("SEEEEYYYMOOUURRR!");
                    break;
                case "Apu":
                    System.out.println("Thank You, Come Again!");
                    break;
                case "11":
                    System.out.println("Disco Stu likes disco music.");
                    break;
                default:
                    System.out.println("Please choose a correct character");
            }


        }


        /*Överkurs
        Gör om metoden så att den läser in namn på karaktärerna*/

 }


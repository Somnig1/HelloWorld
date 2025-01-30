package TestautomatiseringsUppgifter.LektionsUppgifter.Animals;

import TestautomatiseringsUppgifter.Names;

import java.lang.invoke.StringConcatException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        /*ArrayList<Animals> animals = new ArrayList<>();
        try {


            while (true) {
                System.out.println("Vad vill du göra?");
                System.out.println("1. Skapa en groda");
                System.out.println("2. Skapa en orm");
                System.out.println("3. Visa djuren och deras beteende");
                System.out.println("4. Avsluta programmet");

                int val = scanner.nextInt();
                scanner.nextLine();

                switch (val) {
                    case 1:
                        System.out.println("Vad heter din groda: ");
                        String frogName = scanner.nextLine();
                        System.out.println("Hur gammal är din groda: ");
                        int frogAge = scanner.nextInt();
                        Frog frog = new Frog(frogName, frogAge);
                        animals.add(frog);
                        System.out.println(frogName + " har lagts till hos dina djur");
                        break;

                    case 2:
                        System.out.println("Vad heter din orm: ");
                        String snakeName = scanner.nextLine();
                        System.out.println("Hur gammal är din orm: ");
                        int snakeAge = scanner.nextInt();
                        Snake snake = new Snake(snakeName, snakeAge);
                        animals.add(snake);
                        System.out.println(snakeName + " har lagts till hos dina djur");
                        break;

                    case 3:
                        if (animals.isEmpty()) {

                            System.out.println("Du har inte lagt till några djur");
                            System.out.println();
                        } else {
                            for (int i = 0; i < animals.size(); i++) {
                                Animals animal = animals.get(i);
                                if (animal instanceof Frog) {
                                    Frog frog1 = (Frog) animal;
                                    frog1.introduce();
                                    frog1.action();
                                    frog1.totalLength();
                                    System.out.println();
                                } else if (animal instanceof Snake) {
                                    Snake snake1 = (Snake) animal;
                                    snake1.introduce();
                                    snake1.action();
                                    snake1.totalLength();
                                    System.out.println();
                                }
                            }
                        }
                        break;

                    case 4:
                        System.out.println();
                        System.out.println("Avslutar programmet!");

                    default:
                        System.out.println("Välj mella 1-4. Försök igen");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Gör ett val med siffrorna 1-4");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
    }*/
        try {


            while (true) {
                System.out.println("Vill du skapa ett djur? Y/N: ");
                String userInput = scanner.nextLine();

                if (!userInput.equalsIgnoreCase("N") && !userInput.equalsIgnoreCase("Y")) {
                    System.out.println("Var snäll och skriv antingen Y eller N");
                    System.out.println();
                }

                if (userInput.equalsIgnoreCase("N")) {
                    System.out.println("Programmet avslutas.");
                    break;
                }
                if (userInput.equalsIgnoreCase("Y")) {

                    System.out.println("Vilken typ av djur vill du skapa?");
                    System.out.println("1. Skapa en groda");
                    System.out.println("2. Skapa en orm");
                    String userInput2 = scanner.nextLine();

                    if (userInput2.equals("1")) {

                        System.out.println("Ange din grodas namn: ");
                        String name = scanner.nextLine();

                        int age = 0;
                        boolean validAge = false;

                        while (!validAge) {

                            try {
                                System.out.println("Ange grodans ålder: ");
                                age = Integer.parseInt(scanner.nextLine());
                                validAge = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Skriv med siffror. Försök igen!");
                            }

                        }

                        Frog frog = new Frog(name, age);

                        int length = 0;
                        int ammountOfTimes = 0;
                        boolean validJumpData = false;

                        while (!validJumpData) {
                            try {
                                System.out.println("Hur långt kan din groda hoppa (i meter)? ");
                                length = Integer.parseInt(scanner.nextLine());
                                System.out.println("Hur många gånger kan din groda hoppa? ");
                                ammountOfTimes = Integer.parseInt(scanner.nextLine());
                                frog.actionInfo(length, ammountOfTimes);
                                validJumpData = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Skriv med siffror. Försök igen!");
                            }
                        }


                        System.out.println(frog.introduce());
                        System.out.println(frog.action());
                        System.out.println(frog.totalLength());

                        System.out.println("Hej då! Säger " + name);
                        System.out.println();
                    }

                    if (userInput2.equals("2")) {
                        System.out.println("Ange din orms namn: ");
                        String name = scanner.nextLine();

                        int age = 0;
                        boolean validAge = false;

                        while (!validAge) {

                            try {
                                System.out.println("Ange ormens ålder: ");
                                age = Integer.parseInt(scanner.nextLine());
                                validAge = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Skriv med siffror. Försök igen!");
                            }

                        }

                        Snake snake = new Snake(name, age);

                        int length = 0;
                        int ammountOfTimes = 0;
                        boolean validSlitherData = false;

                        while (!validSlitherData) {
                            try {
                                System.out.println("Hur långt kan din orm slingra sig (i meter)? ");
                                length = Integer.parseInt(scanner.nextLine());
                                System.out.println("Hur många gånger kan din orm slingar sig? ");
                                ammountOfTimes = Integer.parseInt(scanner.nextLine());
                                snake.actionInfo(length, ammountOfTimes);
                                validSlitherData = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Skriv med siffror. Försök igen!");
                            }
                        }


                        System.out.println(snake.introduce());
                        System.out.println(snake.action());
                        System.out.println(snake.totalLength());

                        System.out.println("Hej då! Säger " + name);
                        System.out.println();
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
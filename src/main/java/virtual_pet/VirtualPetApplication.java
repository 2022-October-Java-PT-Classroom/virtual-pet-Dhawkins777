package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static Virtualpet Rick = new Virtualpet(3, 3, 3, 3);

    public static void main(String[] args) {

        System.out.println("Welcome to Virtual pet!");
        System.out.println("try to keep the pet happy so he doesn't run away!");
        System.out.println("Will run away when any of his needs reach 10");
        displayCurrentNeeds();
        displayGameObjective();


            while (Rick.getHungerLevel() <= 10 && Rick.getThirstLevel() <= 10 && Rick.getBoredomLevel() <= 10 && Rick.getBathroomBreak() <= 10) {
                System.out.println("What would you like to do? ");
                System.out.println("Want to feed, type 1");
                System.out.println("Want to water, type 2");
                System.out.println("To play with pet, type 3");
                System.out.println("To give a bathroom break, type 4");
                System.out.println("To do nothing at this time, type 5");
                System.out.println("To end the game, type 6");

                Scanner scanner1 = new Scanner(System.in);
                int userSelection = Integer.valueOf(scanner1.next());

                 System.out.println("Current hunger level is " + Rick.getHungerLevel());
            System.out.println("Current thirst level is " + Rick.getThirstLevel());
            System.out.println("Current boredom level is " + Rick.getBoredomLevel());
            System.out.println("Current need for a bathroom break is " + Rick.getBathroomBreak());

                if (userSelection == 1) {
                    Rick.feedPet();
                } else if (userSelection == 2) {
                    Rick.givePetWater();
                } else if (userSelection == 3) {
                    Rick.playWithPet();
                } else if (userSelection == 4) {
                    Rick.givePetBathroomBreak();
                } else if (userSelection == 5) {
//                    Rick.tick();
                    System.out.println("Time is ticking!");
                } else if (userSelection == 6) {
                    System.out.println("Thank you for playing with my pet!");
                    System.exit(0);
                } else if (userSelection == 0) {
                    printUserInstructions();
                }

                if (userSelection != 0) {
//                    Rick.tick();
                    displayCurrentNeeds();
                }
                displayCurrentNeeds();


                System.out.println("What would you like to do now? (type 0 for user instructions)");
            }
            System.out.println("Pet ran away !");
        }

         {

            System.out.println("Objective: try to keep the pet happy so he doesn't run away!");
            displayCurrentNeeds();
            printUserInstructions();
        }
        {

            System.out.println("Current hunger level is " + Rick.getHungerLevel());
            System.out.println("Current thirst level is " + Rick.getThirstLevel());
            System.out.println("Current boredom level is " + Rick.getBoredomLevel());
            System.out.println("Current need for a bathroom break is " + Rick.getBathroomBreak());
        }


    private static void printUserInstructions() {

        System.out.println("What would you like to do? ");
        System.out.println("Want to feed, type 1");
        System.out.println("Want to water, type 2");
        System.out.println("To play with pet, type 3");
        System.out.println("To give a bathroom break, type 4");
        System.out.println("To do nothing at this time, type 5");
        System.out.println("To end the game, type 6");

    }

    private static void displayGameObjective() {
    }

    private static boolean areNeedsTooHigh() {
        return false;
    }

    private static void displayCurrentNeeds() {
    }
}

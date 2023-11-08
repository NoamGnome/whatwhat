import java.util.Scanner;




public class montyHallRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        montyHall v1 = new montyHall();
        v1.doors();
        String g1 = v1.getGoat1();
        String g2 = v1.getGoat2();
        String c = v1.car();
        switch (g1) {
            case "door 1" -> g1 = "1";
            case "door 2" -> g1 = "2";
            case "door 3" -> g1 = "3";
        }
        switch (g2) {
            case "door 1" -> g2 = "1";
            case "door 2" -> g2 = "2";
            case "door 3" -> g2 = "3";
        }
        switch (c) {
            case "door 1" -> c = "1";
            case "door 2" -> c = "2";
            case "door 3" -> c = "3";
        }
        System.out.println("Welcome to the Monty Hall Game!");
        System.out.println();
        System.out.println("There are two goats and a car randomly placed behind doors 1, 2, and 3");
        System.out.print("Where do you think the car is? Enter 1, 2 or 3: ");
        String userchoice = s.nextLine();
        System.out.print("");
        if (userchoice.equals(g1)) {
            System.out.println("One of the goats is behind door number " + g2);
        }
        if (userchoice.equals(g2)) {
            System.out.println("One of the goats is behind door number " + g1);
        }
        if (userchoice.equals(c)) {
            System.out.println("One of the goats is behind door number " + g1);
        }
        System.out.print("Do you want to switch your guess? Yes or No: ");
        String userswitch = s.nextLine();
        System.out.print("");
        if (userswitch.equals("No") && userchoice.equals(g1)) {
            System.out.println("The car is behind door number " + c + " (or you could say you won a goat)");
        }
        if (userswitch.equals("No") && userchoice.equals(g2)) {
            System.out.println("The car is behind door number " + c + " (or you could say you won a goat)");
        }
        if (userswitch.equals("No") && userchoice.equals(c)) {
            System.out.print("You won the car!");
        }
        if (userswitch.equals("Yes") && (userchoice.equals(g1) || userchoice.equals(g2))) {
            System.out.println("Guess switched from " + userchoice + " to " + c);
            System.out.print("You won the car!");
        }
        if (userswitch.equals("Yes") && userchoice.equals(c)) {
            System.out.println("Guess switched from " + userchoice + " to " + g2);
            System.out.println("The car is behind door number " + c + " (or you could say you won a goat)");
        }
    }
}



import java.util.Scanner;
public class ExerciseThree {

    public static void main(String[] args) {
        Scanner userIO = new Scanner(System.in);
        int numberEntered = -1;

        // Asks the user to enter a number between 1 and 24
        // only breaks the loop if the conditions are met
        while (numberEntered < 0 || numberEntered > 35) {
            System.out.println("Please enter a number between 0 and 35:");
            numberEntered = userIO.nextInt();
        }

        if (numberEntered <= 9) {
            System.out.println("You've entered: " + numberEntered);
        } else {
            System.out.println("You've got: " + ((char)(numberEntered+55)));
        }


    }

}


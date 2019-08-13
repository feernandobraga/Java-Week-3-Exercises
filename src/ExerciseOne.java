//Write a program to take an input number from user between 1 and 24. Use if
//        statement and case statement to display the output. If the input is less than 18, print
//        a "Good day" greeting, otherwise print "Good evening".
//        • Write a while loop that prints out multiples of 5 between 10 and 95
//        • Write a while loop to add up the values 1 to 10 and print the sum once the loop has
//        finished

import java.util.Scanner;
public class ExerciseOne {

    public static void main(String[] args) {
        Scanner userIO = new Scanner(System.in);
        int numberEntered = 0;
        int fiveToNineFive = 5;

        // Asks the user to enter a number between 1 and 24
        // only breaks the loop if the conditions are met
        while (numberEntered <1 || numberEntered > 24) {
            System.out.println("Please enter a number between 1 and 24:");
            numberEntered = userIO.nextInt();
        }

        // if statement that analyse if the user entered
        // a number lower than 18 and greets the user accordingly
        if (numberEntered < 18){
            System.out.println("Good day =D");
        } else {
            System.out.println("Good evening ^_^");
        }

        while (fiveToNineFive <= 95) {
            if (fiveToNineFive % 5 == 0) {
                System.out.println(fiveToNineFive + " is a multiple of five");
            }
            fiveToNineFive++;
        }

    }
}

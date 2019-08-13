import java.util.Scanner;
public class ExerciseOne {

    public static void main(String[] args) {
        Scanner userIO = new Scanner(System.in);
        int numberEntered = 0;
        int tenToNineFive = 10;
        int oneToTen = 1;
        int sum = 0;

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

        // Write a while loop that prints out multiples of 5 between 10 and 95
        while (tenToNineFive <= 95) {
            if (tenToNineFive % 5 == 0) {
                System.out.println(tenToNineFive + " is a multiple of five");
            }
            tenToNineFive++;
        }

        // Write a while loop to add up the values 1 to 10 and print the sum once the loop has finished
        while (oneToTen <= 10) {
            sum = sum + oneToTen;
            oneToTen++;
        }
        System.out.println("\nThe sum is: " + sum);
    }
}

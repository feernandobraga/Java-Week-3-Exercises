import java.util.Scanner;
public class ExerciseFive {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int numberEntered;

        System.out.println("Please enter an integer and press enter: ");
        numberEntered = userInput.nextInt();

        if (numberEntered % 2 == 0){
            System.out.println("It's an even number, mate");
        } else {
            System.out.println("Oh... that's odd!");
        }

    }
}

import java.util.Arrays;
import java.util.Scanner;
public class ExerciseTwo {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Please enter a integer and press enter: ");
            numbers[i] = userInput.nextInt();
        }

        int count = 0;
        while (count < numbers.length){ //while 0

            for (int i = 0; i < numbers.length -1; i++) { //for 0

                if (numbers[i] > numbers[i+1]){ //if 0
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                } //close if 0

            } //close for 0
        count++;
        } //close while 0

        System.out.println("I've now sorted your numbers in ascending order: " + Arrays.toString(numbers) );

    }
}

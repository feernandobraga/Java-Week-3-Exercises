import java.util.Scanner;
public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum, secondNum;
        int sumOfEvens = 0;
        int sumOfSquares = 0;

        // a. Prompt the user to input 'two integers: firstNum and secondNum. (firstNum must be less than secondNum.)
        System.out.println("Please enter the first integer and press enter: ");
        firstNum = input.nextInt();

        do {
            System.out.println("Now enter an integer that is greater than the first one you've entered: ");
            secondNum = input.nextInt();
        }while (firstNum >= secondNum);

        // b. Output all the odd numbers between firstNum and secondNum inclusive.
        // c. Output the sum of all the even numbers between firstNum and second.Num inclusive.
        // e. Output the sum of the squares of all the odd numbers between firstNum and secondNum inclusive.
        while (firstNum <= secondNum){
            if (firstNum % 2 != 0){
                System.out.println(firstNum + " is an odd number!");
                sumOfSquares = sumOfSquares + (int)Math.pow(firstNum, 2);
            } else {
                sumOfEvens = sumOfEvens + firstNum;
            }

            firstNum++;
        }

        System.out.println("\nThe sum of the even numbers is: " + sumOfEvens);
        System.out.println("The sum of the squares of odd numbers is: " + sumOfSquares + "\n");

        // d. Output all the numbers and their squares between 1 and 10.
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i + " squared is: " + (int) Math.pow(i,2));
        }

        // f. Output all the uppercase letters.
        System.out.println();
        for (int i = 65; i < 91; i++) {
            System.out.print((char)(i) + ", ");
        }

    }
}

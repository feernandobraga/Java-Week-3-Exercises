import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userSentence;
        StringBuffer sBuffer = new StringBuffer();

        // get the user input
        System.out.println("Please enter a string:");
        userSentence = userInput.next();
        userSentence = userSentence.toLowerCase();

        sBuffer.append(userSentence); // append the sentence to the buffer

        // compares if the user input in lower case is equals to the
        // user input in lower case, but reversed.
        if (userSentence.equals(sBuffer.reverse().toString())){
            System.out.println("Bingo, you have a Palindrome :)");
        } else {
            System.out.println("Sorry, not a Palindrome ):");
        }
    }
}


import java.util.Scanner;
public class ExerciseSix {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double colourCost = 0.10;
        double regularCost = 0.15;
        double fancyFrame = 0.25;
        double crownsCost = 0.35;
        int crownsAmount;
        double frameLength;
        String frameColour;
        int frameFinish;
        double totalCost = 0;

        System.out.println("Hi there, please enter the images's length in inches: ");
        frameLength = userInput.nextDouble();

        System.out.println("Now please enter the images's width in inches: ");
        frameLength = frameLength + userInput.nextDouble();

        do {
            System.out.println("What type of frame would you like to choose?");
            System.out.println("1 - Regular Frame  |  2 - Fancy Frame");
            frameFinish = userInput.nextInt();
        } while (frameFinish != 1 && frameFinish != 2);

        System.out.println("Now enter the colour for the frame: ");
        frameColour = userInput.next().toLowerCase();

        System.out.println("How many crows would you like to add?: ");
        crownsAmount = userInput.nextInt();


        if (!frameColour.equals("white")){
            totalCost = frameLength * colourCost;
        }

        if (frameFinish == 1){
            totalCost = totalCost + (frameLength * regularCost);
        } else {
            totalCost = totalCost + (frameLength * fancyFrame);
        }

        totalCost = totalCost + (crownsAmount * crownsCost);

        System.out.printf("The total cost of your order is: $%.2f", totalCost);

    }
}

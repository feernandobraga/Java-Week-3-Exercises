public class ExerciseFour {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100 ; i++) {
            sum = (int) (sum + Math.pow(i, 2));

            if (i % Math.sqrt(i) == 0){ //if the remainder of a number divided by its square root is 0, then the number is a integer
                System.out.println(i + " is a perfect number");
            }
        }

        System.out.println("\n The sum of the square of the first 100 integers is: " + sum);

    }
}

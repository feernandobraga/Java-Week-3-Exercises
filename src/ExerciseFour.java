public class ExerciseFour {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100 ; i++) {
            sum = (int) (sum + Math.pow(i, 2));
        }
        System.out.println("The sum of the square of the first 100 integers is: " + sum);
    }
}

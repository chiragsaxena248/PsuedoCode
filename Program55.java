
public class Program55 {

    public static void main(String[] args) {
        System.out.println(divisible(2630));
    }

    public static int divisible(int number) {
        int digit;
        int evenCounter = 0;
        int numRemainder = number;
        while (numRemainder > 0) {
            digit = numRemainder % 10;
            if (digit != 0 && number % digit == 0) {
                evenCounter += 1;
            }
            numRemainder = numRemainder / 10;
        }
        return evenCounter;
    }
}

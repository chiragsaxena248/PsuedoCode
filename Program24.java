/*
DECLARE num : INTEGER
DECLARE sum : INTEGER
DECLARE rem : INTEGER
SET sum := 0
WHILE num > 0
        rem = num MOD 10
        sum = sum + rem
        num = num / 10
END WHILE
PRINT sum

 */
import java.util.*;

public class Program24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int rem = 0;

        while (num > 0) {
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}

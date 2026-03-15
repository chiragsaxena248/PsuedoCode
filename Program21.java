/*
Palindrome
DECLARE num, rem, b, n : INTEGER
SET b :=0
READ num
n := num
WHILE num>0
        rem := num MOD 10
        b := (b*10) + rem
        num = num/10
END WHILE
IF n==b
    PRINT Palindrome
ELSE
    PRINT Not palindrome
 */
import java.util.*;

public class Program21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = 0;
        int b = 0, n = num;

        while (num > 0) {
            rem = num % 10;
            b = (b * 10) + rem;
            num = num / 10;
        }
        if (b == n) {
            System.out.println("Number is panlindrome");
        } else {
            System.out.println("Number is not panlindrome");
        }
    }

}

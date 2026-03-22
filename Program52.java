/*
FUNCTION Palindrome (n: INTEGER) : BOOLEAN
        DECLARE a : INTEGER
        DECLARE b : INTEGER
        DECLARE x : INTEGER
        SET b:=0
        SET x:=n
        WHILE n>0 LOOP
                a := n MOD 10
                n := n/10
                b := (b*10)+a
        END WHILE

        IF b==x THEN
            RETURN true
        ELSE 
            RETURN false
END FUNCTION 
PRINT Palindrome(151)
 */
import java.util.*;

public class Program52 {

    public static boolean isPalindrome(int a) {
        int b = 0;
        int n = a;

        while (n > 0) {
            a = n % 10;
            n = n / 10;
            b = b * 10 + n;
        }

        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPalindrome(a));
    }
}

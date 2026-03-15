/*
DECLARE num : INTEGER
DECLARE rem : INTEGER
DECLARE b : INTEGER
DECLARE n : INTEGER
SET b:= 0
READ num
SET n = num
WHILE n>0
        rem := num MOD 10
        b := b + (rem*rem*rem)
        num = num/10
ENDWHILE

IF(n==b) THEN
        PRINT "Armstrong"
ELSE
        PRINT "NOT Armstrong"
ENDIF
 */
import java.util.*;

public class Program22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = 0;
        int b = 0, n = num;

        while (num > 0) {
            rem = num % 10;
            b = b + (rem * rem * rem);
            num = num / 10;
        }
        if (n == b) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}

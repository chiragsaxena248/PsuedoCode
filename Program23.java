/*
Fibonacci Series
DECLARE num : INTEGER
DECLARE sum : INTEGER
DECLARE pre : INTEGER
DECLARE nex : INTEGER

SET pre = 0, next = 1, sum = 0
READ num
PRINT pre nex
WHILE sum <= num
        sum := pre + nex 
        PRINT sum
        pre = nex
        nex = sum
END WHILE
 */
import java.util.*;

public class Program23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int prev = 0, next = 1;
        while (sum <= num) {
            sum = prev + next;
            System.out.print(sum + " ");
            prev = next;
            next = sum;
        }
    }
}

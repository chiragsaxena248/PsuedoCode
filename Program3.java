/*
DECLARE x : INTEGER
READ x
IF x MOD 2 == 0 THEN
    PRINT x is even
ELSE
    PRINT x is odd
ENDIF

 */
import java.util.*;

public class Program3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }
    }
}

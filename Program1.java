/*
DECLARE x = INTEGER
READ x
IF x>5 THEN
    PRINT "x is greater than 5"
ENDIF


 */
import java.util.*;

public class Program1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than 5");
        }
    }

}

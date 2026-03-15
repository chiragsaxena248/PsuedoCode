/*
DECLARE x : INTEGER
DECLARE y : INTEGER
READ x
READ y

IF x>y THEN
        PRINT x is greater than y
ELSE IF x<y THEN
        PRINT y is greater than x
ELSE
        PRINT x and y are equal
ENDIF
 */
import java.util.*;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y) {
            System.out.println("x is greater than y");
        } else if (y > x) {
            System.out.println("x is smaller than y");
        } else {
            System.out.println("x and y are equal");
        }
    }
}

/*
Nesteed if

DECLARE x : INTEGER
READ x

IF x>0 THEN
        IF x MOD 2 == 0 THEN
            PRINT x is even
        ELSE
            PRINT x is odd
        END IF
ELSE
        PRINT x is negative
 */

import java.util.*;

public class Program5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            if (x % 2 == 0) {
                System.out.println("x is even");
            } else {
                System.out.println("x is odd");
            }
        } else {
            System.out.println("x is negative");
        }
    }
}

/*
DECLARE x : INTEGER
DECLARE y : INTEGER
READ x
READ y

IF x>0 && y>0 THEN
        PRINT 1st quadrant
ELSE IF x<0 && y>0 THEN
        PRINT 2nd quadrant
ELSE IF x<0 && y<0 THEN
        PRINT 3rd quadrant
ELSE IF x>0 && y<0 THEN
        PRINT 4th quadrant
ELSE
        PRINT origin
 */

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("4th quadrant");
        } else {
            System.out.println("Origin");
        }

    }
}

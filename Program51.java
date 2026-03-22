/*
FUNCTION reverse (n : INTEGER): INTEGER
            DECLARE a : INTEGER
            DECLARE b : INTEGER
            SET b := 0
            WHILE n>0 LOOP 
                    a = n MOD 10
                    n = n/10
                    b = b*10 + a
            ENDWHILE
            RETURN b
END FUNCTION reverse
PRINT reverse(1234)
 */

import java.util.Scanner;

public class Program51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;
        System.out.println(reverse(a, b));
    }

    public static int reverse(int a, int b) {
        int n = a;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            b = (b * 10) + a;
        }
        return b;
    }
}

/*
INTEGER funnn ( INTEGER a, INTEGER b, INTEGER c)
        IF ((c ^ b + a) < ( a & c))
            b = a ^ b
            c = a + 3 + c
        END IF
        IF (( 3 ^ b) + ( c ^ c) > ( 11 & c))
            b = (c + 12) ^ a
        END IF
        RETURN a + b + c
 */

import java.util.Scanner;

public class Program60 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(funnnn(a, b, c));
    }

    public static int funnnn(int a, int b, int c) {
        if ((c ^ b + a) < (a & c)) {
            b = a ^ b;
            c = a + 3 + c;
        }

        if ((3 ^ b) + (c ^ c) > (11 & c)) {
            b = (c + 12) ^ a;
        }
        return a + b + c;
    }
}

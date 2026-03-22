/*
INTEGER a, b, c
SET a = 9, b = 5, c = 5
a = 5 & b
c = (11 & 4) + b
c = c + c
c = (b + 11) ^ b
PRINT a + b + c
 */

import java.util.Scanner;

public class Program58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a = 5 & b;
        c = (11 & 4) + b;
        c = c + c;
        c = (b + 11) ^ b;

        System.out.println(a + b + c);
    }
}

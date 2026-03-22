/*
INTEGER a, b, c
SET a = 9, b = 5, c = 4
c = a & c
c = (a + b) + b
a = (c + a) & c
b = 2 ^ a
print a + b + c
 */

import java.util.Scanner;

public class Program57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        c = a & c;
        c = (a + b) + b;
        a = (c + a) & c;
        b = 2 ^ a;

        System.out.println(a + b + c);
    }
}

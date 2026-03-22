/*
INTEGER funn (INTEGER a, INTEGER b, INTEGER c)
    b = (c + 3) + a
    b = (c + c) + b
    c = (c + 5) + c
    c = (b & 8) + b
    c = (a + 3) + a
    RETURN a + b + c

 */

import java.util.Scanner;

public class Program59 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(funnn(a, b, c));
    }

    public static int funnn(int a, int b, int c) {
        b = (c + 3) + a;
        b = (c + c) + b;
        c = (c + 5) + c;
        c = (b & 8) + b;
        c = (a + 3) + a;
        return a + b + c;

    }
}

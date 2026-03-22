
import java.util.Scanner;

/*
INTEGER funn(INTEGER a, INTEGER b, INTEGER c)
        b = (b + 8) + b
        c = (9 + 2) + b
        b = (b + b) + c
        IF (b > c AND (9 + 4) < a)
                c = b + c
        END IF
        a = (5 + 7) + a
        RETURN a + b + c
 */
public class Program56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(funn(a, b, c));
    }

    public static int funn(int a, int b, int c) {
        b = (b + 8) + b;
        c = (9 + 2) + b;
        b = (b + b) + c;
        if (b > c && (9 + 4) < a) {
            c = b + c;
        }
        a = (5 + 7) + a;
        return a + b + c;
    }
}

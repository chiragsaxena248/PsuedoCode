/*
INT FUNCTION (INT a, INT b, INT c)
        FOR EACH c FROM 3 TO 5
                a = (c+c)^b
                IF ((a+c)<(c+a))
                    b = (a+11) + c
                ELSE
                    c = b + b
                    a = 3 + b
                    CONTINUE
                END IF
        END FOR
        RETURN a + b
END FUNCTION

 */
import java.util.*;

public class Program53 {

    public static int problem1(int a, int b, int c) {
        for (c = 3; c <= 5; c++) {
            a = (c + c) ^ b;

            if ((a + c) < (c + a)) {
                b = (a + 11) + c;
            } else {
                c = b + b;
                a = 3 + b;
                continue;
            }
        }
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(problem1(a, b, c));
    }
}

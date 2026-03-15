/*
INTEGER a, b
SET a = 2, b = 50
WHILE  b> 0
        a = b MOD 2 + a
        IF a MOD 3 IS EQUAL TO 0
            PRINT a
        ELSE
            PRINT b - 1
        b = b / 5
        a = a+1
END WHILE
 */
public class Program36 {

    public static void main(String[] args) {
        int a = 2, b = 50;
        while (b > 0) {
            a = (b % 2) + a;
            if (a % 3 == 0) {
                System.out.println(a);
            } else {
                System.out.println(b - 1);
            }
            b = b / 5;
            a = a + 1;
        }
    }
}

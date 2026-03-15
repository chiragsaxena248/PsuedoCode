/*
INTEGER a, b, c
SET a = 7, b = 8, c = 9
IF  a^b^c  <  b+c+a
        b = 6+a
END IF
a = 8 ^ b
PRINT a + b + c
 */
public class Program31 {

    public static void main(String[] args) {
        int a = 7, b = 8, c = 9;
        if ((a ^ b ^ c) < (a + b + c)) {
            b = 6 + a;
        }
        a = 8 ^ b;
        System.out.println(a + b + c);
    }
}

/*
INTEGER a, b, c
SET a = 4, b = 4, c = 4
IF (a & ( b ^ b ) & c)
        a = a>>1
END IF
PRINT a + b + c

 */
import java.util.*;

public class Program33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 4, b = 4, c = 4;

        int val = (a & (b ^ b) & c);

        if (val != 0) {
            a = a >> 1;
        }

        System.out.println(a + b + c);
    }
}

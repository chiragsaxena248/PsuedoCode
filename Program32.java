/*
INTEGER a, b, c
SET a = 2, b = 5, c = 10
FOR  EACH c FROM 3 TO 6
        a = (a+a)+a
        a = (a^11)+c
ENDFOR
b = (9+7)+a
PRINT a+b
 */
public class Program32 {

    public static void main(String[] args) {
        int a = 2, b = 5, c = 10;
        for (c = 3; c <= 6; c++) {
            a = (a + a) + a;
            a = (a ^ 11) + c;
        }
        b = (9 + 7) + a;
        System.out.println(a + b);
    }
}

/*
INT FUNN (INT a, INT b)
    DECLARE c : INTEGER
    SET c:= 2
    b :=b MOD c
    a := a MOD c
    RETURN a+b
END FUNCTION FUNN
PRINT funn(9, 7)
 */
public class Program48 {

    public static void main(String[] args) {
        System.out.println(funn(9, 7));
    }

    public static int funn(int a, int b) {
        int c = 2;
        b = b % c;
        a = a % c;
        return a + b;
    }
}

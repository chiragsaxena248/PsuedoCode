/*
FUNCTION fact(n: INTEGER)
        DECLARE f : INTEGER
        SET f := 1
        FOR i IN n TO 1 STEP-1
                f = f*i
        ENDFOR
        RETURN f
END FUNCTION
PRINT fact(5)
 */
import java.util.*;

public class Program47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        int f = 1;
        for (int i = n; i > 1; i--) {
            f = f * i;
        }
        return f;
    }
}

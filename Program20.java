/*
1234=4321
DECLARE num : INTEGER
DECLARE rem : INTEGER
READ num
DECLARE b : INTEGER
SET b:= 0
WHILE num>0
    r := num MOD 10
    b := (b*10) + r
    num = num/10
END WHILE
PRINT b
 */
import java.util.*;

public class Program20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = 0;
        int b = 0;
        while (num > 0) {
            rem = num % 10;
            b = (b * 10) + rem;
            num = num / 10;
        }
        System.out.println(b);

    }
}

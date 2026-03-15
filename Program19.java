/*
DECLARE n : INTEGER
READ n
DECLARE fact : INTEGER
SET fact = 1
FOR i := n TO 1 STEP -1
        fact = fact * i
END FOR
PRINT fact
 */
import java.util.*;

public class Program19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }
}

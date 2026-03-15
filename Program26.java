/*
DECLARE num : INTEGER
DECLARE dig : INTEGER
DECLARE rem : INTEGER
READ num
READ dig
DECLARE found : BOOLEAN
found = false
WHILE num>0
        rem :=  num MOD 10
        IF remo == dig
            found = true
            BREAK
        END IF
        num = num/10
END WHILE

IF found == true
    PRINT Yes
ELSE
    PRINT No
END IF
 */
import java.util.*;

public class Program26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dig = sc.nextInt();
        int rem;
        boolean found = false;
        while (num > 0) {
            rem = num % 10;
            if (rem == dig) {
                found = true;
                break;
            }
            num = num / 10;
        }
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

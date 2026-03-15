/*
DECLARE num : INTEGER
DECLARE i : INTEGER
READ num 
FOR i:=2 TO num-1
        IF num MOD i == 0 THEN
                PRINT Not prime
                BREAK
        END IF
END FOR
IF num == i THEN
        PRINT Prime
END IF
 */

import java.util.Scanner;

public class Program28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;

        for (i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                System.out.println("Not prime");
                break;
            }
        }

        if (num == i) {
            System.out.println("Prime");
        }
    }
}

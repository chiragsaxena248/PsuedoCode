/*
Count of digit
DECLARE num : INTEGER
DECLARE dig : INTEGER
DECLARE rem : INTEGER
DECLARE cnt : INTEGER
READ num 
READ dig
SET cnt = 0
WHILE num > 0
        rem := num MOD 10
        IF rem == dig
            INCREMENT cnt 
        END IF
        num = num / 10
END WHILE
PRINT cnt

 */

import java.util.Scanner;

public class Program27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dig = sc.nextInt();
        int cnt = 0;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            if (rem == dig) {
                cnt++;
            }
            num = num / 10;
        }
        System.out.println(cnt);
    }
}

/*

DECLARE num : INTEGER
DECLARE sum : INTEGER
READ num
SET sum = 0
WHILE i < = num
        sum = sum + i
END WHILE
PRINT sum
 */

import java.util.*;

public class Program15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num >= 0) {
            sum += num;
            num--;
        }
        System.out.println(sum);
    }
}

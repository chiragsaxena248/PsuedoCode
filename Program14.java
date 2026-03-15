/*

DECLARE num : INTEGER
DECLARE sum : INTEGER
READ num
SET sum = 0
FOR i:=10 TO 1 STEP -1
        sum = sum + i
END FOR
PRINT sum
 */

import java.util.*;

public class Program14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

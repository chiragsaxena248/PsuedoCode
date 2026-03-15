/*
Add element
DECLARE arr : ARRAY[3][3] OF INTEGER
FOR i:=0  TO 2
    FOR j:=0 TO 2
            READ arr[i][j]
    ENDFOR
ENDFOR
DECLARE sum : INTEGER
SET sum = 0
FOR i:=0 TO 2
    FOR j :=0 TO 2
            sum += arr[i][j]
    ENDFOR
ENDFOR
PRINT sum
PRINT sum / 9
 */
import java.util.*;

public class Program43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);

    }
}

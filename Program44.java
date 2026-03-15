/*
Add element
DECLARE arr : ARRAY[3][3] OF INTEGER
DECLARE odd : INTEGER
DECLARE even : INTEGER

FOR i:=0  TO 2
    FOR j:=0 TO 2
            READ arr[i][j]
    ENDFOR
ENDFOR
FOR i:=0 TO 2
    FOR j :=0 TO 2
            IF arr[i][j] % 2 == 0 THEN
                    INCREMENT even
            ELSE
                    INCREMENT odd
            ENDIF
    ENDFOR
ENDFOR
PRINT Odd + odd
PRINT Even + even

 */
import java.util.*;

public class Program44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);

    }
}

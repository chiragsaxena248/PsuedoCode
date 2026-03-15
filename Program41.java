/*
DECLARE a : ARRAY[5] OF INTEGER
DECLARE max : INTEGER
FOR i:=0 TO 4
        READ a[i]
END FOR
SET max = a[0]
FOR i:=0 TO 4
`       IF a[i]> max THEN
                max = a[i]
        ENDIF
ENDFOR
PRINT max
 */
import java.util.*;

public class Program41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int max;
        for (int i = 0; i <= 4; i++) {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for (int i = 0; i <= 4; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

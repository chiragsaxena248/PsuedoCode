/*
DECLARE a : ARRAY[5] OF INTEGER
DECLARE min : INTEGER
FOR i:=0 TO 4
        READ a[i]
END FOR
SET min = a[0]
FOR i:=0 TO 4
`       IF a[i] < min THEN
                min = a[i]
        ENDIF
ENDFOR
PRINT min
 */
import java.util.*;

public class Program42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int min;
        for (int i = 0; i <= 4; i++) {
            a[i] = sc.nextInt();
        }
        min = a[0];
        for (int i = 0; i <= 4; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}

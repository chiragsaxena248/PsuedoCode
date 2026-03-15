/*
DECLARE x : ARRAY[3][3] OF INTEGER
DECLARE y : ARRAY[3][3] OF INTEGER
DECLARE z : ARRAY[3][3] OF INTEGER
FOR r:=0 TO 2
    FOR c:=0 TO 2
        READ x[r][c]
        READ y[r][c]
        z[r][c] = x[r][c] - y[r][c]
        PRINT z[r][c]
    ENDFOR
ENDFOR

 */
import java.util.*;

public class Program46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x = new int[3][3];
        int[][] y = new int[3][3];
        int[][] z = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                y[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                z[i][j] = x[i][j] - y[i][j];
                System.out.print(z[i][j] + " ");
            }
        }
    }
}

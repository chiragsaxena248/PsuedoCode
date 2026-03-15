/*
DECLARE i : INTEGER
SET i = 1
WHILE  i<=10
    PRINT num*i
    INCREMENT i
ENDWHILE

 */
import java.util.*;

public class Program12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int num = sc.nextInt();
        while (i <= 10) {
            System.out.print(num * i + " ");
            i++;
        }
    }
}

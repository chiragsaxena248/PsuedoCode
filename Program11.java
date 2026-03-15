
/*
DECLARE i : INTEGER
DECLARE num : INTEGER
READ num
SET i=1
REPEAT
    PRINT num*i
    INCREMENT i
UNTIL i<=10

 */
import java.util.*;

public class Program11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        System.out.println("Output: ");
        do {
            System.out.print(num * i + " ");
            i++;
        } while (i <= 10);
    }
}

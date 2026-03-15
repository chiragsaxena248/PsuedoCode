
/*
DECLARE num : INTEGER
DECLARE count : INTEGER
SET count = 0
READ num
WHILE num > 0
        INCREMENT count
        num = num / 10
END WHILE
PRINT count

 */
import java.util.*;

public class Program25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}

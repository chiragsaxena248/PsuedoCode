/*
EVEN NUMBER

FOR i:=1 TO 10
    IF i MOD 2 != 0 THEN
        CONTINUE
    END IF
END FOR

ODD NUMBER

FOR i:=0 TO 10
    IF i MOD 2 == 0 THEN
        CONTINUE
    END IF
    PRINT i
END FOR


 */
import java.util.*;

public class Program17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("Even num: ");
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Odd num: ");
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

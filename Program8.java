/*
DECLARE i : INTEGER 
SET i=1
REPEAT
    PRINT i
    INCREMENT i
UNTIL i<=10

 */

import java.util.*;

public class Program8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Output: ");
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
    }
}

/*
SET x TO 0
SET n TO 1
WHILE n<=100
        x = x+n
        n = n+1
ENDWHILE
WRITE x
 */
public class Program38 {

    public static void main(String[] args) {
        int x = 0, n = 1;
        while (n <= 100) {
            x = x + n;
            n = n + 1;
        }
        System.out.println(x);
    }
}

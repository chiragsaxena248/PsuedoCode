/*
INT sumTSeries(INTEGER n)
        DECLARE sum : INTEGER
        sum :=  0
        FOR EACH i FROM 1 TO n 
                sum += i
        END FOR
        RETURN sum
END FUNCTION
PRINT sumTSeries(10)

 */
import java.util.*;

public class Program50 {

    public static void main(String[] args) {
        // Sum the series using a function
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Series: " + sumTSeries(n));
    }

    public static int sumTSeries(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

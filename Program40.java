/*
INTEGER f = 6, g = 9
SET sum = 0
INTEGER n
IF (g>f)
    FOR n = f; n< g; n = n+1
        sum = sum + n
    END LOOP
ELSE
    PRINT error message
END IF
PRINT sum

 */
public class Program40 {

    public static void main(String[] args) {
        int f = 6, g = 9;
        int sum = 0;
        int n;
        if (g > f) {
            for (n = f; n < g; n += 1) {
                sum += n;
            }
        } else {
            System.out.println("Error");
        }
        System.out.println(sum);
    }
}

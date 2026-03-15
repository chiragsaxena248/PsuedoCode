/*
INTEGER p, q, r
SET p = 3, q = 4, r = 4
FOR EAACH FROM q = 5 TO 8
        IF ((q+r)<(r-q))
            CONTINUE
        END IF
        p = (p + 7) + r
        q = p + p
END FOR
PRINT p + q

 */
public class Program34 {

    public static void main(String[] args) {
        int p = 3, q = 4, r = 4;
        for (q = 5; q <= 8; q++) {
            if ((q + r) < (r - q)) {
                continue;
            }
            p = (p + 7) + r;
            q = p + p;
        }
        System.out.println(p + q);
    }
}

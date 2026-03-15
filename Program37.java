/*
INTEGER p, q, r
SET p = 0, q = 2, r = 9
r = (7+p)
q = (q+r)
FOR EACH r FROM 4 to 7
        p = (p+p)&q
        IF ((p+q)<(r-p) || 8<p)
            p = (p+2)+q
            JUMP OUT OF THE LOOP
        ENDIF
ENDFOR
PRINT p + q

 */
public class Program37 {

    public static void main(String[] args) {
        int p = 0, q = 2, r = 9;
        r = (7 + p);
        q = (q + r);
        for (r = 4; r <= 7; r++) {
            p = (p + p) & q;
            if ((p + q) < (r - p) || 8 < p) {
                p = (p + 2) + q;
                break;
            }
        }
        System.out.println(p + q);
    }
}

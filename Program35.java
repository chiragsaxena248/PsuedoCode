/*
INTEGER a, b, c
SET a = 7, b = 10, c = 9
FOR EACH c FROM 3 TO 4 
        a = b
        IF ((b-a+c)<(c+b))
            continue
        ELSE
            JUMP OUT OF THE LOOP
        END IF
        a = ( 5+ 6) ^ c
END FOR
PRINT a + b
 */
public class Program35 {

    public static void main(String[] args) {
        int a = 7, b = 10, c = 9;
        for (c = 3; c <= 4; c++) {
            a = b;
            if ((b - a + c) < (c + b)) {
                continue;
            } else {
                break;
            }
            // Unreachable a = (5 + 6) ^ c;
        }
        System.out.println(a + b);
    }
}

/*
DECLARE x : INTEGER
SET x = 259
IF x EQUALS TO 0
    PRINT a
OTHERWISE
    PRINT x MOD 9
END IF


 */
public class Program16 {

    public static void main(String[] args) {
        int x = 259;
        if (x == 0) {
            System.out.println(0);
        } else {
            System.out.println(x % 9);
        }
    }
}

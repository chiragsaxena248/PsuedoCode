/*
FOR i:=0 TO 10
    IF i==5
        BREAK
    END IF
    PRINT i
END FOR

 */
public class Program18 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}

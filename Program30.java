/*
INTEGER val, x
SET val = 1, x = 45
WHILE cal <= x
        val = val<<1
END WHILE
PRINT val
 */
public class Program30 {

    public static void main(String[] args) {
        int val = 1;
        int x = 45;
        while (val <= x) {
            val = val << 1;
        }
        System.out.println(val);
    }
}

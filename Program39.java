/*
INTEGER a, b, c, d, e
SET a = 50, b = 3, c = 3
WHILE (c>0)
        d = a MOD b
        e = e + d + a
        c = c-1
END WHILE
PRINT e


INTEGER x = 9, y = 2, z = 6
INTEGER a
SET a = x & y | z
PRINT a
 */
public class Program39 {

    public static void main(String[] args) {
        int a = 50, b = 3, c = 3, d = 0, e = 0;
        while (c > 0) {
            d = a % b;
            e = e + d + a;
            c = c - 1;
        }
        System.out.println(e);

        int x = 9, y = 2, z = 6;
        int aa = x & y | z;
        System.out.println(aa);
    }
}

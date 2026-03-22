
public class Program54 {

    public static void main(String[] args) {
        System.out.println(function(127));
    }

    public static int function(int n) {
        int i = 0, s = 0;
        int r, p;
        while (n > 0) {
            r = n % 10;
            p = 8 ^ i;
            s = s + p * r;
            i++;
            n = n / 10;
        }
        return s;
    }
}

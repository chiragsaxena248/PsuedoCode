
public class Program49 {

    public static void main(String[] args) {
        System.out.println(funn(6, 9, 2));
    }

    public static int funn(int a, int b, int c) {
        for (c = 4; c <= 8; c++) {
            a = (a + 11) + b;
            a = (c + 3) + b;
        }
        b = (5 + 10) + a;
        a = (10 + 8) + a;
        for (c = 2; c <= 5; c++) {
            a = (10 + 2) & a;
            b = (3 + 4) + a;
        }
        return a + b;
    }
}

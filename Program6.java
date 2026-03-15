/*
LOGIN

DECLARE uid : INTEGER
DECLARE pass : STRING
READ uid
READ pass

IF uid == "admin" THEN
        IF pass == "adminpass" THEN
            PRINT welcome user
        ELSE 
            print Wrong password
        ENDIF
ELSE
        PRINT Wrong user id
ENDIF
 */
import java.util.*;

public class Program6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uid = sc.nextInt();
        sc.nextLine();
        String pass = sc.nextLine();

        if (uid == 100) {
            if (pass.equals("adminpass")) {
                System.out.println("Welcome user");
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("Wrong user id");
        }
    }
}

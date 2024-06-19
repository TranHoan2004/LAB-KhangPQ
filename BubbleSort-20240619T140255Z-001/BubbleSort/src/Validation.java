
import java.util.Scanner;

public class Validation {

    public static Scanner sc = new Scanner(System.in);

    public static int inputInt(String msg, int min, int max) {
        int n;
        do {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("choice must be an integer from " + min + " to " + max + ", pls re-entry !");
            }
        } while (true);
        return n;
    }
}

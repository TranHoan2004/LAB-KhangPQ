package ulis;

import java.util.Random;
import java.util.Scanner;

public class NumberUtils {

    public static int getRandomNumberInRange(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static int inputInt(String mess, int min, int max) {
        int ret;
        Scanner scan = new Scanner(System.in);
        System.out.println(mess);
        do {
            try {
                ret = Integer.parseInt(scan.nextLine());
                if (ret < min || ret > max) {
                    throw new IndexOutOfBoundsException();
                }
                return ret;
            } catch (NumberFormatException e) {
                System.err.println("Only allowed to enter integer numbers");
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Please enter integer number in range [" + min + "," + max + "]");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public static int inputInt(String mess) {
        return inputInt(mess, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}

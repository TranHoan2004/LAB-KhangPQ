
package utils;

import java.util.Scanner;


public class ValidationAndNormalText {

    public static Scanner sc = new Scanner(System.in);

    // check user input number limite
    public static int checkIntLimit(int min, int max) {
        while (true) {
            try {
                int rels = Integer.parseInt(sc.nextLine());
                if (rels >= min && rels <= max) {
                    return rels;
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String getStringByRegex(String mess, String error, String regex) {
        Scanner scan = new Scanner(System.in);
        String output = "";
        while (true) {
            System.out.print(mess);
            output = scan.nextLine();
            if (output.matches(regex)) {
                return output;
            } else {
                System.err.println(error);
            }
        }
    }

    // check user input string
    public static String checkInputString(String mes) {
        // loop utils user input correct
        while (true) {
            try {
                System.out.println(mes);
                String res = sc.nextLine().trim();
                if (res.isEmpty()) {
                    throw new Exception();
                }
                return res;
            } catch (Exception e) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            }
        }
    }
    // check user input int 

    public static int checkInt(String mes) {
        while (true) {
            try {
                System.out.println(mes);
                int res = Integer.parseInt(sc.nextLine());
                return res;

            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }

    static String p = "^[0-9]{10}$";
    static String p1 = "^[0-9]{3}-[0-9]{3}-[0-9]{4}$";
    static String p3 = "^[0-9]{3}.[0-9]{3}.[0-9]{4}$";
    static String p4 = "^[0-9]{3} [0-9]{3} [0-9]{4}$";
    static String p2 = "^[0-9]{3}-[0-9]{3}-[0-9]{4} (x|ext)[0-9]{4}$";
    static String p5 = "^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$";

    // check input phone
    public static String checkinputPhone() {
        while (true) {
            try {
                String res = checkInputString("Enter Phone: ");
                if (res.matches(p) || res.matches(p1) || res.matches(p2) || res.matches(p3) || res.matches(p4) || res.matches(p5)) {
                    return res;
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Please input Phone flow\n"
                        + "• 1234567890\n"
                        + "• 132-456-7890 \n"
                        + "• 123-456-7890 x1234\n"
                        + "• 123-456-7890 ext1234\n"
                        + "• (123)-456-7890\n"
                        + "• 123.456.7890\n"
                        + "• 123 456 7890");
                System.out.print("Enter again: ");
            }
        }
    }
}

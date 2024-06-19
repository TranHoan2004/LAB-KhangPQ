package DATA;

import DTO.Product;
import java.util.List;
import java.util.Scanner;

public class InputData {

    public static Scanner sc = new Scanner(System.in);

    public static int inputInt(String msg, int min, int max) {
        String str;
        int n;
        do {
            try {
                System.out.print(msg);
                str = sc.nextLine().trim();
                if (str.isEmpty()) {
                    System.out.println("input is not allowed to be empty, pls re-entry! ");
                    continue;
                }
                n = Integer.parseInt(str);
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

    public static String inputID(String msg, String err, int mode, List<Product> pList) {
        String ID;
        while (true) {
            try {
                System.out.print(msg);
                ID = sc.nextLine().toUpperCase().trim();
                if (ID.isEmpty()) {
                    System.out.println("input is not allowed to be empty, pls re-entry! ");
                    continue;
                } else if (!ID.isEmpty()) {
                    if ((Validation.oExist(ID, pList,1) == null && mode == 1)
                            || (Validation.oExist(ID, pList,1) != null && mode == 2)) {
                        break;
                    }
                    throw new Exception();
                }

            } catch (Exception e) {
                System.err.println(err);
            }
        }
        return ID;
    }

    public static String intputSring(String msg, String err) {
        String name;
        String s = "";
        String str[];
        while (true) {
            try {
                System.out.print(msg);
                name = sc.nextLine().trim();
                if (!name.isEmpty()) {
                    str = name.split("\\s++");
                    for (String x : str) {
                        name = String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1).toLowerCase();
                        s = s + " " + name;
                    }
                    break;
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println(err);
            }
        }
        return s;
    }

    public static double inputDouble(String msg, double min, double max) {
        String str;
        double n;
        do {
            try {
                System.out.print(msg);
                str = sc.nextLine().trim();
                if (str.isEmpty()) {
                    System.out.println("input is not allowed to be empty, pls re-entry! ");
                    continue;
                }
                n = Double.parseDouble(str);
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

    public static String inputDate(String msg, String err) {
        String pattern = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
        String str;
        String Date;
        do {
            try {
                System.out.print(msg);
                Date = sc.nextLine();
                if (Date.isEmpty()) {
                    System.out.println("input is not allowed to be empty");
                    continue;
                }
                if (!Date.matches(pattern)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println(err);
            }
        } while (true);
        return Date;
    }

    public static String inputYorN(String msg, String a, String b) {
        String choice;
        do {
            System.out.println(msg);
            choice = sc.nextLine().trim();
            if (choice.isEmpty()) {
                System.out.println("input is not allowed to be empty, pls re-entry !");
                continue;
            }
            if (!(choice.equalsIgnoreCase(a) || choice.equalsIgnoreCase(b))) {
                System.out.println("input must be " + a + "/" + b + ", pls re-entry !");
                continue;
            }
            break;
        } while (true);
        return choice;
    }
    
    public static void choiceSearh() {
        System.out.println("Search By (Name) (Category) (Storekeeper) (ReceiptDate)");
        System.out.println("    1.Name");
        System.out.println("    2.Category");
        System.out.println("    3.Storekeeper");
        System.out.println("    4.ReceiptDate");
    }

}

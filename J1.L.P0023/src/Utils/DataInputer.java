package Utils;

import java.util.List;
import java.util.Scanner;

public class DataInputer {

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

    public static String inputStringID(String msg, String err, int choice, List<Object> wList) {
        String ID;
        while (true) {
            try {
                System.out.print(msg);
                ID = sc.nextLine().toUpperCase().trim();
                if (!ID.isEmpty()) {
                    if ((oExist(ID, wList) == null && choice == 1) || oExist(ID, wList) != null && choice == 2) {
                        break;
                    }
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println(err);
            }
        }
        return ID;
    }
    
    public static String intputSring(String msg , String err){
        String name;
        String s = "";
        String str[];
        while (true) {            
            try {
                System.out.print(msg);
                name = sc.nextLine().trim();
                if(!name.isEmpty()){
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

    public static double inputDouble(String msg, String err , double min , double max) {
        double n;
        while (true) {
            try {
                System.out.print(msg);
                n = Double.parseDouble(sc.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println(err);
            }
        }
        return n;
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
    
    public static Object oExist(String ID, List<Object> oList) {
        for (Object o : oList) {
            if (o.getID().equalsIgnoreCase(ID)) {
                return o;
            }
        }
        return null;
    }

}

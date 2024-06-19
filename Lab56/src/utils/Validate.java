
package utils;

import java.util.List;
import java.util.Scanner;
import model.Worker;

public class Validate {
     static Scanner sc = new Scanner(System.in);
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
        
        String output = null;
        while (true) {
            System.out.print(mess);
            output = sc.nextLine();
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
    public static int checkInt(String mes, int min, int max) {
        while (true) {
            try {
                System.out.println(mes);
                int res = Integer.parseInt(sc.nextLine());
                if(res >= min && res <=max){
                return res;
                }
              throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }
    
     public static double checkDouble(String mes) {
        while (true) {
            try {
                System.out.println(mes);
                double res = Double.parseDouble(sc.nextLine());
                return res;

            } catch (NumberFormatException e) {
                System.err.println("Please input double number");
                System.out.print("Enter again: ");
            }
        }
    }
     
     
    public static Worker getWorker(String id, List<Worker> wlist){
        for (Worker o : wlist) {
            if(o.getId().equals(id))
                return o;
    }
        return null;
    }
}

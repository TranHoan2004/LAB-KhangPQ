
package Data;

import java.util.Scanner;


public class Validation {
    public static Scanner sc = new Scanner(System.in);
    
    public static int getBase(String msg,String err){
        while (true) {            
            try {
                System.out.print(msg);
                int base = Integer.parseInt(sc.nextLine());
                if(base == 2 || base == 10 || base == 16)
                    return base;
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.err.println(err);
            }
        }
    }
    
    public static String getValue(String msg, int base, String err) {
        String patternBin = "[0-1]+";
        String patternDec = "[0-9]+";
        String patternHex = "[0-9-a-fAF]+";
        while (true) {            
            try {
                System.out.print(msg);
                String value = sc.nextLine();
                switch (base) {
                    case 2:
                        if (value.matches(patternBin)) {
                            return value;
                        }
                        throw new Error();
                    case 10:
                        if (value.matches(patternDec)) {
                            return value;
                        }
                        throw new Error();
                    case 16:
                        if (value.matches(patternHex)) {
                            return value;
                        }
                        throw new Error();
                    default:
                        break;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Base must from 2 or 10 or 16");
            } catch (Error e) {
                System.err.println(err);
            }
        }        
    }
}

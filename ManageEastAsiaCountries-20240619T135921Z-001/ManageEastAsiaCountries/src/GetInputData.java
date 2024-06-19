
import java.util.Scanner;


public class GetInputData {
    public static Scanner sc = new Scanner(System.in);
    
    public static int inputChoice(String msg,int min,int max){
        String str;
        int choice;
        do {
            try {
                System.out.println(msg);
                str = sc.nextLine().trim();
                if (str.isEmpty()) {
                    System.out.println("choice is not allowed to be empty, pls re-entry!");
                    continue;
                }
                choice = Integer.parseInt(str);
                if (choice < min || choice > max) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("choice must be an integer from " + min + " to " + max + ", pls re-entry !");
            }
        } while (true);
        return choice;
    }
    
    public static String stringInput(String msg){
        String s;
        while (true) { 
            try {
                System.out.println(msg);
                s = sc.nextLine().trim();
                if(s.isEmpty())
                    throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("input is not allowed to be empty!");
            }          
        }
        return s;
    }
    
    public static float floatInput(String msg){
        float a;
        while (true) {
            try { 
                System.out.println(msg);
                a = Float.parseFloat(sc.nextLine()); 
                if(a > 0){
                    break;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Pls!Enter a possitive great than 0");
            }
        }
        return a;
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
        
    public static int sizeListStudent() {
        int n;
        do {
            System.out.println("Enter number of lists want to add: ");
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n > 0) {
                    break;
                }
                System.out.println("Our Range!Enter again: ");
            } catch (NumberFormatException e) {
                System.out.println("Error Format!Enter again");
            }
        } while (true);
        return n;
    }
 
}

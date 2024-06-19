
import java.util.Scanner;


public class GetInputData {
    public static Scanner sc = new Scanner(System.in);
    
    public static int inputChoice(String msg,int min,int max){
        String str;
        int choice;
        do {
            try {
                System.out.println(msg);
                str = sc.nextLine();
                if (str.isEmpty()) {
                    System.out.println("Choice is not allowed to be empty, pls re-entry!");
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
    
    public static String inputString(String msg){
        String str;
        do {
            try {
                System.out.println(msg);
                str = sc.nextLine();
                if (str.isEmpty()) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("input is not allowed to be empty, pls en-try! ");
            }      
        } while (true);
        return str;
    }
    
    public static int inputInt(String msg){          
        int n;
        while (true) {
            try {
                System.out.println(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n > 0) {
                    break;
                }
                System.out.println("Pls!Enter a positive");
            } catch (NumberFormatException e) {
                System.out.println("Enter again");
            }
        }
        return n;
    }
    
    public static String inputYorN(String msg, String a, String b) {
        Scanner sc = new Scanner(System.in);
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
}

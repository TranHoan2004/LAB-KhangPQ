package Data;


import java.util.Scanner;



public class GetInputDataSubject {
    public static Scanner sc = new Scanner(System.in);
    

    
    public static String inputString(String msg) {
        String str;
        do {
            try {
                System.out.print(msg);
                str = sc.nextLine().toUpperCase().trim();
                if(str.isEmpty()){
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("input is not allowed to be empty");
            }
            
        } while (true);
        return str;
    }
    
    public static double doubleInput(String msg) {
        double a;
        while (true) {
            try {
                System.out.print(msg);
                a = Double.parseDouble(sc.nextLine());
                if (a > 0) {
                    break;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Pls!Enter a possitive great than 0");
            }
        }
        return a;
    }
}

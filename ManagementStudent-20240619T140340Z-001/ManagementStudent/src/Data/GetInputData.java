package Data;

import DTO.Student;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class GetInputData {

    public static Scanner sc = new Scanner(System.in);

    public static int inputChoice(String msg, int min, int max) {
        int choice;
        String str;
        do {
            try {
                System.out.print(msg);
                str = sc.nextLine().trim();
                if (str.isEmpty()) {
                    System.out.println("choice is not allowed to be empty, pls re-entry!");
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

    public static String inputID(String msg , String err,  ArrayList<Student> t , int mode) {
        String ID;
        String pattern = "SE[0-9]{6}";
        String error = "SE[0]{6}";
        do {
            try {
                System.out.print(msg);
                ID = sc.nextLine().trim().toUpperCase();
                if (ID.isEmpty()) {
                    System.out.println("input is not allowed to be empty");
                    continue;
                }
                if((ID.matches(pattern) && Validation.searchAStudent(t, ID) == null && mode == 1) 
                    || (ID.matches(pattern) && Validation.searchAStudent(t, ID) != null && mode == 2)){
                    break;
                }
                else if (!ID.matches(pattern)) {
                    throw new IllegalArgumentException();
                }
                else if (ID.matches(error)) {
                    throw new Error();
                }
                throw new Exception();                
            } catch (IllegalArgumentException e) {
                System.out.println("Code(ID) must be in form SE123456");
            } catch (Error e) {
                System.out.println("Code(ID) is not allowed to be SE000000");
            } catch (Exception e) {
                System.err.println(err);
            }

        } while (true);
        return ID;
    }

    public static String inputEmail(String msg) {
        String email;
        Pattern p = Pattern.compile("^[a-zA-z][a-zA-z0-9]+@[a-zA-z]+(.[a-zA-z]+){1,3}$");
        String error = "\\\\b[A-Z0-9._%-]+[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b";
        do {
            try {
                System.out.print(msg);
                email = sc.nextLine().trim();
                if (email.isEmpty()) {
                    System.out.println("input is not allowed to be empty");
                    continue;
                }
                if (!p.matcher(email).find()) {
                    throw new Exception();
                }
                if (email.matches(error)) {
                    throw new Error();
                }
                break;
            } catch (Exception e) {
                System.out.println("Email must be in form abcde@gmail.com");
            } catch (Error e) {
                System.out.println("Email is not allow to be abcd^#");
            }
        } while (true);
        return email;
    }

    public static String inputGender(String msg) {
        String gender = "";
        int choice;
        String str;
        do {
            try {
                System.out.println(msg);
                System.out.println("1. Male");
                System.out.println("2. Female");
                System.out.println("3. Other");
                System.out.println("Your choice: ");
                str = sc.nextLine().trim();
                if (str.isEmpty()) {
                    System.out.println("input is not allowed to be empty, pls en-try!");
                    continue;
                }
                choice = Integer.parseInt(str);
                if (choice < 1 || choice > 3) {
                    throw new Exception();
                }
                switch (choice) {
                    case 1:
                        gender = "Male";
                        break;
                    case 2:
                        gender = "Female";
                        break;
                    case 3:
                        gender = "other gender";
                        break;
                }
                break;
            } catch (Exception e) {
                System.out.println("gender must be one of above, pls re-entry!");
            }
        } while (true);
        return gender;
    }

    public static String inputDOB(String msg) {
        String pattern = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
        String str;
        String DOB;
        do {
            try {
                System.out.print(msg);
                DOB = sc.nextLine();
                if (DOB.isEmpty()) {
                    System.out.println("input is not allowed to be empty");
                    continue;
                }
                if (!DOB.matches(pattern)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Date of Birth form dd\\mm\\yyyy");
            }
        } while (true);

        return DOB;
    }

    public static int inputNumberPhone(String msg) {
        String pattern = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
        String str;
        int numberPhone;
        do {
            try {
                System.out.print(msg);
                str = sc.nextLine().trim();
                numberPhone = Integer.parseInt(str);
                if (str.isEmpty()) {
                    System.out.println("input is not allowed to be empty");
                    continue;
                }
                if (!str.matches(pattern)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Number Phone format must +84 1 234 5678");
            }
        } while (true);
        return numberPhone;
    }

    public static String inputFNLN(String msg,String err) {
        String str;
        String str1[];
        String s = "";
        do {
            try {
                System.out.print(msg);
                str = sc.nextLine().trim();
                if (str.isEmpty()) {
                    throw new Exception();
                }
                str1 = str.split("\\s++");
                for (String x : str1) {
                    str = String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1).toLowerCase();
                    s = s + " " + str;
                }
                break;
            } catch (Exception e) {
                System.err.println(err);
            }
        } while (true);
        return s.trim();
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

    public static double doubleInput(String msg) {
        double a;
        while (true) {
            try {
                System.out.println(msg);
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

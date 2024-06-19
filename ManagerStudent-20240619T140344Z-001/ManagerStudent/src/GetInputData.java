
import java.util.Scanner;

public class GetInputData {

    public static int inputChoice(String msg, int min, int max) {
        Scanner sc = new Scanner(System.in);
        String str;
        int choice;
        do {
            try {
                System.out.print(msg);
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

    public static String inputID(String msg) {
        Scanner sc = new Scanner(System.in);
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
                if (!ID.matches(pattern)) {
                    throw new Exception();
                }
                if (ID.matches(error)) {
                    throw new Error();
                }
                break;
            } catch (Exception e) {
                System.out.println("Code(ID) must be in form SE123456");
            } catch (Error e) {
                System.out.println("Code(ID) is not allowed to be SE000000");
            }

        } while (true);
        return ID;
    }

    static String toName(String str) {
        str = str.toUpperCase();
        String sub = str.substring(1, str.length());
        return str.charAt(0) + sub.toLowerCase();
    }

    public static String inputName(String msg) {
        Scanner sc = new Scanner(System.in);
        String name;
        String pattern = "[a-zA-Z ]+";
        do {
            try {
                System.out.print(msg);
                name = sc.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("input is not allowed to be empty, pls re-entry!");
                    continue;
                }
                if (!name.matches(pattern)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Name is not allowed to contain special characters or number");
            }
        } while (true);
        String[] sub = name.split("[ ]+");
        name = "";
        for (int i = 0; i < sub.length; i++) {
            name += toName(sub[i]);
            if (i != sub.length - 1) {
                name += " ";
            }

        }
        return name;
    }

    public static int inputSemester(String msg) {
        Scanner sc = new Scanner(System.in);
        String str;
        int semester;
        do {
            try {
                System.out.print(msg);
                str = sc.nextLine().trim();
                if (str.isEmpty()) {
                    System.out.println("input is not allowed to be empty, pls re-entry!");
                    continue;
                }
                semester = Integer.parseInt(str);
                if (semester <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("semester must be a positive integer, pls re-entry !");
            }

        } while (true);
        return semester;
    }

    public static String inputCourse(String msg) {
        Scanner sc = new Scanner(System.in);
        String course = null;
        int choice;
        String str;
        do {
            try {
                System.out.println(msg);
                System.out.println("1. java");
                System.out.println("2. .Net");
                System.out.println("3. C/C++");
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
                        course = "java";
                        break;
                    case 2:
                        course = ".Net";
                        break;
                    case 3:
                        course = "C/C++";
                        break;
                }
                break;
            } catch (Exception e) {
                System.out.println("course must be one of above, pls re-entry!");
            }
        } while (true);
        return course;
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

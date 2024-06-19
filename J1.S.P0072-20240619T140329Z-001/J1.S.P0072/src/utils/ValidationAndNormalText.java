package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class ValidationAndNormalText {

    public static Scanner sc = new Scanner(System.in);

    public static int inputChoice(String msg, int min, int max) {
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
                System.err.println("choice must be an integer from " + min + " to " + max + ", pls re-entry !");
            }
        } while (true);
        return choice;
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

    public static String getStringByRegex(String mess, String error, String regex) {
        Scanner scan = new Scanner(System.in);
        String output = null;
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

    public static String getPhone(int minLength, String mess) {
        String regex = "[0-9 ]+";
        while (true) {
            String phoneNum = getStringByRegex(mess, "Please enter number only!!", regex).replaceAll("\\s+", "");
            if (phoneNum.length() < minLength) {
                System.err.println("Phone number must be at least 10 characters");
            } else {
                return phoneNum;
            }
        }
    }

    public static String getEmail(String mess) {

        String regex = "^[A-Za-z](.*)([@]{1})(.{2,})(\\.)(.{2,})";//phai bat dau bang chu cai
        String email = getStringByRegex(mess, "Please enter email with format <account name>@<domain>", regex);
        return email;
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

    public static String MD5Encryption(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            return DatatypeConverter.printHexBinary(md.digest()).toLowerCase();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}

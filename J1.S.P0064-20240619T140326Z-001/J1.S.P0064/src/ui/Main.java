
package ui;

import bo.CheckValidate;


public class Main {
    public static void main(String[] args) {
        CheckValidate checkValidate = new CheckValidate();
        String getDate = checkValidate.checkDate("Enter Date: ", "input must be dd-mm-yyyy");
        String getPhone = checkValidate.checkPhone("Enter phone: ");
        String getEmail = checkValidate.checkEmail("Enter email: ");
        System.out.println("Date: " + getDate + "\n" + "Phone: " + getPhone + "\n" + "Email: " + getEmail);
    }
}

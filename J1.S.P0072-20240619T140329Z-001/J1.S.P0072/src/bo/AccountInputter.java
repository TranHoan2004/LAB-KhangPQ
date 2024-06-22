package bo;

import entity.Account;
import utils.Validation;

public class AccountInputter {

    private Account a;

    public AccountInputter() {
        a = new Account();
    }

    public Account getAccount() {
        return a;
    }

    public Account userAccount() {
        a.setUsername(Validation.intputSring("Enter Username: ", "Error Format"));
        return a;
    }

    public Account information() {
        a.setPassword(Validation.intputSring("Enter Password: ", "Eror Format"));
        a.setPhone(Validation.getPhone(10, "Enter phone: "));
        a.setEmail(Validation.getEmail("Enter email: "));
//        a.setAddress(Validation.intputSring("Enter Address: ", "Eror Format"));
//        a.setDateOfBirth(Validation.inputDOB("Enter DOB: "));
        return a;
    }
}

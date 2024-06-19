package bo;

import entity.Account;
import utils.ValidationAndNormalText;

public class AccountInputter {

    private Account a;

    public AccountInputter() {
        a = new Account();
    }

    public Account getAccount() {
        return a;
    }

    public Account userAccount() {
        a.setUsername(ValidationAndNormalText.intputSring("Enter Username: ", "Error Format"));
        return a;
    }

    public Account information() {
        a.setPassword(ValidationAndNormalText.intputSring("Enter Password: ", "Eror Format"));
        a.setPhone(ValidationAndNormalText.getPhone(10, "Enter phone: "));
        a.setEmail(ValidationAndNormalText.getEmail("Enter email: "));
//        a.setAddress(ValidationAndNormalText.intputSring("Enter Address: ", "Eror Format"));
//        a.setDateOfBirth(ValidationAndNormalText.inputDOB("Enter DOB: "));
        return a;
    }
}

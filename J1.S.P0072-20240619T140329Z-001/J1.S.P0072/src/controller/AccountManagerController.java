package controller;

import bo.AccountInputter;
import bo.AccountManager;
import entity.Account;
import utils.ValidationAndNormalText;

public class AccountManagerController {

    private AccountInputter accountInputter;
    private AccountManager accountManager;

    public AccountManagerController() {
        accountManager = new AccountManager();
    }

    public Account inputAccount() {
        accountInputter = new AccountInputter();
        Account a = accountInputter.userAccount();
        if (!accountManager.isSameName(a)) {
            a = accountInputter.information();
            return a;
        } else {
            System.err.println("Duplicated! Try again");
            return inputAccount();
        }
    }

    public boolean addAccount() {
        Account a = inputAccount();
        if (accountManager.addAccount(a)) {
            accountInputter.getAccount();
        }
        return false;
    }

    public Account changePassWord() throws Exception {
        String userName = ValidationAndNormalText.intputSring("Enter Username: ", "Error Format");
        String oldPassWord = ValidationAndNormalText.intputSring("Enter PassWord: ", "Error Format");
        Account a = accountManager.getAccount(userName,ValidationAndNormalText.MD5Encryption(oldPassWord));
        String newPassWord = ValidationAndNormalText.intputSring("Enter new PassWord: ", "Error Format");
        String renewPassWord = ValidationAndNormalText.intputSring("Enter reNew PassWord: ", "Error Format");
        return accountManager.changePassWord(a, userName, oldPassWord,ValidationAndNormalText.MD5Encryption(newPassWord),ValidationAndNormalText.MD5Encryption(renewPassWord));
    }
}

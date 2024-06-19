package ui;

import controller.AccountManagerController;
import entity.Account;

public class Main {

    public static void main(String[] args) throws Exception {
        AccountManagerController accountManagerController = new AccountManagerController();
        int choice;
        while (true) {
            Menu.menu();
            choice = Menu.getMenu();
            switch (choice) {
                case 1:
                    if (!accountManagerController.addAccount()) {
                        System.out.println("Add successfully!");
                    } else {
                        System.out.println("Add fail");
                    }
                    break;
                case 2:
                    try {
                        Account a = accountManagerController.changePassWord();
                        System.out.println("Change Successfully");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    return;
            }
        }
    }
}

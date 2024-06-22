package ui;

import utils.Validation;

public class Menu {

    public static void menu() {
        System.out.println("1. Add user");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }

    public static int getMenu() {
        return Validation.inputChoice("Enter your choice: ", 1, 3);
    }
}

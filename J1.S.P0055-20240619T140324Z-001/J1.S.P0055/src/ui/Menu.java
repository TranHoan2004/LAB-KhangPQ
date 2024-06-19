package ui;

import utils.ValidationAndNormalText;

public class Menu {

    public static void Menu() {
        System.out.println("========= Worker Managerment =========");
        System.out.println("    1.Add Worker");
        System.out.println("    2.Increase salary for worker.");
        System.out.println("    3.Decrease for worker.");
        System.out.println("    4.Show Worker in List ");
        System.out.println("    5.Show adjusted salary worker information.");
        System.out.println("    6.Exit");
    }

    public static int getMenu() {
        return ValidationAndNormalText.inputChoice("Enter one option in above : ", 1, 6);
    }

}

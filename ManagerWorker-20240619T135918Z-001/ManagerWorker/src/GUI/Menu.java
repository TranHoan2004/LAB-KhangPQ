package GUI;

import DTO.ManagerWorker;
import DTO.Worker;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static void Menu() {
        System.out.println("========= Worker Managerment =========");
        System.out.println("    1.Add Worker");
        System.out.println("    2.Increase salary for worker.");
        System.out.println("    3.Decrease for worker.");
        System.out.println("    4.Show adjusted salary worker information.");
        System.out.println("    5.Exit");
    }

    public static int getChoice() {
        return Data.DataInputer.inputInt("Enter one option in above : ", 1, 5);
    }

    public static void display() {
        ManagerWorker mw = new ManagerWorker();
        List<Worker> t = new ArrayList<>() ;
        int choice;
        while (true) {
            Menu();
            choice = Menu.getChoice();
            switch (choice) {
                case 1:
                    mw.addWorker();
                    break;
                case 2:
                    mw.getInformationUpdate(1);
                    break;
                case 3:
                    mw.getInformationUpdate(2);
                    break;
                case 4:
                    mw.getInformation();
                    break;
                case 5:
                    return;
            }
        }
    }
}

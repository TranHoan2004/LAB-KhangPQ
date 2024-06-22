package ui;

import controller.Controller;
import entity.Student;
import utils.Validation;

public class Main {

    public static void main(String[] args) throws Exception {
        Controller studentManagerController = new Controller();
        String menu = "WELCOME TO STUDENT MANAGEMENT\n"
                + "1. Create\n"
                + "2. Find and Sort\n"
                + "3. Update/Delete\n"
                + "4. Report\n"
                + "5. Exit\n"
                + "Enter one option in above : ";
        while (true) {
            int choice = Validation.getInt(menu, "Only number integer!", "input must be in range [1,5]", 1, 5);
            switch (choice) {
                case 1:
                    do {
                        try {
                            studentManagerController.inputStudent();
                            System.out.println("Add successfully!");
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                        System.out.printf("%-15s%-15s%-15s%s\n", "id", "name", "semester", "course");
                        for (Student st : studentManagerController.getList()) {
                            System.out.println(st.toString());
                        }
                    } while (Validation.pressYNtoContinue("Do you want to continue (Y/N? )"));
                    break;
                case 2:
                    try {
                        System.out.printf("%-15s%-15s%-15s%s\n", "id", "name", "semester", "course");
                        for (Student st : studentManagerController.findAndSort()) {
                            System.out.println(st.toString());
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        studentManagerController.updateOrDelete();
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.printf("%-15s%-15s%s\n", "name", "Semester", "course");
                        studentManagerController.getReport();
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 5:
                    return;
            }
        }
    }
}

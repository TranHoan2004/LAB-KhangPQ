package ui;

import controller.StudentManagerController;
import entity.Student;
import utils.ValidationAndNormalizingTextUtil;

public class Main {

    public static void main(String[] args) throws Exception {
        StudentManagerController studentManagerController = new StudentManagerController();
        String menu = "                      WELCOME TO STUDENT MANAGEMENT\n"
                + "                      1. Create\n"
                + "                      2. Find and Sort\n"
                + "                      3. Update/Delete\n"
                + "                      4. Report\n"
                + "                      5. Exit\n"
                + "Enter one option in above : ";
        while (true) {
            int choice = ValidationAndNormalizingTextUtil.getInt(menu, "Only number integer!", "input must be in range [1,5]", 1, 5);
            switch (choice) {
                case 1:
                    do {
                        try {
                            Student input = studentManagerController.inputStudent();
                            System.out.println(input);
                            System.out.println("Add successfully!");
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    } while (ValidationAndNormalizingTextUtil.pressYNtoContinue("Do you want to continue (Y/N? )"));
                    break;
                case 2:
                    studentManagerController.findAndSort();
                    break;
                case 3:
                    try {
                        studentManagerController.updateOrDelete();
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
                    studentManagerController.getReport();
                    break;
                case 5:
                    return;
            }
        }
    }
}

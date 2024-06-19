package ui;

import controller.TaskManagerController;
import entity.Task;
import utils.ValidationAndNormalizingTextUtil;

public class Main {

    public static void main(String[] args) throws Exception {
        TaskManagerController taskManagerController = new TaskManagerController();
        String menu = "                      WELCOME TO Task MANAGEMENT\n"
                + "                      1. Add Task\n"
                + "                      2. Delete Task\n"
                + "                      3. Display Task\n"
                + "                      4. Exit\n"
                + "Enter one option in above : ";
        while (true) {
            int choice = ValidationAndNormalizingTextUtil.getInt(menu, "Only number integer!", "input must be in range [1,4]", 1, 4);
            switch (choice) {
                case 1:
                    Task add = taskManagerController.getInformationTask();
                    System.out.println(add);
                    System.out.println("Add successfully!");
                    break;
                case 2:
                    try {
                        Task deleTask = taskManagerController.deleteTask();
                        System.out.println(deleTask);
                        System.out.println("Delete successfully!");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    taskManagerController.getDisplay();
                    break;
                case 4:
                    return;
            }
        }
    }
}

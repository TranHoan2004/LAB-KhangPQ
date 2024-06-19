package ui;

import controller.WorkerManagerController;
import entity.Worker;

public class Main {

    public static void main(String[] args) throws Exception {
        WorkerManagerController workerManagerController = new WorkerManagerController();
        int choice;

        while (true) {
            Menu.Menu();
            choice = Menu.getMenu();
            switch (choice) {
                case 1:
                    if (!workerManagerController.addAllWorker()) {
                        System.out.println("Add Succesfully");
                    } else {
                        System.out.println("Add fail");
                    }
                    break;
                case 2:
                    try {
                        Worker up = workerManagerController.updateWorker(1);
                        System.out.println(up);
                    } catch (Exception ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;
                case 3:
                    try {
                        Worker down = workerManagerController.updateWorker(2);
                        System.out.println(down);
                        System.out.println("Update Worker success!");
                    } catch (Exception ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;

                case 4:
                    workerManagerController.displayHistoryOrListWorker(1);
                    break;
                case 5:
                    workerManagerController.displayHistoryOrListWorker(2);
                    break;
                case 6:
                    System.out.println("Have a nice day!");
                    return;
            }
        }
    }

}

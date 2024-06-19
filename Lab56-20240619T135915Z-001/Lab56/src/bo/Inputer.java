package bo;

import model.Worker;
import utils.Validate;

public class Inputer {

    private Worker w = new Worker();
    private WorkerManager workerManager = new WorkerManager();

    public Worker getWorker() {
        return w;
    }

    public Worker inputInfonation() {
        //   String id = workerManager.getCodeInput("Enter id: ", "Id existed");
//        String id = Validate.checkInputString("Enter id: ");
//        if (workerManager.getCodeInput(id) == false) {
//            w.setId(id);
//        } else {
//            System.out.println("ID exits");
//        }
        w.setId(workerManager.inputStringID("Enter id: "));
        w.setName(Validate.checkInputString("Enter name: "));
        w.setAge(Validate.checkInt("Enter age: ", 18, 50));
        w.setSalary(Validate.checkDouble("Enter salary: "));
        w.setWorkLocation(Validate.checkInputString("Enter work location: "));
        return w;
    }

}

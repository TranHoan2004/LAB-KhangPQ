package bo;

import model.Worker;
import utils.Validation;

public class Inputer {

    private Worker w = new Worker();

    public Worker getWorker() {
        return w;
    }

    public Worker inputInfonation() {
        w.setId(Validation.checkInputString("Enter id: "));
        w.setName(Validation.checkInputString("Enter name: "));
        w.setAge(Validation.checkInt("Enter age: ", 18, 50));
        w.setSalary(Validation.checkDouble("Enter salary: "));
        w.setWorkLocation(Validation.checkInputString("Enter work location: "));
        return w;
    }

}

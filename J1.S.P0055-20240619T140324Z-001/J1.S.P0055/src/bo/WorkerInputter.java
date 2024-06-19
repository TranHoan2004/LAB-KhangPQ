package bo;

import entity.Worker;
import utils.ValidationAndNormalText;

public class WorkerInputter {

    private Worker w;

    public WorkerInputter() {
        w = new Worker();
    }

    public Worker getWorker() {
        return w;
    }

    public Worker inputID() {

        w.setID(ValidationAndNormalText.intputSring("Enter ID: ", "Eror Format"));
        return w;
    }

    public Worker inputInformation() {
        w.setName(ValidationAndNormalText.intputSring("Enter Name: ", "Eror Format"));
        w.setAge(ValidationAndNormalText.inputChoice("Enter Age: ", 18, 50));
        w.setSalary(ValidationAndNormalText.inputDouble("Enter Salary: ", 0.0000001, Double.MAX_VALUE));
        w.setWorkLocation(ValidationAndNormalText.intputSring("Enter Location: ", "Eror Format"));
        return w;
    }
}

package bo;

import DTO.Worker;
import java.util.ArrayList;
import java.util.List;
import ulis.ValidationAndNormalText;

public class WorkerInputer {

    private Worker w;
    private List<Worker> wList = new ArrayList<>();

    public WorkerInputer() {
        w = new Worker();
    }

    public Worker getWorker() {
        return w;
    }

    private void inputCommonInfomation() {
        w.setID(ValidationAndNormalText.inputStringID("Enter ID: ", "ID is Exist", 1, wList));
        w.setName(ValidationAndNormalText.intputSring("Enter Name: ", "input is not allowed to be empty"));
        w.setAge(ValidationAndNormalText.inputInt("Enter Age: ", 18, 50));
        w.setSalary(ValidationAndNormalText.inputDouble("Enter salary: ", "Salary must be greater than 0", 0.000001, Double.MAX_VALUE));
        w.setWorkLocation(ValidationAndNormalText.intputSring("Enter Location", "input is not allowed to be empty"));
    }
}

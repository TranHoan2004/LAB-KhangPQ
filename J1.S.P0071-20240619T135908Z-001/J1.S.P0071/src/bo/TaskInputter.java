package bo;

import entity.Task;
import entity.TypeName;
import utils.Validation;

public class TaskInputter {

    private Task task;

    public TaskInputter() {
        task = new Task();
    }

    public Task getTask() {
        return task;
    }

    public Task informationTask() {

        task.setName(Validation.normalFormName(Validation.getNonEmptyString("Requirement name: ")));
        int taskType = Validation.getInt("1. Code\n"
                + "2. Test\n"
                + "3. Design\n"
                + "4. Review\n"
                + "Enter type: ", "Must be a number", "Must in range [1,4]", 1, 4);

        TypeName t = TypeName.Code;

        switch (taskType) {
            case 2:
                t = TypeName.Test;
                break;
            case 3:
                t = TypeName.Design;
                break;
            case 4:
                t = TypeName.Review;
                break;
            default:
                break;
        }

        task.setGetTypeName(t);
        task.setDate(Validation.getDate("Enter Date: ", "input must be dd-mm-yyyy", "^([0]?[1-9]|[1|2][0-9]|[3][0|1])[-]([0]?[1-9]|[1][0-2])[-]([0-9]{4}|[0-9]{2})$"));
        task.setFrom(Validation.getDoubleWithStepOfValue("Enter From: ", "Must be a double number", "Must in range (8;17)", 8, 17, 0.5));
        task.setTo(Validation.getDoubleWithStepOfValue("Enter To: ", "Must be a double number", "Must in range (" + task.getFrom() + 0.5 + ", 17.5)", task.getFrom() + 0.5, 17.5, 0.5));
        task.setAssignee(Validation.normalFormName(Validation.getNonEmptyString("Enter Assignee: ")));
        task.setReviewer(Validation.normalFormName(Validation.getNonEmptyString("Enter Reviewer: ")));
        return task;
    }

}

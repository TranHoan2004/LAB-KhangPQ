
import java.util.*;

public class StudentManagement {

    List<Student> createStudentList() {
        List<Student> t = new ArrayList<>();
        return t;
    }

    Student getDuplicate(List<Student> t, Student s) {
        for (Student x : t) {
            if (Validation.isSame(x, s) == true) {
                return x;
            }
        }
        return null;
    }

    
    private Student inputStudentData(List<Student> t) {
        String ID, name, courseName;
        int semester;
        Student s;
        do {
            do {
                ID = GetInputData.inputID("Enter student ID: ");
                name = GetInputData.inputName("Enter student name: ");
                if (!Validation.isConsistency(t, ID, name)) {
                    System.out.println("this name is not consistency with code");
                }
            } while (Validation.isConsistency(t, ID, name) == false);
            semester = GetInputData.inputSemester("Enter semester: ");
            courseName = GetInputData.inputCourse("Enter course: ");
            s = new Student(ID, name, semester, courseName);
            if (getDuplicate(t, s) != null) {
                System.out.println("this record has been existed");
            }
        } while (getDuplicate(t, s) != null);
        return s;
    }

    private boolean addStudent(List<Student> t, Student s) {
        return t.add(s);
    }

    public void importData(List<Student> t) {
        Student s;
        for (int i = 0; i < 2; i++) {
            System.out.println("Student " + (i + 1));
            s = inputStudentData(t);
            addStudent(t, s);
            System.out.println();
        }
        String choice;
        while (true) {
            choice = GetInputData.inputYorN("Do you want to continue (Y/N)? ", "Y", "N");
            if (choice.equalsIgnoreCase("Y")) {
                s = inputStudentData(t);
                addStudent(t, s);
            } else {
                break;
            }

        }
    }

    private void Sort(List<Student> s) {
        Student[] arr = s.toArray(new Student[s.size()]);
        Student swap;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getName().compareTo(arr[j + 1].getName()) > 0) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        s.clear();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
    }

    public void FindAndSort(List<Student> t) {
        List<Student> s = new ArrayList<>();
        String name = GetInputData.inputName("Enter student name you want to find: ");

        for (Student x : t) {
            if (x.getName().contains(name)) {
                s.add(x);
            }
        }
        Sort(s);
        if (s.isEmpty()) {
            System.out.println("Not Found!");
        } else {
            for (Student x : s) {
                System.out.println(x);
            }
        }
    }

    public void UpdateORDelete(List<Student> t) {
        String ID;
        do {
            ID = GetInputData.inputID("Enter student ID: ");
            if (!Validation.isExist(t, ID)) {
                System.out.println("this student ID is not existed");
            }
        } while (!Validation.isExist(t, ID));
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getID().equals(ID)) {
                count++;
                System.out.println(count + ". " + t.get(i));
            }
        }
        String choice = GetInputData.inputYorN("Do you want to update (U) or delete (D) student", "U", "D");
        if (choice.equalsIgnoreCase("U")) {
            update(t, ID, count);
        } else {
            delete(t, ID, count);
        }
    }

    void display(List<Student> t, Student beUpdate, Student duplicate) {
        for (Student x : t) {
            if (x.equals(beUpdate)) {
                System.out.println("\u001B[32m" + x.display() + "\u001B[30m");
            } else if (x.equals(duplicate)) {
                System.out.println("\u001B[31m" + x.display() + "\u001B[30m");
            } else {
                System.out.println(x.display());
            }
        }

    }

    private void update(List<Student> t, String ID, int amount) {
        Student beUpdate = null;
        Student substitute, duplicate;
        String code, name, courseName;
        int semester, index = -1, count = 0;
        int choice = GetInputData.inputChoice("Choose one of above record: ", 1, amount);
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getID().equals(ID)) {
                count++;
                if (count == choice) {
                    beUpdate = t.get(i);
                    index = i;
                    break;
                }

            }
        }
        do {
            code = GetInputData.inputID("Enter new student ID: ");
            name = GetInputData.inputName("Enter new student name: ");
            semester = GetInputData.inputSemester("Enter new semester: ");
            courseName = GetInputData.inputCourse("Enter new course name: ");
            substitute = new Student(code, name, semester, courseName);
            System.out.println("The record after update is: ");
            System.out.println(substitute.display());
            if (getDuplicate(t, substitute) != null) {
                duplicate = getDuplicate(t, substitute);
                System.out.println("this record has been existed");
                System.out.println("the current student list is : ");
                display(t, beUpdate, duplicate);
            }
        } while (getDuplicate(t, substitute) != null);
        t.remove(beUpdate);
        t.add(index, substitute);
        System.out.println("Student list after update is: ");
        display(t, substitute, null);
        System.out.println("*Row with green color is updated record");
        System.out.println("*Row with red color is duplicated record");
        System.out.println("Update Successful !");
    }

    private void delete(List<Student> t, String ID, int count) {

        int choice = GetInputData.inputChoice("Choose one of above record: ", 1, count);
        count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getID().equals(ID)) {
                count++;
                if (count == choice) {
                    t.remove(i);
                    break;
                }
            }
        }
        System.out.println("Student list after deleted is : ");
        display(t, null, null);
        System.out.println("Remove Successful !");
    }

    public void Report(List<Student> t) {
        int[] frequency = new int[t.size()];
        int count, i, j;
        for (i = 0; i < t.size(); i++) {
            count = 1;
            for (j = i + 1; j < t.size(); j++) {
                if (Validation.isSameIDAndCourse(t.get(i), t.get(j))) {
                    count++;
                }
            }
            frequency[i] = count;
        }
        for (i = 0; i < t.size(); i++) {
            for (j = 0; j <= i; j++) {
                if (Validation.isSameIDAndCourse(t.get(i), t.get(j))) {
                    break;
                }
            }
            if (j == i) {
                System.out.printf("%-15s | %-5s | %-2d \n", t.get(i).getName(), t.get(i).getCourseName(), frequency[i]);
            }
        }
    }
}

package bo;

import entity.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager {

    //Create list object
    private ArrayList<Student> sList;

    public Manager() {
        sList = new ArrayList<>();
    }

    //get All List
    public ArrayList<Student> getAllList() {
        return sList;
    }

    //Add list
    public boolean addStudent(Student s) throws Exception {
        if (isConsistency(s.getId(), s.getName())) {
            if (!getDuplicate(s)) {
                return sList.add(s);
            }
            throw new Exception("this record has been existed");
        }
        throw new Exception("this name is not consistency with code");
    }

    //check same student
    public boolean isSame(Student s1, Student s2) {

        return s1.getId().equals(s2.getId())
                && s1.getName().equals(s2.getName())
                && s1.getSemester() == s2.getSemester()
                && s1.getCourse().equals(s2.getCourse());
    }

    //check duplicate Student
    public boolean getDuplicate(Student s) throws Exception {
        for (Student x : sList) {
            if (isSame(x, s)) {
                throw new Exception("This student is existed");
            }
        }
        return false;
    }

    //check Consistency
    public boolean isConsistency(String code, String name) {
        for (Student x : sList) {
            if (code.equals(x.getId()) && !name.equals(x.getName())) {
                return false;
            }
        }
        return true;
    }

    //search by ID
    private int searchById(String iD) {
        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i).getId().equalsIgnoreCase(iD)) {
                return i;
            }
        }
        return -1;
    }

    public Student getSearchStudentById(String iD) throws Exception {
        int index = searchById(iD);
        if (index != -1) {
            return sList.get(index);
        }
        throw new Exception("this student ID is not existed");
    }

    //count student and print
    public int countStudent(String iD) throws Exception {
        int count = 0;
        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i).getId().equalsIgnoreCase(iD)) {
                count++;
                System.out.println(count + ". " + sList.get(i));
            }
        }
        return count;
    }

    //check same course
    public boolean isSameIDAndCourse(Student s, Student s1) {
        return s.getId().equals(s1.getId())
                && s.getCourse().equals(s1.getCourse());
    }

    //sort
    private ArrayList<Student> sort() {
        ArrayList<Student> cloneCountry = new ArrayList<>();
        cloneCountry = (ArrayList) sList.clone();
        Comparator<Student> ct = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(cloneCountry, ct);
        return cloneCountry;
    }

    //Search and sort
    public ArrayList<Student> searchByName(String name) {
        ArrayList<Student> ret = new ArrayList<>();
        for (Student student : sList) {
            if (student.getName().toUpperCase().contains(name.toUpperCase())
             || student.getName().toLowerCase().contains(name.toLowerCase())) {
                ret.add(student);
            }
        }
        ret = sort();
        return ret;
    }

    //Delete 
    public void delete(String iD, int count, int choice) {
        count = 0;
        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i).getId().equalsIgnoreCase(iD)) {
                count++;
                if (count == choice) {
                    sList.remove(i);
                    break;
                }
            }
        }
    }

    //update
    public void update(Student s, String iD, int count, int choice) {
        count = 0;
        int index = -1;
        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i).getId().equals(iD)) {
                count++;
                if (count == choice) {
                    index = i;
                    sList.set(index, s);
                    break;
                }
            }
        }
    }

    //report
    public String report() throws Exception {
        ArrayList<Student> cloneReport = sList;
        int[] frequency = new int[sList.size()];
        int count, i, j;
        for (i = 0; i < cloneReport.size(); i++) {
            count = 1;
            for (j = i + 1; j < cloneReport.size(); j++) {
                if (isSameIDAndCourse(cloneReport.get(i), cloneReport.get(j))) {
                    count++;
                }
            }
            frequency[i] = count;
        }
        for (i = 0; i < cloneReport.size(); i++) {
            for (j = 0; j <= i; j++) {
                if (isSameIDAndCourse(cloneReport.get(i), cloneReport.get(j))) {
                    break;
                }
            }
            if (j == i) {
                return String.format("%-15s%-15s%d\n", cloneReport.get(i).getName(), cloneReport.get(i).getCourse(), frequency[i]);
            }
        }
        throw new Exception("No data");
    }

}

package GUI;

import Data.GetInputData;




public class Menu {

    public static void display() {
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        System.out.println("    1.Create");
        System.out.println("    2.Update/Delete a student");
        System.out.println("    3.Add new subject");
        System.out.println("    4.Update/Delete a subject");
        System.out.println("    5.Enter grade");
        System.out.println("    6.Student Grade Report");
        System.out.println("    7.Subject Grade Report");
        System.out.println("    8.Exit");
    }

    public static int getChoice() {
        return GetInputData.inputChoice("Enter one option in above : ", 1, 8);
    }
}

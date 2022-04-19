package main;
/* importing every Class the Test Class is going to Test */

import student.Student;
import student.StudentList;
import warning.Warning;
import teacher.Teacher;
import teacher.TeacherList;
import classPKG.Class;
import register.ClassRegister;

/**
 * The Test-Class, just testing every other Class like it should, not really interesting
 *
 * @author Manuel Fellner
 * @version 19.04.2022
 */
public class Test {
    public static void main(String[] args) {
        /* Creates 4 Teacher Objects */
        Teacher tch1 = new Teacher("Harald Mustermann", "German", 'C', 1337, "hmustermann@school.ac.at");
        Teacher tch2 = new Teacher("Max Mustermann", "Bewegung und Sport", 'E', 1338, "mmustermann@school.ac.at");
        Teacher tch3 = new Teacher("Elisa Musterfrau", "Software Development", 'A', 1339, "emusterfrau@school.ac.at");
        Teacher tch4 = new Teacher("Anna Musterfrau", "Physics", 'D', 1340, "amusterfrau@school.ac.at");

        /* Creates 4 Student Objects */
        Student std1 = new Student("Sebastian Mustermann", 2337, "smustermann@student.school.ac.at", tch1);
        Student std2 = new Student("Helena Musterfrau", 2338, "hmusterfrau@student.school.ac.at", tch2);
        Student std3 = new Student("Zhen Mustermann", 2339, "zmustermann@student.school.ac.at", tch3);
        Student std4 = new Student("Gioia Musterfrau", 2340, "gmusterfrau@student.school.ac.at", tch4);

        /* Creates 4 Warning Objects */
        Warning wr1 = new Warning('F', tch1, "Disturbed the lesson");
        Warning wr2 = new Warning('E', tch2, "Was too loud");
        Warning wr3 = new Warning('D', tch3, "Ate and drank during the lesson");
        Warning wr4 = new Warning('C', tch4, "Asked dumb questions");

        System.out.println("[Test] Method: addMissedHrs ; Class: Student");
        std1.addMissedHrs(2.5);
        std1.addMissedHrs(1.5);
        std2.addMissedHrs(0.3);
        std2.addMissedHrs(0.1);
        std3.addMissedHrs(0.5);
        std4.addMissedHrs(0.1);
        System.out.println("[Results] Method: addMissedHrs ; Class: Student");
        System.out.println("Missed Hours from Student 1 (std1) : 4 ; Result: " + std1.getMissedHrs());
        System.out.println("Missed Hours from Student 2 (std2) : 0.4 ; Result: " + std2.getMissedHrs());
        System.out.println("Missed Hours from Student 3 (std3) : 0.5 ; Result: " + std3.getMissedHrs());
        System.out.println("Missed Hours from Student 4 (std4) : 0.1 ; Result: " + std4.getMissedHrs());

        int[] testAv = {1, 3, 1, 1, 2, 1, 1};
        System.out.println("[Test] Method: addAverageGrade ; Class: Student");
        std1.addAverageGrade(testAv);
        System.out.println("[Results] Method: addAverageGrade ; Class: Student");
        System.out.println("Average Grade from Student 1 (std1( : ~ 1 ; Result: " + std1.getAverageGrade());

        System.out.println("[Test] Method: addWarning ; Class: Student");
        std1.addWarning(wr1);
        std1.addWarning(wr2);
        std1.addWarning(wr3);
        std1.addWarning(wr4);
        System.out.println("[Results] Method: addWarning ; Class: Student (the arrays)");
        String std1wr1 = "";
        String std2wr2 = "";
        String std3wr3 = "";
        String std4wr4 = "";
        Warning[] wrArray = std1.getWarnings();
        for (int i = 0; i < wrArray.length; i++) {
            if (wrArray[i] != null) {
                std1wr1 += wrArray[i].getReason();
            }
        }

        wrArray = std2.getWarnings();
        for (int i = 0; i < wrArray.length; i++) {
            if (wrArray[i] != null) {
                std2wr2 += wrArray[i].getReason();
            }
        }

        wrArray = std3.getWarnings();
        for (int i = 0; i < wrArray.length; i++) {
            if (wrArray[i] != null) {
                std3wr3 += wrArray[i].getReason();
            }
        }

        wrArray = std4.getWarnings();
        for (int i = 0; i < wrArray.length; i++) {
            if (wrArray[i] != null) {
                std4wr4 += wrArray[i].getReason();
            }
        }
        System.out.println(std1wr1);
        System.out.println(std2wr2);
        System.out.println(std3wr3);
        System.out.println(std4wr4);

        TeacherList tchList = new TeacherList(4);
        tchList.addTeacher(tch1);
        tchList.addTeacher(tch2);
        tchList.addTeacher(tch3);
        tchList.addTeacher(tch3);
        tchList.deleteTeacher(1337, "");
        StudentList stdList = new StudentList(4);
        stdList.addStudent(std1);
        stdList.addStudent(std2);
        stdList.addStudent(std3);
        stdList.addStudent(std4);
        stdList.deleteStudent(0);

        /* Creates one "Class" Object */
        Class classTest = new Class("4BHIT", stdList, tchList, 930);
    }
}

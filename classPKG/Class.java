package classPKG;

import student.*;
import teacher.*;

/**
 * This class represents the entire classroom with it's classname, students, teacher and
 * it's room number
 *
 * @author Manuel Fellner
 * @version 19.04.2022
 */
public class Class {
    private String className;           //the name of the Class, for example: 1BHIT, 2BHIT, 3BHIT, 4BHEL, ...
    private StudentList students;       //the students of the class
    private TeacherList teacher;        //the teachers of the class
    private int roomNumber;             //the roomNumber of the class(room)

    /**
     * Custom Constructor, create a whole Class
     *
     * @param className  the name of the class
     * @param students   a list of the students
     * @param teacher    a list of the teachers
     * @param roomNumber the room number of the class(room)
     */
    public Class(String className, StudentList students, TeacherList teacher, int roomNumber) {
        if (!className.equals("") && students != null && teacher != null) {
            this.className = className;
            this.students = students;
            this.teacher = teacher;
            this.roomNumber = roomNumber;
        }
    }

    /**
     * setRoomNumber
     *
     * @param roomNumber the roomNumber
     */
    public void setRoomNumber(int roomNumber) {
        if (roomNumber > 0) {
            this.roomNumber = roomNumber;
        }
    }

    /**
     * addStudent, adds a Student to the class, the method for that use is already there, how nice!
     *
     * @param newStudent the new Student
     * @return true / false (if there's a place for that new Student or not)
     */
    public boolean addStudent(Student newStudent) {
        return this.students.addStudent(newStudent);
    }

    /**
     * delelteStudent, deletes a Student with its ID
     *
     * @param delStudent the student that is going to be deleted.
     * @return true / false
     */
    public boolean deleteStudent(Student delStudent) {
        return this.students.deleteStudent(delStudent.getID(), "");
    }

    /**
     * addTeacher, adds a Teacher to the class, the method for that use is already there too, really nice!
     *
     * @param newTeacher the new Teacher
     * @return true / false (if there's a place for that new Teacher or not)
     */
    public boolean addTeacher(Teacher newTeacher) {
        return this.teacher.addTeacher(newTeacher);
    }

    /**
     * deleteTeacher, deletes a teacher with its ID
     *
     * @param delTeacher the teacher that is going to be deleted.
     * @return true / false
     */
    public boolean deleteTeacher(Teacher delTeacher) {
        return this.teacher.deleteTeacher(delTeacher.getID(), "");
    }

    /**
     * getClassName
     *
     * @return className this.className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * getStudents
     *
     * @return students this.students (a studentList)
     */
    public StudentList getStudents() {
        return this.students;
    }

    /**
     * getTeacher
     *
     * @return teacher this.teacher (a teacherList)
     */
    public TeacherList getTeacher() {
        return this.teacher;
    }

    /**
     * getRoomNumber
     *
     * @return roomNumber this.roomNumber
     */
    public int getRoomNumber() {
        return this.roomNumber;
    }
}

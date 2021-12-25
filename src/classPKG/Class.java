package classPKG;
import student.*;
import teacher.*;

/**
 * A "Class" Class, just the whole Class Ig
 * @author Manuel Fellner
 * @version DEVELOPMENT-1.0
 */
public class Class {
    private String className;           //the name of the Class, for example: 1BHIT, 2BHIT, 3BHIT, 4BHEL, ...
    private StudentList students;       //the students of the class
    private TeacherList teacher;        //the teachers of the class
    private int roomNumber;             //the roomNumber of the class(room)

    /**
     * Default Constructor
     */
    public Class()  {
        this.className = "";
        this.students = null;
        this.teacher = null;
        this.roomNumber = 0;
    }

    /**
     * Custom Constructor, create a whole Class
     * @param className the name of the class
     * @param students a list of the students
     * @param teacher a list of the teachers
     * @param roomNumber the room number of the class(room)
     */
    public Class(String className, StudentList students, TeacherList teacher, int roomNumber)   {
        if (!className.equals("") && students != null && teacher != null && roomNumber > 0) {
            this.className = className;
            this.students = students;
            this.teacher = teacher;
            this.roomNumber = roomNumber;
        }
    }

    /**
     * setClassName
     * @param className the class Name
     */
    public void setClassName(String className)   {
        if (!className.equals(""))  {
            this.className = className;
        }
    }

    /**
     * setStudents
     * @param students a studentList
     */
    public void setStudents(StudentList students)   {
        if (students != null)   {
            this.students = students;
        }
    }

    /**
     * setTeacher
     * @param teacher a teacherList
     */
    public void setTeacher(TeacherList teacher)   {
        if (teacher != null)   {
            this.teacher = teacher;
        }
    }

    /**
     * setRoomNumber
     * @param roomNumber the roomNumber
     */
    public void setRoomNumber(int roomNumber)   {
        if (roomNumber > 0) {
            this.roomNumber = roomNumber;
        }
    }

    /**
     * addStudent, adds a Student to the class, the method for that use is already there, how nice!
     * @param newStudent the new Student
     * @return true / false (if there's a place for that new Student or not)
     */
    public boolean addStudent(Student newStudent)   {
        return this.students.addStudent(newStudent);
    }

    /** addTeacher, adds a Teacher to the class, the method for that use is already there too, really nice!
     * @param newTeacher the new Teacher
     * @return true / false (if there's a place for that new Teacher or not)
     */
    public boolean addTeacher(Teacher newTeacher)   {
        return this.teacher.addTeacher(newTeacher);
    }

    /**
     * getClassName
     * @return className this.className
     */
    public String getClassName()    {
        return this.className;
    }

    /**
     * getStudents
     * @return students this.students (a studentList)
     */
    public StudentList getStudents()    {
        return this.students;
    }

    /**
     * getTeacher
     * @return teacher this.teacher (a teacherList)*/
    public TeacherList getTeacher() {
        return this.teacher;
    }

    /**
     * getRoomNumber
     * @return roomNumber this.roomNumber
     */
    public int getRoomNumber()  {
        return this.roomNumber;
    }
}

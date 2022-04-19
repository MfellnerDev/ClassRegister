package student;

/**
 * A list of Students (Student-objects actually)
 * @author Manuel Fellner
 * @version 19.04.2022
 */
public class StudentList {
    private Student[] studentList;      //the list of the students, just a Student-Array

    /**
     * Custom Constructor, create a Student-Array with [students]-elements
     * @param students the elements of the array
     */
    public StudentList(int students)    {
        if (students > 0) {
            this.studentList = new Student[students];
        }
    }

    /**
     * addStudent, adds a student to the array
     * @param newStudent the new Student
     * @return if there is any storage -> true, if not -> false, the teacher or authorized person
     * has to increase the array-elements
     */
    public boolean addStudent(Student newStudent)  {
        if (newStudent != null) {
            for (int i = 0; i < this.studentList.length; i++)   {
                if (this.studentList[i] == null)    {
                    this.studentList[i] = newStudent;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * the same thing as the method before, you can just place a student on a fix index
     * @param newStudent the new Student
     * @param index the index the Student should be added to
     * @return if the index is free (=null), true, if not -> false
     */
    public boolean addStudent(Student newStudent, int index)   {
        if (newStudent != null && index < this.studentList.length) {
            if (this.studentList[index] == null)    {
                this.studentList[index] = newStudent;
                return true;
            }
        }
        return false;
    }

    /**
     * Imports a Student-Array (a Student List, just cheap)
     * @param studentList the Student Array that is going to be a StudentList
     */
    public void importStudentList(Student[] studentList)  {
        if (studentList != null)    {
            this.studentList = studentList;
        }
    }

    /**
     * returns a Student object of a special index
     * @param index the index of the Student object
     * @return student a Student Object if there is an Object on that Index, if not -> null
     */
    public Student getStudent(int index)    {
        if (index < this.studentList.length)    {
            if (this.studentList[index] != null)    {
                return this.studentList[index];
            }
        }
        return null;
    }

    /**
     * returns the whole Student List
     * @return studentList the whole List (array) like I said
     */
    public Student[] getStudentList() {
        return this.studentList;
    }

    /**
     * deletes a Student from the array
     *
     * @param index the index that should be deleted
     * @return true / false
     */
    public boolean deleteStudent(int index) {
        if (index < this.studentList.length) {
            if (this.studentList[index] != null) {
                this.studentList[index] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * This method is searching a student with his unique id and returns the index. If there currently
     * is no student in the array with this id, it returns -1
     *
     * @param id the unique ID of the student
     * @return if found = Array-Index, if not found = -1
     */
    public int studentSearch(int id) {
        int index;
        for (int i = 0; i < this.studentList.length; i++) {
            if (this.studentList[i] != null) {
                if (this.studentList[i].getID() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * deletes a Student from the unique ID
     *
     * @param id    the unique Student ID as an integer
     * @param dummy a dummy parameter because i do not wish to overload the method
     * @return true / false
     */
    public boolean deleteStudent(int id, String dummy) {
        return deleteStudent(this.studentSearch(id));
    }
}

package student;

/**
 * A Student-Array (object array)
 * @author Manuel Fellner
 * @version DEVELOPMENT-1.0
 */
public class StudentList {
    private Student[] studentList;      //the list of the students, just a Student-Array

    /**
     * Default Constructor, shouldn't be used, as always
     */
    public StudentList()    {
        this.studentList = null;
    }

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
     * @param index the index that should be deleted
     */
    public void deleteStudent(int index)    {
        if (index < this.studentList.length)  {
            if (this.studentList[index] != null)    {
                this.studentList[index] = null;
            }
        }
    }

    /**
     * deletes a Student from the unique ID (the param is a String because yes, but it is secure, don't worry)
     * @param id the unique Student ID
     */
    public void deleteStudent(String id)   {
        int idI = 0;
        try {
            idI = Integer.parseInt(id);
        } catch (NumberFormatException numberEx)   {
            System.err.println("An Exception occurred, nice!" + "\n" + "There you go: " + "\"" + numberEx + "\"");
        }

        for (int i = 0; i < this.studentList.length; i++)   {
            if (this.studentList[i].getID() == idI) {
                this.studentList[i] = null;
            }
        }
    }
}

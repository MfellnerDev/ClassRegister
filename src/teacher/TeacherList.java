package teacher;

/**
 * A Teacher-Array (object array)
 * @author Manuel Fellner
 * @version DEVELOPMENT-1.0
 */
public class TeacherList {
    private Teacher[] teacherList;      //the list of the Teachers, just a Teacher-Array

    /**
     * Default Constructor, shouldn't be used, as always
     */
    public TeacherList()    {
        this.teacherList = null;
    }

    /**
     * Custom Constructor, create a Teacher-Array with [teachers]-elements
     * @param teachers the elements of the array
     */
    public TeacherList(int teachers)    {
        if (teachers > 0) {
            this.teacherList = new Teacher[teachers];
        }
    }

    /**
     * addTeacher, adds a Teacher to the array
     * @param newTeacher the new Teacher
     * @return if there is any storage -> true, if not -> false, the teacher or authorized person
     * has to increase the array-elements
     */
    public boolean addTeacher(Teacher newTeacher)  {
        if (newTeacher != null) {
            for (int i = 0; i < this.teacherList.length; i++)   {
                if (this.teacherList[i] == null)    {
                    this.teacherList[i] = newTeacher;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * the same thing as the method before, you can just place a Teacher on a fixed index
     * @param newTeacher the new Teacher
     * @param index the index the Teacher should be added to
     * @return if the index is free (=null), true, if not -> false
     */
    public boolean addTeacher(Teacher newTeacher, int index)   {
        if (newTeacher != null && index < this.teacherList.length) {
            if (this.teacherList[index] == null)    {
                this.teacherList[index] = newTeacher;
                return true;
            }
        }
        return false;
    }

    /**
     * Imports a Teacher-Array (a Teacher List, just cheap)
     * @param teacherList the Teacher Array that is going to be a TeacherList
     */
    public void importTeacherList(Teacher[] teacherList)  {
        if (teacherList != null)    {
            this.teacherList = teacherList;
        }
    }

    /**
     * returns a Teacher object of a special index
     * @param index the index of the Teacher object
     * @return teacher a Teacher Object if there is an Object on that Index, if not -> null
     */
    public Teacher getTeacher(int index)    {
        if (index < this.teacherList.length)    {
            if (this.teacherList[index] != null)    {
                return this.teacherList[index];
            }
        }
        return null;
    }

    /**
     * returns the whole Teacher List
     * @return teacherList the whole List (array) like I said
     */
    public Teacher[] getTeacherList() {
        return this.teacherList;
    }

    /**
     * deletes a Teacher from the array
     * @param index the index that should be deleted
     */
    public void deleterTeacher(int index)    {
        if (index < this.teacherList.length)  {
            if (this.teacherList[index] != null)    {
                this.teacherList[index] = null;
            }
        }
    }

    /**
     * deletes a Teacher from the unique ID (the param is a String because yes, but it is secure, don't worry)
     * @param id the unique Student ID
     */
    public void deleteTeacher(String id)   {
        int idI = 0;
        try {
            idI = Integer.parseInt(id);
        } catch (NumberFormatException numberEx)   {
            System.err.println("An Exception occurred, nice!" + "\n" + "There you go: " + "\"" + numberEx + "\"");
        }

        for (int i = 0; i < this.teacherList.length; i++)   {
            if (this.teacherList[i].getID() == idI) {
                this.teacherList[i] = null;
            }
        }
    }
}

package teacher;

/**
 * An Array of the teacher (Teacher-Objects).
 *
 * @author Manuel Fellner
 * @version 19.04.2022
 */
public class TeacherList {
    private Teacher[] teacherList;      //the list of the Teachers, just a Teacher-Array

    /**
     * Custom Constructor, create a Teacher-Array with [teachers]-elements
     *
     * @param teachers the elements of the array
     */
    public TeacherList(int teachers) {
        if (teachers > 0) {
            this.teacherList = new Teacher[teachers];
        }
    }

    /**
     * addTeacher, adds a Teacher to the array
     *
     * @param newTeacher the new Teacher
     * @return if there is any storage -> true, if not -> false, the teacher or authorized person
     * has to increase the array-elements
     */
    public boolean addTeacher(Teacher newTeacher) {
        if (newTeacher != null) {
            for (int i = 0; i < this.teacherList.length; i++) {
                if (this.teacherList[i] == null) {
                    this.teacherList[i] = newTeacher;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * the same thing as the method before, you can just place a Teacher on a fixed index
     *
     * @param newTeacher the new Teacher
     * @param index      the index the Teacher should be added to
     * @return if the index is free (=null), true, if not -> false
     */
    public boolean addTeacher(Teacher newTeacher, int index) {
        if (newTeacher != null && index < this.teacherList.length) {
            if (this.teacherList[index] == null) {
                this.teacherList[index] = newTeacher;
                return true;
            }
        }
        return false;
    }

    /**
     * Imports a Teacher-Array (a Teacher List, just cheap)
     *
     * @param teacherList the Teacher Array that is going to be a TeacherList
     */
    public void importTeacherList(Teacher[] teacherList) {
        if (teacherList != null) {
            this.teacherList = teacherList;
        }
    }

    /**
     * returns a Teacher object of a special index
     *
     * @param index the index of the Teacher object
     * @return teacher a Teacher Object if there is an Object on that Index, if not -> null
     */
    public Teacher getTeacher(int index) {
        if (index < this.teacherList.length) {
            if (this.teacherList[index] != null) {
                return this.teacherList[index];
            }
        }
        return null;
    }

    /**
     * returns the whole Teacher List
     *
     * @return teacherList the whole List (array) like I said
     */
    public Teacher[] getTeacherList() {
        return this.teacherList;
    }

    /**
     * deletes a Teacher from the array
     *
     * @param index the index that should be deleted
     * @return true / false
     */
    public boolean deleteTeacher(int index) {
        if (index < this.teacherList.length) {
            if (this.teacherList[index] != null) {
                this.teacherList[index] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * This method is searching a teacher with his unique id and returns the index. If there currently
     * is no student in the array with this id, it returns -1
     *
     * @param id the unique ID of the teacher
     * @return if found = Array-Index, if not found = -1
     */
    public int teacherSearch(int id) {
        int index;
        for (int i = 0; i < this.teacherList.length; i++) {
            if (this.teacherList[i] != null) {
                if (this.teacherList[i].getID() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * deletes a teacher from the unique ID
     *
     * @param id    the unique Student ID as an integer
     * @param dummy a dummy parameter because i do not wish to overload the method
     * @return true / false
     */
    public boolean deleteTeacher(int id, String dummy) {
        return deleteTeacher(this.teacherSearch(id));
    }
}

package student;

import warning.*;
import teacher.*;

/**
 * A student. A normal member of a class. The warnings cannot overcome 10 pieces,
 * if it does, the student get's thrown out of the class.
 *
 * @author Manuel Fellner
 * @version 19.04.2022
 */
public class Student {
    private String name;        //Attribute for the students name
    private int id;             //student ID, just for the unique identification
    private double missedHrs;   //the missed hours the student has, for example: 1.30 hrs -> 1hr and 30 min
    private Warning[] warnings = new Warning[10];   //warning-array a student has, if the student has more than 10 warnings, it is over
    private double averageGrade;    //the average grade of the student, for example: 1.1, 3.2, etc.
    private String email;           //the email of the student, an email Class coming soon maybe
    private Teacher teacher;        //the personal teacher of the Student

    /**
     * A custom Constructor, with every possible attribute that makes sense
     *
     * @param name    the name of the Student
     * @param id      the unique Student ID
     * @param email   the email of the Student
     * @param teacher and the personal teacher
     */
    public Student(String name, int id, String email, Teacher teacher) {
        if (!name.equals("") && id > 0 && !email.equals("") && teacher != null) {
            this.name = name;
            this.id = id;
            this.email = email;
            this.teacher = teacher;
        }
    }

    /**
     * setName, if the param isn't "", the name attribute changes
     *
     * @param name the name of the student
     */
    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        }
    }

    /**
     * setID, if the param isn't = 0; the unique Student ID changes
     *
     * @param id the unique student ID
     */
    public void setID(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    /**
     * addMissedHrs, I don't think there is any doc needed for that
     *
     * @param hrs missed Hrs, for example: 1.0 -> 1 hr, 0.30 --> 30 min
     */
    public void addMissedHrs(double hrs) {
        if (hrs > 0.0) {
            this.missedHrs += hrs;
        }
    }

    /**
     * getName
     *
     * @return name the name attribute
     */
    public String getName() {
        return this.name;
    }

    /**
     * getID
     *
     * @return id the id attribute
     */
    public int getID() {
        return this.id;
    }

    /**
     * getMissedHrs
     *
     * @return missedHrs the missed hours attribute
     */
    public double getMissedHrs() {
        return this.missedHrs;
    }

    /**
     * getWarnings
     *
     * @return warnings the Warning-Array Attribute which contains all warnings of the students
     */
    public Warning[] getWarnings() {
        return this.warnings;
    }

    /**
     * addAverageGrade, takes an int-array and calculates the students average grade
     *
     * @param grades an int-array which contains all the grades the student has
     */
    public void addAverageGrade(int[] grades) {
        int a = 0;
        double average = 0.0;
        if (grades != null) {
            for (int i = 0; i < grades.length; i++) {
                a += grades[i];
            }
            average = (double) (a / grades.length);
        }
        if (average > 0.0) {
            this.averageGrade = average;
        }
    }

    /**
     * getAverageGrade
     *
     * @return averageGrade the averageGrade attribute
     */
    public double getAverageGrade() {
        return this.averageGrade;
    }

    /**
     * addWarning, adds a Warning Object in the Warning-Array (if there is enough storage left),
     *
     * @param newWarning the new Warning
     * @return if there isn't any place for the new Warning in the 10 Elements big Warning-Array, false (the student
     * has a big problem because 10 is the absolute limit). If there is storage left, true
     */
    public boolean addWarning(Warning newWarning) {
        if (newWarning != null) {
            for (int i = 0; i < this.warnings.length; i++) {
                if (this.warnings[i] == null) {
                    this.warnings[i] = newWarning;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * setEmail
     *
     * @param email a email in a String
     */
    public void setEmail(String email) {
        if (!email.equals("")) {
            this.email = email;
        }
    }

    /**
     * getEmail
     *
     * @return email the email attribute
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * setTeacher, if the teacher Object isn't null, the personal teacher is set
     *
     * @param teacher the teacher
     */
    public void setTeacher(Teacher teacher) {
        if (teacher != null) {
            this.teacher = teacher;
        }
    }

    /**
     * getTeacher
     *
     * @return teacher the teacher attribute
     */
    public Teacher getTeacher() {
        return this.teacher;
    }
}

package warning;
import teacher.*;

/**
 * The Warning Class
 * @author Manuel Fellner
 * @version DEVELOPMENT-1.0
 */
public class Warning {
    private char warningGrade;      //the grade of the warning, A - F
    private Teacher teacher;        //the teacher that gave the warning
    private String reason;          //the reason for the warning

    /**
     * The default Constructor
     */
    public Warning()    {
        this.warningGrade = 0;
        this.teacher = null;
        this.reason = "";
    }

    /**
     * Custom Constructor, can create a complete warning
     * @param grade the grade of the warning
     * @param teacher the teacher that gave it
     * @param reason the reason
     */
    public Warning(char grade, Teacher teacher, String reason)  {
        if (grade > 0 && teacher != null && !reason.equals("")) {
            this.warningGrade = grade;
            this.teacher = teacher;
            this.reason = reason;
        }
    }

    /**
     * getWarningGrade
     * @return warningGrade this.warningGrade
     */
    public char getWarningGrade()   {
        return this.warningGrade;
    }

    /**
     * getTeacher
     * @return teacher this.teacher
     */
    public Teacher getTeacher() {
        return this.teacher;
    }

    /**
     * getReason
     * @return reason this.reason
     */
    public String getReason()   {
        return this.reason;
    }
}

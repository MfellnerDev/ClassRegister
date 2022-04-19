package warning;

import teacher.*;

/**
 * The Warning Class. If a student behaviour is bad, then it gets a warning.
 *
 * @author Manuel Fellner
 * @version 19.04.2022
 */
public record Warning(char warningGrade, Teacher teacher, String reason) {

    /**
     * Custom Constructor, can create a complete warning
     *
     * @param warningGrade the grade of the warning
     * @param teacher      the teacher that gave it
     * @param reason       the reason
     */
    public Warning {
        if (teacher == null || reason.equals("")) {
            throw new IllegalArgumentException("Keiner der Werte darf Null oder leer sein!");
        }
    }

    /**
     * getWarningGrade
     *
     * @return warningGrade this.warningGrade
     */
    public char getWarningGrade() {
        return this.warningGrade;
    }

    /**
     * getTeacher
     *
     * @return teacher this.teacher
     */
    public Teacher getTeacher() {
        return this.teacher;
    }

    /**
     * getReason
     *
     * @return reason this.reason
     */
    public String getReason() {
        return this.reason;
    }
}

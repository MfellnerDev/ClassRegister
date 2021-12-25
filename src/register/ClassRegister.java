package register;
import classPKG.Class;

/**
 * The ClassRegister Class, the ClassRegister (an extra folder so there's a place for some logging or
 * something like that). Not a big class, more's coming soon Ig.
 * @author Manuel Fellner
 * @version DEVELOPMENT-1.0
 */
public class ClassRegister {
    private Class classroom;        //a whole classroom

    /**
     * Default Constructor
     */
    public ClassRegister()  {
        classroom = null;
    }

    /**
     * Custom Constructor
     * @param classroom a Class to create a ClassRegister with
     */
    public ClassRegister(Class classroom)   {
        if (classroom != null) {
            this.classroom = classroom;
        }
    }
}

package teacher;

/**
 * The Teacher Class
 * @author Manuel Fellner
 * @version DEVELOPMENT-1.0
 */
public class Teacher {
    private String name;            //name of the Teacher
    private String subject;         //subject of the teacher, for example: English, German, Math, Physics,...
    private char authorization;     //the authorization of the teacher, A = the highest, F = the lowest
    private int id;                 //the unique ID of the teacher (but can be changed cuz reasons Ig)
    private String email;           //the email of the teacher, an email Class coming soon maybe

    /**
     * The Default Constructor
     */
    public Teacher()    {
        this.name = "";
        this.subject = "";
        this.authorization = 'F';
        this.id = 0;
        this.email = "";
    }

    /**
     * The custom constructor, create a full teacher! (heh)
     * @param name the name of the teacher
     * @param subject the subject of the teacher
     * @param authorization the authorization of the teacher
     * @param id the unique id of the teacher
     * @param email the email of the teacher
     */
    public Teacher(String name, String subject, char authorization, int id, String email)   {
        if (!name.equals("") && !subject.equals("") && authorization > 0 && id > 0 && !email.equals(""))  {
            this.name = name;
            this.subject = subject;
            this.authorization = authorization;
            this.id = id;
            this.email = email;
        }
    }

    /**
     * setEmail
     * @param email the email
     */
    public void setEmail(String email)  {
        if (!email.equals(""))  {
            this.email = email;
        }
    }

    /**
     * getEmail
     * @return email this.email
     */
    public String getEmail()    {
        return this.email;
    }

    /**
     * setName
     * @param name the name
     */
    public void setName(String name)   {
        if (!name.equals(""))   {
            this.name = name;
        }
    }

    /**
     * getName
     * @return name this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * setSubject
     * @param subject the subject
     */
    public void setSubject(String subject)   {
        if (!subject.equals(""))    {
            this.subject = subject;
        }
    }

    /**
     * getSubject
     * @return subject this.subject
     */
    public String getSubject()  {
        return this.subject;
    }

    /**
     * setAuth, A - F
     * @param auth the authorization
     */
    public void setAuth(char auth)  {
        if (auth > 0)  {
            this.authorization = auth;
        }
    }

    /**
     * getAuth
     * @return authorization this.authorization
     */
    public char getAuth()   {
        return this.authorization;
    }

    /**
     * setID
     * @param id the unique ID
     */
    public void setID(int id)   {
        if (id > 0) {
            this.id = id;
        }
    }

    /**
     * getID
     * @return id this.id
     */
    public int getID()  {
        return this.id;
    }
}

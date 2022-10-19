package assignment1;

/**
 * @author Megan Ryan
 * a) b.
 * A similar lecturer class should contain some attributes such as (Name, Age, DOB, ID,
 * username, and modules teaching, etc.).
 * A specific method (getUsername()) will generate the lecturer’s username by
 * concatenating their name and age.
 */

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Lecturer {
    private String name;
    private int age;
    private DateTime DOB;
    private int ID;
    private String username;
    private ArrayList<Module> modules;

    public Lecturer(String name, int age, DateTime DOB, int ID, ArrayList<Module> modules) {
        this.DOB = DOB;
        this.modules = modules;
        this.ID = ID;
        this.username = getUsername();
    }

    public String getUsername() {
        this.username = this.name + "-" + this.age;
        return this.username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //blank name changed to "NAME NOT ENTERED"
        this.name = (name.equals("")) ?  "NAME NOT ENTERED" : name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //age must be between 10 and 110, otherwise set to 30
        if ((age > 10) && (age < 110)) {
            this.age = age;
        } else {
            this.age = 30;
        }
    }

    public DateTime getDOB() {
        return DOB;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}

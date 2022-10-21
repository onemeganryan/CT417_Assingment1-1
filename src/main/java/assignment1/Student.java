package assignment1;
/**
 * @author Megan Ryan
 * a) a.
 * A student class should contain some attributes such as (Name, Age, DOB, ID,
 * username, courses and modules registered for, etc.).
 * A specific method (getUsername()) will generate the student’s username by
 * concatenating their name and age.
 */

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private DateTime DOB;
    private int ID;
    private String username;
    private ArrayList<CourseProgramme> courses;
    private ArrayList<Module> modules;

    public Student(String name, int age, DateTime DOB, int ID, ArrayList<CourseProgramme> courses) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.courses = courses;
        this.ID = ID;
        this.username = getUsername();
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public String getUsername() {
        this.username = this.name + "-" + this.age;
        return this.username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //if empty string input for name, "NAME NOT ENTERED" used instead
        this.name = (name.equals("")) ?  "NAME NOT ENTERED" : name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //set age must be between 10 and 110, otherwise set to 30
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

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}

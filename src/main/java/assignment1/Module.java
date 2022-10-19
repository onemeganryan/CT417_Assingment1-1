package assignment1;

/**
 * @author Megan Ryan
 * a) c.
 * A module class, which should contain information such as module name, id (e.g.
 * CT417), list of students, courses it is associated with, and lecturer responsible).
 */


import java.util.ArrayList;

public class Module {
    private String moduleName;
    private String ID;
    private ArrayList<Student> students;
    private ArrayList<CourseProgramme> courses;
    private Lecturer lecturer;

    public Module(String moduleName, String ID, ArrayList<Student> students, ArrayList<CourseProgramme> courses, Lecturer lecturer) {
        this.students = students;
        this.courses = courses;
        this.lecturer = lecturer;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = (moduleName.equals("")) ? "INVALID" : moduleName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = (ID.equals("")) ? "INVALID" : ID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

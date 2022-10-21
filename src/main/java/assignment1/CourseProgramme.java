package assignment1;

/**
 * @author Megan Ryan
 * a) d.
 * A course programme class containing course name (CS & IT or ECE, etc.), list of
 * modules, list of students that are enrolled, academic start date and end date.
 * Start and end dates should use Terasoluna Joda Time classes (i.e. DateTime), which
 * must be added as a project dependency
 */

import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {
    private String courseName;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startTime;
    private DateTime endTime;

    public CourseProgramme(String courseName, DateTime startTime, DateTime endTime) {
        this.courseName = courseName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    // useful for adding all modules in a course
    public void addModules(ArrayList<Module> newModules){
        for (int i=0; i <= newModules.size() - 1; i++){
            modules.add(newModules.get(i));
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // useful to add list of students in same course
    public void addStudents(ArrayList<Student> newStudents){
        for (int i=0; i <= newStudents.size() - 1; i++){
            students.add(newStudents.get(i));
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = (courseName.equals("") ? "INVALID" : courseName);
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public DateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }
}

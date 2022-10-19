package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class ModuleTest {

    @Test
    public void setupModuleTest() {
        //create null arrays to add to student
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        ArrayList<Module> modules = new ArrayList<>();

        //create new student to add to module
        DateTime DOB = new DateTime(2000, 1, 1, 0, 0);
        Student student = new Student("Megan", 22, DOB, 19222222, courses, modules);

        //create array list then add student to it
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);

        //create lecturer to add to module using null modules
        Lecturer lecturer = new Lecturer("Dewey Finn", 35, DOB, 666200, modules);

        //create new module
        Module module = new Module("Software Engineering III", "CT417", students, courses, lecturer);

        //check if all mocule arguments were input correctly
        assertEquals("Software Engineering III", module.getModuleName(),
                "Name is incorrect from module");
        assertEquals("CT417", module.getID(),
                "Course Code is incorrect from module");
        assertEquals(students, module.getStudents(),
                "Students are missing from module");
        assertEquals(courses, module.getCourses(),
                "Courses are missing from module");
        assertEquals(lecturer, module.getLecturer(),
                "Lecturers are missing from module");
    }
}

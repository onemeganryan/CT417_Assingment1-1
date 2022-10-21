package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.DateTime;
import java.util.ArrayList;

public class StudentTest {

    @Test
    public void setupStudentTest() {
        //testing username, name, age, DOB, ID, courses and lecturers attributes for Student

        //create null arrays to add to student
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        ArrayList<Module> modules = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        //start and end dates for course
        DateTime start = new DateTime(2019, 8, 28, 0, 0);
        DateTime end = new DateTime(2023, 8, 25, 0, 0);

        // make courseprogramme and add to courses for student
        CourseProgramme cp = new CourseProgramme(
                "Electronic and Computer Engineering",
                start,
                end);
        courses.add(cp);

        DateTime DOB = new DateTime(2000, 1, 1, 0, 0);
        Student student = new Student("Megan", 22, DOB, 19222222, courses);
        students.add(student);

        Module module = new Module(
                "Software Engineering III",
                "CT417",
                students,
                courses);
        modules.add(module);

        student.addModule(module);

        assertEquals("Megan Ryan22", student.getUsername(),
                "Username is incorrect for student");
        assertEquals("Megan Ryan", student.getName(),
                "Name is incorrect for student");
        assertEquals(22, student.getAge(),
                "Age is incorrect for student");
        assertEquals(DOB, student.getDOB(),
                "Date of Birth");
        assertEquals(19222222, student.getID(),
                "Student ID no. is incorrect");
        assertEquals(courses, student.getCourses(),
                "Courses incorrect for student");
        assertEquals(modules, student.getModules(),
                "Modules incorrect for student");
    }
}

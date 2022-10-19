package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.DateTime;
import java.util.ArrayList;

public class StudentTest {

    @Test
    public void setupStudentTest() {
        //create null arrays to add to student
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        ArrayList<Module> modules = new ArrayList<>();

        DateTime DOB = new DateTime(2000, 1, 1, 0, 0);
        Student student = new Student("Megan", 22, DOB, 19222222, courses, modules);

        assertEquals("Megan Ryan22", student.getUsername(),
                "Username is incorrect for student");
        assertEquals("Megan Ryan", student.getName(),
                "Name is incorrect for student");
        assertEquals(22, student.getAge(),
                "Age is incorrect for student");
        assertEquals(DOB, student.getDOB(), "Date of Birth");
        assertEquals(19222222, student.getID(),
                "Student ID no. is incorrect");
    }
}

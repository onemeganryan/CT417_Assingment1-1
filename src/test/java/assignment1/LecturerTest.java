package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class LecturerTest {

    @Test
    public void setupLecturerTest() {
        //testing username, name, age, DOB, ID and modules attributes for Student

        ArrayList<Module> modules = new ArrayList<>();

        //create new lecturer
        DateTime DOB = new DateTime(1987, 4, 22, 0, 0);
        Lecturer lecturer = new Lecturer("Dewey Finn", 35, DOB, 666200, modules);

        //check if all lecturer arguments were set and gotten correctly
        assertEquals("Dewey Finn35", lecturer.getUsername(),
                "Username is incorrect for lecturer");
        assertEquals("Dewey Finn", lecturer.getName(),
                "Name is incorrect for lecturer");
        assertEquals(35, lecturer.getAge(),
                "Age is incorrect for lecturer");
        assertEquals(DOB, lecturer.getDOB(),
                "Date of Birth is incorrect for lecturer");
        assertEquals(666200, lecturer.getID(),
                "Student ID no. is incorrect for lecturer");
        assertEquals(modules, lecturer.getModules(),
                "Modules incorrect for lecturer");
    }

}

package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.joda.time.DateTime;

public class CourseProgrammeTest {

    @Test
    public void setupCourseTest() {
        //create null arrays to be used later
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        ArrayList<Module> modules = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        DateTime DOB = new DateTime(2000, 1, 1, 0, 0);
        Student student = new Student(
                "Megan",
                22,
                DOB,
                19222222,
                courses,
                modules);
        students.add(student);

        DOB = new DateTime(1987, 4, 22, 0, 0);
        Lecturer lecturer = new Lecturer(
                "Dewey Finn",
                35, DOB,
                666200,
                modules);

        Module module = new Module(
                "Software Engineering III",
                "CT417",
                students,
                courses,
                lecturer);
        modules.add(module);

        //star and end dates for course
        DateTime start = new DateTime(2019, 8, 28, 0, 0);
        DateTime end = new DateTime(2023, 8, 25, 0, 0);

        CourseProgramme cp = new CourseProgramme(
                "Electronic and Computer Engineering",
                modules,
                students,
                start,
                end);

        //check if all arguments are correct
        assertEquals("Electronic and Computer Engineering", cp.getCourseName(),
                "Course name in course programme incorrect");
        assertEquals(modules, cp.getModules(),
                "Modules list in course programme incorrect");
        assertEquals(students, cp.getStudents(),
                "Students list in course programme incorrect");
        assertEquals(start, cp.getStartTime(),
                "Start time in course programme incorrect");
        assertEquals(end, cp.getEndTime(),
                "End time in course programme incorrect");

    }

}

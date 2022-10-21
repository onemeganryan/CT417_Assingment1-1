package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.joda.time.DateTime;

public class CourseProgrammeTest {

    @Test
    public void setupCourseTest() {
        //testing name, modules, students, startTime and endTime attributes for CourseProgramme

        //create null arrays to be used later
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        ArrayList<Module> modules = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        //start and end dates for course
        DateTime start = new DateTime(2019, 8, 28, 0, 0);
        DateTime end = new DateTime(2023, 8, 25, 0, 0);

        //COURSEPROGRAMME HAS AN ADDMODULES AND AN ADDSTUDENTS
        // 1.MAKE COURSE
        CourseProgramme cp = new CourseProgramme(
                "Electronic and Computer Engineering",
                start,
                end);
        courses.add(cp);

        //STUDENTS HAS ADDMODULES METHOD
        // 2.CREATE STUDENTS AND ADD STUDENTS TO COURSE
        DateTime DOB = new DateTime(2000, 1, 1, 0, 0);
        Student student = new Student(
                "Megan",
                22,
                DOB,
                19222222,
                courses);
        students.add(student);

        // 3.ADD NEW STUDENT TO COURSEPROGRAMME
        cp.addStudent(student);

        // 4.CREATE MODULES, ADDING STUDENTS AND COURSES
        Module module = new Module(
                "Software Engineering III",
                "CT417",
                students,
                courses);
        modules.add(module);

        // 5.CREATE LECTURERS, ADDING MODULES
        DOB = new DateTime(1987, 4, 22, 0, 0);
        Lecturer lecturer = new Lecturer(
                "Dewey Finn",
                35, DOB,
                666200,
                modules);

        // 6.ADD LECTURER TO MODULE
        module.addLecturer(lecturer);

        // 7.ADD MODULES TO STUDENTS
        student.addModule(module);
        //also student.setModules(modules);

        // 8.ADD MODULES AND STUDENTS TO COURSEPROGRAMME
        cp.addModule(module);
        cp.addStudent(student);

        //check if all arguments FOR CourseProgramme are correct
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

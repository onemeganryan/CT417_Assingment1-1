package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class ModuleTest {

    @Test
    public void setupModuleTest() {
        //testing name, ID, students, courses and lecturers attributes for Module

        //create null arrays to add to student
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        ArrayList<Module> modules = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Lecturer> lecturers = new ArrayList<>();

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
        lecturers.add(lecturer);

        // 6.ADD LECTURER TO MODULE
        module.addLecturer(lecturer);

        // 7.ADD MODULES TO STUDENTS
        student.addModule(module);
        //also student.setModules(modules);

        // 8.ADD MODULES AND STUDENTS TO COURSEPROGRAMME
        cp.addModule(module);
        cp.addStudent(student);

        //check if all mocule arguments were input correctly
        assertEquals("Software Engineering III", module.getModuleName(),
                "Name is incorrect from module");
        assertEquals("CT417", module.getID(),
                "Course Code is incorrect from module");
        assertEquals(students, module.getStudents(),
                "Students are missing from module");
        assertEquals(courses, module.getCourses(),
                "Courses are missing from module");
        assertEquals(lecturers, module.getLecturers(),
                "Lecturers are missing from module");
    }
}

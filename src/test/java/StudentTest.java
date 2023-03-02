import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testStudentCreation() {
        Student createStudent = new Student(1234, "John Smith");

//        Tests the student ID and the Name
        assertEquals(1234, createStudent.getId());
        assertEquals("John Smith", createStudent.getName());
    }
    @Test
    public void testStudentGrades(){
        Student student = new Student(9119, "Johnny Goode");

//        Ensures there are no grades inputted
        ArrayList<Integer> grades = student.getGrades();
        assertEquals(0, grades.size());

//        Manually pushes two grades
        student.addGrade(90);
        student.addGrade(80);

        grades = student.getGrades();
        int totalGrades = grades.size();
        assertEquals(2, totalGrades);

//        Testing first grade
        int firstGrade = grades.get(0);
        assertEquals(90, firstGrade);

//        Testing second grade
        int secondGrade = grades.get(1);
        assertEquals(80, secondGrade);

//        Testing Float
        double gradeAverage = student.getGradeAverage();
        assertEquals(85.0, gradeAverage, 0);
    }
}

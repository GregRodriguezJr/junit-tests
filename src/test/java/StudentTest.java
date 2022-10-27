import org.junit.Test;

import static org.junit.Assert.*;
public class StudentTest {
    @Test
    public void testCreateStudent(){
        Student greg = new Student( "greg", 1L);
        Student cody = null;
        assertNull(cody);
        assertNotNull(greg);
    }

    @Test
    public void testStudentFields(){
        Student greg = new Student("greg",1L );
        assertSame(1L, greg.getId());
        assertSame("greg", greg.getName());
        assertSame(0, greg.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student greg = new Student("greg", 1L );
        greg.addGrade(85);
        assertSame(85, greg.getGrades().get(0));
        greg.addGrade(60);
        assertSame(60, greg.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student greg = new Student("greg", 1L );
        greg.addGrade(100);
        greg.addGrade(80);
        assertEquals(90, greg.getGradeAverage(), 0);
    }
}

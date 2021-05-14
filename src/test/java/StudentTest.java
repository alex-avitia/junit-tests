import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testForStudent() {
        Student hank = new Student(1L, "hank");

        assertNotNull(hank);
    }

    @Test
    public void testProperties() {
        Student bob = new Student(1L, "bobby");

        assertEquals(1L, bob.getId());
        assertEquals("bobby", bob.getName());
    }

    @Test
    public void testForAddGrades() {
        Student peg = new Student(1L, "peggy");
        peg.addGrade(84);
        peg.addGrade(70);
        peg.addGrade(100);
    }

    @Test
    public void testForGrades() {

    }
}

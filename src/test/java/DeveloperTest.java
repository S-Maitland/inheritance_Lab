import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Scott", "JJ773491D", 30000);
    }

    @Test
    public void canGetName() {
        assertEquals("Scott", developer.getName());
    }

    @Test
    public void canSetName() {
        developer.setName("Scott Maitland");
        assertEquals("Scott Maitland", developer.getName());
    }

    @Test
    public void cannotSetNullName() {
        developer.setName(null);
        assertEquals("Scott", developer.getName());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(300.00);
        assertEquals(30300, developer.getSalary(), 0.01);
    }

    @Test
    public void cannotSubmitNegativeRaiseSalary() {
        developer.raiseSalary(-300.00);
        assertEquals(30000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, developer.getSalary(), 0.01);
    }

    @Test
    public void canSetSalary() {
        developer.setSalary(30000);
        assertEquals(30000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetNINumber() {
        assertEquals("JJ773491D", developer.getNiNumber());
    }

    @Test
    public void canSetNINumber() {
        developer.setNiNumber("JJ462355B");
        assertEquals("JJ462355B", developer.getNiNumber());
    }

    @Test
    public void canGetBonus() {
        assertEquals(300, developer.payBonus(), 0.01);
    }

}
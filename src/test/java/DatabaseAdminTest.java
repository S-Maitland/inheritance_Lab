import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Sven", "SS994783R", 40000);
    }

    @Test
    public void canGetName() {
        assertEquals("Sven", databaseAdmin.getName());
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Sven Torvsky");
        assertEquals("Sven Torvsky", databaseAdmin.getName());
    }

    @Test
    public void cannotSetBlankName() {
        databaseAdmin.setName("");
        assertEquals("Sven", databaseAdmin.getName());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(400.00);
        assertEquals(40400, databaseAdmin.getSalary());
    }

    @Test
    public void cannotSubmitNegativeRaiseSalary() {
        databaseAdmin.raiseSalary(-300.00);
        assertEquals(40000, databaseAdmin.getSalary());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, databaseAdmin.getSalary());
    }

    @Test
    public void canSetSalary() {
        databaseAdmin.setSalary(40000);
        assertEquals(40000, databaseAdmin.getSalary());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("SS994783R", databaseAdmin.getNiNumber());
    }

    @Test
    public void canSetNINumber() {
        databaseAdmin.setNiNumber("SS955483A");
        assertEquals("SS955483A", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetBonus() {
        assertEquals(400, databaseAdmin.payBonus(), 0.01);
    }

}
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("John Doe", "JJ998603B", 25000, "Front-End");
    }

    @Test
    public void canGetName(){
        assertEquals("John Doe", manager.getName());
    }

    @Test
    public void canSetName(){
        manager.setName("Jayne Doe");
        assertEquals("Jayne Doe", manager.getName());
    }

    @Test
    public void cannotSetNullName() {
        manager.setName(null);
        assertEquals("John Doe", manager.getName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(200.00);
        assertEquals(25200, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotSubmitNegativeRaiseSalary() {
        manager.raiseSalary(-300.00);
        assertEquals(25000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, manager.getSalary(), 0.01);
    }

    @Test
    public void canSetSalary(){
        manager.setSalary(30000);
        assertEquals(30000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JJ998603B", manager.getNiNumber());
    }

    @Test
    public void canSetNINumber(){
        manager.setNiNumber("DD469933A");
        assertEquals("DD469933A", manager.getNiNumber());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Front-End", manager.getDeptName());
    }

    @Test
    public void canSetDeptName(){
        manager.setDeptName("Back-End");
        assertEquals("Back-End", manager.getDeptName());
    }

    @Test
    public void canGetBonus(){
        assertEquals(250, manager.payBonus(), 0.01);
    }
}

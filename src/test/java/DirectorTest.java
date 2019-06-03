import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Seth Rogen", "AA123344B", 75000, "Booking Operations", 175000);
    }

    @Test
    public void canGetName(){
        assertEquals("Seth Rogen", director.getName());
    }

    @Test
    public void canSetName(){
        director.setName("James McAvoy");
        assertEquals("James McAvoy", director.getName());
    }

    @Test
    public void canGetSalary(){
        director.raiseSalary(750.00);
        assertEquals(75750, director.getSalary());
    }

    @Test
    public void canSetSalary(){
        director.setSalary(75000);
        assertEquals(75000, director.getSalary());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("AA123344B", director.getNiNumber());
    }

    @Test
    public void canSetNINumber(){
        director.setNiNumber("DD774533B");
        assertEquals("DD774533B", director.getNiNumber());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Booking Operations", director.getDeptName());
    }

    @Test
    public void canSetDeptName(){
        director.setDeptName("Production Env");
        assertEquals("Production Env", director.getDeptName());
    }

    @Test
    public void canGetBonus(){
        assertEquals(750, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(175000, director.getBudget(),0.01);
    }

    @Test
    public void canSetBudget(){
        director.setBudget(200000);
        assertEquals(200000, director.getBudget(),0.01);
    }
}

import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class TestManager {

    public Manager manager;

    @Before
    public void setup(){
        manager = new Manager("Donnie", "R24786ML", 18000.00, "product");
    }

    @Test
    public void hasName(){
        assertEquals("Donnie", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("R24786ML", manager.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(18000.00, manager.getSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("product", manager.getDeptName());
    }

    @Test
    public void canGetRaise(){
        manager.raiseSalary(5000.00);
        assertEquals(23000.00, manager.getSalary(), 0);
    }

    @Test
    public void canReceiveBonus(){
        assertEquals(180, manager.payBonus(), 0);
    }

    @Test
    public void canSetName(){
        manager.setName("Eloise");
        assertEquals("Eloise", manager.getName());
    }

    @Test
    public void willNotSetNameIfNewNameIsNull(){
        manager.setName("");
        assertEquals("Donnie", manager.getName());
    }
}

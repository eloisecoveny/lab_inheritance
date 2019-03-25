import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    public Developer developer;

    @Before
    public void setup(){
        developer = new Developer("Bobby", "NI97657364", 18000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bobby", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("NI97657364", developer.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(18000.00, developer.getSalary(), 0);
    }

    @Test
    public void canGetRaise(){
        developer.raiseSalary(5000.00);
        assertEquals(23000.00, developer.getSalary(), 0);
    }

    @Test
    public void canReceiveBonus(){
        assertEquals(180, developer.payBonus(), 0);
    }

    @Test
    public void canSetName(){
        developer.setName("Eloise");
        assertEquals("Eloise", developer.getName());
    }

    @Test
    public void willNotSetNameIfNewNameIsNull(){
        developer.setName("");
        assertEquals("Bobby", developer.getName());
    }
}

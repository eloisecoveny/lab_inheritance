import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class TestDirector {

    public Director director;

    @Before
    public void setup(){
        director = new Director("Donnie", "R24786ML", 50000.00, "public relations", 150000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Donnie", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("R24786ML", director.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.00, director.getSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("public relations", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(150000.00, director.getBudget(), 0);
    }

    @Test
    public void canGetRaise(){
        director.raiseSalary(5000.00);
        assertEquals(55000.00, director.getSalary(), 0);
    }

    @Test
    public void canSetName(){
        director.setName("Eloise");
        assertEquals("Eloise", director.getName());
    }

    @Test
    public void willNotSetNameIfNewNameIsNull(){
        director.setName("");
        assertEquals("Donnie", director.getName());
    }

    @Test
    public void canGetBonus(){
        assertEquals(1000.00, director.payBonus(), 0);
    }
}

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {

    public DatabaseAdmin databaseAdmin;

    @Before
    public void setup(){
        databaseAdmin = new DatabaseAdmin("Bobby", "NI97657364", 18000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bobby", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("NI97657364", databaseAdmin.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(18000.00, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canGetRaise(){
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(23000.00, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canReceiveBonus(){
        assertEquals(180, databaseAdmin.payBonus(), 0);
    }

    @Test
    public void canSetName(){
        databaseAdmin.setName("Eloise");
        assertEquals("Eloise", databaseAdmin.getName());
    }

    @Test
    public void willNotSetNameIfNewNameIsNull(){
        databaseAdmin.setName("");
        assertEquals("Bobby", databaseAdmin.getName());
    }
}

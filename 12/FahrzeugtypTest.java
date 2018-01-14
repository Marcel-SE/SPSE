import static org.junit.Assert.*;

import org.junit.Test;

public class FahrzeugtypTest {

	@Test
	public void test1() {
		Fahrzeugtyp f1 = Fahrzeugtyp.getInstance("PKW");
	    Fahrzeugtyp f2 = Fahrzeugtyp.getInstance("PKW");
	    assertSame(f1, f2);
	}
	@Test
	public void test2() {
	    Fahrzeugtyp f1 = Fahrzeugtyp.getInstance("PKW");
	    Fahrzeugtyp f2 = Fahrzeugtyp.getInstance("SUV");
	    assertNotSame(f1, f2);
	}
	@Test
	public void test3() {
	    Fahrzeugtyp f1 = Fahrzeugtyp.getInstance("PKW");
	    Fahrzeugtyp f2 = Fahrzeugtyp.getInstance("PKW");
	    Fahrzeugtyp.setGebuehr("PKW", 3);
	    assertTrue(Fahrzeugtyp.getGebuehr("PKW") == Fahrzeugtyp.getGebuehr("PKW"));
	}
	@Test
	public void test4() {
	    Fahrzeugtyp f1 = Fahrzeugtyp.getInstance("PKW");
	    Fahrzeugtyp f2 = Fahrzeugtyp.getInstance("SUV");
	    Fahrzeugtyp.setGebuehr("PKW", 3);
	    assertFalse(Fahrzeugtyp.getGebuehr("PKW") == Fahrzeugtyp.getGebuehr("SUV"));
	}

}
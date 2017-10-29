import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KundeIFTest {

	Kunde k;
	@Before
	public void setUp() throws Exception {
		k = new Kunde();
	}

	@Test
	public void test() {
		assertSame(k.freieParkplaetze(),20);
	}

}

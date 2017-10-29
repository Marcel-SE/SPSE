import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ManagerIFTest {

	Manager m;
	@Before
	public void setUp() throws Exception {
		m = new Manager();
	}

	@Test
	public void preisAnpassung_IntInput5_ReturnsInt5() {
		assertSame(m.preisAnpassen(5),5);
	}

}

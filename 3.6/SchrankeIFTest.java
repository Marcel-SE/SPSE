import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SchrankeIFTest {

	Schranke s;
	@Before
	public void setUp() throws Exception {
		s = new Schranke();
	}

	@Test
	public void bezahlen_IntInput3_ReturnsTrue() {
		assertTrue(s.bezahlen(3));
	}

	@Test
	public void oeffnen_NullInput_ReturnsTrue() {
		assertTrue(s.oeffnen());
	}

	@Test
	public void schlieﬂen_NullInput_ReturnsFalse() {
		assertFalse(s.schlieﬂen());
	}

}

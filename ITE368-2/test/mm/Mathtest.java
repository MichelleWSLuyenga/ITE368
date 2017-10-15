package mm;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class Mathtest {
	
	multi math;
	
	@Before
	public void setUp() throws Exception {
		math = new multi(10, 2);
		
	}

	@Test
	public void test() {
		assertEquals(20, math.mm());
		assertNotNull(math.mm());
		assertTrue(math.mm()>0);
		assertEquals(5, math.mm1());
		assertEquals(12, math.mm2());
		assertEquals(8, math.mm3());
		assertEquals("Junit is working fine", math.mm4());
	}

}

package first;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class FirstJUnitTest {

	FirstJUnit fj;
	
	@Before
	public void setUp() throws Exception {
			fj = new FirstJUnit();
	}
	
	@Test
	public void test() {
		assertEquals(22, 7+(3*5));
	}

}


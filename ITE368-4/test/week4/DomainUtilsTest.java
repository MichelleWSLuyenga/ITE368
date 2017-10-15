package week4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DomainUtilsTest {

	DomainUtils domain = new DomainUtils();
	
	private String input;
	private boolean x;
	
	public DomainUtilsTest(String input, boolean x) {
		this.input = input;
		this.x = x;
	}
	
	@Parameters
	public static Collection<Object[]> testConditions() {
		Object x[][] = {
				{"google.com", true},
				{"stamford.edu", true},
				{"stackoverflow.com", true}
		};
		return Arrays.asList(x);
	}
	
	@Test
	public void test() {
		assertEquals(x, DomainUtils.isValid(input));
	}

}

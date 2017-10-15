package week3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParametrizedTest {

	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	private boolean x;
	
	public StringHelperParametrizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	public StringHelperParametrizedTest(String input, boolean x) {
		super();
		this.input = input;
		this.x = x;
	}
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String ExpectedInputAndOutput[][] = {
				{"AACD", "CD"},
				{"ACD", "CD"},
				{"CDEF", "CDEF"},
				{"CDEF", "CDEF"},
				{"CDAA", "CDAA"}
				
		};
		
		return Arrays.asList(ExpectedInputAndOutput);
	}
	
	@Parameters
	public static Collection<Object[]> testConditions1() {
		Object x[][] ={
				{"AACD", true},
				{"ACD", false},
				{"CDEF", true},
				{"CDEF", false},
				{"CDAA", true}
		};
		return Arrays.asList(x);
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		//AACD => CD; ACD => CD; CDEF => CDEF; CDAA => CDAA
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame() {
		assertEquals(x ,helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
	
}



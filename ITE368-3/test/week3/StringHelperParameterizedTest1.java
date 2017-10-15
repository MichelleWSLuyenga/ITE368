package week3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest1 {

	StringHelper helper = new StringHelper();
	
	private String input;
	private boolean x;
	
	public void StringHelperParametrizedTest(String input, boolean x) 
	{
		this.input = input;
		this.x = x;
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
	public void areFirstAndLastTwoCharactersTheSame() {
		assertEquals(x ,helper.areFirstAndLastTwoCharactersTheSame(input));
	}

}



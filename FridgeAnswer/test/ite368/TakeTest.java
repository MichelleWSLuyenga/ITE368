package ite368;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TakeTest {
	
	Fridge fridge;
	private String input;
	private boolean output;
	
	public TakeTest(String input, boolean output) {
		this.input = input;
		this.output = output;
	}
	
	@Before
	public void setUp() throws Exception {
		fridge = new Fridge();
		fridge.put("Water");
	}

	@Parameters
	public static List<Object[]> testCollections() {
		
		Object ExpectedInputandOutput[][] = {
				{"Water", true},
				{"Pepsi", false},
				{"Sprite", false}
		};
		return Arrays.asList(ExpectedInputandOutput);
		
	}

	@Test
	public void testTakeWhatIsThere() {
		
		boolean isthere = true;
		
		try	
		{
			fridge.take(input);
		} catch(NoSuchItemException e) {
			isthere = false;
		}
		
		assertEquals(output, isthere);
		
	}
}



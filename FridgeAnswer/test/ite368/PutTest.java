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
public class PutTest {
	
	Fridge fridge;
	private String input;
	private boolean output;
	
	public PutTest(String input, boolean output) {
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
	public void testWhetherPutReallyAddStuffs() {
		assertEquals(output, fridge.contains(input));
	}
	
	@Test
	public void testCannotPutTwice() {
		//if i add one more water, it should be false
		//if i add one more pepsi, it sould be true
		//if i add more more sprit, it should be false
		assertEquals(!output, fridge.put(input));
	}

}

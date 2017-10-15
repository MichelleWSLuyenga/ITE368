package ite368;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PutTakeTest {

	@Test
	public void testPutTake() throws NoSuchItemException {
		Fridge fridge = new Fridge();
		List<String> food = new ArrayList<String>();
		food.add("Water");
		food.add("Pepsi");
		food.add("Sprite");
		
		//Make sure what you put is there, and whenever you take, is gone
		for (String item : food) {
			fridge.put(item);
			assertEquals(true, fridge.contains(item));
			fridge.take(item);
			assertEquals(false, fridge.contains(item));
		}

		//Make sure now that you take again, should not be allowed
		for (String item : food) {
			try {
				fridge.take(item);
				fail("there was no " + item + " in the fridge");
			} catch (NoSuchItemException e) {
				System.out.println(e.getMessage());
				assertEquals(true, e.getMessage().contains(item));
			}
		}
	}
}

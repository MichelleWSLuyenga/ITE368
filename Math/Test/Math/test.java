package Math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Test;

public class test {
	@Test
	   public void answersArithmeticMeanOfTwoNumbers() {
	      ScoreCollection collection = new ScoreCollection();
	      collection.add(() -> 5);
	      collection.add(() -> 7);
	      
	      int actualResult = collection.arithmeticMean();

	      assertThat(actualResult, equalTo(6));
	   }
}

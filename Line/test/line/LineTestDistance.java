package line;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LineTestDistance {

	
	private double distance;
	private Line d;
	
	
	public LineTestDistance(double distance, Line d)
	{
		this.distance = distance;
		this.d = d;
	}
	
	@Parameters
	public static Collection<Object[]> testConditions() {
		
		Line one = new Line(1,1,2,2);
		Line two = new Line(1,1,3,3);
		Line three = new Line(1,1,3,2);
		
		Object d[][] = {
				{2.0, one},
				{8.0, two},
				{3.0, three}
		};
		return Arrays.asList(d);
	}
	
	
	@Test
	public void test() {
		assertEquals(distance, d.getDistance(), 10);
	}

}



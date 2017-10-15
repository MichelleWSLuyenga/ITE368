package line;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class LineTestSlope {

	//Line line = new Line(slope, slope, slope, slope);
	
	private double slope;
	private Line a;
	
	public LineTestSlope(double slope, Line a)
	{
		this.slope = slope;
		this.a = a;
	}
	
	@Parameters
	public static Collection<Object[]> testConditions() {
		
		Line one = new Line(1,1,2,2);
		Line two = new Line(1,1,3,3);
		Line three = new Line(1,1,3,2);
		
		Object a[][] = {
		{1.0, one},
		{1.0, two},
		{0.5, three}
		};
		return Arrays.asList(a);
	}
	
	
	@Test
	public void getSlope() {
		//assertEquals(expected, value);
		assertEquals(slope, a.getSlope(), 1);
	}
	
	
}

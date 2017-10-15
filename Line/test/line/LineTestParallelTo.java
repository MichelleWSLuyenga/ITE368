package line;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LineTestParallelTo {

	
	private Line a;
	private Line p;
	private Boolean x;
	
	public LineTestParallelTo(Line a, Line p, boolean x)
	{
		this.a = a;
		this.p = p;	
		this.x = x;
	}
	
	@Parameters
	public static Collection<Object[]> testConditions() {
		
		Line one = new Line(1,1,2,2);
		Line two = new Line(1,1,3,3);
		Line three = new Line(1,1,3,2);
		
		Object x[][] = {
				{one, two, true},
				{two, three, false},
				{three, one, false}
		};
		return Arrays.asList(x);
	}
	
	@Test
	public void parallelTo() {
		assertEquals(a.parallelTo(p), x);
	}

}


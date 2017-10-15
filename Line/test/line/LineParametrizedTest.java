package line;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LineParametrizedTest {
	
	Line line;
	
	@Parameters
	public static Collection<Double[]> testConditions() {
		Line l1 = new Line(0.5, 3.0, 2.5, 7.0);
		Line l2 = new Line(0.5, 3.0, 2.5, 7.0);
		Line l3 = new Line(0.5, 3.0, 2.5, 7.0);
		
		Double ExpectedInputAndOutput[][] = {
				{2.0, },
		};
		return Arrays.asList(ExpectedInputAndOutput);
	}
	
	@Before
	public void setUp() throws Exception {
		line = new Line(0.5, 3.0, 2.5, 7.0);
		System.out.println("Before test");
	}
	
	
	
}

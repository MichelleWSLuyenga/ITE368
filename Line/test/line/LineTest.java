package line;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import line.Line;

public class LineTest {

	Line line;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void setUp() throws Exception {
		line = new Line(0, 0, 0, 0); //so it is new for every test
		System.out.println("Before test");
	}
	
	@Test
	public void getDistance() {
		//assertEquals();
	}
	
	@Test
	public void getSlope() {
		
	}
	
	@Test
	public void parallelTo() {
		//Create tests for the getSlope, getDistance and parallelTo methods.
		
	}
	
	@After
	public void teardown() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}

package week4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateUtilityTest {

	DateUtility date = new DateUtility();
	
	private static int input;
	private int m;
	private int d;
	private int y;

	public DateUtilityTest(int input, int m, int d, int y) {
	    this.input = input;
	    this.m = m;
	    this.d = d;
	    this.y = y;
	}

	@Parameters
	public static Collection testConditions(){
		
	    return Arrays.asList(new Object [][] {
	    	{74 ,3, 15, 2010},
	    	{1, 1, 1, 1999},
	    	{366, 12, 31, 2004},	
	    });
	}

	@Test
	public void test() {
	    assertEquals(input , DateUtility.ordinalDate(m, d, y));
	}

}




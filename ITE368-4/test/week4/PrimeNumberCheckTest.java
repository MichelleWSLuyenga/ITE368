package week4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeNumberCheckTest {

	PrimeNumberChecker prime = new PrimeNumberChecker();
	
	private int put;
	private boolean x;
	
	public PrimeNumberCheckTest(int put, boolean x) 
	{
		this.put = put;
		this.x = x;
	}
	
	@Parameters
	public static Collection<Object[]> testConditions() {
		Object x[][] = {
				{2, true},
				{6, false},
				{19, true},
				{22, false},
				{23, true}
		};
		return Arrays.asList(x);
	}
	
	@Test
	public void test() {
		assertEquals(x , prime.validate(put));
	}

}

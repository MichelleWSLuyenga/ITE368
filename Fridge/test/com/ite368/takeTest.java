package com.ite368;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class takeTest {

Fridge freeze = new Fridge();
	
	private String take;
	private boolean x;
	
	public void putTest(String take, boolean x)
	{
		this.take = take;
		this.x = x;
	}
	
	@Parameters
	public static Collection<Object[]> testConditions() {
		Object x[][] ={
				{"Nugget", true},
				{"Icy kofi", true}
		};
		return Arrays.asList(x);
	}
	
	
	@Test
	public void test() {
		assertEquals(x, freeze.put(take));
	}

}

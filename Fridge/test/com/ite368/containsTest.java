package com.ite368;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class containsTest {

Fridge freeze = new Fridge();
	
	private String con;
	private boolean x;
	
	public void putTest(String con, boolean x)
	{
		this.con = con;
		this.x = x;
	}
	
	@Parameters
	public static Collection<Object[]> testConditions() {
		Object x[][] ={
				{"Wotah", true},
				{"Nugget", true},
				{"Icy kofi", true},
				{"Peezaa", true}
		};
		return Arrays.asList(x);
	}
	
	@Test
	public void test() {
		assertEquals(x, freeze.put(con));
	}

}

package com.ite368;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NoSuchItemExceptionTest {

	NoSuchItemException NoSuch;
	
	@Before
	public void setUp() throws Exception {
		NoSuch = new NoSuchItemException(null);
	}
	
	@Test
	public void test() {
		
	}

}

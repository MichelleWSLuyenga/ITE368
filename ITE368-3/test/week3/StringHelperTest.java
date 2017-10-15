package week3;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import week3.StringHelper;

public class StringHelperTest {
	
	StringHelper helper;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		//setup database connection...
		//usually we use @before, unless you concerned about performance
	}
	
	@Before
	public void setUp() throws Exception {
		helper = new StringHelper(); //so it is new for every test
		System.out.println("Before test");
	}
	
	@Test
	public void test() {
		//AACD => CD; ACD => CD; CDEF; CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		System.out.println("Test1");
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {	
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
		System.out.println("Test2");
	}

	@Test
	public void areFirstAndLastTwoCharactersTheSame() {
		assertFalse("ABCD", helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertTrue("ABAB", helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		assertTrue("AB", helper.areFirstAndLastTwoCharactersTheSame("AB"));
		assertFalse("A", helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@After
	public void teardown() {
		//clear database connection to save bandwidth
		//shut down services
		//clear variables if needed
		System.out.println("After Test");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
		//shutdown database connection at last step
		//usually we use @after, unless you concerned about performance
	}
	
}

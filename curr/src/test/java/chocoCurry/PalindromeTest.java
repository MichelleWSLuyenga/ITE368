package chocoCurry;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		 Palindrome palindromeTester = new Palindrome();
		 assertTrue(palindromeTester.isPalindrome(""));
	}
	
	@Test
	public void whenPalindrom_thenAccept() {
		Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome("noon"));
	}
	     
	@Test
	public void whenNearPalindrom_thanReject(){
		Palindrome palindromeTester = new Palindrome();
	    assertFalse(palindromeTester.isPalindrome("neon"));
	}

}

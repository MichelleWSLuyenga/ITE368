package hard;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class LoginHandlerTest {
	//Create a test file, testing LoginHandler.java.
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void test() {
		Account blah = mock(Account.class);
		AccountRepository breath = mock(AccountRepository.class);
		
		final String accountId = "1234567";
		final String password = "hahaha";
		
		when(blah.find()).thenReturn(accountId);
		when(breath.find(password)).thenReturn(blah);
		
		LoginHandler hand = new LoginHandler(breath);
		
		try {
			hand.login(accountId, password);
		}catch(Exception e) {
			
		}
		
		//verify(blah).setLoggedIn(true);
		verify(breath).find(accountId);
	}

}



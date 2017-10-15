package authenticator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class AuthenticatorApplicationTest {

	@Before
	public void setUp() throws Exception {
		
	}
	
	private AuthenticatorInterface AI = mock(AuthenticatorInterface.class);
	
	@Test
	public void test() {
		final String U = "VorpalSword";
		final String P = "AkashiSeijuro"; 
		
		 //assertTrue(AI.authenticateUser(U, P));
		 
		 when(AI.authenticateUser(U, P));
		
		 AuthenticatorApplication auapp = new  AuthenticatorApplication(AI);
		 
		 try {
			 auapp.authenticate(U, P);
		 }catch(Exception e) {
			 
		 }
		 
		 verify(AI).authenticateUser(U, P);
	}

}


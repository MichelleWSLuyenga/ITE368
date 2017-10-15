package michelle;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;


public class SecurityServiceTest {

	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void test() {
		//1st step
		UserDAO ud = mock(UserDAO.class);
		User u = mock(User.class);
		SecurityService security = mock(SecurityService.class);
		
		final String PASS = "noooob";
		final String PASS_md5 = "experience";
		
		
		//3rd step - setting up some default
		when(u.getPassword()).thenReturn(PASS);
		when(security.md5(PASS)).thenReturn(PASS_md5);
		
		
		//2nd step - verify the behaviors because no output
		UserServiceImpl service = new UserServiceImpl(ud, security);
		
		try {
			service.assignPassword(u);
		}catch(Exception e) {
			
		}
		
		
		verify(u).setPassword(PASS_md5);
		verify(ud).updateUser(u);
	}

}




package hard;

public class LoginHandler {
	private final AccountRepository accountRepository;
	 
	   public LoginHandler(AccountRepository accountRepository) {
	      this.accountRepository = accountRepository;
	   }
	 
	   public void login(String accountId, String password) {
	      Account account = accountRepository.find(accountId);
	      account.setLoggedIn(true);
	   }
}

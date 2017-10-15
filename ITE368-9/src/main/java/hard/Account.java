package hard;

public interface Account {
	void setLoggedIn(boolean value);
	   boolean passwordMatches(String candidate);
	Object find();
}

package webapp.login;

public class LoginService {

	public boolean isValid(String user, String password) {
		// Test usernames we would find from database
		String dummyUserName = "manav";
		String dummyPassword = "manav";

		if (user.equals(dummyUserName) && password.equals(dummyPassword)) {
			return true;
		}
		return false;
	}
}

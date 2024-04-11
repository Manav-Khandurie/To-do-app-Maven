package webapp.login;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void testIsValid() {
        LoginService loginService = new LoginService();
        assertTrue(loginService.isValid("manav", "manav"));
        assertFalse(loginService.isValid("incorrectUser", "incorrectPassword"));
    }
}

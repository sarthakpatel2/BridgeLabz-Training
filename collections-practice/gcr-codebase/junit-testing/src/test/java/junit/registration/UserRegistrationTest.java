package junit.registration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class UserRegistrationTest{
    UserRegistration userReg = new UserRegistration();
    @Test
    void testValidUserRegistration() {
        boolean result = userReg.registerUser("Sarthak", "Sanjh@example.com", "password");
        assertEquals(true, result);
    }
    @Test
    void testEmptyUsername() {
        boolean result = userReg.registerUser("", "Sanjh@example.com", "password");
        assertEquals(false, result);
    }
    @Test
    void testInvalidEmail() {
        boolean result = userReg.registerUser("Sarthak", "Sanjhexample.com", "password");
        assertEquals(false, result);
    }
    @Test
    void testShortPassword() {
        boolean result = userReg.registerUser("Sarthak", "Sanjh@example.com", "123");
        assertEquals(false, result);
    }
}

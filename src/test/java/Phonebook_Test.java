/**
 * writing unit tests for each method of classes
 * If you have no idea about how to write unit tests, you can search the internet or check your first assignment
 * After each unit test you've written, please commit the changes and push to your repo

 * Hint: Your test coverage should be 100%
 * Attention:  We would check your commits and it will affect your score
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
public class Phonebook_Test {

        private Person person;

        @BeforeEach
        void setUp() {
            // Reset the identifier manually for the purpose of these unit tests.
            // In production, the Person class should be refactored to allow resetting or reconfiguring the identifier for unit testing.
            Person.identifier = 1;
            // Now let's create a Person object for testing
            person = new Person("John Doe", "09123456789");
        }

        @Test
        void personConstructorTest_ValidPhone_AssignsPhone() {
            assertEquals("John Doe", person.getName());
            assertEquals("09123456789", person.getPhone());
            assertFalse(person.isHidden());
        }

        @Test
        void getNameTest() {
            assertEquals("John Doe", person.getName());
        }

        
    }



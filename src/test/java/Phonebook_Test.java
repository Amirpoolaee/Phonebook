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

        @Test
        void getPhoneTest() {
            assertEquals("09123456789", person.getPhone());
        }

        @Test
        void getIdTest() {
            // Since we reset the identifier to 1 in setUp and then created a Person object, the id of the first person should be 1.
            assertEquals(1, person.getId());
        }

        @Test
        void isHiddenTest_InitiallyFalse() {
            assertFalse(person.isHidden());
        }

        @Test
        void setNameTest() {
            person.setName("Jane Doe");
            assertEquals("Jane Doe", person.getName());
        }

        @Test
        void setPhoneTest_ValidPhone_AssignsPhone() {
            person.setPhone("09234567890");
            assertEquals("09234567890", person.getPhone());
        }

        @Test
        void setPhoneTest_InvalidPhone_NoChange() {
            person.setPhone("0123"); // Invalid phone format
            assertEquals("09123456789", person.getPhone()); // Ensure number is unchanged
        }

    @Test
    void setHiddenTest() {
        person.setHidden();
        assertTrue(person.isHidden());
    }

  
    }



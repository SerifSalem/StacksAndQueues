package Lecture._3_TDDExample;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/* NameCheckerTest - This test class demonstrates the difference between:
 * - NameChecker1 (case-sensitive)
 * - NameChecker2 (case-insensitive, corrected version)
 */

class NameCheckerTest {

    // Test for NameChecker1 - This should fail
    @Test
    void testNameChecker1() {
        NameChecker1 checker1 = new NameChecker1();
        // This will FAIL because "Ali" != "ali"
        assertTrue(checker1.nameExists("Ali"));
    }

    // Test for NameChecker2 - This should pass
    @Test
    void testNameChecker2() {
        NameChecker2 checker2 = new NameChecker2();
        // This will PASS
        assertTrue(checker2.nameExists("Ali"));
    }
}

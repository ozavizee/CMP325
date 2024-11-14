package Ass;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class palindromecheckertest {
    @Test
    public void stringToPalindrome() {
        palindromechecker maths = new palindromechecker();

        assertTrue(maths.isPalindrome("madam"));
        assertTrue(maths.isPalindrome("racecar"));
        assertFalse(maths.isPalindrome("abc"));
        assertFalse(maths.isPalindrome("hello"));
    }
}
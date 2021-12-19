import org.junit.Test;

import static org.junit.Assert.*;

public class TestOffByOne {
    static CharacterComparator offByOne = new OffByOne();
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testOffByOne() {
        assertTrue(offByOne.equalChars('x', 'y'));
        assertTrue(palindrome.isPalindrome("acb", offByOne));
        assertTrue(palindrome.isPalindrome("a", offByOne));
        assertFalse(palindrome.isPalindrome("aaa", offByOne));
    }
}

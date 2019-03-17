package DevOps.demo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	String input1 = "racecar";
	String input2 = "WILP";
	String input3 = null;
	App app = new App();

	
	@Test
	public void isPlaindromeTest() {
		assertEquals(true, app.isPalindrome(input1));
	}

	@Test
	public void isNotPlaindromeTest() {
		assertEquals(false, app.isPalindrome(input2));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isNullPlaindromeTest() {
		assertEquals(false, app.isPalindrome(input3));
	}

}
package DevOps.demo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
String input1 = "noon";
App app = new App();
boolean expected = true;

@Test
public void isPlaindromeTest(){
	assertEquals(expected, app.isPalindrome(input1));
}
}
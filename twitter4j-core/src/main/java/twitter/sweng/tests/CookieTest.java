/**
 * 
 */
package twitter.sweng.tests;

import twitter4j.internal.org.json.Cookie;
import junit.framework.TestCase;

/**
 * @author Kevin
 *
 */
public class CookieTest extends TestCase {

	/**
	 * @param name
	 */
	public CookieTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link twitter4j.internal.org.json.Cookie#unescape(java.lang.String)}.
	 */
	public void testUnescapeEmptyString() {
		String empty = new String();
		assertEquals(empty, Cookie.unescape(empty));
	}
	
	public void testUnescapePlusSign() {
		String space = "Test+String";
		
		assertEquals("Test String", Cookie.unescape(space));
	}
	
	public void testUnescape() {
		String test = "This is a hex string%20%21%22";
		
		String tested = Cookie.unescape(test);
		assertEquals("This is a hex string !\"", tested);
	}
	
	public void testUnescapeNull() {
		Cookie.unescape(null);
	}

}

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
		String test = "%20%21%22%23%24%25%26%27%28%29%2A%2b%2C%2D%2E%2F";
		
		String tested = Cookie.unescape(test);
		assertEquals(" !\"#$%&'()*+,-./", tested);
	}
	

}

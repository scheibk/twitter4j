/**
 * 
 */
package twitter.sweng.tests.integration;

import twitter4j.auth.Authorization;
import twitter4j.internal.http.HttpRequest;

/**
 * @author Kevin
 *
 */
public class AuthorizationStub implements Authorization {

	/* (non-Javadoc)
	 * @see twitter4j.auth.Authorization#getAuthorizationHeader(twitter4j.internal.http.HttpRequest)
	 */
	@Override
	public String getAuthorizationHeader(HttpRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see twitter4j.auth.Authorization#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}

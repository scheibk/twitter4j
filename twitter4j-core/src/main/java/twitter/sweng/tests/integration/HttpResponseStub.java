/**
 * 
 */
package twitter.sweng.tests.integration;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import twitter4j.conf.ConfigurationContext;
import twitter4j.internal.http.HttpResponse;

/**
 * @author Kevin
 *
 */
public class HttpResponseStub extends HttpResponse {
	
	public HttpResponseStub(String content) {
		super(ConfigurationContext.getInstance());
		responseAsString = content;
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.http.HttpResponse#getResponseHeader(java.lang.String)
	 */
	@Override
	public String getResponseHeader(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.http.HttpResponse#getResponseHeaderFields()
	 */
	@Override
	public Map<String, List<String>> getResponseHeaderFields() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.http.HttpResponse#disconnect()
	 */
	@Override
	public void disconnect() throws IOException {
		// TODO Auto-generated method stub

	}

}

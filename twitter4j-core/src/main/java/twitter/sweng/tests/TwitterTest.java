package twitter.sweng.tests;

import java.io.File;
import java.util.Random;

import junit.framework.TestCase;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterTest extends TestCase {
	
	private String SWENG581oAuthAccessToken;
	private String SWENG581oAuthAccessTokenSecret;
	private String oAuthConsumerKey;
	private String oAuthConsumerSecret;

	private Twitter twitter;
	public TwitterTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		SWENG581oAuthAccessToken = "925557278-t0mqe9nhaLCTQokUWjmDfM1Mlu2BvT1DRngBjNNM";
		SWENG581oAuthAccessTokenSecret = "tUirc4nuDju50gcP31Sm697hyq2zTgTlPnp8lnfU";
		oAuthConsumerKey = "B2WBtFKoXRDyd1UAtXnSA";
		oAuthConsumerSecret = "mpHfiRX0xHG3ZSOlqGNUeq6yQdyJj8p1nq8eSaZtNOo";
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setOAuthAccessToken(SWENG581oAuthAccessToken);
		cb.setOAuthAccessTokenSecret(SWENG581oAuthAccessTokenSecret);
		cb.setOAuthConsumerKey(oAuthConsumerKey);
		cb.setOAuthConsumerSecret(oAuthConsumerSecret);
		twitter = new TwitterFactory(cb.build()).getInstance();
	}

	/* Tests for updating status. */
	public void testUpdateStatus141Chars() {
		String tweet = generateRandom(141);
		StatusUpdate status = new StatusUpdate(tweet);
		Status update = null;
		try {
			update = twitter.updateStatus(status);
		} catch (TwitterException e) {
			assertNull(update);
			return;
		}
		fail("Successfully Sent tweet > 140 characters");
	}
	
	public void testUpdateStatus140Chars() {
		String tweet = generateRandom(140);
		StatusUpdate status = new StatusUpdate(tweet);
		Status update = null;
		try {
			update = twitter.updateStatus(status);
		} catch (TwitterException e) {
			fail(e.getMessage());
		}
		assertNotNull(update);
	}
	
	public void testUpdateStatus139Chars() {
		String tweet = generateRandom(139);
		StatusUpdate status = new StatusUpdate(tweet);
		Status update = null;
		try {
			update = twitter.updateStatus(status);
		} catch (TwitterException e) {
			fail(e.getMessage());
		}
		assertNotNull(update);
	}
	
	public void testUpdateStatusEmpty() {
		String tweet = new String();
		StatusUpdate status = new StatusUpdate(tweet);
		Status update = null;
		try {
			update = twitter.updateStatus(status);
		} catch (TwitterException e) {
			assertNull(update);
			return;
		}
		fail("somehow an empty update was posted.");
	}
	
	public void testUpdateWithMedia() {
		StatusUpdate status = new StatusUpdate("Tweet with media");
		status.media(new File("src/test/resources/t4j.png"));
		
		Status update = null;
		try {
			update = twitter.updateStatus(status);
		} catch (TwitterException e) {
			fail(e.getMessage());
		}
		assertNotNull(update);
	}
	
	/*
	public void testUpdateStatusNull() {
		String tweet = null;
		Status update = null;
		try {
			update = twitter.updateStatus(tweet);
		} catch (TwitterException e) {
			fail(e.getMessage());
		}
			
		assertNotNull(update);
	}*/
	
	private String generateRandom(int length) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()\\\"';:,./?|=+-_`~";
		String ret = new String();
		
		Random r = new Random();
		for(int i = 0; i < length; i++) {
			int random = r.nextInt();
			if(random < 0) random = -random;
			int c = random % characters.length();
			ret += characters.charAt(c);
		}
		return ret;
	}
	
	/* Tests for HTTP methods */
	public void testGetBaseURL() {
		String base = "http://api.twitter.com/1/";
		String url = twitter.getConfiguration().getRestBaseURL();
		assertEquals(base, url);
	}
	
	public void testDirectMessage() {
		try {
			assertNotNull(twitter.sendDirectMessage("sweng5814", generateRandom(140)));
		} catch (TwitterException e) {
			fail(e.getMessage());
		}
		
		try {
			assertNotNull(twitter.sendDirectMessage(925681892, generateRandom(140)));
		} catch (TwitterException e) {
			fail(e.getMessage());
		}
	}

}

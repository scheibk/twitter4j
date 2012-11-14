package twitter.sweng.tests;

import java.util.Random;

import junit.framework.TestCase;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterTest extends TestCase {

	private Twitter twitter;
	public TwitterTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setOAuthAccessToken("925557278-t0mqe9nhaLCTQokUWjmDfM1Mlu2BvT1DRngBjNNM");
		cb.setOAuthAccessTokenSecret("tUirc4nuDju50gcP31Sm697hyq2zTgTlPnp8lnfU");
		cb.setOAuthConsumerKey("B2WBtFKoXRDyd1UAtXnSA");
		cb.setOAuthConsumerSecret("mpHfiRX0xHG3ZSOlqGNUeq6yQdyJj8p1nq8eSaZtNOo");
		twitter = new TwitterFactory(cb.build()).getInstance();
	}

	public void testUpdateStatus141Chars() {
		String tweet = generateRandom(141);
		StatusUpdate status = new StatusUpdate(tweet);
		try {
			twitter.updateStatus(status);
		} catch (TwitterException e) {
			assertTrue(true);
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
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
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

}

package twitter.sweng.tests.integration;

import twitter4j.TwitterException;
import twitter4j.internal.json.z_T4JInternalFactory;
import twitter4j.internal.json.z_T4JInternalJSONImplFactory;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;
import junit.framework.TestCase;

public class z_T4JInternalFactoryTest extends TestCase {
	
	private z_T4JInternalFactory fact;

	public z_T4JInternalFactoryTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		ConfigurationStub config = new ConfigurationStub();
		fact = new z_T4JInternalJSONImplFactory(config);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCreateStatusJSONObject() {
		//JSON from https://dev.twitter.com/docs/api/1/get/statuses/show/%3Aid
		String json = "{'coordinates': null,'created_at': 'Sat Sep 10 22:23:38 +0000 2011','truncated': false,'favorited': false," +
				"'id_str': '112652479837110273','entities': {'urls': [{'expanded_url': 'http://instagr.am/p/MuW67/'," +
				"'url': 'http://t.co/6J2EgYM','indices': [67,86],'display_url': 'instagr.am/p/MuW67/'}]," +
				"'hashtags': [{'text': 'tcdisrupt','indices': [32,42]      }],'user_mentions': [{'name': 'Twitter','id_str': '783214','id': 783214,'indices': [0,8],'screen_name': 'twitter'}," +
				"{'name': 'Picture.ly','id_str': '334715534','id': 334715534,'indices': [15,28],'screen_name': 'SeePicturely'}," +
				"{'name': 'Bosco So','id_str': '14792670','id': 14792670,'indices': [46,58],'screen_name': 'boscomonkey'}," +
				"{'name': 'Taylor Singletary','id_str': '819797','id': 819797,'indices': [59,66],'screen_name': 'episod'}]  }," +
				"'in_reply_to_user_id_str': '783214','text': '@twitter meets @seepicturely at #tcdisrupt cc.@boscomonkey @episod http://t.co/6J2EgYM'," +
				"'contributors': null,'id': 112652479837110273,'retweet_count': 0,'in_reply_to_status_id_str': null,'geo': null," +
				"'retweeted': false,'possibly_sensitive': false,'in_reply_to_user_id': 783214,'place': null," +
				"'source': '<a href=\"http://instagr.am\" rel=\"nofollow\">Instagram</a>'," +
				"'user': {'profile_sidebar_border_color': 'eeeeee','profile_background_tile': true,'profile_sidebar_fill_color': 'efefef'," +
				"'name': 'Eoin McMillan ','profile_image_url': 'http://a1.twimg.com/profile_images/1380912173/Screen_shot_2011-06-03_at_7.35.36_PM_normal.png'," +
				"'created_at': 'Mon May 16 20:07:59 +0000 2011','location': 'Twitter','profile_link_color': '009999','follow_request_sent': null," +
				"'is_translator': false,'id_str': '299862462','favourites_count': 0,'default_profile': false,'url': 'http://www.eoin.me'," +
				"'contributors_enabled': false,'id': 299862462,'utc_offset': null,'profile_image_url_https': 'https://si0.twimg.com/profile_images/1380912173/Screen_shot_2011-06-03_at_7.35.36_PM_normal.png'," +
				"'profile_use_background_image': true,'listed_count': 0,'followers_count': 9,'lang': 'en','profile_text_color': '333333'," +
				"'protected': false,'profile_background_image_url_https': 'https://si0.twimg.com/images/themes/theme14/bg.gif','description': 'Eoin\\'s photography account. See @mceoin for tweets.'," +
				"'geo_enabled': false,'verified': false,'profile_background_color': '131516','time_zone': null,'notifications': null," +
				"'statuses_count': 255,'friends_count': 0,'default_profile_image': false,'profile_background_image_url': 'http://a1.twimg.com/images/themes/theme14/bg.gif'," +
				"'screen_name': 'imeoin','following': null,'show_all_inline_media': false  },'in_reply_to_screen_name': 'twitter','in_reply_to_status_id': null}";
		try {
			assertNotNull(fact.createStatus(new JSONObject(json)));
		} catch (TwitterException e) {
			fail("TwitterException thrown");
		} catch (JSONException e) {
			fail("JSONException thrown");
		}
	}

	public void testCreateUserJSONObject() {
		//JSON from https://dev.twitter.com/docs/api/1/get/users/show
		String json = "{'profile_sidebar_fill_color':'e0ff92','name':'Twitter API','profile_sidebar_border_color':'87bc44','profile_background_tile': false," +
				"'created_at':'Wed May 23 06:01:13 +0000 2007','profile_image_url':'http://a3.twimg.com/profile_images/689684365/api_normal.png','location':'San Francisco, CA'," +
				"'follow_request_sent': false,'id_str':'6253282','profile_link_color':'0000ff','is_translator': false,'contributors_enabled': true," +
				"'url':'http://dev.twitter.com','favourites_count': 15,'utc_offset': -28800,'id': 6253282,'profile_use_background_image': true,'listed_count': 6868," +
				"'profile_text_color':'000000','protected': false,'followers_count': 335343,'lang':'en','notifications': false,'geo_enabled': true,'profile_background_color':'c1dfee'," +
				"'verified': true,'description':'The Real Twitter API. I tweet about API changes, service issues and happily answer questions about Twitter and our API. Don\\'t get an answer? It\\'s on my website.'," +
				"'time_zone':'Pacific Time (US & Canada)','profile_background_image_url':'http://a3.twimg.com/profile_background_images/59931895/twitterapi-background-new.png'," +
				"'friends_count': 20,'statuses_count': 2404,'status':{'coordinates': null,'created_at':'Wed Dec 22 20:08:02 +0000 2010','favorited': false,'truncated': false,'id_str':'17672734540570624'," +
				"'entities':{'urls': [{'expanded_url':'http://tumblr.com/xnr140f9mi','url':'http://t.co/37zl2jI','indices': [93,112],'display_url':'tumblr.com/xnr140f9mi'}],'hashtags': [],'user_mentions': []}," +
				"'in_reply_to_user_id_str': null,'contributors': null,'text':'Twitter downtime - Twitter is currently down. We are aware of the problem and working on it. http://t.co/37zl2jI','id': 17672734540570624," +
				"'retweet_count': 30,'in_reply_to_status_id_str': null,'geo': null,'retweeted': false,'in_reply_to_user_id': null,'source':'<a href=\\'http://www.tumblr.com/\\' rel=\\'nofollow\\'>Tumblr</a>'," +
				"'in_reply_to_screen_name': null,'place': null,'in_reply_to_status_id': null},'following': true,'screen_name':'twitterapi','show_all_inline_media': false}";
		try {
			assertNotNull(fact.createUser(new JSONObject(json)));
		} catch (TwitterException e) {
			fail(e.getMessage());
		} catch (JSONException e) {
			fail(e.getMessage());
		}
	}

	public void testCreateAUserListJSONObject() {
		fail("Not yet implemented");
	}

	public void testCreateDirectMessageJSONObject() {
		fail("Not yet implemented");
	}

	public void testCreateRateLimitStatus() {
		fail("Not yet implemented");
	}

	public void testCreateStatusHttpResponse() {
		fail("Not yet implemented");
	}

	public void testCreateStatusList() {
		fail("Not yet implemented");
	}

	public void testCreateTrends() {
		fail("Not yet implemented");
	}

	public void testCreateTrendsList() {
		fail("Not yet implemented");
	}

	public void testCreateUserHttpResponse() {
		fail("Not yet implemented");
	}

	public void testCreateUserList() {
		fail("Not yet implemented");
	}

	public void testCreateUserListFromJSONArray() {
		fail("Not yet implemented");
	}

	public void testCreateUserListFromJSONArray_Users() {
		fail("Not yet implemented");
	}

	public void testCreateQueryResult() {
		fail("Not yet implemented");
	}

	public void testCreateIDs() {
		fail("Not yet implemented");
	}

	public void testCreatePagableUserList() {
		fail("Not yet implemented");
	}

	public void testCreateAUserListHttpResponse() {
		fail("Not yet implemented");
	}

	public void testCreatePagableUserListList() {
		fail("Not yet implemented");
	}

	public void testCreateUserListList() {
		fail("Not yet implemented");
	}

	public void testCreateCategoryList() {
		fail("Not yet implemented");
	}

	public void testCreateProfileImage() {
		fail("Not yet implemented");
	}

	public void testCreateDirectMessageHttpResponse() {
		fail("Not yet implemented");
	}

	public void testCreateDirectMessageList() {
		fail("Not yet implemented");
	}

	public void testCreateRelationship() {
		fail("Not yet implemented");
	}

	public void testCreateFriendshipList() {
		fail("Not yet implemented");
	}

	public void testCreateAccountTotals() {
		fail("Not yet implemented");
	}

	public void testCreateAccountSettings() {
		fail("Not yet implemented");
	}

	public void testCreateSavedSearch() {
		fail("Not yet implemented");
	}

	public void testCreateSavedSearchList() {
		fail("Not yet implemented");
	}

	public void testCreateLocationList() {
		fail("Not yet implemented");
	}

	public void testCreatePlace() {
		fail("Not yet implemented");
	}

	public void testCreatePlaceList() {
		fail("Not yet implemented");
	}

	public void testCreateSimilarPlaces() {
		fail("Not yet implemented");
	}

	public void testCreateRelatedResults() {
		fail("Not yet implemented");
	}

	public void testCreateTwitterAPIConfiguration() {
		fail("Not yet implemented");
	}

	public void testCreateLanguageList() {
		fail("Not yet implemented");
	}

	public void testCreateEmptyResponseList() {
		fail("Not yet implemented");
	}

}

package twitter.sweng.tests.integration;

import junit.framework.TestCase;
import twitter4j.TwitterException;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.json.z_T4JInternalFactory;
import twitter4j.internal.json.z_T4JInternalJSONImplFactory;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

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
		String json ="{'created_at':'Wed Sep 23 01:18:01 +0000 2009','slug':'team','name':'Team','full_name':'@twitter/team','description':'','mode':'public','following': false," +
				"'user': {'geo_enabled': true,'profile_background_image_url_https':'https://si0.twimg.com/images/themes/theme18/bg.gif','profile_background_color':'ACDED6','protected': false,'listed_count': 66019," +
				"'profile_background_tile': false,'created_at':'Tue Feb 20 14:35:54 +0000 2007','friends_count': 695,'name':'Twitter','profile_sidebar_fill_color':'F6F6F6','notifications': false,'utc_offset': -28800," +
				"'profile_image_url_https':'https://si0.twimg.com/profile_images/1124040897/at-twitter_normal.png','description':'Always wondering what\\'s happening.','display_url': null,'following': false,'verified': true," +
				"'favourites_count': 16,'profile_sidebar_border_color':'EEEEEE','followers_count': 6619092,'profile_image_url':'http://a0.twimg.com/profile_images/1124040897/at-twitter_normal.png','default_profile_image': false," +
				"'contributors_enabled': true,'deactivated_bit': false,'statuses_count': 1218,'profile_use_background_image': true,'location':'San Francisco, CA','id_str':'783214','default_profile': false,'show_all_inline_media': true," +
				"'profile_text_color':'333333','screen_name':'twitter','follow_request_sent': false,'profile_background_image_url':'http://a1.twimg.com/images/themes/theme18/bg.gif','url':'http://blog.twitter.com/','expanded_url': null," +
				"'is_translator': false,'time_zone':'Pacific Time (US & Canada)','profile_link_color':'038543','id': 783214,'entities': {'urls': [],'user_mentions': [],'hashtags': []},'suspended': false,'lang':'en'},'member_count': 643," +
				"'id_str':'574','subscriber_count': 76779,'id': 574,'uri':'/twitter/team'}";
		try {
			assertNotNull(fact.createAUserList(new JSONObject(json)));
		} catch (TwitterException e) {
			fail(e.getMessage());
		} catch (JSONException e) {
			fail(e.getMessage());
		}
	}

	public void testCreateDirectMessageJSONObject() {
		String json = "{'created_at':'Mon Aug 27 17:21:03 +0000 2012','entities': {'hashtags': [],'urls': [],'user_mentions': []},'id': 240136858829479936,'id_str':'240136858829479936','recipient': {'contributors_enabled': false," +
				"'created_at':'Thu Aug 23 19:45:07 +0000 2012','default_profile': false,'default_profile_image': false,'description':'Keep calm and test','favourites_count': 0,'follow_request_sent': false,'followers_count': 0," +
				"'following': false,'friends_count': 10,'geo_enabled': true,'id': 776627022,'id_str':'776627022','is_translator': false,'lang':'en','listed_count': 0,'location':'San Francisco, CA','name':'Mick Jagger'," +
				"'notifications': false,'profile_background_color':'000000','profile_background_image_url':'http://a0.twimg.com/profile_background_images/644522235/cdjlccey99gy36j3em67.jpeg'," +
				"'profile_background_image_url_https':'https://si0.twimg.com/profile_background_images/644522235/cdjlccey99gy36j3em67.jpeg','profile_background_tile': true," +
				"'profile_image_url':'http://a0.twimg.com/profile_images/2550226257/y0ef5abcx5yrba8du0sk_normal.jpeg','profile_image_url_https':'https://si0.twimg.com/profile_images/2550226257/y0ef5abcx5yrba8du0sk_normal.jpeg'," +
				"'profile_link_color':'000000','profile_sidebar_border_color':'000000','profile_sidebar_fill_color':'000000','profile_text_color':'000000','profile_use_background_image': false,'protected': false," +
				"'screen_name':'s0c1alm3dia','show_all_inline_media': false,'statuses_count': 0,'time_zone':'Pacific Time (US & Canada)','url':'http://cnn.com','utc_offset': -28800,'verified': false},'recipient_id': 776627022," +
				"'recipient_screen_name':'s0c1alm3dia','sender': {'contributors_enabled': true,'created_at':'Sat May 09 17:58:22 +0000 2009','default_profile': false,'default_profile_image': false," +
				"'description':'I taught your phone that thing you like.  The Mobile Partner Engineer @Twitter.','favourites_count': 584,'follow_request_sent': false,'followers_count': 10621,'following': false," +
				"'friends_count': 1181,'geo_enabled': true,'id': 38895958,'id_str':'38895958','is_translator': false,'lang':'en','listed_count': 190,'location':'San Francisco','name':'Sean Cook','notifications': false," +
				"'profile_background_color':'1A1B1F','profile_background_image_url':'http://a0.twimg.com/profile_background_images/495742332/purty_wood.png'," +
				"'profile_background_image_url_https':'https://si0.twimg.com/profile_background_images/495742332/purty_wood.png','profile_background_tile': true," +
				"'profile_image_url':'http://a0.twimg.com/profile_images/1751506047/dead_sexy_normal.JPG'," +
				"'profile_image_url_https':'https://si0.twimg.com/profile_images/1751506047/dead_sexy_normal.JPG','profile_link_color':'2FC2EF','profile_sidebar_border_color':'181A1E','profile_sidebar_fill_color':'252429'," +
				"'profile_text_color':'666666','profile_use_background_image': true,'protected': false,'screen_name':'theSeanCook','show_all_inline_media': true,'statuses_count': 2608,'time_zone':'Pacific Time (US & Canada)'," +
				"'url': null,'utc_offset': -28800,'verified': false},'sender_id': 38895958,'sender_screen_name':'theSeanCook','text':'booyakasha'}";
		
		try {
			assertNotNull(fact.createDirectMessage(new JSONObject(json)));
		} catch (TwitterException e) {
			fail(e.getMessage());
		} catch (JSONException e) {
			fail(e.getMessage());
		}
	}

	public void testCreateRateLimitStatus() {
		fail("Not yet implemented");
	}

	public void testCreateStatusHttpResponse() {
		fail("Not yet implemented");
	}

	public void testCreateStatusList() {
		String json = "[{'coordinates': null,'favorited': false,'created_at':'Fri Jul 16 16:58:46 +0000 2010','truncated': false,'entities':{'urls':[{'expanded_url': null,'url':'http://www.flickr.com/photos/cindyli/4799054041/'," +
				"'indices':[75,123]}],'hashtags':[],'user_mentions':[{'name':'Stephanie','id': 15473839,'indices':[27,39],'screen_name':'craftybeans'}]}," +
				"'text':'got a lovely surprise from @craftybeans. She sent me the best tshirt ever. http://www.flickr.com/photos/cindyli/4799054041/ ::giggles::','annotations': null,'contributors': null,'id': 18700887835," +
				"'geo': null,'in_reply_to_user_id': null,'place': null,'in_reply_to_screen_name': null,'user':{'name':'cindy li','profile_sidebar_border_color':'AD0066','profile_background_tile': false," +
				"'profile_sidebar_fill_color':'AD0066','created_at':'Wed Nov 29 06:08:08 +0000 2006','profile_image_url':'http://a1.twimg.com/profile_images/553508996/43082001_N00_normal.jpg','location':'San Francisco,CA'," +
				"'profile_link_color':'FF8500','follow_request_sent': false,'url':'http://www.cindyli.com','favourites_count': 465,'contributors_enabled': false,'utc_offset': -28800,'id': 29733,'profile_use_background_image': true," +
				"'profile_text_color':'000000','protected': false,'followers_count': 3395,'lang':'en','notifications': true,'time_zone':'Pacific Time (US & Canada)','verified': false,'profile_background_color':'cfe8f6'," +
				"'geo_enabled': true,'description':'Just me,Cindy Li.Giving cute substance since 1997.\\r\\nMarried to @themattharris.\\r\\nProduct designer for Yahoo!','friends_count': 542,'statuses_count': 4847," +
				"'profile_background_image_url':'http://a3.twimg.com/profile_background_images/3368753/twitter_flowerbig.gif','following': true,'screen_name':'cindyli'},'source':'web','in_reply_to_status_id': null}," +
				"{'coordinates': null,'favorited': false,'created_at':'Fri Jul 16 16:55:52 +0000 2010','truncated': false,'entities':{'urls':[{'expanded_url': null,'url':'http://bit.ly/libraryman','indices':[78,102]}],'hashtags':[]," +
				"'user_mentions':[{'name':'Cal Henderson','id': 6104,'indices':[108,115],'screen_name':'iamcal'}]},'text':'Anything is possible when you\\'re in the library... with a celestial sandwich: http://bit.ly/libraryman (via @iamcal)'," +
				"'annotations': null,'contributors': null,'id': 18700688341,'geo': null,'in_reply_to_user_id': null,'place':{'name':'San Francisco','country_code':'US','country':'The United States of America','attributes':{}," +
				"'url':'http://api.twitter.com/1/geo/id/5a110d312052166f.json','id':'5a110d312052166f','bounding_box':{'coordinates':[[[-122.51368188,37.70813196],[-122.35845384,37.70813196],[-122.35845384,37.83245301],[-122.51368188,37.83245301]]]," +
				"'type':'Polygon'},'full_name':'San Francisco,CA','place_type':'city'},'in_reply_to_screen_name': null,'user':{'name':'Daniel Burka','profile_sidebar_border_color':'a655ec','profile_background_tile': true,'profile_sidebar_fill_color':'f1ccff'," +
				"'created_at':'Mon Jan 15 15:22:14 +0000 2007','profile_image_url':'http://a3.twimg.com/profile_images/74260755/2009-square-small_normal.jpg','location':'San Francisco','profile_link_color':'5a0d91','follow_request_sent': false," +
				"'url':'http://deltatangobravo.com','favourites_count': 92,'contributors_enabled': false,'utc_offset': -28800,'id': 635543,'profile_use_background_image': true,'profile_text_color':'0C3E53','protected': false,'followers_count': 9950," +
				"'lang':'en','notifications': false,'time_zone':'Pacific Time (US & Canada)','verified': false,'profile_background_color':'BADFCD','geo_enabled': true,'description':'Director of design at Tiny Speck. Ex-Creative director at Digg. CSS. Design. UX. Climbing. Cycling. Chilaquiles mmm.'," +
				"'friends_count': 219,'statuses_count': 806,'profile_background_image_url':'http://a3.twimg.com/profile_background_images/4444585/back.png','following': true,'screen_name':'dburka'},'source':'web','in_reply_to_status_id': null}," +
				"{'coordinates': null,'favorited': false,'created_at':'Fri Jul 16 16:40:34 +0000 2010','truncated': false,'entities':{'urls':[],'hashtags':[],'user_mentions':[]},'text':'Walking the DOM like Huggybear.','annotations': null,'contributors': null," +
				"'id': 18699620902,'geo': null,'in_reply_to_user_id': null,'place': null,'in_reply_to_screen_name': null,'user':{'name':'Kevin Lawver','profile_sidebar_border_color':'A8A37E','profile_background_tile': true,'profile_sidebar_fill_color':'E6E2B0'," +
				"'created_at':'Sat Jul 29 18:23:37 +0000 2006','profile_image_url':'http://a3.twimg.com/profile_images/980477983/oh_lawver_normal.jpg','location':'Savannah,GA,US','profile_link_color':'DC4104','follow_request_sent': false,'url':'http://lawver.net'," +
				"'favourites_count': 148,'contributors_enabled': false,'utc_offset': -18000,'id': 3404,'profile_use_background_image': true,'profile_text_color':'003030','protected': false,'followers_count': 1049,'lang':'en','notifications': false," +
				"'time_zone':'Eastern Time (US & Canada)','verified': false,'profile_background_color':'003030','geo_enabled': true,'description':'Nerd who loves web standards,Ruby on Rails and all things webbish. Chief Architect @ http://uplaya.com and co-founder of http://ficly.com. Happy dad & husband.'," +
				"'friends_count': 268,'statuses_count': 10561,'profile_background_image_url':'http://a1.twimg.com/profile_background_images/1391712/twitter_back.png','following': true,'screen_name':'kplawver'},'source':'<a href=\\'http://twitter.com\\' rel=\\'nofollow\\'>Tweetie for Mac</a>'," +
				"'in_reply_to_status_id': null},]";
		
		HttpResponse res = new HttpResponseStub(json);
		try {
			assertNotNull(fact.createStatusList(res));
		} catch (TwitterException e) {
			fail("TwitterException thrown");
		}
	}

	public void testCreateTrends() {
		fail("Not yet implemented");
	}

	public void testCreateTrendsList() {
		fail("Not yet implemented");
	}

	public void testCreateUserHttpResponse() {
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
		
		HttpResponse res = new HttpResponseStub(json);
		try {
			assertNotNull(fact.createUser(res));
		} catch (TwitterException e) {
			fail("TwitterException thrown");
		}
	}

	public void testCreateUserList() {
		String json = "[{'previous_cursor': 0,'previous_cursor_str': '0','next_cursor': 0,'users': [{'profile_sidebar_border_color': 'C0DEED','name': 'Javier Heady \\r','profile_sidebar_fill_color': 'DDEEF6'," +
				"'profile_background_tile': false,'location': null,'created_at': 'Thu Mar 01 00:16:47 +0000 2012','profile_image_url': 'http://a0.twimg.com/sticky/default_profile_images/default_profile_4_normal.png'," +
				"'is_translator': false,'id_str': '509466276','profile_link_color': '0084B4','follow_request_sent': false,'contributors_enabled': false,'default_profile': true,'url': null,'favourites_count': 0," +
				"'utc_offset': null,'id': 509466276,'profile_image_url_https': 'https://si0.twimg.com/sticky/default_profile_images/default_profile_4_normal.png','listed_count': 0,'profile_use_background_image': true," +
				"'profile_text_color': '333333','lang': 'en','protected': false,'followers_count': 0,'geo_enabled': false,'description': null,'profile_background_image_url_https': 'https://si0.twimg.com/images/themes/theme1/bg.png'," +
				"'verified': false,'time_zone': null,'profile_background_color': 'C0DEED','notifications': false,'status': {'coordinates': null,'truncated': false,'favorited': false,'created_at': 'Thu Mar 01 00:17:26 +0000 2012'," +
				"'id_str': '175011828630421504','in_reply_to_user_id_str': '119476949','entities': {'urls': [{'expanded_url': 'http://tinyurl.com/86qf88r/H5bgvt','url': 'http://t.co/XRnL260w','indices': [15,35],'display_url': 'tinyurl.com/86qf88r/H5bgvt'}]," +
				"'hashtags': [],'user_mentions': [{'name': 'OAuth Dancer','id_str': '119476949','id': 119476949,'indices': [0,13],'screen_name': 'oauth_dancer'}]},'text': '@oauth_dancer  http://t.co/XRnL260w','contributors': null,'retweet_count': 0," +
				"'in_reply_to_status_id_str': null,'id': 175011828630421504,'geo': null,'retweeted': false,'possibly_sensitive': false,'in_reply_to_user_id': 119476949,'source': '<a href=\\'http://mobile.twitter.com\\' rel=\\'nofollow\\'>Mobile Web</a>'," +
				"'in_reply_to_screen_name': 'oauth_dancer','place': null,'in_reply_to_status_id': null},'friends_count': 0,'statuses_count': 4,'profile_background_image_url': 'http://a0.twimg.com/images/themes/theme1/bg.png','default_profile_image': true," +
				"'show_all_inline_media': false,'screen_name': 'javierg3ong','following': false}],'next_cursor_str': '0'}]";
		
		HttpResponse res = new HttpResponseStub(json);
		try {
			assertNotNull(fact.createUserList(res));
		} catch (TwitterException e) {
			fail("TwitterException thrown: " + e.getMessage());
		}
	}

	public void testCreateUserListFromJSONArray() {
		String json = "[{'name': 'Art & Design','slug': 'art-design','size': 56},{'name': 'Books','slug': 'books','size': 72},{'name': 'Business','slug': 'business','size': 65},{'name': 'Charity','slug': 'charity','size': 83},{'name': 'Deals','slug': 'deals','size': 32}," +
				"{'name': 'Entertainment','slug': 'entertainment','size': 128},{'name': 'Family','slug': 'family','size': 55},{'name': 'Fashion','slug': 'fashion','size': 56},{'name': 'Food & Drink','slug': 'food-drink','size': 83},{'name': 'Funny','slug': 'funny','size': 72}," +
				"{'name': 'Health','slug': 'health','size': 52},{'name': 'Music','slug': 'music','size': 120},{'name': 'News','slug': 'news','size': 59},{'name': 'Politics','slug': 'politics','size': 81},{'name': 'Science','slug': 'science','size': 58}," +
				"{'name': 'Sports','slug': 'sports','size': 118},{'name': 'Staff Picks','slug': 'staff-picks','size': 96},{'name': 'Staff Picks: NFL Playoffs','slug': 'staff-picks-nfl-playoffs','size': 220},{'name': 'Technology','slug': 'technology','size': 60}," +
				"{'name': 'Travel','slug': 'travel','size': 56},{'name': 'Twitter','slug': 'twitter','size': 16}]";
		HttpResponse res = new HttpResponseStub(json);
		try {
			assertNotNull(fact.createUserListFromJSONArray(res));
		} catch (TwitterException e) {
			fail("TwitterException thrown: " + e.getMessage());
		}
	}

	public void testCreateUserListFromJSONArray_Users() {
		String json = "{'name': 'Twitter','slug': 'twitter','size': 16,'users': [{'name': 'Twitter Mobile','profile_sidebar_border_color': 'C0DEED','profile_background_tile': false,'profile_sidebar_fill_color': 'DDEEF6'," +
				"'profile_image_url': 'http://a2.twimg.com/profile_images/381297805/mobile_normal.png','location': 'San Francisco,CA','created_at': 'Tue Apr 10 01:20:52 +0000 2007','is_translator': false,'id_str': '3963481'," +
				"'profile_link_color': '0084B4','follow_request_sent': false,'favourites_count': 1,'url': 'http://twitter.com','contributors_enabled': true,'utc_offset': -28800,'id': 3963481,'profile_use_background_image': true," +
				"'listed_count': 3817,'protected': false,'followers_count': 454864,'profile_text_color': '333333','lang': 'en','notifications': false,'geo_enabled': true,'verified': true,'time_zone': 'Pacific Time (US & Canada)'," +
				"'description': '','profile_background_color': 'C0DEED','friends_count': 15,'statuses_count': 127,'profile_background_image_url': 'http://a3.twimg.com/a/1294198369/images/themes/theme1/bg.png','show_all_inline_media': true," +
				"'following': true,'screen_name': 'twittermobile'},{'name': 'Safety','profile_sidebar_border_color': 'a8c7f7','profile_background_tile': false,'profile_sidebar_fill_color': 'C0DFEC'," +
				"'profile_image_url': 'http://a3.twimg.com/profile_images/633860326/Picture_19_bigger_normal.png','location': 'Twitter HQ','created_at': 'Wed Dec 09 21:00:57 +0000 2009','is_translator': false,'id_str': '95731075'," +
				"'profile_link_color': '0084B4','follow_request_sent': false,'favourites_count': 0,'url': 'http://help.twitter.com/forums/10711/entries/76036','contributors_enabled': false,'utc_offset': null,'id': 95731075," +
				"'profile_use_background_image': true,'listed_count': 4180,'protected': false,'followers_count': 299045,'profile_text_color': '333333','lang': 'en','notifications': false,'geo_enabled': false,'verified': true," +
				"'time_zone': null,'description': 'Twitter\\'s Trust and Safety Updates!','profile_background_color': '022330','friends_count': 4,'statuses_count': 72,'profile_background_image_url': 'http://a2.twimg.com/a/1294945237/images/themes/theme15/bg.png'," +
				"'show_all_inline_media': false,'following': true,'screen_name': 'safety'},{'name': 'Support','profile_sidebar_border_color': 'C0DEED','profile_background_tile': false,'profile_sidebar_fill_color': 'DDEEF6'," +
				"'profile_image_url': 'http://a2.twimg.com/profile_images/1164188883/support_normal.png','location': 'Twitter HQ','created_at': 'Thu Dec 04 18:51:57 +0000 2008','is_translator': false,'id_str': '17874544','profile_link_color': '0084B4'," +
				"'follow_request_sent': false,'favourites_count': 0,'url': 'http://support.twitter.com','contributors_enabled': true,'utc_offset': -32400,'id': 17874544,'profile_use_background_image': true,'listed_count': 5345,'protected': false," +
				"'followers_count': 322350,'profile_text_color': '333333','lang': 'en','notifications': false,'geo_enabled': true,'verified': true,'time_zone': 'Alaska','description': 'Always wondering how we can help you! (Make sure you are following us if you\\'d like a response to your DM).'," +
				"'profile_background_color': 'C0DEED','friends_count': 69,'statuses_count': 583,'profile_background_image_url': 'http://a3.twimg.com/a/1292975674/images/themes/theme1/bg.png','show_all_inline_media': false,'following': true,'screen_name': 'Support'}," +
				"{'name': 'Top Tweets','profile_sidebar_border_color': 'eeeeee','profile_background_tile': false,'profile_sidebar_fill_color': 'f6f6f6','profile_image_url': 'http://a2.twimg.com/profile_images/756779235/icon-toptweets5_normal.png','location': 'Everywhere'," +
				"'created_at': 'Thu Feb 11 18:31:38 +0000 2010','is_translator': false,'id_str': '113425681','profile_link_color': '2276bb','follow_request_sent': false,'favourites_count': 5766,'url': 'http://twitter.com','contributors_enabled': false,'utc_offset': -32400,'id': 113425681," +
				"'profile_use_background_image': true,'listed_count': 8711,'protected': false,'followers_count': 815804,'profile_text_color': '333333','lang': 'en','notifications': false,'geo_enabled': false,'verified': true,'time_zone': 'Alaska'," +
				"'description': 'Top Tweets algorithmically selects and retweets some of the most interesting tweets spreading across Twitter. Enjoy!','profile_background_color': '5599bb','friends_count': 0,'statuses_count': 7378," +
				"'profile_background_image_url': 'http://a2.twimg.com/profile_background_images/83490645/bg-rays2.jpg','show_all_inline_media': false,'following': true,'screen_name': 'toptweets'},{'name': 'Feedback by Tweet','profile_sidebar_border_color': 'C0DEED','profile_background_tile': false," +
				"'profile_sidebar_fill_color': 'DDEEF6','profile_image_url': 'http://a2.twimg.com/profile_images/818033855/Picture_3_normal.png','location': 'Twitter HQ','created_at': 'Fri Jun 26 00:59:03 +0000 2009','is_translator': false,'id_str': '50851703','profile_link_color': '0084B4'," +
				"'follow_request_sent': false,'favourites_count': 0,'url': 'http://www.twitter.com','contributors_enabled': true,'utc_offset': -28800,'id': 50851703,'profile_use_background_image': true,'listed_count': 1727,'protected': false,'followers_count': 235300,'profile_text_color': '333333'," +
				"'lang': 'en','notifications': false,'geo_enabled': true,'verified': true,'time_zone': 'Pacific Time (US & Canada)','description': 'Collecting your ideas and feature requests!','profile_background_color': 'C0DEED','friends_count': 23,'statuses_count': 27," +
				"'profile_background_image_url': 'http://a3.twimg.com/a/1292975674/images/themes/theme1/bg.png','show_all_inline_media': false,'following': true,'screen_name': 'feedback'},{'name': 'Twitter Espa\u00f1ol','profile_sidebar_border_color': 'C0DEED','profile_background_tile': false," +
				"'profile_sidebar_fill_color': 'DDEEF6','profile_image_url': 'http://a3.twimg.com/profile_images/1129034137/Twitter_normal.png','location': 'San Francisco,CA','created_at': 'Mon Oct 26 21:54:02 +0000 2009','is_translator': false,'id_str': '85426644','profile_link_color': '0084B4'," +
				"'follow_request_sent': false,'favourites_count': 4,'url': 'http://blog.es.twitter.com','contributors_enabled': true,'utc_offset': -28800,'id': 85426644,'profile_use_background_image': true,'listed_count': 12072,'protected': false,'followers_count': 3471934,'profile_text_color': '333333'," +
				"'lang': 'es','notifications': false,'geo_enabled': false,'verified': true,'time_zone': 'Pacific Time (US & Canada)','description': '\u00a1Bienvenidos a la cuenta oficial de Twitter en espa\u00f1ol!','profile_background_color': 'C0DEED','friends_count': 18,'statuses_count': 339," +
				"'profile_background_image_url': 'http://a3.twimg.com/a/1294708774/images/themes/theme1/bg.png','show_all_inline_media': false,'following': false,'screen_name': 'twitter_es'},{'name': 'Twitter Italiano','profile_sidebar_border_color': 'C0DEED','profile_background_tile': false," +
				"'profile_sidebar_fill_color': 'DDEEF6','profile_image_url': 'http://a3.twimg.com/profile_images/1129120603/at-twitter_normal.png','location': 'San Francisco,CA','created_at': 'Fri Dec 04 23:02:23 +0000 2009','is_translator': false,'id_str': '94666311','profile_link_color': '0084B4'," +
				"'follow_request_sent': false,'favourites_count': 1,'url': 'http://twitter-italian.blogspot.com/','contributors_enabled': false,'utc_offset': -28800,'id': 94666311,'profile_use_background_image': true,'listed_count': 1527,'protected': false,'followers_count': 234378,'profile_text_color': '333333'," +
				"'lang': 'it','notifications': false,'geo_enabled': false,'verified': true,'time_zone': 'Pacific Time (US & Canada)','description': 'L\\'account ufficiale di Twitter in italiano!','profile_background_color': 'C0DEED','friends_count': 11,'statuses_count': 310," +
				"'profile_background_image_url': 'http://a3.twimg.com/a/1294945237/images/themes/theme1/bg.png','show_all_inline_media': true,'following': false,'screen_name': 'twitter_it'},{'name': 'Mobile Support','profile_sidebar_border_color': 'C0DEED','profile_background_tile': false,'profile_sidebar_fill_color': 'DDEEF6'," +
				"'profile_image_url': 'http://a3.twimg.com/profile_images/1164891509/support-mobile_normal.png','location': '','created_at': 'Tue Mar 23 22:30:37 +0000 2010','is_translator': false,'id_str': '125798513','profile_link_color': '0084B4','follow_request_sent': false,'favourites_count': 0," +
				"'url': 'http://mobile.twitter.com','contributors_enabled': false,'utc_offset': -28800,'id': 125798513,'profile_use_background_image': true,'listed_count': 786,'protected': false,'followers_count': 64268,'profile_text_color': '333333','lang': 'en','notifications': false,'geo_enabled': true,'verified': true," +
				"'time_zone': 'Pacific Time (US & Canada)','description': 'Check out our Mobile Web support forum,http://groups.google.com/group/twitter-support','profile_background_color': 'C0DEED','friends_count': 17,'statuses_count': 367,'profile_background_image_url': 'http://a3.twimg.com/a/1294777242/images/themes/theme1/bg.png'," +
				"'show_all_inline_media': false,'following': true,'screen_name': 'MobileSupport'},{'name': 'Twitter','profile_sidebar_border_color': 'EEEEEE','profile_background_tile': false,'profile_sidebar_fill_color': 'F6F6F6','profile_image_url': 'http://a2.twimg.com/profile_images/1124040897/at-twitter_normal.png'," +
				"'location': 'San Francisco,CA','created_at': 'Tue Feb 20 14:35:54 +0000 2007','is_translator': false,'id_str': '783214','profile_link_color': '038543','follow_request_sent': false,'favourites_count': 2,'url': 'http://twitter.com','contributors_enabled': true,'utc_offset': -28800,'id': 783214," +
				"'profile_use_background_image': true,'listed_count': 52841,'protected': false,'followers_count': 4169479,'profile_text_color': '333333','lang': 'ko','notifications': false,'geo_enabled': true,'verified': true,'time_zone': 'Pacific Time (US & Canada)','description': 'Always wondering what\\'s happening. '," +
				"'profile_background_color': 'ACDED6','friends_count': 390,'statuses_count': 963,'profile_background_image_url': 'http://a2.twimg.com/a/1294957282/images/themes/theme18/bg.gif','show_all_inline_media': true,'following': true,'screen_name': 'twitter'},{'name': 'Twitter auf Deutsch','profile_sidebar_border_color': 'C0DEED'," +
				"'profile_background_tile': false,'profile_sidebar_fill_color': 'DDEEF6','profile_image_url': 'http://a3.twimg.com/profile_images/1142699194/at-twitter_normal.png','location': 'San Francisco,CA','created_at': 'Mon Dec 07 18:40:52 +0000 2009','is_translator': false,'id_str': '95255169','profile_link_color': '0084B4'," +
				"'follow_request_sent': false,'favourites_count': 0,'url': 'http://www.twitter.com','contributors_enabled': false,'utc_offset': -32400,'id': 95255169,'profile_use_background_image': true,'listed_count': 1919,'protected': false,'followers_count': 221075,'profile_text_color': '333333','lang': 'de','notifications': false," +
				"'geo_enabled': true,'verified': true,'time_zone': 'Alaska','description': 'Das offizielle deutsche Twitter Konto!---------  http://twitter-deutsch.blogspot.com/','profile_background_color': 'C0DEED','friends_count': 30,'statuses_count': 182,'profile_background_image_url': 'http://a3.twimg.com/a/1294945237/images/themes/theme1/bg.png'," +
				"'show_all_inline_media': false,'following': false,'screen_name': 'twitter_de'},{'name': 'Twitter Fran\u00e7ais','profile_sidebar_border_color': 'EEEEEE','profile_background_tile': false,'profile_sidebar_fill_color': 'F6F6F6','profile_image_url': 'http://a3.twimg.com/profile_images/1168748308/support-france_normal.png'," +
				"'location': 'San Francisco CA','created_at': 'Tue Nov 17 03:49:40 +0000 2009','is_translator': false,'id_str': '90556897','profile_link_color': '038543','follow_request_sent': false,'favourites_count': 0,'url': 'http://www.twitter.com','contributors_enabled': true,'utc_offset': -28800,'id': 90556897," +
				"'profile_use_background_image': true,'listed_count': 2585,'protected': false,'followers_count': 301370,'profile_text_color': '333333','lang': 'fr','notifications': false,'geo_enabled': true,'verified': true,'time_zone': 'Pacific Time (US & Canada)','description': 'Bienvenue au compte officiel de Twitter en France !'," +
				"'profile_background_color': 'ACDED6','friends_count': 38,'statuses_count': 232,'profile_background_image_url': 'http://a2.twimg.com/a/1294945237/images/themes/theme18/bg.gif','show_all_inline_media': false,'following': false,'screen_name': 'twitter_fr'},{'name': 'twj','profile_sidebar_border_color': 'C0DEED'," +
				"'profile_background_tile': false,'profile_sidebar_fill_color': 'DDEEF6','profile_image_url': 'http://a0.twimg.com/profile_images/1129089217/twitter_newbird_normal.png','location': '\u6771\u4eac\u90fd\u6e0b\u8c37\u533a','created_at': 'Tue Jun 26 01:54:35 +0000 2007','is_translator': false,'id_str': '7080152'," +
				"'profile_link_color': '0084B4','follow_request_sent': false,'favourites_count': 2,'url': 'http://twitter.jp','contributors_enabled': true,'utc_offset': 32400,'id': 7080152,'profile_use_background_image': true,'listed_count': 13245,'protected': false,'followers_count': 542516,'profile_text_color': '333333','lang': 'ja'," +
				"'notifications': false,'geo_enabled': false,'verified': true,'time_zone': 'Tokyo','description': '\u65e5\u672c\u8a9e\u7248Twitter\u30b5\u30a4\u30c8\u306e\u904b\u55b6\u3092\u624b\u4f1d\u3063\u3066\u307e\u3059\u3002','profile_background_color': 'C0DEED','friends_count': 4639,'statuses_count': 1456," +
				"'profile_background_image_url': 'http://a3.twimg.com/a/1294945237/images/themes/theme1/bg.png','show_all_inline_media': false,'following': false,'screen_name': 'twj'},{'name': 'Twitter Search','profile_sidebar_border_color': 'C0DEED','profile_background_tile': false,'profile_sidebar_fill_color': 'DDEEF6'," +
				"'profile_image_url': 'http://a1.twimg.com/profile_images/828359055/Picture_19_bigger_bigger_normal.png','location': 'San Francisco,CA','created_at': 'Fri Apr 16 18:38:13 +0000 2010','is_translator': false,'id_str': '133824534','profile_link_color': '0084B4','follow_request_sent': false,'favourites_count': 0," +
				"'url': 'http://search.twitter.com/','contributors_enabled': false,'utc_offset': -28800,'id': 133824534,'profile_use_background_image': true,'listed_count': 1777,'protected': false,'followers_count': 248718,'profile_text_color': '333333','lang': 'en','notifications': false,'geo_enabled': true,'verified': false," +
				"'time_zone': 'Pacific Time (US & Canada)','description': 'We are Twitter Search! Follow us for search tips and news about cool features. Tweet us your ideas,feedback,and questions.','profile_background_color': 'C0DEED','friends_count': 0,'statuses_count': 25," +
				"'profile_background_image_url': 'http://a3.twimg.com/a/1294945237/images/themes/theme1/bg.png','show_all_inline_media': false,'following': true,'screen_name': 'twittersearch'},{'name': 'Twitter API','profile_sidebar_border_color': '87bc44','profile_background_tile': false,'profile_sidebar_fill_color': 'e0ff92'," +
				"'profile_image_url': 'http://a3.twimg.com/profile_images/689684365/api_normal.png','location': 'San Francisco,CA','created_at': 'Wed May 23 06:01:13 +0000 2007','is_translator': false,'id_str': '6253282','profile_link_color': '0000ff','follow_request_sent': false,'favourites_count': 15,'url': 'http://dev.twitter.com'," +
				"'contributors_enabled': true,'utc_offset': -28800,'id': 6253282,'profile_use_background_image': true,'listed_count': 6994,'protected': false,'followers_count': 345625,'profile_text_color': '000000','lang': 'en','notifications': false,'geo_enabled': true,'verified': true,'time_zone': 'Pacific Time (US & Canada)'," +
				"'description': 'The Real Twitter API. I tweet about API changes,service issues and happily answer questions about Twitter and our API. Don\\'t get an answer? It\\'s on my website.','profile_background_color': 'c1dfee','friends_count': 21,'statuses_count': 2430," +
				"'profile_background_image_url': 'http://a3.twimg.com/profile_background_images/59931895/twitterapi-background-new.png','show_all_inline_media': false,'following': true,'screen_name': 'twitterapi'},{'name': 'Spam Watch','profile_sidebar_border_color': '181A1E','profile_background_tile': false,'profile_sidebar_fill_color': '252429'," +
				"'profile_image_url': 'http://a2.twimg.com/profile_images/706137324/Picture_19_bigger_bigger_normal.png','location': 'Twitter HQ','created_at': 'Tue Apr 29 19:55:39 +0000 2008','is_translator': false,'id_str': '14589771','profile_link_color': '2FC2EF','follow_request_sent': false,'favourites_count': 13," +
				"'url': 'http://help.twitter.com/entries/64986','contributors_enabled': true,'utc_offset': -28800,'id': 14589771,'profile_use_background_image': true,'listed_count': 7335,'protected': false,'followers_count': 346339,'profile_text_color': '888888','lang': 'en','notifications': false,'geo_enabled': false,'verified': true," +
				"'time_zone': 'Pacific Time (US & Canada)','description': 'Suspect Twitter spam?\\r\\nLet us know (http://bit.ly/Tweport)!\\r\\n\\r\\nFollow @spam & @safety for helpful info,and check out our favorite tips: http://bit.ly/spamfav','profile_background_color': '1A1B1F','friends_count': 31971,'statuses_count': 126," +
				"'profile_background_image_url': 'http://a3.twimg.com/a/1294874399/images/themes/theme9/bg.gif','show_all_inline_media': false,'following': true,'screen_name': 'spam'},{'name': 'Fledgling Wine','profile_sidebar_border_color': 'D9B17E','profile_background_tile': false,'profile_sidebar_fill_color': 'EADEAA'," +
				"'profile_image_url': 'http://a2.twimg.com/profile_images/471198711/a_rasterized_500w_normal.jpg','location': 'San Francisco','created_at': 'Mon Oct 12 18:42:20 +0000 2009','is_translator': false,'id_str': '81900486','profile_link_color': '9D582E','follow_request_sent': false,'favourites_count': 0," +
				"'url': 'http://www.fledglingwine.com','contributors_enabled': true,'utc_offset': -28800,'id': 81900486,'profile_use_background_image': false,'listed_count': 2044,'protected': false,'followers_count': 410565,'profile_text_color': '333333','lang': 'en','notifications': false,'geo_enabled': false,'verified': true," +
				"'time_zone': 'Pacific Time (US & Canada)','description': 'A Twitter wine project that promotes literacy around the world.','profile_background_color': '8B542B','friends_count': 25,'statuses_count': 390,'profile_background_image_url': 'http://a2.twimg.com/profile_background_images/45603449/slide_twit.jpg'," +
				"'show_all_inline_media': false,'following': true,'screen_name': 'fledgling'}]}";
		
		HttpResponse res = new HttpResponseStub(json);
		
		try {
			assertNotNull(fact.createUserListFromJSONArray_Users(res));
		} catch (TwitterException e) {
			fail(e.getMessage());
		}

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
		String json = "{'created_at':'Mon Aug 27 17:21:03 +0000 2012','entities': {'hashtags': [],'urls': [],'user_mentions': []},'id': 240136858829479936,'id_str':'240136858829479936','recipient': {'contributors_enabled': false," +
				"'created_at':'Thu Aug 23 19:45:07 +0000 2012','default_profile': false,'default_profile_image': false,'description':'Keep calm and test','favourites_count': 0,'follow_request_sent': false,'followers_count': 0," +
				"'following': false,'friends_count': 10,'geo_enabled': true,'id': 776627022,'id_str':'776627022','is_translator': false,'lang':'en','listed_count': 0,'location':'San Francisco, CA','name':'Mick Jagger'," +
				"'notifications': false,'profile_background_color':'000000','profile_background_image_url':'http://a0.twimg.com/profile_background_images/644522235/cdjlccey99gy36j3em67.jpeg'," +
				"'profile_background_image_url_https':'https://si0.twimg.com/profile_background_images/644522235/cdjlccey99gy36j3em67.jpeg','profile_background_tile': true," +
				"'profile_image_url':'http://a0.twimg.com/profile_images/2550226257/y0ef5abcx5yrba8du0sk_normal.jpeg','profile_image_url_https':'https://si0.twimg.com/profile_images/2550226257/y0ef5abcx5yrba8du0sk_normal.jpeg'," +
				"'profile_link_color':'000000','profile_sidebar_border_color':'000000','profile_sidebar_fill_color':'000000','profile_text_color':'000000','profile_use_background_image': false,'protected': false," +
				"'screen_name':'s0c1alm3dia','show_all_inline_media': false,'statuses_count': 0,'time_zone':'Pacific Time (US & Canada)','url':'http://cnn.com','utc_offset': -28800,'verified': false},'recipient_id': 776627022," +
				"'recipient_screen_name':'s0c1alm3dia','sender': {'contributors_enabled': true,'created_at':'Sat May 09 17:58:22 +0000 2009','default_profile': false,'default_profile_image': false," +
				"'description':'I taught your phone that thing you like.  The Mobile Partner Engineer @Twitter.','favourites_count': 584,'follow_request_sent': false,'followers_count': 10621,'following': false," +
				"'friends_count': 1181,'geo_enabled': true,'id': 38895958,'id_str':'38895958','is_translator': false,'lang':'en','listed_count': 190,'location':'San Francisco','name':'Sean Cook','notifications': false," +
				"'profile_background_color':'1A1B1F','profile_background_image_url':'http://a0.twimg.com/profile_background_images/495742332/purty_wood.png'," +
				"'profile_background_image_url_https':'https://si0.twimg.com/profile_background_images/495742332/purty_wood.png','profile_background_tile': true," +
				"'profile_image_url':'http://a0.twimg.com/profile_images/1751506047/dead_sexy_normal.JPG'," +
				"'profile_image_url_https':'https://si0.twimg.com/profile_images/1751506047/dead_sexy_normal.JPG','profile_link_color':'2FC2EF','profile_sidebar_border_color':'181A1E','profile_sidebar_fill_color':'252429'," +
				"'profile_text_color':'666666','profile_use_background_image': true,'protected': false,'screen_name':'theSeanCook','show_all_inline_media': true,'statuses_count': 2608,'time_zone':'Pacific Time (US & Canada)'," +
				"'url': null,'utc_offset': -28800,'verified': false},'sender_id': 38895958,'sender_screen_name':'theSeanCook','text':'booyakasha'}";
		
		HttpResponse res = new HttpResponseStub(json);
		try {
			assertNotNull(fact.createDirectMessage(res));
		} catch (TwitterException e) {
			fail("TwitterException thrown");
		}
	}

	public void testCreateDirectMessageList() {
		String json = "[{'created_at': 'Tue Jun 22 17:48:26 +0000 2010','sender_screen_name': 'themattharris','sender': {'name': 'Matt Harris','profile_sidebar_border_color': 'C0DEED','profile_background_tile': false," +
				"'profile_sidebar_fill_color': 'DDEEF6','location': 'San Francisco','profile_image_url': 'http://a1.twimg.com/profile_images/554181350/matt_normal.jpg','created_at': 'Sat Feb 17 20:49:54 +0000 2007'," +
				"'profile_link_color': '0084B4','favourites_count': 95,'url': 'http://themattharris.com','contributors_enabled': false,'utc_offset': -28800,'id': 777925,'profile_use_background_image': true," +
				"'profile_text_color': '333333','protected': false,'followers_count': 1026,'lang': 'en','verified': false,'profile_background_color': 'C0DEED','geo_enabled': true,'notifications': false," +
				"'description': 'Developer Advocate at Twitter. Also a hacker and British expat who is married to @cindyli and lives in San Francisco.','time_zone': 'Tijuana','friends_count': 294," +
				"'statuses_count': 2923,'profile_background_image_url': 'http://s.twimg.com/a/1276711174/images/themes/theme1/bg.png','screen_name': 'themattharris','following': true}," +
				"'text': 'sure thing. Meet you at the mall around 7?','recipient_screen_name': 'mattytest','id': 1270520569,'recipient': {'name': 'mattytest','profile_sidebar_border_color': 'C0DEED'," +
				"'profile_background_tile': false,'profile_sidebar_fill_color': 'DDEEF6','location': '','profile_image_url': 'http://a1.twimg.com/profile_images/644612310/matt_bright_normal.png'," +
				"'created_at': 'Thu Jan 22 16:27:50 +0000 2009','profile_link_color': '0084B4','favourites_count': 0,'url': null,'contributors_enabled': false,'utc_offset': -28800,'id': 19345946," +
				"'profile_use_background_image': false,'profile_text_color': '333333','protected': true,'followers_count': 3,'lang': 'en','verified': false,'profile_background_color': 'C0DEED'," +
				"'geo_enabled': true,'notifications': false,'description': '','time_zone': 'Tijuana','friends_count': 2,'statuses_count': 9," +
				"'profile_background_image_url': 'http://s.twimg.com/a/1277162817/images/themes/theme1/bg.png','screen_name': 'mattytest','following': false},'recipient_id': 19345946,'sender_id': 777925}]";
		
		HttpResponse res = new HttpResponseStub(json);
		try {
			assertNotNull(fact.createDirectMessageList(res));
		} catch (TwitterException e) {
			fail(e.getMessage());
		}
	}

	public void testCreateRelationship() {
		fail("Not yet implemented");
	}

	public void testCreateFriendshipList() {
		fail("Not yet implemented");
	}


}

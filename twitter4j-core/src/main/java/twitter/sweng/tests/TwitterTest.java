package twitter.sweng.tests;

import junit.framework.TestCase;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
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

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSetOAuthConsumer() {
		fail("Not yet implemented");
	}

	public void testGetOAuthRequestToken() {
		fail("Not yet implemented");
	}

	public void testGetOAuthRequestTokenString() {
		fail("Not yet implemented");
	}

	public void testGetOAuthRequestTokenStringString() {
		fail("Not yet implemented");
	}

	public void testGetOAuthAccessToken() {
		fail("Not yet implemented");
	}

	public void testGetOAuthAccessTokenString() {
		fail("Not yet implemented");
	}

	public void testGetOAuthAccessTokenRequestToken() {
		fail("Not yet implemented");
	}

	public void testGetOAuthAccessTokenRequestTokenString() {
		fail("Not yet implemented");
	}

	public void testGetOAuthAccessTokenStringString() {
		fail("Not yet implemented");
	}

	public void testSetOAuthAccessToken() {
		try {
			AccessToken originalAccessToken = twitter.getOAuthAccessToken();
			AccessToken newAccessToken = new AccessToken("01234-testToken", "testSecretToken");
			twitter.setOAuthAccessToken(newAccessToken);
			assertEquals(newAccessToken, twitter.getOAuthAccessToken());
			twitter.setOAuthAccessToken(originalAccessToken);
		} catch (TwitterException e) {
			fail("TwitterException thrown");
		}
		
	}

	public void testGetScreenName() {
		try {
			assertEquals("SWENG581", twitter.getScreenName());
		} catch (IllegalStateException e) {
			fail("IllegalStateException thrown");
		} catch (TwitterException e) {
			fail("TwitterException thrown");
		}
	}

	public void testGetId() {
		try {
			assertEquals(925557278, twitter.getId());
		} catch (IllegalStateException e) {
			fail("IllegalStateException thrown");
		} catch (TwitterException e) {
			fail("TwitterException thrown");
		}
	}

	public void testAddRateLimitStatusListener() {
		fail("Not yet implemented");
	}

	public void testGetAuthorization() {
		fail("Not yet implemented");
	}

	public void testGetConfiguration() {
		fail("Not yet implemented");
	}

	public void testShutdown() {
		fail("Not yet implemented");
	}

	public void testSearch() {
		fail("Not yet implemented");
	}

	public void testGetDailyTrends() {
		fail("Not yet implemented");
	}

	public void testGetDailyTrendsDateBoolean() {
		fail("Not yet implemented");
	}

	public void testGetWeeklyTrends() {
		fail("Not yet implemented");
	}

	public void testGetWeeklyTrendsDateBoolean() {
		fail("Not yet implemented");
	}

	public void testGetHomeTimeline() {
		fail("Not yet implemented");
	}

	public void testGetHomeTimelinePaging() {
		fail("Not yet implemented");
	}

	public void testGetUserTimelineStringPaging() {
		fail("Not yet implemented");
	}

	public void testGetUserTimelineLongPaging() {
		fail("Not yet implemented");
	}

	public void testGetUserTimelineString() {
		fail("Not yet implemented");
	}

	public void testGetUserTimelineLong() {
		fail("Not yet implemented");
	}

	public void testGetUserTimeline() {
		fail("Not yet implemented");
	}

	public void testGetUserTimelinePaging() {
		fail("Not yet implemented");
	}

	public void testGetMentions() {
		fail("Not yet implemented");
	}

	public void testGetMentionsPaging() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedByMe() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedByMePaging() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedToMe() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedToMePaging() {
		fail("Not yet implemented");
	}

	public void testGetRetweetsOfMe() {
		fail("Not yet implemented");
	}

	public void testGetRetweetsOfMePaging() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedToUserStringPaging() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedToUserLongPaging() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedByUserStringPaging() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedByUserLongPaging() {
		fail("Not yet implemented");
	}

	public void testShowStatus() {
		fail("Not yet implemented");
	}

	public void testUpdateStatusString() {
		fail("Not yet implemented");
	}

	public void testUpdateStatusStatusUpdate() {
		fail("Not yet implemented");
	}

	public void testDestroyStatus() {
		fail("Not yet implemented");
	}

	public void testRetweetStatus() {
		fail("Not yet implemented");
	}

	public void testGetRetweets() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedByLong() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedByLongPaging() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedByIDsLong() {
		fail("Not yet implemented");
	}

	public void testGetRetweetedByIDsLongPaging() {
		fail("Not yet implemented");
	}

	public void testShowUserString() {
		fail("Not yet implemented");
	}

	public void testShowUserLong() {
		fail("Not yet implemented");
	}

	public void testLookupUsersStringArray() {
		fail("Not yet implemented");
	}

	public void testLookupUsersLongArray() {
		fail("Not yet implemented");
	}

	public void testSearchUsers() {
		fail("Not yet implemented");
	}

	public void testGetSuggestedUserCategories() {
		fail("Not yet implemented");
	}

	public void testGetUserSuggestions() {
		fail("Not yet implemented");
	}

	public void testGetMemberSuggestions() {
		fail("Not yet implemented");
	}

	public void testGetProfileImage() {
		fail("Not yet implemented");
	}

	public void testGetContributorsString() {
		fail("Not yet implemented");
	}

	public void testGetContributorsLong() {
		fail("Not yet implemented");
	}

	public void testGetContributeesString() {
		fail("Not yet implemented");
	}

	public void testGetContributeesLong() {
		fail("Not yet implemented");
	}

	public void testCreateUserList() {
		fail("Not yet implemented");
	}

	public void testUpdateUserListIntStringBooleanString() {
		fail("Not yet implemented");
	}

	public void testUpdateUserListLongStringStringBooleanString() {
		fail("Not yet implemented");
	}

	public void testGetUserListsStringLong() {
		fail("Not yet implemented");
	}

	public void testGetUserListsLongLong() {
		fail("Not yet implemented");
	}

	public void testShowUserListInt() {
		fail("Not yet implemented");
	}

	public void testShowUserListLongString() {
		fail("Not yet implemented");
	}

	public void testDestroyUserListInt() {
		fail("Not yet implemented");
	}

	public void testDestroyUserListLongString() {
		fail("Not yet implemented");
	}

	public void testGetUserListStatusesIntPaging() {
		fail("Not yet implemented");
	}

	public void testGetUserListStatusesLongStringPaging() {
		fail("Not yet implemented");
	}

	public void testGetUserListMembershipsLong() {
		fail("Not yet implemented");
	}

	public void testGetUserListMembershipsLongLong() {
		fail("Not yet implemented");
	}

	public void testGetUserListMembershipsStringLong() {
		fail("Not yet implemented");
	}

	public void testGetUserListMembershipsStringLongBoolean() {
		fail("Not yet implemented");
	}

	public void testGetUserListMembershipsLongLongBoolean() {
		fail("Not yet implemented");
	}

	public void testGetUserListSubscriptions() {
		fail("Not yet implemented");
	}

	public void testGetAllUserListsString() {
		fail("Not yet implemented");
	}

	public void testGetAllUserListsLong() {
		fail("Not yet implemented");
	}

	public void testGetUserListMembersIntLong() {
		fail("Not yet implemented");
	}

	public void testGetUserListMembersLongStringLong() {
		fail("Not yet implemented");
	}

	public void testAddUserListMemberIntLong() {
		fail("Not yet implemented");
	}

	public void testAddUserListMemberLongStringLong() {
		fail("Not yet implemented");
	}

	public void testAddUserListMembersIntLongArray() {
		fail("Not yet implemented");
	}

	public void testAddUserListMembersLongStringLongArray() {
		fail("Not yet implemented");
	}

	public void testAddUserListMembersIntStringArray() {
		fail("Not yet implemented");
	}

	public void testAddUserListMembersLongStringStringArray() {
		fail("Not yet implemented");
	}

	public void testDeleteUserListMemberIntLong() {
		fail("Not yet implemented");
	}

	public void testDeleteUserListMemberLongStringLong() {
		fail("Not yet implemented");
	}

	public void testShowUserListMembershipIntLong() {
		fail("Not yet implemented");
	}

	public void testShowUserListMembershipLongStringLong() {
		fail("Not yet implemented");
	}

	public void testGetUserListSubscribersIntLong() {
		fail("Not yet implemented");
	}

	public void testGetUserListSubscribersLongStringLong() {
		fail("Not yet implemented");
	}

	public void testCreateUserListSubscriptionInt() {
		fail("Not yet implemented");
	}

	public void testCreateUserListSubscriptionLongString() {
		fail("Not yet implemented");
	}

	public void testDestroyUserListSubscriptionInt() {
		fail("Not yet implemented");
	}

	public void testDestroyUserListSubscriptionLongString() {
		fail("Not yet implemented");
	}

	public void testShowUserListSubscriptionIntLong() {
		fail("Not yet implemented");
	}

	public void testShowUserListSubscriptionLongStringLong() {
		fail("Not yet implemented");
	}

	public void testGetDirectMessages() {
		fail("Not yet implemented");
	}

	public void testGetDirectMessagesPaging() {
		fail("Not yet implemented");
	}

	public void testGetSentDirectMessages() {
		fail("Not yet implemented");
	}

	public void testGetSentDirectMessagesPaging() {
		fail("Not yet implemented");
	}

	public void testSendDirectMessageStringString() {
		fail("Not yet implemented");
	}

	public void testSendDirectMessageLongString() {
		fail("Not yet implemented");
	}

	public void testDestroyDirectMessage() {
		fail("Not yet implemented");
	}

	public void testShowDirectMessage() {
		fail("Not yet implemented");
	}

	public void testCreateFriendshipString() {
		fail("Not yet implemented");
	}

	public void testCreateFriendshipLong() {
		fail("Not yet implemented");
	}

	public void testCreateFriendshipStringBoolean() {
		fail("Not yet implemented");
	}

	public void testCreateFriendshipLongBoolean() {
		fail("Not yet implemented");
	}

	public void testDestroyFriendshipString() {
		fail("Not yet implemented");
	}

	public void testDestroyFriendshipLong() {
		fail("Not yet implemented");
	}

	public void testExistsFriendship() {
		fail("Not yet implemented");
	}

	public void testShowFriendshipStringString() {
		fail("Not yet implemented");
	}

	public void testShowFriendshipLongLong() {
		fail("Not yet implemented");
	}

	public void testGetIncomingFriendships() {
		fail("Not yet implemented");
	}

	public void testGetOutgoingFriendships() {
		fail("Not yet implemented");
	}

	public void testLookupFriendshipsStringArray() {
		fail("Not yet implemented");
	}

	public void testLookupFriendshipsLongArray() {
		fail("Not yet implemented");
	}

	public void testUpdateFriendshipStringBooleanBoolean() {
		fail("Not yet implemented");
	}

	public void testUpdateFriendshipLongBooleanBoolean() {
		fail("Not yet implemented");
	}

	public void testGetNoRetweetIds() {
		fail("Not yet implemented");
	}

	public void testGetFriendsIDsLong() {
		fail("Not yet implemented");
	}

	public void testGetFriendsIDsLongLong() {
		fail("Not yet implemented");
	}

	public void testGetFriendsIDsStringLong() {
		fail("Not yet implemented");
	}

	public void testGetFollowersIDsLong() {
		fail("Not yet implemented");
	}

	public void testGetFollowersIDsLongLong() {
		fail("Not yet implemented");
	}

	public void testGetFollowersIDsStringLong() {
		fail("Not yet implemented");
	}

	public void testVerifyCredentials() {
		fail("Not yet implemented");
	}

	public void testGetRateLimitStatus() {
		fail("Not yet implemented");
	}

	public void testUpdateProfileColors() {
		fail("Not yet implemented");
	}

	public void testUpdateProfileImageFile() {
		fail("Not yet implemented");
	}

	public void testUpdateProfileImageInputStream() {
		fail("Not yet implemented");
	}

	public void testUpdateProfileBackgroundImageFileBoolean() {
		fail("Not yet implemented");
	}

	public void testUpdateProfileBackgroundImageInputStreamBoolean() {
		fail("Not yet implemented");
	}

	public void testUpdateProfile() {
		fail("Not yet implemented");
	}

	public void testGetAccountTotals() {
		fail("Not yet implemented");
	}

	public void testGetAccountSettings() {
		fail("Not yet implemented");
	}

	public void testUpdateAccountSettings() {
		fail("Not yet implemented");
	}

	public void testGetFavorites() {
		fail("Not yet implemented");
	}

	public void testGetFavoritesInt() {
		fail("Not yet implemented");
	}

	public void testGetFavoritesString() {
		fail("Not yet implemented");
	}

	public void testGetFavoritesStringInt() {
		fail("Not yet implemented");
	}

	public void testGetFavoritesPaging() {
		fail("Not yet implemented");
	}

	public void testGetFavoritesStringPaging() {
		fail("Not yet implemented");
	}

	public void testCreateFavorite() {
		fail("Not yet implemented");
	}

	public void testDestroyFavorite() {
		fail("Not yet implemented");
	}

	public void testEnableNotificationString() {
		fail("Not yet implemented");
	}

	public void testEnableNotificationLong() {
		fail("Not yet implemented");
	}

	public void testDisableNotificationString() {
		fail("Not yet implemented");
	}

	public void testDisableNotificationLong() {
		fail("Not yet implemented");
	}

	public void testCreateBlockString() {
		fail("Not yet implemented");
	}

	public void testCreateBlockLong() {
		fail("Not yet implemented");
	}

	public void testDestroyBlockString() {
		fail("Not yet implemented");
	}

	public void testDestroyBlockLong() {
		fail("Not yet implemented");
	}

	public void testExistsBlockString() {
		fail("Not yet implemented");
	}

	public void testExistsBlockLong() {
		fail("Not yet implemented");
	}

	public void testGetBlockingUsers() {
		fail("Not yet implemented");
	}

	public void testGetBlockingUsersInt() {
		fail("Not yet implemented");
	}

	public void testGetBlockingUsersIDs() {
		fail("Not yet implemented");
	}

	public void testReportSpamLong() {
		fail("Not yet implemented");
	}

	public void testReportSpamString() {
		fail("Not yet implemented");
	}

	public void testGetSavedSearches() {
		fail("Not yet implemented");
	}

	public void testShowSavedSearch() {
		fail("Not yet implemented");
	}

	public void testCreateSavedSearch() {
		fail("Not yet implemented");
	}

	public void testDestroySavedSearch() {
		fail("Not yet implemented");
	}

	public void testGetAvailableTrends() {
		fail("Not yet implemented");
	}

	public void testGetAvailableTrendsGeoLocation() {
		fail("Not yet implemented");
	}

	public void testGetLocationTrends() {
		fail("Not yet implemented");
	}

	public void testSearchPlaces() {
		fail("Not yet implemented");
	}

	public void testGetSimilarPlaces() {
		fail("Not yet implemented");
	}

	public void testReverseGeoCode() {
		fail("Not yet implemented");
	}

	public void testGetGeoDetails() {
		fail("Not yet implemented");
	}

	public void testCreatePlace() {
		fail("Not yet implemented");
	}

	public void testGetTermsOfService() {
		fail("Not yet implemented");
	}

	public void testGetPrivacyPolicy() {
		fail("Not yet implemented");
	}

	public void testGetRelatedResults() {
		fail("Not yet implemented");
	}

	public void testTest() {
		fail("Not yet implemented");
	}

	public void testGetAPIConfiguration() {
		fail("Not yet implemented");
	}

	public void testGetLanguages() {
		fail("Not yet implemented");
	}

}

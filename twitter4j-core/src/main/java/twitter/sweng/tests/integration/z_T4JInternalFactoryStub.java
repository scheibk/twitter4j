/**
 * 
 */
package twitter.sweng.tests.integration;

import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import twitter4j.AccountSettings;
import twitter4j.AccountTotals;
import twitter4j.Annotations;
import twitter4j.Category;
import twitter4j.DirectMessage;
import twitter4j.Friendship;
import twitter4j.GeoLocation;
import twitter4j.HashtagEntity;
import twitter4j.IDs;
import twitter4j.Location;
import twitter4j.MediaEntity;
import twitter4j.PagableResponseList;
import twitter4j.Place;
import twitter4j.ProfileImage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.RateLimitStatus;
import twitter4j.RelatedResults;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.SavedSearch;
import twitter4j.SimilarPlaces;
import twitter4j.Status;
import twitter4j.TimeZone;
import twitter4j.Trend;
import twitter4j.Trends;
import twitter4j.Tweet;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.TwitterException;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.UserMentionEntity;
import twitter4j.MediaEntity.Size;
import twitter4j.api.HelpMethods;
import twitter4j.api.HelpMethods.Language;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.json.z_T4JInternalFactory;
import twitter4j.internal.org.json.JSONObject;

/**
 * @author Kevin
 *
 */
public class z_T4JInternalFactoryStub implements z_T4JInternalFactory {

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createStatus(twitter4j.internal.org.json.JSONObject)
	 */
	@Override
	public Status createStatus(JSONObject json) throws TwitterException {
		return new Status() {
			
			@Override
			public UserMentionEntity[] getUserMentionEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URLEntity[] getURLEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public MediaEntity[] getMediaEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public HashtagEntity[] getHashtagEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int compareTo(Status o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean isTruncated() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isRetweetedByMe() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isRetweet() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isFavorited() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public User getUser() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getText() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getSource() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Status getRetweetedStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getRetweetCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Place getPlace() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getInReplyToUserId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getInReplyToStatusId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getInReplyToScreenName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public GeoLocation getGeoLocation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Date getCreatedAt() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long[] getContributors() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Annotations getAnnotations() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createUser(twitter4j.internal.org.json.JSONObject)
	 */
	@Override
	public User createUser(JSONObject json) throws TwitterException {
		return new User() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int compareTo(User o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean isVerified() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isTranslator() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isShowAllInlineMedia() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isProtected() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isProfileUseBackgroundImage() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isProfileBackgroundTiled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isGeoEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isFollowRequestSent() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isContributorsEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getUtcOffset() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public URL getURL() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getTimeZone() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getStatusesCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Status getStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getScreenName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileTextColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileSidebarFillColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileSidebarBorderColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileLinkColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URL getProfileImageUrlHttps() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URL getProfileImageURL() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileBackgroundImageUrlHttps() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileBackgroundImageUrl() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileBackgroundColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLocation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getListedCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getLang() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getFriendsCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getFollowersCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getFavouritesCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Date getCreatedAt() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createAUserList(twitter4j.internal.org.json.JSONObject)
	 */
	@Override
	public UserList createAUserList(JSONObject json) throws TwitterException {
		return new UserList() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int compareTo(UserList o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean isPublic() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isFollowing() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public User getUser() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URI getURI() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getSubscriberCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getSlug() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getMemberCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getFullName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createDirectMessage(twitter4j.internal.org.json.JSONObject)
	 */
	@Override
	public DirectMessage createDirectMessage(JSONObject json)
			throws TwitterException {
		return new DirectMessage() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getText() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getSenderScreenName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getSenderId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public User getSender() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getRecipientScreenName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getRecipientId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public User getRecipient() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Date getCreatedAt() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createRateLimitStatus(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public RateLimitStatus createRateLimitStatus(HttpResponse res)
			throws TwitterException {
		return new RateLimitStatus() {
			
			@Override
			public int getSecondsUntilReset() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getResetTimeInSeconds() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Date getResetTime() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getRemainingHits() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getHourlyLimit() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createStatus(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public Status createStatus(HttpResponse res) throws TwitterException {
		return new Status() {
			
			@Override
			public UserMentionEntity[] getUserMentionEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URLEntity[] getURLEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public MediaEntity[] getMediaEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public HashtagEntity[] getHashtagEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int compareTo(Status o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean isTruncated() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isRetweetedByMe() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isRetweet() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isFavorited() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public User getUser() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getText() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getSource() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Status getRetweetedStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getRetweetCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Place getPlace() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getInReplyToUserId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getInReplyToStatusId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getInReplyToScreenName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public GeoLocation getGeoLocation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Date getCreatedAt() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long[] getContributors() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Annotations getAnnotations() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createStatusList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<Status> createStatusList(HttpResponse res)
			throws TwitterException {
		return new ResponseList<Status>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(Status e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, Status element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends Status> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Status> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Status get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Status> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<Status> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<Status> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Status remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Status set(int index, Status element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<Status> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createTrends(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public Trends createTrends(HttpResponse res) throws TwitterException {
		return new Trends() {
			
			@Override
			public int compareTo(Trends o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Trend[] getTrends() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Date getTrendAt() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Location getLocation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Date getAsOf() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createTrendsList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<Trends> createTrendsList(HttpResponse res)
			throws TwitterException {
		return new ResponseList<Trends>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(Trends e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, Trends element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends Trends> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Trends> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Trends get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Trends> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<Trends> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<Trends> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Trends remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Trends set(int index, Trends element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<Trends> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createUser(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public User createUser(HttpResponse res) throws TwitterException {
		return new User() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int compareTo(User o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean isVerified() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isTranslator() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isShowAllInlineMedia() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isProtected() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isProfileUseBackgroundImage() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isProfileBackgroundTiled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isGeoEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isFollowRequestSent() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isContributorsEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getUtcOffset() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public URL getURL() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getTimeZone() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getStatusesCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Status getStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getScreenName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileTextColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileSidebarFillColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileSidebarBorderColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileLinkColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URL getProfileImageUrlHttps() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URL getProfileImageURL() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileBackgroundImageUrlHttps() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileBackgroundImageUrl() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfileBackgroundColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLocation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getListedCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getLang() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getFriendsCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getFollowersCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getFavouritesCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Date getCreatedAt() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createUserList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<User> createUserList(HttpResponse res)
			throws TwitterException {
		return new ResponseList<User>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(User e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, User element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends User> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends User> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<User> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<User> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<User> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User set(int index, User element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<User> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createUserListFromJSONArray(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<User> createUserListFromJSONArray(HttpResponse res)
			throws TwitterException {
		return new ResponseList<User>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(User e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, User element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends User> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends User> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<User> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<User> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<User> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User set(int index, User element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<User> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createUserListFromJSONArray_Users(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<User> createUserListFromJSONArray_Users(HttpResponse res)
			throws TwitterException {
		return new ResponseList<User>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(User e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, User element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends User> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends User> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<User> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<User> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<User> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User set(int index, User element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<User> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createQueryResult(twitter4j.internal.http.HttpResponse, twitter4j.Query)
	 */
	@Override
	public QueryResult createQueryResult(HttpResponse res, Query query)
			throws TwitterException {
		return new QueryResult() {
			
			@Override
			public Query nextQuery() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getWarning() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Tweet> getTweets() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getSinceId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getResultsPerPage() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getRefreshUrl() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getQuery() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getPage() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getMaxId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double getCompletedIn() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createIDs(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public IDs createIDs(HttpResponse res) throws TwitterException {
		return new IDs() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean hasPrevious() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public long getPreviousCursor() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getNextCursor() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long[] getIDs() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createPagableUserList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public PagableResponseList<User> createPagableUserList(HttpResponse res)
			throws TwitterException {
		return new PagableResponseList<User>() {

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(User e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, User element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends User> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends User> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<User> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<User> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<User> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User set(int index, User element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<User> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean hasPrevious() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public long getPreviousCursor() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public long getNextCursor() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createAUserList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public UserList createAUserList(HttpResponse res) throws TwitterException {
		return new UserList() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int compareTo(UserList o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean isPublic() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isFollowing() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public User getUser() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URI getURI() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getSubscriberCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getSlug() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getMemberCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getFullName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createPagableUserListList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public PagableResponseList<UserList> createPagableUserListList(
			HttpResponse res) throws TwitterException {
		return new PagableResponseList<UserList>() {

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(UserList e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, UserList element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends UserList> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends UserList> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public UserList get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<UserList> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<UserList> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<UserList> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public UserList remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public UserList set(int index, UserList element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<UserList> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean hasPrevious() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public long getPreviousCursor() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public long getNextCursor() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createUserListList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<UserList> createUserListList(HttpResponse res)
			throws TwitterException {
		return new ResponseList<UserList>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(UserList e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, UserList element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends UserList> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends UserList> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public UserList get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<UserList> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<UserList> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<UserList> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public UserList remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public UserList set(int index, UserList element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<UserList> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createCategoryList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<Category> createCategoryList(HttpResponse res)
			throws TwitterException {
		return new ResponseList<Category>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(Category e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, Category element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends Category> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Category> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Category get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Category> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<Category> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<Category> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Category remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Category set(int index, Category element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<Category> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createProfileImage(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ProfileImage createProfileImage(HttpResponse res)
			throws TwitterException {
		return new ProfileImage() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getURL() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createDirectMessage(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public DirectMessage createDirectMessage(HttpResponse res)
			throws TwitterException {
		return new DirectMessage() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getText() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getSenderScreenName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getSenderId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public User getSender() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getRecipientScreenName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getRecipientId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public User getRecipient() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Date getCreatedAt() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createDirectMessageList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<DirectMessage> createDirectMessageList(HttpResponse res)
			throws TwitterException {
		return new ResponseList<DirectMessage>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(DirectMessage e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, DirectMessage element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends DirectMessage> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index,
					Collection<? extends DirectMessage> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public DirectMessage get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<DirectMessage> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<DirectMessage> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<DirectMessage> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public DirectMessage remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public DirectMessage set(int index, DirectMessage element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<DirectMessage> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createRelationship(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public Relationship createRelationship(HttpResponse res)
			throws TwitterException {
		return new Relationship() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean isTargetFollowingSource() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isTargetFollowedBySource() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isSourceNotificationsEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isSourceFollowingTarget() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isSourceFollowedByTarget() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isSourceBlockingTarget() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getTargetUserScreenName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getTargetUserId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getSourceUserScreenName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getSourceUserId() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createFriendshipList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<Friendship> createFriendshipList(HttpResponse res)
			throws TwitterException {
		return new ResponseList<Friendship>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(Friendship e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, Friendship element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends Friendship> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Friendship> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Friendship get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Friendship> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<Friendship> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<Friendship> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Friendship remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Friendship set(int index, Friendship element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<Friendship> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createAccountTotals(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public AccountTotals createAccountTotals(HttpResponse res)
			throws TwitterException {
		return new AccountTotals() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getUpdates() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getFriends() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getFollowers() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getFavorites() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createAccountSettings(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public AccountSettings createAccountSettings(HttpResponse res)
			throws TwitterException {
		return new AccountSettings() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean isSleepTimeEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isGeoEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isDiscoverableByEmail() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isAlwaysUseHttps() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Location[] getTrendLocations() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public TimeZone getTimeZone() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getSleepStartTime() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getSleepEndTime() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLanguage() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createSavedSearch(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public SavedSearch createSavedSearch(HttpResponse res)
			throws TwitterException {
		return new SavedSearch() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int compareTo(SavedSearch o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getQuery() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getPosition() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Date getCreatedAt() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createSavedSearchList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<SavedSearch> createSavedSearchList(HttpResponse res)
			throws TwitterException {
		return new ResponseList<SavedSearch>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(SavedSearch e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, SavedSearch element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends SavedSearch> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends SavedSearch> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public SavedSearch get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<SavedSearch> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<SavedSearch> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<SavedSearch> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public SavedSearch remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public SavedSearch set(int index, SavedSearch element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<SavedSearch> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createLocationList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<Location> createLocationList(HttpResponse res)
			throws TwitterException {
		return new ResponseList<Location>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(Location e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, Location element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends Location> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Location> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Location get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Location> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<Location> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<Location> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Location remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Location set(int index, Location element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<Location> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createPlace(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public Place createPlace(HttpResponse res) throws TwitterException {
		return new Place() {
			
			@Override
			public int compareTo(Place o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getURL() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getStreetAddress() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getPlaceType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getGeometryType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public GeoLocation[][] getGeometryCoordinates() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getFullName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getCountryCode() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getCountry() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Place[] getContainedWithIn() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getBoundingBoxType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public GeoLocation[][] getBoundingBoxCoordinates() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createPlaceList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<Place> createPlaceList(HttpResponse res)
			throws TwitterException {
		return new ResponseList<Place>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(Place e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, Place element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends Place> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Place> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Place get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Place> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<Place> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<Place> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Place remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Place set(int index, Place element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<Place> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createSimilarPlaces(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public SimilarPlaces createSimilarPlaces(HttpResponse res)
			throws TwitterException {
		return new SimilarPlaces() {
			
			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Place> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Place set(int index, Place element) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Place remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public ListIterator<Place> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ListIterator<Place> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Iterator<Place> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Place get(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(int index, Collection<? extends Place> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean addAll(Collection<? extends Place> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void add(int index, Place element) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean add(Place e) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getToken() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createRelatedResults(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public RelatedResults createRelatedResults(HttpResponse res)
			throws TwitterException {
		return new RelatedResults() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public ResponseList<Status> getTweetsWithReply() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResponseList<Status> getTweetsWithConversation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResponseList<Status> getTweetsFromUser() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createTwitterAPIConfiguration(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public TwitterAPIConfiguration createTwitterAPIConfiguration(
			HttpResponse res) throws TwitterException {
		return new TwitterAPIConfiguration() {
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getShortURLLengthHttps() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getShortURLLength() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Map<Integer, Size> getPhotoSizes() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getPhotoSizeLimit() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String[] getNonUsernamePaths() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getMaxMediaPerUpload() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getCharactersReservedPerMedia() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createLanguageList(twitter4j.internal.http.HttpResponse)
	 */
	@Override
	public ResponseList<Language> createLanguageList(HttpResponse res)
			throws TwitterException {
		return new ResponseList<HelpMethods.Language>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(HelpMethods.Language e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, HelpMethods.Language element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends HelpMethods.Language> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index,
					Collection<? extends HelpMethods.Language> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public HelpMethods.Language get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<HelpMethods.Language> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<HelpMethods.Language> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<HelpMethods.Language> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public HelpMethods.Language remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public HelpMethods.Language set(int index,
					HelpMethods.Language element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<HelpMethods.Language> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see twitter4j.internal.json.z_T4JInternalFactory#createEmptyResponseList()
	 */
	@Override
	public <T> ResponseList<T> createEmptyResponseList() {
		return new ResponseList<T>() {

			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean add(T e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void add(int index, T element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean addAll(Collection<? extends T> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends T> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public T get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<T> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<T> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<T> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public T remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public T set(int index, T element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<T> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RateLimitStatus getFeatureSpecificRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}

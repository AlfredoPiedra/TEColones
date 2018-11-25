package pruebaTwitter;

import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Intento2 {

	public static void main(String[] args) throws TwitterException 
	{
		Tweet("Timulo acaba de reciclar papel");
	}

	 public static void Tweet(String Mensaje) throws TwitterException{
	       Twitter twitter;
	        ConfigurationBuilder cb = new ConfigurationBuilder();
	        cb.setDebugEnabled(true)
	                .setOAuthConsumerKey("pwHws9Nrk09SppIpjecXpnuH2")
	                .setOAuthConsumerSecret("S8WCiOoKCtWF5bF1tD6qdLxDloCDTmsvw0wVKmfwnxTI4zqhxU")
	                .setOAuthAccessToken("1066794977638957056-wa2X2e9J02JJZJn0s9WH6x4IlbL7Ve")
	                .setOAuthAccessTokenSecret("lcG7zpEgLkVpd790xiohUIF9fP73g6RjVhilPK9riEW8J");
	        twitter = new TwitterFactory(cb.build()).getInstance();

	        Paging pagina = new Paging();

	        Status tweetEscrito = twitter.updateStatus(Mensaje);      

	    }

}

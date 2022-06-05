package org.spotify.extension.janiConnector.internal;


/**
 * This class represents an extension connection just as example (there is no real connection with anything here c:).
 */



public final class SpotifyConnection {

	static String host;
	static String key;
	public SpotifyConnection(String Host, String Key) {
		  
		  this.host=Host;
		  this.key=Key;

	  }
	  public static String getHost()
	  {
		return host; 
	  }
	  public static String getKey()
	  {
		  return key;
	  }


  public void invalidate() {
    // do something to invalidate this connection!
  }


public String getId() {
	// TODO Auto-generated method stub
	return null;
}
}

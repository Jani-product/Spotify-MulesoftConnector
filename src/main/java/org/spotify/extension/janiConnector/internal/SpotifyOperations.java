package org.spotify.extension.janiConnector.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class SpotifyOperations {

  /**
   * Example of an operation that uses the configuration and a connection instance to perform some action.
   */


  /**
   * Example of a simple operation that receives a string parameter and returns a new string message that will be set on the payload.
   */
  @MediaType(value = ANY, strict = false)
  
  public String FetchSongDetails(String SongName, String Type, @Connection SpotifyConnection connection)throws IOException, InterruptedException{
	  SongName = SongName.trim();
	  SongName= SongName.replaceAll("\\s", "%20");
              String keyData=SpotifyConnection.getKey();
              String hostData=SpotifyConnection.getHost();
              String finaldata=getSongDetails(SongName,Type,keyData,hostData);
    		   return finaldata;
  
  }
  
   private static String getSongDetails(String SongName, String Type, String KeyData, String hostData) throws IOException, InterruptedException
   {
	    HttpRequest request = HttpRequest.newBuilder()
	    		

	            .uri(URI.create("https://spotify23.p.rapidapi.com/search/?q="+SongName+"&type="+Type))
	            .header("X-RapidAPI-Host", hostData)
	            .header("X-RapidAPI-Key", KeyData)
	            .method("GET", HttpRequest.BodyPublishers.noBody())
	            .build();
	    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
	    System.out.println(response.body().toString());
	    return response.body().toString();
   }


}

### Spotify-MulesoftConnector
This is a Custom developed Mulesoft Connector which is used to fetch the song details from the Spotify in the Anypoint Studio

## Developed By : Mohammad.Jani
## Email: janiprogramming@gmail.com
Below is the proper documentation to get started with this connector 💝

#How to Use this Connector?
well,its Quite Simple

just clone this repo into a local folder
then open terminal in the same path and use this command

mvn clean install -DskipTests

if the build is success, then you can proceed with further steps, but if it is failure, the issue is with the maven in your local 

once the build is success, open your anypoint studio, make sure the maven is configured properly, default settings should work fine
  -create a new project
  -open pom.xml file in the project 
  -add the dependency in the dependencies like this

<dependency>
	<groupId>com.spotify.muleConnector</groupId>
	<artifactId>mulesoft-spotfy-connector</artifactId>
	<version>3.0.6	</version>
	<classifier>mule-plugin</classifier>
</dependency>






[![pomedited-xml.jpg](https://i.postimg.cc/3NbTSs1W/pomedited-xml.jpg)](https://postimg.cc/Fkc81n2Q)


# - if the connector is not showing up in the pallette it refresh the project or restart the studio

once the above steps are followed properly then we can see the connector in the pallete 

[![connector-Image.jpg](https://i.postimg.cc/JnX866gQ/connector-Image.jpg)](https://postimg.cc/qhpWgLpt)

How to use this connector :

Drag and Drop the connector into the flow
Double tap the connector
in the connector configuration : 
[![connectorconfiguration.jpg](https://i.postimg.cc/593PL5KY/connectorconfiguration.jpg)](https://postimg.cc/7b5Myzkw)
   
   make sure you have ✅ the connection as shown in the image then, 
   enter the host and key of yours
   
 To subscribe to your spotify API go to rapidapi and search for spotify and subscribe it for free
 link:  https://rapidapi.com/Glavier/api/spotify23/
 host and key are visible copy and paste them in the configuration
 
 then choose for the song you desire,
 you can either directly enter the song or pass it through queryparams, or uri params
 
 same with type 
 spotify api comes with few types like
  	-albums
	-artists
	-episodes
	-genres
	-playlists
	-podcasts
	-tracks
	-users
	
choose any of them, either directly or through query params

Thats, it .. its quite simple.. 

output payload is generated in the format of string
if you want to have the output payload in the format of json add a transform message/ payload and write the dwl as 

%dw 2.0
output application/json
---
read(payload,"application/json")
   
   Tools/Softwares To Develop this
   JDK version: 11
   Maven version: 3.6.3
   Eclipse ide for writing Java code/ prefer intellij idea if you are intersted with it, makes it more easy
   Anypoint Studio: 7.12
  
  Made with 💗
  reach out to me for any concerns/ issue working with the connector, 
  ⭐️ this Repo



### Spotify-MulesoftConnector
This is a Custom developed Mulesoft Connector which is used to fetch the song details from the Spotify in the Anypoint Studio

## Developed By : Mohammad.Jani
## Email: janiprogramming@gmail.com

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
   
   



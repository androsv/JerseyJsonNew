package com.freetipscentral;

import java.util.ArrayList;
import org.json.*;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/json")
public class HelloWorldRestService {
 
 @GET
 @Path("/get")
 @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_ATOM_XML})

 public ServerList getjson(){
	 
	 Server s1 = new Server();
	 Server s2 = new Server();
	 Server s3 = new Server();
	 Server s4 = new Server();
	 
	 s1.setServer("lvpma123");
	 s1.setEnv("E1");
	 s1.setStatus("InRotation");
	 s1.setIp("11.11.11.11");
	 
	 s2.setServer("lvpma456");
	 s2.setEnv("E2");
	 s2.setStatus("OutOfRotation");
	 s2.setIp("12.12.12.12");
	 
	 s3.setServer("lvpma678");
	 s3.setEnv("E1");
	 s3.setStatus("InRotation");
	 s3.setIp("13.13.13.13");
	 
	 s4.setServer("lvpma111");
	 s4.setEnv("E3");
	 s4.setStatus("InRotation");
	 s4.setIp("14.14.14.14");
		
		
		List <Server> listOfServer = new ArrayList<Server>();
		
		listOfServer.add(s1);
		listOfServer.add(s2);
		listOfServer.add(s3);
		listOfServer.add(s4);
		
		
		ServerList serverList = new ServerList();
		
		serverList.setServerList(listOfServer);
		
		return serverList;
		
		
		
	
		
		//String str = "{ hello: 'world', places: ['Africa', 'America', 'Asia', 'Australia'] }";
		
	
 
 }
 
 @GET
 @Path("/get2")
 @Produces(MediaType.TEXT_PLAIN)
 public String getInfo()
 {
	 return "hello";
 }

}
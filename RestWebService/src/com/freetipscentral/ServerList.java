package com.freetipscentral;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class ServerList {
	
	List<Server> serverList;
	
	public List<Server> getServerList()
	{
		return serverList;
	}
	
	public void setServerList(List<Server> serverList)
	{
		this.serverList = serverList;
	}
	
	

}

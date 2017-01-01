package com.freetipscentral;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class Server {
	
	String ip;
	
	String serverName;
	
	String env;
	
	String status;
	
	public Server()
	{
	
	}
	public void setEnv(String env)
	{
		this.env=env;
	}
	public void setStatus(String status)
	{
		this.status=status;
	
	}

	
	public void setServer(String server)
	{
		serverName = server;
	}
	
	public void setIp(String ip)
	{
		this.ip = ip;
	}
	
	public String getServer()
	{
		return serverName;
	}
	
	public String getIp()
	{
		return ip;
	}
	public String getEnv()
	{
		return env;
	}
	public String getStatus()
	{
		return status;
	}

}

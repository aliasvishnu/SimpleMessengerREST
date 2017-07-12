package org.sriram.javabrains.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sriram.javabrains.messenger.service.MessageService;
import org.sriram.javabrains.messenger.model.Message;
import javax.ws.rs.PathParam;

@Path("/messages")
public class MessageResource {
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String test(@PathParam("id") String id){
		return messageService.getMessage(Integer.parseInt(id)).getMessage();
//		return "Test";
	}
	
	
	
}

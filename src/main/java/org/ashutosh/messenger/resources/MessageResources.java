package org.ashutosh.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ashutosh.messenger.model.Message;
import org.ashutosh.messenger.services.MessageService;

@Path("/messages")
public class MessageResources {
	
	MessageService messageService = new MessageService();	

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage(){
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessage(@PathParam("messageId") long messageId){
		return messageService.getMessage(messageId);
		
	}
}

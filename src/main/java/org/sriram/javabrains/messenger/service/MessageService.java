package org.sriram.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.sriram.javabrains.messenger.database.DatabaseClass;
import org.sriram.javabrains.messenger.model.Message;
// This class is like a connector to the Database whereas Database class is the connector itself
public class MessageService {
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(1L, "Message 1", "Sriram"));
		messages.put(2L, new Message(2L, "Message 2", "Sriram 2"));
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
}

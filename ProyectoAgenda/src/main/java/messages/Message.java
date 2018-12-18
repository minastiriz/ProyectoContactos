package messages;

public class Message <T> {
	
	private MessageType message;
	private T object;
	
	public Message(MessageType message) {
		this.message = message;
	}
	
	public MessageType getMessage() {
		return message;
	}
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}

}

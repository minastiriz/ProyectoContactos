package messages;

/**
 * 
 * Son los mensajes utilizados en el centro de notificaciones. 
 * 
 * Se componen de un id en forma de enumeración y los datos propios del mensaje.
 * 
 * Si no se desea enviar ningún dato junto al mensaje, hacer el mensaje de tipo Object y
 * ponerle como dato null.
 * 
 * 
 * @author al341918
 * 
 * @see MessageType
 *
 * @param <T> Tipo de dato que se desea enviar con el mensaje.
 * 
 * @version 1.0
 * 
 */

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

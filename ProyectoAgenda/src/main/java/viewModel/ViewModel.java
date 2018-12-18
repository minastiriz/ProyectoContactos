package viewModel;

import java.util.Set;

import dataStructure.Contacto;
import messages.IObservable;
import messages.Message;

/**
 * 
 * Debe fingir ser el modelo que la vista desea.
 * 
 * NOTA: Cuando llama al modelo, el modelo no devuelve nada al instante, debe esperarse a que
 * el modelo prepare los datos solicitados o realice la operación solicitada. Sabes que los datos
 * están listos y la operación terminada cuando te llega el mensaje correspondiente.
 * 
 * @author al341918
 * 
 * @see Model
 * @see NotificationCenter
 * @see BasicViewModel
 * 
 * @version 0.1
 *
 */

public class ViewModel extends BasicViewModel{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Cada case es un tipo de mensaje que puede devolver el modelo.
	 * 
	 * Según el tipo de mensaje que devuelva el modelo, el view-model debe comportarse de una forma
	 * u otra.
	 * 
	 */
	@Override
	public <T> void notify(IObservable observable, Message<T> message) {
		switch (message.getMessage()){
		
		case ALL_CONTACTOS_GETTERS:
			@SuppressWarnings("unchecked") 
			Set<Contacto> object = (Set<Contacto>) message.getObject();
			finishAllContactos(object);
			break;
		case CONTACTO_GETTER:
			
			break;
		case CONTACTO_ADDED:
			
			break;
		case CONTACTO_REMOVED:
			
			break;
		case CONTACTO_UPDATED:
			
			break;
		case EMAIL_ADDED:
			
			break;
		case EMAIL_REMOVED:
			
			break;
		case EMAIL_UPDATED:
			
			break;
		case ALL_EMAIL_GETTERS:
			
			break;
		case EMAIL_OWNER_ID:
			
			break;
		case TELEFONO_ADDED:
			
			break;
		case TELEFONO_REMOVED:
			
			break;
		case TELEFONO_UPDATED:
			
			break;
		case ALL_TELEFONO_GETTERS:
			
			break;
		case TELEFONO_OWNER_ID:
			
			break;
		default:
			break;
			
		}
		
	}

	/**
	 * 
	 * Esta es la función que deberá activar la vista para pedir todos los contactos.
	 * 
	 * Llama al modelo y espera a que se le notifique que están listos los datos
	 * 
	 */
	@Override
	public void getAllContactos() {
		model.getAllContactos();
	}
	
	/**
	 * 
	 * Protocolo a seguir cuando el modelo devuelve el conjunto con los datos.
	 * 
	 * @param contactos conjunto de contactos en la aplicación.
	 */
	private void finishAllContactos(Set<Contacto> contactos) {
		//POR IMPLEMENTAR <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	}

}

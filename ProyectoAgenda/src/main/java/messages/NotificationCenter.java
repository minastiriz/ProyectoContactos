package messages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Se encarga de la gestión del patrón observer.
 * 
 * Observadores se suscriben a objetos observables, y éstos notifican a traves del centro de
 * notificaciones cuando se producen eventos relevantes.
 * 
 * En esta implementación, los datos se pueden pasar a través de los mensajes de las notificaciones y
 * la id de los mensajes viene determinada por la enumeración MessageType.
 * 
 * @author al341918
 * 
 * @see IObservable
 * @see IObservers
 * @see Message
 * 
 * @version 1.0
 *
 */

public class NotificationCenter {
	
	//Static body
	
	private static NotificationCenter nc;
	
	public static NotificationCenter getInstance() {
		if (nc == null)
			nc = new NotificationCenter();
		return nc;
	}
	 
	//Instance body
	
	private Map<IObservable, List <IObservers>> costumers;
	
	public NotificationCenter() {
		costumers = new HashMap<IObservable, List <IObservers>>();
	}
	
	public boolean subscribe(IObservable observable, IObservers observer) {
		List <IObservers> observers = costumers.get(observable);
		if (observers == null) {
			observers = new ArrayList<IObservers>();
			costumers.put(observable, observers);
		}
		return observers.add(observer);
	}
	
	public boolean unsubscribe(IObservable observable, IObservers observer) {
		List <IObservers> observers = costumers.get(observable);
		if (observers == null)
			return false;
		return observers.remove(observer);
	}
	
	public <T> boolean notify(IObservable observable, Message<T> message) {
		List <IObservers> observers = costumers.get(observable);
		if (observers == null)
			return false;
		for (IObservers observer:observers) {
			observer.notify(observable, message);
		}
		return true;
	}

}

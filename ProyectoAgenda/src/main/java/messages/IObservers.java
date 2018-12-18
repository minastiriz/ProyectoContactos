package messages;

public interface IObservers {
	
	public <T> void notify(IObservable observable, Message<T> message);

}

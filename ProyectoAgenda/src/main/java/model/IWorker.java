package model;

import messages.MessageType;

public interface IWorker <T> {
	
	public T doTask();
	public MessageType getTypeOfWork();

}

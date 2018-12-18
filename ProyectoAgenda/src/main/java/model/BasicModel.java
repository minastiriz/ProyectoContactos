package model;

import java.util.ArrayList;
import java.util.List;

import abstractFeatures.IBasicModel;
import abstractFeatures.IComponent;
import abstractFeatures.IModelFunctionality;
import configuration.IConfigureDao;
import dao.DaoContacto;
import dao.DaoEmail;
import dao.DaoTelefono;
import messages.IObservable;
import messages.Message;
import messages.NotificationCenter;

public abstract class BasicModel implements IBasicModel, IModelFunctionality, IObservable{
	
	protected DaoContacto daoContacto;
	protected DaoEmail daoEmail;
	protected DaoTelefono daoTelefono;
	
	protected List<IComponent> components = new ArrayList<IComponent>();
	
	protected void configureDao(IConfigureDao config) {
		
		daoContacto = config.getDaoContacto();
		components.add(daoContacto);
		
		daoEmail = config.getDaoEmail();
		components.add(daoEmail);
		
		daoTelefono = config.getDaoTelefono();
		components.add(daoTelefono);
	}
	
	protected <T> void notify(Message<T> msg) {
		NotificationCenter nc = NotificationCenter.getInstance();
		nc.notify(this, msg);
	}
	
	protected <V> void sendMessage(Message<V> msg) {
		notify(msg);
	}
	
	@Override
	public void close() {
		for (IComponent component: components) {
			component.close();
		}
		
	}
	
	protected <V> void doWork(IWorker<V> worker) {
		Thread th = new Thread() {
			@Override
			public void run() {
				V data = worker.doTask();
				Message<V> msg = new Message<V>(worker.getTypeOfWork());
				msg.setObject(data);
				sendMessage(msg);			
			}
			
		};
		th.start();
	}

}

package model;

import java.util.Set;

import configuration.IConfigureDao;
import dataStructure.Contacto;
import dataStructure.Email;
import dataStructure.Telefono;
import messages.MessageType;

/**
 * 
 * Implementación del modelo básico haciendo uso de hebras. 
 * 
 * Extiende el modelo básico y se apoya en él para la comunicación 
 * con el centro de notificaciones y para la creación de las hebras.
 * 
 * @author al341918
 * 
 * @see BasicModel
 * @see IWorker
 * 
 * @version 1.0
 * 
 */

public class Model extends BasicModel{
	
	public Model (IConfigureDao config) {
		super.configureDao(config);
	}

	@Override
	public void getAllContactos() {
		super.doWork(new IWorker<Set<Contacto>>() {

			@Override
			public Set<Contacto> doTask() {
				return daoContacto.getAllContactos();
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.ALL_CONTACTOS_GETTERS;
			}
		});
	}

	@Override
	public void getContacto(int id) {
		super.doWork(new IWorker<Contacto>() {

			@Override
			public Contacto doTask() {
				// TODO Auto-generated method stub
				return daoContacto.getContacto(id);
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.CONTACTO_GETTER;
			}
		});
		
	}

	@Override
	public void addContacto(Contacto contacto) {
		super.doWork(new IWorker<Object>() {

			@Override
			public Object doTask() {
				daoContacto.add(contacto);
				return null;
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.CONTACTO_ADDED;
			}
		});
	}

	@Override
	public void removeContacto(Contacto contacto) {
		super.doWork(new IWorker<Object>() {

			@Override
			public Object doTask() {
				daoContacto.remove(contacto);
				return null;
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.CONTACTO_REMOVED;
			}
		});
	}

	@Override
	public void updateContacto(Contacto contacto) {
		super.doWork(new IWorker<Object>() {

			@Override
			public Object doTask() {
				daoContacto.update(contacto);
				return null;
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.CONTACTO_UPDATED;
			}
		});
	}

	@Override
	public void getAllEmails() {
		super.doWork(new IWorker<Set<Email>>() {

			@Override
			public Set<Email> doTask() {
				// TODO Auto-generated method stub
				return daoEmail.getAllEmails();
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.ALL_EMAIL_GETTERS;
			}
		});
	}

	@Override
	public void getIdOfOwnerEmail(String nombre) {
		super.doWork(new IWorker<Integer>() {

			@Override
			public Integer doTask() {
				// TODO Auto-generated method stub
				return daoEmail.getIdOfOwner(nombre);
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.EMAIL_OWNER_ID;
			}
		});
	}

	@Override
	public void addEmail(Email email) {
		super.doWork(new IWorker<Object>() {

			@Override
			public Object doTask() {
				daoEmail.add(email);
				return null;
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.EMAIL_ADDED;
			}
		});
	}

	@Override
	public void removeEmail(Email email) {
		super.doWork(new IWorker<Object>() {

			@Override
			public Object doTask() {
				// TODO Auto-generated method stub
				daoEmail.remove(email);
				return null;
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.EMAIL_REMOVED;
			}
		});
	}

	@Override
	public void updateEmail(Email email) {
		super.doWork(new IWorker<Object>() {

			@Override
			public Object doTask() {
				// TODO Auto-generated method stub
				daoEmail.update(email);
				return null;
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.EMAIL_UPDATED;
			}
		});
	}

	@Override
	public void getAllTelefonos() {
		super.doWork(new IWorker<Set<Telefono>>() {

			@Override
			public Set<Telefono> doTask() {
				// TODO Auto-generated method stub
				return daoTelefono.getAllTelefonos();
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.ALL_TELEFONO_GETTERS;
			}
		});
	}

	@Override
	public void getIdOfOwnerTelefono(int telefono) {
		super.doWork(new IWorker<Integer>() {

			@Override
			public Integer doTask() {
				// TODO Auto-generated method stub
				return daoTelefono.getIdOfOwner(telefono);
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.TELEFONO_OWNER_ID;
			}
		});
	}

	@Override
	public void addTelefono(Telefono telefono) {
		super.doWork(new IWorker<Object>() {

			@Override
			public Object doTask() {
				// TODO Auto-generated method stub
				daoTelefono.add(telefono);
				return null;
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.TELEFONO_ADDED;
			}
		});
	}

	@Override
	public void removeTelefono(Telefono telefono) {
		super.doWork(new IWorker<Object>() {

			@Override
			public Object doTask() {
				// TODO Auto-generated method stub
				daoTelefono.remove(telefono);
				return null;
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.TELEFONO_REMOVED;
			}
		});
	}

	@Override
	public void updateTelefono(Telefono telefono) {
		super.doWork(new IWorker<Object>() {

			@Override
			public Object doTask() {
				// TODO Auto-generated method stub
				daoTelefono.update(telefono);
				return null;
			}

			@Override
			public MessageType getTypeOfWork() {
				// TODO Auto-generated method stub
				return MessageType.TELEFONO_UPDATED;
			}
		});
	}

}

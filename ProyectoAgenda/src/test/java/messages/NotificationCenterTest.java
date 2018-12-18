package messages;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Before;
import org.junit.Test;

public class NotificationCenterTest implements IObservable, IObservers{
	
	private NotificationCenter nc;
	
	private AtomicBoolean ab;
	
	@Before
	public void setUp() {
		nc = new NotificationCenter();
		ab = new AtomicBoolean(false);
	}

	@Test
	public void testSubscribe_normal_ok() {
		nc.subscribe(this, this);
	}

	@Test
	public void testUnsubscribe_normal_ok() {
		nc.subscribe(this, this);
		nc.unsubscribe(this, this);
	}

	@Test
	public void testNotifyIObservableMessageOfT() throws InterruptedException {
		nc.subscribe(this, this);
		Message<Object> message = new Message<Object>(MessageType.ALL_CONTACTOS_GETTERS);
		nc.notify(this, message);
		Thread.sleep(200);
		assertTrue(ab.get());
	}

	@Override
	public <T> void notify(IObservable observable, Message<T> message) {
		ab.set(true);
		
	}

}

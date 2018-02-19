package helldragger;

import java.util.HashSet;
import java.util.Set;

public interface Notifier {
	Set<Listener> listeners = new HashSet<>();
	
	void add_listener(Listener l);
	void notify_listeners();
	void remove_listener(Listener l);
	
}

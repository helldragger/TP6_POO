package helldragger.Model;

import helldragger.Listener;
import helldragger.Notifier;


public class Model implements Notifier{
	
	State state;
	
	public Model(){
		state = State.RED;
	}
	
	public void next(){
		switch(this.state) {
			case RED:
				this.state = State.GREEN;
				break;
			case GREEN:
				this.state = State.ORANGE;
				break;
			case ORANGE:
				this.state = State.RED;
				break;
		}
		notify_listeners();
	}
	
	public State get_state(){
		return this.state;
	}
	
	@Override
	public void add_listener(final Listener l) {
		this.listeners.add(l);
	}
	
	@Override
	public void notify_listeners() {
		for (Listener l : listeners)
			l.update(this);
	}
	
	@Override
	public void remove_listener(final Listener l) {
		this.listeners.remove(l);
	}
	
	@Override
	public String toString() {
		return "Model state: "+this.state;
	}
}

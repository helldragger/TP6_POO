package helldragger.Controller;

import helldragger.Model.Model;

public class Controller {

	Model m;
	
	public Controller(Model m){
		this.m = m;
	}
	
	public void next_colour(){
		m.next();
	}
	
}

package helldragger;

import helldragger.Controller.Controller;
import helldragger.Model.Model;
import helldragger.View.View;
import helldragger.View.ViewGUI;

public class Main {

	private static void print(Object o){
		System.out.println(o.toString());
	}
	
    public static void main(String[] args) {
		Model m = new Model();
		print(m);
		m.next();
		print(m);
		Controller c = new Controller(m);
		print(m);
		print(c);
		c.next_colour();
		print(m);
		View v = new View(m);
		ViewGUI vgui = new ViewGUI(v);
    }
}

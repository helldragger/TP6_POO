package helldragger.View;

import helldragger.Listener;
import helldragger.Model.Model;
import helldragger.Notifier;

import javax.swing.*;
import java.awt.*;

import static java.lang.Math.min;


public class View extends JPanel implements Listener {
	Model m;
	int radius = 5;
	
	public View(Model m){
		this.m = m;
		m.add_listener(this);
		setPreferredSize(new Dimension(radius, radius * 3));
	}
	
	View(){
		this(new Model());
	}
	
	@Override
	public void paintComponent(final Graphics g) {
		super.paintComponent(g);
		radius = min(this.getHeight()/3, this.getWidth());
		g.setColor(Color.gray);
		g.drawOval(0,0*radius,radius, radius);
		g.drawOval(0,1*radius,radius, radius);
		g.drawOval(0,2*radius,radius, radius);
		
		switch(m.get_state()){
			case RED:
				g.setColor(Color.red);
				g.fillOval(0,0*radius,radius,radius);
				break;
			case ORANGE:
				g.setColor(Color.orange);
				g.fillOval(0,1*radius,radius,radius);
				break;
			case GREEN:
				g.setColor(Color.green);
				g.fillOval(0,2*radius,radius,radius);
				break;
		}
		
		
	}
	
	@Override
	public void update(final Notifier n) {
		this.m = (Model) n;
		this.updateUI();
	}
}

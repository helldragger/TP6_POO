package helldragger.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewGUI extends JFrame {
	
	public ViewGUI(View v){
		BorderLayout bl = new BorderLayout();
		
		JPanel pan = new JPanel();
		pan.setLayout(bl);
		
		JButton button = new JButton("next");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				v.m.next();
				System.out.println("New state: "+v.m.get_state());
			}
		});
		
		pan.add(v,BorderLayout.CENTER);
		pan.add(button, BorderLayout.SOUTH);
		
		this.setContentPane(pan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}

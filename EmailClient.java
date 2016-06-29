package mailClient;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;



@SuppressWarnings("serial")
public class EmailClient extends JFrame  implements KeyListener, ActionListener{
	
	EmailClient() {		
		this.setSize(1250, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(this);		
		
		this.addKeyListener(this);
	}

	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char letter = e.getKeyChar();
		
		
		System.out.println(letter);
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

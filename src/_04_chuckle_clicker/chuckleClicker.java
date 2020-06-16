package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {

	public void main(String[] args) {
		// TODO Auto-generated method stub
makeButtons();
	}
	public void makeButtons() {
		JFrame f= new JFrame();
		JPanel p = new JPanel();
		JButton punchline = new JButton();
		JButton joke = new JButton();
		punchline.setText("punchline");
		joke.setText("joke");
		punchline.addActionListener(this);
		joke.addActionListener(this);
		p.add(joke);
		p.add(punchline);
		f.add(p);
		f.setVisible(true);
		f.pack();
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

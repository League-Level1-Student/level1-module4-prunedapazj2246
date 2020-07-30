package _11_whack_a_mole;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackAMole {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	Random r = new Random();
	int buttonNumber;
	public void run() {
		drawButtons(buttonNumber =r.nextInt(23));
		
	}
	public void drawButtons(int num) {
		int mole = num;
		for(int i=0; i<23; i++) {
			if(mole == i) {
				 JButton m = new JButton();
				 m.setText("Mole!");
				p.add(m);
			}else {
			p.add(new JButton());
			}
		}
		
		f.add(p);
		f.setVisible(true);
		f.setTitle("Whack A MOLE!!");
		f.setSize(150, 250);
	}
}

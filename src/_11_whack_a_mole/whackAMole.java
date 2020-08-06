package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackAMole implements MouseListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	Random r = new Random();
	int molesWhacked =0;
	Date startTime;
	int timesMissed = 0;
	JButton m = new JButton();
	public void run() {
		drawButtons(r.nextInt(24));
		startTime = new Date();
	}
	public void drawButtons(int num) {
		f=new JFrame();
	    p=new JPanel();
		int mole = num;
		for(int i=0; i<24; i++) {
			JButton a= new JButton();
			a.setPreferredSize(new Dimension(75,35));
			a.addMouseListener(this);
			p.add(a);
			if(mole == i) {
				 a.setText("Mole!");
				m=a;
			}
		}
		
		f.add(p);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setTitle("Whack A MOLE!!");
		f.setSize(250, 350);
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()== m) {
			molesWhacked++;
			//playSound();
				if(molesWhacked==10) {
				endGame(startTime,molesWhacked);
					//System.out.println(molesWhacked);
				}
			
		}else {
			timesMissed++;
			if(timesMissed ==1 ) {
				System.out.println("Miss!!");
			}else if(timesMissed == 2) {
				System.out.println("You can do better than that!!");
			}else if(timesMissed == 3) {
				System.out.println("Even mmy mom and dad are better than you!!");
			}else if(timesMissed == 4) {
				System.out.println("LAST SHOT!!");
			}else {
				System.out.println("You Lost!!");
				endGame(startTime,molesWhacked);
			}
		}
		f.dispose();
		drawButtons(r.nextInt(24));
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	private void playSound(String fileName) { 
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	}
}

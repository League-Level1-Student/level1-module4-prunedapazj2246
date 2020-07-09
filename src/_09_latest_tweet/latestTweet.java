package _09_latest_tweet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class latestTweet implements MouseListener {
	JFrame f = new JFrame();
			JPanel p = new JPanel();
			JTextField jtf = new JTextField(10);
			JButton tweet = new JButton();
public void run() {
	tweet.setText("Search the Twitterverse");
tweet.addMouseListener(this);
p.add(jtf);
p.add(tweet);
f.add(p);
f.setVisible(true);
f.setTitle("The Amazing Tweet Retriever");
f.pack();

}
@Override
public void mouseClicked(MouseEvent e) {
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
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}

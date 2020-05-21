package _01_nasty_surprise;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements MouseListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel(); 
public void buildGoey() {

	l1.setText("Trick");
	l2.setText("Treat");
	b1.addMouseListener(this);
	b2.addMouseListener(this);
	b1.add(l1);
	b2.add(l2);
	p.add(b1);
	p.add(b2);
	f.add(p);
	f.pack();
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
}

@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	if() {
showPictureFromTheInternet("https://static-23.sinclairstoryline.com/resources/media/d60d4f1c-9fcc-4ae4-8058-05e885080e19-large16x9_momo2.PNG?1551379953599");
	}
	else {
	showPictureFromTheInternet("https://groomarts.com/assets/images/_listItem/cute-puppy-1.jpg");
	}
	}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
}





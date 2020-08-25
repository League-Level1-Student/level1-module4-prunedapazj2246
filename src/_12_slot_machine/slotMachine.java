package _12_slot_machine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotMachine implements MouseListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton spin = new JButton();
	Random r = new Random();
	Random r2 = new Random();
	Random r3 = new Random();
	JLabel s1 = new JLabel();
	JLabel s2= new JLabel();
	JLabel s3 = new JLabel();
	int wins = 0;
public void run() {
	spin.addMouseListener(this);
	spin.setLabel("Spin");
	p.add(spin);
	try {
		
		s1 = createLabelImage("strawberry.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		s2 =createLabelImage("cherry.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		s3 =createLabelImage("banana.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	f.add(p);
	f.setTitle("Slot Machine");
	f.setVisible(true);
	f.pack();
	
}
public void drawImages() {
	f = new JFrame();
	p = new JPanel();
			spin =new JButton();
			spin.setText("Spin");
			spin.addMouseListener(this);
			p.add(spin);
			p.add(s1);
			p.add(s2);
			p.add(s3);
			f.add(p);
			f.setVisible(true);
			f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
			f.setTitle("Slot Machine");
			f.pack();
	
}


private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
imageLabel.setSize(500, 500);
p.add(imageLabel);
return imageLabel;
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
	int s = r.nextInt(3);
	int slot = r2.nextInt(3);
	int casino = r3.nextInt(3);
	System.out.println(s);
	System.out.println(slot);
	System.out.println(casino);
	if(s==0) {
		try {
			s1 =createLabelImage("strawberry.png");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}else if(s==1) {
		try {
			s1= createLabelImage("banana.png");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}else if(s==2){
			try {
				s1 =createLabelImage("cherry.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
			if(slot==0) {
				try {
					s2=createLabelImage("strawberry.png");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(slot==1) {
				try{
					s2=createLabelImage("banana.png");
				}catch(MalformedURLException e1) {
					e1.printStackTrace();
				}
			}
			else if(slot==2){
				try {
					s2=createLabelImage("cherry.png");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(casino==0) {
				try {
					s3=createLabelImage("strawberry.png");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(casino==1) {
				try {
					s3=createLabelImage("banana.png");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(casino == 2){
				try {
					s3=createLabelImage("cherry.png");
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			f.dispose();
			drawImages();
		if(s==slot&&slot==casino) {
			JOptionPane.showMessageDialog(null,"YOU WIN!!");
			wins+=1;
			if(wins==1) {
				JOptionPane.showMessageDialog(null,"You have "+ wins +" win.");
				
			}else {
				JOptionPane.showMessageDialog(null,"You have " + wins + " wins.");
			}
		}
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}

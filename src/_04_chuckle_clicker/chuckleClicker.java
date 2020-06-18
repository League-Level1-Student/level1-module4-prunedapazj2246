package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {
	JFrame f= new JFrame();
	JPanel p = new JPanel();
	JButton punchline = new JButton();
	JButton joke = new JButton();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chuckleClicker chcl = new chuckleClicker();
		chcl.makeButtons();
	}
	public void makeButtons() {
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
		JOptionPane.showMessageDialog(null, "hi");
		if(e.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "I invented a new word!!");
		}else {
			JOptionPane.showMessageDialog(null, "Plagiarism");
		}
	}

}

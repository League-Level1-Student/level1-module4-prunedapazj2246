package _06_book_of_illusions;

import java.awt.Image;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	JFrame f = new JFrame();// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JLabel ball;
	public void run() {
		f.setVisible(true);// 2. make the frame visible
		f.setSize(500, 500);// 3. set the size of the frame
		// 4. find 2 images and save them to your project’s default package
		String soccerBall ="soccerBall.jpeg";// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"// 6. create a variable of type "JLabel" but don’t initialize it yet
		ball=loadImageFromComputer(soccerBall);// 7. use the "loadImage..." methods below to initialize your JLabel
		f.add(ball);// 8. add your JLabel to the frame
		f.pack();// 9. call the pack() method on the frame
		f.addMouseListener(this);// 10. add a mouse listener to your frame (hint: use *this*)
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("clicked!");// 11. Print "clicked!" to the console when the mouse is pressed
		f.remove(ball); // 12. remove everything from the frame that was added earlier
		String cake = "cake.jpeg";// 13. load a new image like before (this is more than one line of code)
		JLabel c;
		c =loadImageFromComputer(cake);
		f.add(c);
		f.pack();// 14. pack the frame
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}



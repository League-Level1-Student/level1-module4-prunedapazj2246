package _08_calculator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
JFrame f = new JFrame();
JPanel p = new JPanel();
JButton add = new JButton();
JButton subtract = new JButton();
JButton multiply = new JButton();
JButton divide = new JButton();
JTextField jtf = new JTextField(10);
JTextField jtf2 = new JTextField(10);
JLabel answer = new JLabel();
	public void run(){
		// TODO Auto-generated method stub
		add.setText("add");
		subtract.setText("subtract");
		multiply.setText("multiply");
		divide.setText("divide");
add.addMouseListener(this);
subtract.addMouseListener(this);
multiply.addMouseListener(this);
divide.addMouseListener(this);
p.add(add);
p.add(subtract);
p.add(multiply);
p.add(divide);
p.add(jtf);
p.add(jtf2);
p.add(answer);
f.add(p);
f.setVisible(true);
f.setTitle("Simple Calculator");
f.pack();


	}
	double add(double num, double num2) {
		num+=num2;
		return num;
		
	}
	double subtract( double num, double num2) {
		num-=num2;
		return num;
	}
	double multiply(double num, double num2) {
		num*=num2;
		return num;
		
	}
	double divide(double num, double num2) {
		num/=num2;
		return num;
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
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		double result= 0.0;
		double number1 = Double.parseDouble(jtf.getText());
		double number2 = Double.parseDouble(jtf2.getText());
		if(arg0.getSource()== add) {
			result = add(number1,number2);
		}else if(arg0.getSource()==subtract) {
			result = subtract(number1,number2);
		}else if (arg0.getSource()== multiply) {
			result = multiply(number1,number2);
		}else {
			result = divide(number1,number2);
		}
		
		answer.setText(String.valueOf(result));
		f.pack();
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}

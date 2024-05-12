import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Calci extends JFrame implements ActionListener{

	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton add,sub,mul,div,mod,xor,clear;

	public Calci(){
		l1 = new JLabel("Enter num1 : ");
		t1 = new JTextField(10);
		l2 = new JLabel("Enter num2 : ");
		t2 = new JTextField(10);
		l3 = new JLabel("Result : ");
		t3 = new JTextField(10);
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		mod = new JButton("%");
		xor = new JButton("^");
		clear = new JButton("CLEAR");

		setLayout(new FlowLayout());

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(xor);
		add(clear);

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		xor.addActionListener(this);
		clear.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae){

		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());

		switch (ae.getActionCommand()) {
			
			case "+":
				t3.setText((num1 + num2)+"");
				break;
			case "-":
				t3.setText((num1 - num2)+"");
				break;
			case "*":
				t3.setText((num1 * num2)+"");
				break;
			case "/":
				t3.setText((num1 / num2)+"");
				break;
			case "%":
				t3.setText((num1 % num2)+"");
				break;
			case "^":
				t3.setText((num1 ^ num2)+"");
				break;
		}
		if(ae.getSource() == clear){

			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}
public class SimpleCalculator{
	public static void main(String[] args) {

		Calci cal = new Calci();
		cal.setSize(700,600);
		cal.setVisible(true);
		cal.setTitle("Simple Calculator.");
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
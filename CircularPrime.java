import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

class CircPrime extends JFrame implements ActionListener{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;

	public CircPrime(){

		l1 = new JLabel("Enter Number : ");
		t1 = new JTextField(20);
		l2 = new JLabel("Is Circular Prime ? ");
		t2 = new JTextField(7);
		b1 = new JButton("SUBMIT");
		b2 = new JButton("CLEAR");

		setLayout(new FlowLayout());

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae){

		int num = Integer.parseInt(t1.getText());

		if(ae.getSource() == b1){

			if(isCircularPrime(num)){

				t2.setText("true");

			}else{
				t2.setText("false");
			}
		}else{
			t1.setText("");
			t2.setText("");
		}
	}

	public static boolean isCircularPrime(int num){
		int a = num;
		do{
			if(!isPrime(a))return false;

			a = circulate(a);
		}while(a != num);

		return true;
	}
	public static boolean isPrime(int a){
		if(a <= 1 )return false;

		for(int i = 2;i<=Math.sqrt(a);++i){
			if(a%i==0)return false;
		}
		return true;
	}
	public static int circulate(int a){
		String str = Integer.toString(a);
		String circ = str.substring(1)+str.charAt(0);

		return Integer.parseInt(circ);
	}
}
public class CircularPrime{
	public static void main(String[] args) {

		CircPrime cp = new CircPrime();
		cp.setSize(500,500);
		cp.setVisible(true);
		cp.setTitle("Circular Prime");
	}
}
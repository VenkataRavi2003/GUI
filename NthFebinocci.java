import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
class Febinocci extends JFrame implements ActionListener{
	JLabel l1,l2;
	JButton b1,b2;
	JTextField t1,t2;

	Febinocci(){
		l1=new JLabel("Enter N : ");
		t1=new JTextField(10);
		l2=new JLabel("Nth Febinocci : ");
		t2=new JTextField(10);
		b1=new JButton("SUBMIT");
		b2=new JButton("RESET");

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
		int n=Integer.parseInt(t1.getText());

		int res=findNthFebinocci(n);

		if(ae.getSource()==b1){
			t2.setText(res+"");
		}else{
			t1.setText("");
			t2.setText("");
		}
	}
	public static int findNthFebinocci(int n){
		if(n<=1)return n;

		return findNthFebinocci(n-1)+findNthFebinocci(n-2);
	}
}
public class NthFebinocci{
	public static void main(String[] args) {

		Febinocci f = new Febinocci();
		f.setSize(500,500);
		f.setVisible(true);
	}
}
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;

class Primes extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3;
	JButton b1,b2;
	JTextField t1,t2,t3;
	
	public Primes(){
		
		l1 = new JLabel("Start ");
		t1 = new JTextField(10);
		l2 =new JLabel("End ");
		t2=new JTextField(10);
		l3=new JLabel("Primes Are ");
		t3=new JTextField(50);
		
		b1=new JButton("SUBMIT");
		b2=new JButton("RESET");
		
		setLayout(new FlowLayout());
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == b1){
			int start=Integer.parseInt(t1.getText());
			int end=Integer.parseInt(t2.getText());
			
			StringBuffer sb=new StringBuffer("");
			
			for(int i=start;i<=end;++i){
				if(isPrime(i)){
					sb.append(i+",");
				}
			}
			t3.setText(sb.toString());
			
		}else{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
	public static boolean isPrime(int num){
		if(num<=1){
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);++i){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
class PrimeNumbers{
	public static void main(String args[]){
		Primes pm = new Primes();
		pm.setSize(500,500);
		pm.setVisible(true);
		pm.setTitle("Prime-Numbers");
	}
}
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
class Palindromes extends JFrame implements ActionListener{

	JLabel l1,l2;
	JButton b1,b2;
	JTextField t1;
	JTextArea ta1;

	public Palindromes(){

		l1=new JLabel("Enter N : ");
		t1=new JTextField(10);
		l2=new JLabel("Palindromes : ");
		ta1=new JTextArea();
		b1=new JButton("SUBMIT");
		b2=new JButton("RESET");

		setLayout(new FlowLayout());

		add(l1);
		add(t1);
		add(l2);
		add(ta1);
		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae){

		int n = Integer.parseInt(t1.getText());
		StringBuilder sb = new StringBuilder("");
		if(ae.getSource() == b1){
		for(int i = 1; i<=n;++i){
			if(isPalindrome(i)){
				sb.append(i).append(",");
			}
		}
		   ta1.setText(sb.toString());
		}else{
			t1.setText("");
			ta1.setText("");
		}
	}
	public static boolean isPalindrome(int num){
		int temp = num;

		int rev=0;
		while(temp!=0){
			int rem=temp%10;
			rev = (rev*10)+rem;
			temp/=10;
		}

		return rev == num;
	}
}
public class PalindromesUptoN{
	public static void main(String[] args) {
		 
		 Palindromes p =new Palindromes();
		 p.setSize(500,500);
		 p.setVisible(true);
		 p.setTitle("Palindromes Upto N");
	}
}
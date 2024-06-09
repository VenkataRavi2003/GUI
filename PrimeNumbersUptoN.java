import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class PrimeNumbersUptoN extends JFrame{

	JLabel l1,l2,l3;
	JTextField t1,t3;
	JTextArea t2;
	JButton b1,b2;
	JScrollPane scrollPane;

	public PrimeNumbersUptoN(){

		l1 = new JLabel("Enter N : ");
		t1 = new JTextField(10);
		l2 = new JLabel("Prime Numbers : ");
		t2 = new JTextArea(10,30);
		scrollPane = new JScrollPane(t2);
		l3 = new JLabel("No.of primes : ");
		t3 = new JTextField(10);
		b1 = new JButton("SUBMIT");
		b2 = new JButton("CLEAR");

		setLayout(new FlowLayout());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(l1);add(t1);add(l2);add(scrollPane);add(l3);add(t3);add(b1);add(b2);

		b1.addActionListener(new ActionListener(){
			                  public void actionPerformed(ActionEvent ae){

			                  	if(ae.getSource() ==  b1){

			                  		try{

			                  			int n = Integer.parseInt(t1.getText());
			                  			StringBuilder sb = new StringBuilder();
			                  			int count = 0 ;

			                  			for (int i = 2 ; i<=n ; ++i) {
			                  				
			                  				if(isPrime(i)){

			                  					sb.append(i).append(", ");
			                  					++count;
			                  				}
			                  			}

			                  			t2.setText(sb.toString());
			                  			t3.setText(count+"");
			                  		}catch (NumberFormatException e) {
			                  			t2.setText("Please enter a valid integer!!");
			                  		}
			                  	}
			                  }
		                     });

		b2.addActionListener(new ActionListener(){

			                  public void actionPerformed(ActionEvent ae){

			                  	if(ae.getSource() == b2){
			                  		t1.setText("");
			                  		t2.setText("");
			                  		t3.setText("");
			                  	}
			                  }
		                   });




	}
	public static boolean isPrime(int num){

		if(num < 2){
			return false;
		}

		for(int i = 2; i <= Math.sqrt(num);++i){

			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		PrimeNumbersUptoN p = new PrimeNumbersUptoN();
		p.setSize(500,500);
		p.setVisible(true);
		p.setTitle("Prime Numbers.");
	}
}

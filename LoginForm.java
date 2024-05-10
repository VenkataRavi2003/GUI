import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
class Login extends JFrame implements ActionListener{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	
	public Login(){
		l1=new JLabel("Username");
		t1=new JTextField(20);
		l2=new JLabel("Password");
		t2=new JPasswordField(20);
		b1=new JButton("LOGIN");
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
		String uname = t1.getText();
		String pswd = t2.getText();
		
		if(ae.getSource() == b1){
			
			if(uname.equals("Ravi") && pswd.equals("0000")){
				new LoginSuccess();
			}else{
				new LoginFailure();
			}
			
		}else{
			t1.setText("");
			t2.setText("");
		}
	}
}
class LoginSuccess extends JFrame{
	JLabel l1;
	public LoginSuccess(){
		l1=new JLabel("Login Successful :)");
		
		setLayout(new FlowLayout());
		add(l1);
		
		setSize(500,500);
		setVisible(true);
	}
}
class LoginFailure extends JFrame{
	JLabel l1;
	public LoginFailure(){
		l1=new JLabel("Login Failed ):");
		
		setLayout(new FlowLayout());
		add(l1);
		
		setSize(500,500);
		setVisible(true);
	}
}
class LoginForm{
	public static void main(String ars[]){
		Login l=new Login();
		l.setSize(500,500);
		l.setVisible(true);
		l.setTitle("Login Form :)");
	}
}
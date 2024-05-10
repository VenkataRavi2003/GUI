import java.awt.Frame;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
class Colors extends Frame implements ActionListener{
	Button red,green,blue,orange,yellow;
	public Colors(){
		red = new Button("RED");
		green  =new Button("GREEN");
		blue =new Button("BLUE");
		orange =new Button("ORANGE");
		yellow =new Button("YELLOW");
		
		setLayout(new FlowLayout());
		
		add(red);
		add(green);
		add(blue);
		add(orange);
		add(yellow);
		
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		orange.addActionListener(this);
		yellow.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == red){
			setBackground(Color.red);
		}
		if(ae.getSource() == green){
			setBackground(Color.green);
		}
		if(ae.getSource()==blue){
			setBackground(Color.blue);
			
		}
		if(ae.getSource()==orange){
			setBackground(Color.orange);
		}
		if(ae.getSource()==yellow){
			setBackground(Color.yellow);
		}
	}
}
class GeneratingRandomColors{
	public static void main(String args[]){
		Colors c =new Colors();
		c.setSize(500,500);
		c.setVisible(true);
	}
}
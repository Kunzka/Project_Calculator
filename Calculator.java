import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener{
	
	
	JButton add, sub, div, mul, roo, squ, sin, cos, pow, asin, acos, nrt, change, close;
	JTextField tf1, tf2, tf1_exp, tf2_exp;
	JTextArea tf_instr;
	JLabel label;
	JPanel panel;
	Font font_A_B = new Font("Arial Black", Font.BOLD, 15);
	Font font_A_B_2 = new Font("Arial Black", Font.PLAIN, 40);
	int mode;

	
	public Calculator(){

		Dimension monitor = Toolkit.getDefaultToolkit().getScreenSize();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		
		
		mode = 1;
		
		panel = new JPanel();
		label = new JLabel();
		
		
		add = new JButton("Addition");
		sub = new JButton("Subtraction");
		div = new JButton("Division");
		mul = new JButton("Multiplication");
		squ = new JButton("Square");
		roo = new JButton("Square root");
		sin = new JButton("Sine");
		cos = new JButton("Cosine");
		pow = new JButton("Power");
		asin = new JButton("Arcsine");
		acos = new JButton("Arccosine");
		nrt = new JButton("'n'-th root");
		close = new JButton("End program");
		
		change = new JButton("Invert");
		
		
		add.setFont(font_A_B);
		sub.setFont(font_A_B);
		div.setFont(font_A_B);
		mul.setFont(font_A_B);
		squ.setFont(font_A_B);
		roo.setFont(font_A_B);
		sin.setFont(font_A_B);
		cos.setFont(font_A_B);
		pow.setFont(font_A_B);
		asin.setFont(font_A_B);
		acos.setFont(font_A_B);
		nrt.setFont(font_A_B);
		close.setFont(font_A_B);
		
		change.setFont(font_A_B);
		
		
		add.setBorderPainted(false);
		sub.setBorderPainted(false);
		div.setBorderPainted(false);
		mul.setBorderPainted(false);
		squ.setBorderPainted(false);
		roo.setBorderPainted(false);
		sin.setBorderPainted(false);
		cos.setBorderPainted(false);
		pow.setBorderPainted(false);
		asin.setBorderPainted(false);
		acos.setBorderPainted(false);
		nrt.setBorderPainted(false);
		close.setBorderPainted(false);
		
		change.setBorderPainted(false);
		
		
		tf1 = new JTextField();
		tf1.setFont(font_A_B_2);
		tf1.setHorizontalAlignment(JTextField.CENTER);
		
		tf2 = new JTextField();
		tf2.setFont(font_A_B_2);
		tf2.setHorizontalAlignment(JTextField.CENTER);

		tf1_exp = new JTextField();
		tf1_exp.setFont(font_A_B);
		tf1_exp.setEditable(false);
		tf1_exp.setHorizontalAlignment(JTextField.CENTER);
		
		tf2_exp = new JTextField();
		tf2_exp.setFont(font_A_B);
		tf2_exp.setEditable(false);
		tf2_exp.setHorizontalAlignment(JTextField.CENTER);

		tf_instr = new JTextArea();
		tf_instr.append("1. Choose what you want to calculate.\n" 
						+ "\n2. Enter your number(s) in the panels.\n"
						+ "\n3. Press your calculator option again.");
		
		tf_instr.setFont(font_A_B);		
		tf_instr.setEditable(false);
		
		tf1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		tf2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		tf1_exp.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		tf2_exp.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		tf_instr.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		
		panel.setLayout(null);
		panel.setBackground(Color.darkGray);
		
		
		add.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		squ.addActionListener(this);
		roo.addActionListener(this);
		sin.addActionListener(this);
		cos.addActionListener(this);
		pow.addActionListener(this);
		asin.addActionListener(this);
		acos.addActionListener(this);
		nrt.addActionListener(this);
		close.addActionListener(this);
		
		change.addActionListener(this);
		
		
		pow.setVisible(false);
		asin.setVisible(false);
		acos.setVisible(false);
		nrt.setVisible(false);
		
		
		tf1.setVisible(false);
		tf2.setVisible(false);
		tf1_exp.setVisible(true);
		tf2_exp.setVisible(true);
		tf_instr.setVisible(true);
		
		
		tf1.setSize(200, 80);
		tf2.setSize(200, 80);
		tf1_exp.setSize(200, 50);
		tf2_exp.setSize(200, 50);
		tf_instr.setSize(360, 115);
		
		add.setSize(200, 50);
		sub.setSize(200, 50);
		div.setSize(200, 50);
		mul.setSize(200, 50);
		squ.setSize(200, 50);
		roo.setSize(200, 50);
		sin.setSize(200, 50);
		cos.setSize(200, 50);
		pow.setSize(200, 50);
		asin.setSize(200, 50);
		acos.setSize(200, 50);
		nrt.setSize(200, 50);
		close.setSize(200, 50);
		
		change.setSize(monitor.width - 20, 75);
		
		label.setSize(100, 20);
				
		
		tf1.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 - tf1.getHeight() / 2);
		tf2.setLocation(monitor.width / 2 + 5, monitor.height / 2 - tf1.getHeight() / 2);
		tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 + tf1.getHeight() / 2);
		tf2_exp.setLocation(monitor.width / 2 + 5, monitor.height / 2 + tf1.getHeight() / 2);
		tf_instr.setLocation(monitor.width / 2 - tf_instr.getWidth() / 2, monitor.height / 2 + 200);
		
		
		add.setLocation(monitor.width / 2 - 2 * add.getWidth() - 15, change.getHeight() + 30);
		sub.setLocation(monitor.width / 2 - add.getWidth() - 5, change.getHeight() + 30);
		div.setLocation(monitor.width / 2 + 5, change.getHeight() + 30);
		mul.setLocation(monitor.width / 2 + add.getWidth() + 15, change.getHeight() + 30);
		roo.setLocation(monitor.width / 2 - add.getWidth() - 5, change.getHeight() + add.getHeight() + 50);
		squ.setLocation(monitor.width / 2 + 5, change.getHeight() + add.getHeight() + 50);
		sin.setLocation(monitor.width / 2 - add.getWidth() - 5, change.getHeight() + 2 * add.getHeight() + 70);
		cos.setLocation(monitor.width / 2 + 5, change.getHeight() + 2 * add.getHeight() + 70);
		pow.setLocation(monitor.width / 2 + 5, change.getHeight() + add.getHeight() + 50);
		asin.setLocation(monitor.width / 2 - add.getWidth() - 5, change.getHeight() + 2 * add.getHeight() + 70);
		acos.setLocation(monitor.width / 2 + 5, change.getHeight() + 2 * add.getHeight() + 70);
		nrt.setLocation(monitor.width / 2 - add.getWidth() - 5, change.getHeight() + add.getHeight() + 50);
		close.setLocation(monitor.width / 2 - close.getWidth() / 2, monitor.height - close.getHeight() - 80);
		
		change.setLocation(monitor.width / 2 - change.getWidth() / 2, 10);
		
		
		add.setBackground(Color.lightGray);
		add.setForeground(Color.black);
		sub.setBackground(Color.lightGray);
		sub.setForeground(Color.black);
		div.setBackground(Color.lightGray);
		div.setForeground(Color.black);
		mul.setBackground(Color.lightGray);
		mul.setForeground(Color.black);
		squ.setBackground(Color.lightGray);
		squ.setForeground(Color.black);
		roo.setBackground(Color.lightGray);
		roo.setForeground(Color.black);
		sin.setBackground(Color.lightGray);
		sin.setForeground(Color.black);
		cos.setBackground(Color.lightGray);
		cos.setForeground(Color.black);
		
		pow.setBackground(Color.black);
		pow.setForeground(Color.white);
		asin.setBackground(Color.black);
		asin.setForeground(Color.white);
		acos.setBackground(Color.black);
		acos.setForeground(Color.white);
		nrt.setBackground(Color.black);
		nrt.setForeground(Color.white);
		
		close.setBackground(Color.red.darker().darker());
		close.setForeground(Color.black);
		
		change.setBackground(Color.black);
		change.setForeground(Color.white);
		
		tf1.setBackground(Color.white);
		tf1.setForeground(Color.black);
		tf2.setBackground(Color.white);
		tf2.setForeground(Color.black);
		tf1_exp.setBackground(Color.darkGray);
		tf1_exp.setForeground(Color.black);
		tf2_exp.setBackground(Color.darkGray);
		tf2_exp.setForeground(Color.black);
		tf_instr.setBackground(Color.getHSBColor(10, 5, 7));
		tf_instr.setForeground(Color.black);
		
		
		panel.add(label);
		panel.add(add);
		panel.add(sub);
		panel.add(div);
		panel.add(mul);
		panel.add(squ);
		panel.add(roo);
		panel.add(sin);
		panel.add(cos);
		panel.add(pow);
		panel.add(asin);
		panel.add(acos);
		panel.add(nrt);
		
		panel.add(tf1);
		panel.add(tf2);
		panel.add(tf1_exp);
		panel.add(tf2_exp);
		panel.add(tf_instr);
		panel.add(close);
		panel.add(change);
		
		
		this.add(panel);
	}
	
	
		@Override
		public void actionPerformed(ActionEvent e){
			
			Dimension monitor = (Toolkit.getDefaultToolkit().getScreenSize());
			if(e.getSource() == this.change){
				switch(mode){
				
				case 1:
					
					squ.setVisible(false);
					roo.setVisible(false);
					sin.setVisible(false);
					cos.setVisible(false);
					pow.setVisible(true);
					asin.setVisible(true);
					acos.setVisible(true);
					nrt.setVisible(true);
					
					
					change.setBackground(Color.lightGray);
					change.setForeground(Color.black);
					
					
					mode = 2;
					break;
				
					
				case 2:
					
					squ.setVisible(true);
					roo.setVisible(true);
					sin.setVisible(true);
					cos.setVisible(true);
					pow.setVisible(false);
					asin.setVisible(false);
					acos.setVisible(false);
					nrt.setVisible(false);
					
					change.setBackground(Color.black);
					change.setForeground(Color.white);
					
					mode = 1;
					break;
				}
			}
			
			
			if(e.getSource() == this.add){
				
				tf2_exp.setVisible(true);
				tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 + tf1.getHeight() / 2);
				tf1_exp.setText("1st number");
				tf2_exp.setText("2nd number");
				
				
				if(!tf2.isVisible()){
					
					tf2.setVisible(true);
					tf1.setVisible(true);
					
					
					tf1.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}
				
				String add1_text = tf1.getText();
				double add_num1 = Double.parseDouble(add1_text);
				String add2_text = tf2.getText();
				double add_num2 = Double.parseDouble(add2_text);
				
				JOptionPane.showMessageDialog(null, add_num1 + add_num2, "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				tf1.setText("");
				tf2.setText("");
			}
			
			
			if(e.getSource() == this.sub){
				
				tf2_exp.setVisible(true);
				tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 + tf1.getHeight() / 2);
				tf1_exp.setText("1st number");
				tf2_exp.setText("2nd number");
				
				
				if(!tf2.isVisible()){
					
					tf2.setVisible(true);
					tf1.setVisible(true);
					
					tf1.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}
				
				String sub1_text = tf1.getText();
				double sub_num1 = Double.parseDouble(sub1_text);
				String sub2_text = tf2.getText();
				double sub_num2 = Double.parseDouble(sub2_text);
				
				JOptionPane.showMessageDialog(null, sub_num1 - sub_num2, "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				tf1.setText("");
				tf2.setText("");
			}
			
			
			if(e.getSource() == this.div){
				
				tf2_exp.setVisible(true);
				tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 + tf1.getHeight() / 2);
				tf1_exp.setText("1st number");
				tf2_exp.setText("2nd number");
				
				
				if(!tf2.isVisible()){
					
					tf2.setVisible(true);
					tf1.setVisible(true);
					
					tf1.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}
				
				String div1_text = tf1.getText();
				double div_num1 = Double.parseDouble(div1_text);
				String div2_text = tf2.getText();
				double div_num2 = Double.parseDouble(div2_text);
				
				JOptionPane.showMessageDialog(null, div_num1 / div_num2, "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				tf1.setText("");
				tf2.setText("");
			}
			
			
			if(e.getSource() == this.mul){
				
				tf2_exp.setVisible(true);
				tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 + tf1.getHeight() / 2);
				tf1_exp.setText("1st number");
				tf2_exp.setText("2nd number");
				
				
				if(!tf2.isVisible()){
					
					tf2.setVisible(true);
					tf1.setVisible(true);
					
					tf1.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}
				
				String mul1_text = tf1.getText();
				double mul_num1 = Double.parseDouble(mul1_text);
				String mul2_text = tf2.getText();
				double mul_num2 = Double.parseDouble(mul2_text);
				
				JOptionPane.showMessageDialog(null, mul_num1 * mul_num2, "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				tf1.setText("");
				tf2.setText("");
			}
			
			
			if(e.getSource() == this.roo){
				
				tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 + tf1.getHeight() / 2);
				tf1_exp.setText("Radicand");
				tf2_exp.setVisible(false);
				
				
				if(tf2.isVisible() || !tf1.isVisible()){
					
					tf2.setVisible(false);
					tf1.setVisible(true);
					
					tf1.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}
				
				String roo_text = tf1.getText();
				double roo_num = Double.parseDouble(roo_text);
								
				JOptionPane.showMessageDialog(null, Math.sqrt(roo_num), "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				tf1.setText("");
			}
			
			
			if(e.getSource() == this.squ){
				
				tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 + tf1.getHeight() / 2);
				tf1_exp.setText("Base");
				tf2_exp.setVisible(false);
				
				
				if(tf2.isVisible() || !tf1.isVisible()){
					
					tf2.setVisible(false);
					tf1.setVisible(true);
					
					tf1.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}
				
				String squ_text = tf1.getText();
				double squ_num = Double.parseDouble(squ_text);
								
				JOptionPane.showMessageDialog(null, squ_num * squ_num, "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				tf1.setText("");
			}
			
			
			
			if(e.getSource() == this.sin){
				
				tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 + tf1.getHeight() / 2);
				tf1_exp.setText("Number in Degrees");
				tf2_exp.setVisible(false);
				
				
				if(tf2.isVisible() || !tf1.isVisible()){
					
					tf2.setVisible(false);
					tf1.setVisible(true);

					tf1.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}
				
				String sin_text = tf1.getText();
				double sin_num = Double.parseDouble(sin_text);
				double sin_rad = Math.toRadians(sin_num);
				
				JOptionPane.showMessageDialog(null, Math.sin(sin_rad), "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				tf1.setText("");
			}
			
			
			if(e.getSource() == this.cos){
				
				tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 + tf1.getHeight() / 2);
				tf1_exp.setText("Number in Degrees");
				tf2_exp.setVisible(false);
				
				
				if(tf2.isVisible() || !tf1.isVisible()){
					
					tf2.setVisible(false);
					tf1.setVisible(true);
					
					tf1.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}
				
				String cos_text = tf1.getText();
				double cos_num = Double.parseDouble(cos_text);
				double cos_rad = Math.toRadians(cos_num);
				
				JOptionPane.showMessageDialog(null, Math.cos(cos_rad), "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				tf1.setText("");
			}
			
			
			if(e.getSource() == this.pow){
				
				tf2_exp.setVisible(true);
				tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 + tf1.getHeight() / 2);
				tf1_exp.setText("Base");
				tf2_exp.setText("Exponent");
				
				
				if(!tf2.isVisible()){
					
					tf2.setVisible(true);
					tf1.setVisible(true);
					
					tf1.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}
				
				String pow1_text = tf1.getText();
				double pow1= Double.parseDouble(pow1_text);
				String pow2_text = tf2.getText();
				double pow2 = Double.parseDouble(pow2_text);
				
				JOptionPane.showMessageDialog(null, Math.pow(pow1, pow2), "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				tf1.setText("");
				tf2.setText("");
			}
			
			
			if(e.getSource() == this.asin){
				
				tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 + tf1.getHeight() / 2);
				tf1_exp.setText("Number");
				tf2_exp.setVisible(false);
				
				
				if(tf2.isVisible() || !tf1.isVisible()){
					
					tf2.setVisible(false);
					tf1.setVisible(true);
					
					tf1.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}
				
				String asin_text = tf1.getText();
				double asin_num = Double.parseDouble(asin_text);	
				
				JOptionPane.showMessageDialog(null, Math.toDegrees(Math.asin(asin_num)), "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				tf1.setText("");
			}
			
			
			if(e.getSource() == this.acos){
				
				tf1_exp.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 + tf1.getHeight() / 2);
				tf1_exp.setText("Number");
				tf2_exp.setVisible(false);
				
				
				if(tf2.isVisible() || !tf1.isVisible()){
					
					tf2.setVisible(false);
					tf1.setVisible(true);
					
					tf1.setLocation(monitor.width / 2 - tf1.getWidth() / 2, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}
				
				String acos_text = tf1.getText();
				double acos_num = Double.parseDouble(acos_text);
				
				JOptionPane.showMessageDialog(null, Math.toDegrees(Math.acos(acos_num)), "Solution", JOptionPane.INFORMATION_MESSAGE);
				
				tf1.setText("");
			}
			
			
			// nrt is not working yet!
			
			
			if(e.getSource() == this.nrt){
				
				if(!tf2.isVisible()){
					
					tf2.setVisible(true);
					tf1.setVisible(true);
					
					tf1.setLocation(monitor.width / 2 - tf1.getWidth() - 5, monitor.height / 2 - tf1.getHeight() / 2);
					
					return;
				}																													
				
				tf1.setText("");
				tf2.setText("");
			}
			
			
			if(e.getSource() == this.close) {
				
				System.exit(0);
			}
		}
		
}
package datainput;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;

public class VerilerinGirildigiProgram extends JPanel  {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private static String test;
	private static String vaka;
	private static String yogunbakimhasta;
	private static String entubehasta;
	private static String olu;
	private static String iyilesen;
	 static Date gün=Calendar.getInstance().getTime(); 
 private static Boolean button;
	
 	/**
	 * Create the panel.
	 */
	public VerilerinGirildigiProgram() {
		JFrame f = new JFrame();
		 
	   	 JPanel P = new JPanel();                    
	    
	   	               
	    
	   	  
		
		setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("G\u00FCnl\u00FCk Test");
		lblNewLabel.setBounds(10, 57, 69, 14);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(266, 54, 86, 20);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("G\u00FCnl\u00FCk Vaka");
		lblNewLabel_1.setBounds(10, 92, 150, 14);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(266, 89, 86, 20);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Yo\u011Fun Bak\u0131mdaki Hasta");
		lblNewLabel_2.setBounds(10, 129, 150, 14);
		f.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(266, 126, 86, 20);
		f.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Ent\u00FCbe Hasta");
		lblNewLabel_3.setBounds(10, 166, 150, 14);
		f.getContentPane().add(lblNewLabel_3);
		JLabel lblNewLabel_4 = new JLabel("\u00D6l\u00FC Say\u0131s\u0131");
		lblNewLabel_4.setBounds(10, 204, 150, 14);
		f.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u0130yile\u015Fen Say\u0131s\u0131");
		lblNewLabel_5.setBounds(10, 240, 150, 14);
		f.getContentPane().add(lblNewLabel_5);
		
		
		JLabel lblNewLabel_6 = new JLabel("COVID-19 Veri Giri\u015Fi");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(58, 11, 233, 23);
		f.getContentPane().add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(266, 163, 86, 20);
		f.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(266, 201, 86, 20);
		f.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(266, 237, 86, 20);
		f.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTest(textField.getText());
				textField.setText(test);
				setVaka((String)textField_1.getText());
				textField_1.setText(vaka);
				setYogunbakimhasta((String)textField_2.getText());
				textField_2.setText(yogunbakimhasta);
				setEntubehasta((String)textField_3.getText());
				textField_3.setText(entubehasta);
				setOlu((String)textField_4.getText());
				textField_4.setText(olu);
				setIyilesen((String)textField_5.getText());
				textField_5.setText(iyilesen);
			System.out.println(test+vaka+yogunbakimhasta);
				setButton(true);
				
				
			}
			public void setButton(Boolean button) {
				 VerilerinGirildigiProgram.button=button;
			 }
			public void setTest(String test) {
				VerilerinGirildigiProgram.test = test;
			}
			public void setVaka(String vaka) {
				VerilerinGirildigiProgram.vaka = vaka;
			}
			public void setYogunbakimhasta(String yogunbakimhasta) {
				VerilerinGirildigiProgram.yogunbakimhasta = yogunbakimhasta;
			}
			public void setEntubehasta(String entubehasta) {
				VerilerinGirildigiProgram.entubehasta = entubehasta;
			}
			public void setIyilesen(String iyilesen) {
				VerilerinGirildigiProgram.iyilesen = iyilesen;
			}
			public void setOlu(String olu) {
				VerilerinGirildigiProgram.olu = olu;
			}
			
		});
		
		btnNewButton.setBounds(266, 266, 89, 23);
		f.getContentPane().add(btnNewButton);
		   
		 f.getContentPane().add(P);  
		 f.setSize(450,450);
	   	 f.setVisible(true);
		

	}

	public static String getTest() {
		return test;
	}

	

	public static String getVaka() {
		return vaka;
	}

	

	public static String getYogunbakimhasta() {
		return yogunbakimhasta;
	}

	
	public static String getEntubehasta() {
		return entubehasta;
	}

	
	public static String getOlu() {
		return olu;
	}

	

	public static String getIyilesen() {
		return iyilesen;
	}



	public static Boolean getButton() {
		return button;
	}
	
	
	
}

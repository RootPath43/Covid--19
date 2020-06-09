package datapullout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Displayer extends JFrame{
	private static final Displayer instance= new Displayer();
	private static JPanel contentPane = new JPanel();
	
   private static JLabel label;
   private static JLabel label_1;
   private static JLabel label_2;
   private static JLabel label_3;
   private static JLabel label_4;
   private static JLabel label_5;
   private static JLabel lblNewLabel;
	
	 private Displayer() {
		 
	
		 	
			
		 	contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			 lblNewLabel = new JLabel(DataRecorder.getInstance().getData().get(0));
			lblNewLabel.setBounds(10, 24, 137, 14);
			getContentPane().add(lblNewLabel);
			
			label = new JLabel(DataRecorder.getInstance().getData().get(1));
			label.setBounds(10, 56, 137, 14);
			getContentPane().add(label);
			
			label_1 = new JLabel(DataRecorder.getInstance().getData().get(2));
			label_1.setBounds(10, 93, 137, 14);
			getContentPane().add(label_1);
			
		     label_2 = new JLabel(DataRecorder.getInstance().getData().get(3));
			label_2.setBounds(10, 131, 137, 14);
			getContentPane().add(label_2);
			
			label_3 = new JLabel(DataRecorder.getInstance().getData().get(4));
			label_3.setBounds(10, 172, 137, 14);
			getContentPane().add(label_3);
			
			 label_4 = new JLabel(DataRecorder.getInstance().getData().get(5));
			label_4.setBounds(10, 215, 137, 14);
			getContentPane().add(label_4);
			
			label_5 = new JLabel(DataRecorder.getInstance().getData().get(6));
			label_5.setBounds(255, 24, 137, 14);
			getContentPane().add(label_5);
			 
			 setSize(500,500);
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 setVisible(true);
			 
	 }
	 public static Displayer  getInstance() {
		 return instance;
	 }
	 
}

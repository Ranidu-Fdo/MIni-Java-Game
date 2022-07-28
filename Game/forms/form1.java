package forms;
import java.util.Random;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class form1 {

	private JFrame frame;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;
	JButton btnreset;
	int y=0;
	int b=0;
	
	 JLabel lblNewLabel_3;
	 private JLabel lblcom1;
	 private JLabel lblcom2;
	 private JLabel lblNewLabel_4;
	 private JLabel lblcom3;
	 private JLabel lblcom4;
	 private JLabel lblcom5;
	 private JLabel lblNewLabel_5;
	 private JLabel lblNewLabel_6;
	 private JLabel lblNewLabel_7;
	 private JLabel lblNewLabel_8;
	 private JLabel lblwin;
	 private JLabel lbldisplay1;
	 private JLabel lbldisplay2;
	 private JLabel lblt1;
	 private JLabel lblt2;
	 private JLabel lblNewLabel_10;
	 private JLabel lblNewLabel_11;
	 private JLabel lblNewLabel_12;
	 private JLabel lblNewLabel_13;
	 private JLabel lblNewLabel_14;
	 private JLabel lblNewLabel_15;
	 private JLabel lblNewLabel_16;
	 private JLabel lblNewLabel_17;
	 private JLabel lblNewLabel_18;
	 private JLabel lblNewLabel_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1 window = new form1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public form1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */


	
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent we) {
		        int result = JOptionPane.showConfirmDialog(frame,
		            "Do you want to Exit ?", "Exit Confirmation : ",
		            JOptionPane.YES_NO_OPTION);
		        if (result == JOptionPane.YES_OPTION)
		          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        else if (result == JOptionPane.NO_OPTION)
		          frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		      }
		    });

		    frame.setSize(661, 364);
		    frame.setVisible(true);
		
		frame.getContentPane().setBackground(new Color(255, 248, 220));
		frame.setForeground(Color.BLUE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
		
	    lblNewLabel = new JLabel("");
	    lblNewLabel.setBounds(141, 180, 45, 22);
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setBorder(new LineBorder(Color.RED, 3));
	    lblNewLabel.setForeground(Color.BLACK);
	    lblNewLabel.setBackground(Color.GREEN);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btndice = new JButton("");
		btndice.setForeground(Color.BLACK);
		btndice.setIcon(new ImageIcon("E:\\Programe Files\\eclipse\\eclipse work place\\Assinment03\\images\\ee.png"));
		btndice.setBounds(277, 228, 74, 69);
		btndice.setBackground(new Color(255, 255, 255));
		btndice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usergenerate() ;
				computergenerate();
				playerWin_Loss();
				totall();

			}
		});
		frame.getContentPane().add(btndice);
		
		 lblNewLabel_1 = new JLabel("");
		 lblNewLabel_1.setBounds(141, 157, 45, 22);
		 lblNewLabel_1.setForeground(new Color(0, 0, 0));
		 lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_1.setBorder(new LineBorder(Color.RED, 3));
		frame.getContentPane().add(lblNewLabel_1);
		
		 lblNewLabel_2 = new JLabel("");
		 lblNewLabel_2.setBounds(141, 138, 45, 22);
		 lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_2.setBorder(new LineBorder(Color.RED, 3));
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(141, 115, 45, 22);
		lblNewLabel_3.setBorder(new LineBorder(Color.RED, 3));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblcom1 = new JLabel("");
		lblcom1.setBounds(459, 180, 45, 22);
		lblcom1.setBorder(new LineBorder(Color.RED, 3));
		lblcom1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblcom1);
		
		lblcom2 = new JLabel("");
		lblcom2.setBounds(459, 157, 45, 22);
		lblcom2.setHorizontalAlignment(SwingConstants.CENTER);
		lblcom2.setBorder(new LineBorder(Color.RED, 3));
		frame.getContentPane().add(lblcom2);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(141, 92, 45, 24);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new LineBorder(Color.RED, 3));
		frame.getContentPane().add(lblNewLabel_4);
		
		lblcom3 = new JLabel("");
		lblcom3.setBounds(459, 138, 45, 22);
		lblcom3.setHorizontalAlignment(SwingConstants.CENTER);
		lblcom3.setBorder(new LineBorder(Color.RED, 3));
		frame.getContentPane().add(lblcom3);
		
		lblcom4 = new JLabel("");
		lblcom4.setBounds(459, 114, 45, 24);
		lblcom4.setHorizontalAlignment(SwingConstants.CENTER);
		lblcom4.setBorder(new LineBorder(Color.RED, 3));
		frame.getContentPane().add(lblcom4);
		
		lblcom5 = new JLabel("");
		lblcom5.setBounds(459, 93, 45, 22);
		lblcom5.setHorizontalAlignment(SwingConstants.CENTER);
		lblcom5.setBorder(new LineBorder(Color.RED, 3));
		frame.getContentPane().add(lblcom5);
		
		lblNewLabel_5 = new JLabel("Ladder Game");
		lblNewLabel_5.setBounds(0, 10, 653, 35);
		lblNewLabel_5.setBackground(Color.CYAN);
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("You");
		lblNewLabel_6.setBounds(141, 228, 45, 13);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(Color.PINK);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Computer");
		lblNewLabel_7.setBounds(446, 228, 68, 13);
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBackground(Color.PINK);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(518, 65, 248, 338);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setIcon(new ImageIcon("E:\\Programe Files\\eclipse\\eclipse work place\\Assinment03\\images\\Election_Symbol_Ladder.png"));
		lblNewLabel_8.setBackground(Color.WHITE);
		frame.getContentPane().add(lblNewLabel_8);
		
		lblwin = new JLabel(" WON ");
		lblwin.setBounds(221, 115, 200, 55);
		lblwin.setHorizontalAlignment(SwingConstants.CENTER);
		lblwin.setOpaque(true);
		lblwin.setBackground(Color.GREEN);
		frame.getContentPane().add(lblwin);
		lblwin.setVisible(false);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(0, 43, 108, 60);
		lblNewLabel_9.setIcon(new ImageIcon("E:\\Programe Files\\eclipse\\eclipse work place\\Assinment03\\images\\download.png"));
		frame.getContentPane().add(lblNewLabel_9);
		
		lbldisplay1 = new JLabel("");
		lbldisplay1.setBorder(new LineBorder(new Color(0, 0, 255), 2));
		lbldisplay1.setHorizontalAlignment(SwingConstants.CENTER);
		lbldisplay1.setBackground(new Color(240, 240, 240));
		lbldisplay1.setOpaque(true);
		lbldisplay1.setBounds(190, 255, 33, 28);
		frame.getContentPane().add(lbldisplay1);
		
		lbldisplay2 = new JLabel("");
		lbldisplay2.setOpaque(true);
		lbldisplay2.setHorizontalAlignment(SwingConstants.CENTER);
		lbldisplay2.setBorder(new LineBorder(new Color(0, 0, 255), 2));
		lbldisplay2.setBackground(SystemColor.menu);
		lbldisplay2.setBounds(402, 255, 33, 28);
		frame.getContentPane().add(lbldisplay2);
		
		
		btnreset = new JButton("RESET");
		 btnreset.setBackground(new Color(127, 255, 212));
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbldisplay1.setText(null) ;
				lbldisplay2.setText(null);
				lblNewLabel_4.setText("");
				lblNewLabel_3.setText("");
				lblNewLabel_2.setText("");
				lblcom5.setText("");
				lblcom4.setText("");
				lblcom3.setText("");
				y=0;
				b=0;
				btnreset.setVisible(false);
				lblwin.setVisible(false);
				lblt1.setText("");
				lblt2.setText("");
			}
		});
		btnreset.setBounds(255, 170, 123, 21);
		frame.getContentPane().add(btnreset);
		
		lblt1 = new JLabel("");
		lblt1.setHorizontalAlignment(SwingConstants.CENTER);
		lblt1.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		lblt1.setBackground(new Color(245, 255, 250));
		lblt1.setOpaque(true);
		lblt1.setBounds(111, 255, 45, 28);
		frame.getContentPane().add(lblt1);
		
		lblt2 = new JLabel("");
		lblt2.setHorizontalAlignment(SwingConstants.CENTER);
		lblt2.setOpaque(true);
		lblt2.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		lblt2.setBackground(new Color(245, 255, 250));
		lblt2.setBounds(469, 255, 45, 28);
		frame.getContentPane().add(lblt2);
		
		lblNewLabel_10 = new JLabel("30");
		lblNewLabel_10.setBounds(111, 103, 16, 13);
		frame.getContentPane().add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("30");
		lblNewLabel_11.setBounds(524, 103, 16, 13);
		frame.getContentPane().add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("24");
		lblNewLabel_12.setBounds(111, 124, 16, 13);
		frame.getContentPane().add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("24");
		lblNewLabel_13.setBounds(524, 125, 16, 13);
		frame.getContentPane().add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("18");
		lblNewLabel_14.setBounds(111, 147, 16, 13);
		frame.getContentPane().add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("18");
		lblNewLabel_15.setBounds(524, 147, 16, 13);
		frame.getContentPane().add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("12");
		lblNewLabel_16.setBounds(111, 166, 16, 13);
		frame.getContentPane().add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("6");
		lblNewLabel_17.setBounds(111, 189, 16, 13);
		frame.getContentPane().add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("12");
		lblNewLabel_18.setBounds(524, 166, 16, 13);
		frame.getContentPane().add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("6");
		lblNewLabel_19.setBounds(524, 189, 16, 13);
		frame.getContentPane().add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("~");
		lblNewLabel_20.setBounds(166, 265, 16, 7);
		frame.getContentPane().add(lblNewLabel_20);
		
		JLabel lblNewLabel_20_1 = new JLabel("~");
		lblNewLabel_20_1.setBounds(445, 262, 16, 7);
		frame.getContentPane().add(lblNewLabel_20_1);
		btnreset.setVisible(false);
		
	}
	private void usergenerate() {
		 Random random = new Random();
			int x = random.nextInt(6)+1;
			 y = y + x;
			 lbldisplay1.setText(Integer.toString(x)) ;
			 if (y < 7) { 
				 lblNewLabel.setText("*****");
				} else if (y<13) {
					lblNewLabel_1.setText("*****");
					lblNewLabel.setText(null);
				} else if (y<19) {
					lblNewLabel_2.setText("*****");
					lblNewLabel_1.setText(null);
				} else if(y<25){
					lblNewLabel_3.setText("*****");
					lblNewLabel_2.setText(null);
				} else if(y<31) {
					lblNewLabel_4.setText("*****");
					lblNewLabel_3.setText(null);
					
				}
	
		
	}
	private void computergenerate() {
		 Random random = new Random();
			int a = random.nextInt(6)+1;
			 b = b + a;
			 lbldisplay2.setText(Integer.toString(a)) ;
			 if (b < 7) { 
				 lblcom1.setText("*****");
				} else if (b<13) {
					lblcom2.setText("*****");
					lblcom1.setText(null);
				} else if (b<19) {
					lblcom3.setText("*****");
					lblcom2.setText(null);
				} else if(b<25){
					lblcom4.setText("*****");
					lblcom3.setText(null);
				} else if(b<31){
					lblcom5.setText("*****");
					lblcom4.setText(null);
				}
	
	}
	

	
    
    private void playerWin_Loss() {

    	if (lblNewLabel_4.getText()== "*****" && lblcom5.getText() == "*****" ){
    		lblwin.setVisible(true);
			lblwin.setText("BOTH ARE SAME!");
			btnreset.setVisible(true);
    	} else if (lblcom5.getText()=="*****"){
    		lblwin.setVisible(true);
			lblwin.setText("YOU LOST! TRY AGAIN!");
			btnreset.setVisible(true);
    	} else if (lblNewLabel_4.getText()=="*****"){
    		lblwin.setVisible(true);
			lblwin.setText("YOU WON! CONGRATULATIONS!");
			btnreset.setVisible(true);
    	}

    }
    private void totall() {
    	lblt1.setText(Integer.toString(y));
    	lblt2.setText(Integer.toString(b));
    }
}

package U10216032_hw5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class U10216032_hw5 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_showresult;


	public static void main(String[] args) {
		
		U10216032_hw5 frame = new U10216032_hw5();
		frame.setVisible(true);
		frame.setTitle("Calculator");

	}

	
	public U10216032_hw5() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		// The textfield used to show result
		txt_showresult = new JTextField();
		txt_showresult.setBounds(10, 10, 414, 30);
		contentPane.add(txt_showresult);
		
		// figure key
		
		// push it to show number 1
		JButton btn_number_1 = new JButton("1");
		btn_number_1.setBounds(195, 170, 44, 30);
		contentPane.add(btn_number_1);
		
		// push it to show number 2		
		JButton btn_number_2 = new JButton("2");
		btn_number_2.setBounds(249, 170, 44, 30);
		contentPane.add(btn_number_2);
		
		// push it to show number 3		
		JButton btn_number_3 = new JButton("3");
		btn_number_3.setBounds(303, 170, 44, 30);
		contentPane.add(btn_number_3);
		
		// push it to show number 4		
		JButton btn_number_4 = new JButton("4");
		btn_number_4.setBounds(195, 130, 44, 30);
		contentPane.add(btn_number_4);
		
		// push it to show number 5		
		JButton btn_number_5 = new JButton("5");
		btn_number_5.setBounds(249, 130, 44, 30);
		contentPane.add(btn_number_5);		
		
		// push it to show number 6		
		JButton btn_number_6 = new JButton("6");
		btn_number_6.setBounds(303, 130, 44, 30);
		contentPane.add(btn_number_6);
		
		// push it to show number 7		
		JButton btn_number_7 = new JButton("7");
		btn_number_7.setBounds(195, 90, 44, 30);
		contentPane.add(btn_number_7);
		
		// push it to show number 8		
		JButton btn_number_8 = new JButton("8");
		btn_number_8.setBounds(249, 90, 44, 30);
		contentPane.add(btn_number_8);
		
		// push it to show number 9		
		JButton btn_number_9 = new JButton("9");
		btn_number_9.setBounds(303, 90, 44, 30);
		contentPane.add(btn_number_9);
		
		// push it to show number 0		
		JButton btn_number_0 = new JButton("0");
		btn_number_0.setBounds(195, 210, 44, 30);
		contentPane.add(btn_number_0);
		
		

	}
}

package U10216032_hw5;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.lang.Math;



public class U10216032_hw5 extends JFrame {

	double memory_number;
	String get_result;
	double result;	
	double calculate_number;	
	char input_symbol; // determine + , - , * , /
	
	private JPanel contentPane;
	private JTextField txt_showresult;


	public static void main(String[] args) {
		
		U10216032_hw5 frame = new U10216032_hw5();
		frame.setVisible(true);
		frame.setTitle("Calculator");

	}

	private void calculate_equal() { 

 		switch(input_symbol){		
			case '+':
				txt_showresult.setText ( String.valueOf ( calculate_number + result  ) );	break;						
			case '-':
				txt_showresult.setText ( String.valueOf ( calculate_number - result  ) );	break;			
			case '*':
				txt_showresult.setText ( String.valueOf ( calculate_number * result  ) );	break;										
			case '/':
				txt_showresult.setText ( String.valueOf ( calculate_number / result  ) );	break;	
		}
	}
	

  	private void record_number(double number) {
		calculate_number = number;
	} 	

  	private void record_symbol(char symbol) {
  		input_symbol = symbol;
	} 			
  	
	private void record_number_memory(double number) {
		memory_number = number;
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
		
		// number 1
		JButton btn_number_1 = new JButton("1");
		btn_number_1.setBounds(195, 170, 44, 30);
		contentPane.add(btn_number_1);
		btn_number_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// if textfield show 0 , turn it to the number
				if( txt_showresult.getText().equals( "0" )){ 
					txt_showresult.setText("1");
				}
				
				// if textfield show other value , add number after the value
				else{
				txt_showresult.setText( txt_showresult.getText() + "1");
				}
			}
		});	
		
		// number 2		
		JButton btn_number_2 = new JButton("2");
		btn_number_2.setBounds(249, 170, 44, 30);
		contentPane.add(btn_number_2);
		btn_number_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if textfield show 0 , turn it to the number
				if( txt_showresult.getText().equals( "0" )){ 
					txt_showresult.setText("2");
				}
				
				// if textfield show other value , add number after the value
				else{
				txt_showresult.setText( txt_showresult.getText() + "2");
				}
			}
		});
		
		// number 3		
		JButton btn_number_3 = new JButton("3");
		btn_number_3.setBounds(303, 170, 44, 30);
		contentPane.add(btn_number_3);
		btn_number_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if textfield show 0 , turn it to the number
				if( txt_showresult.getText().equals( "0" )){ 
					txt_showresult.setText("3");
				}
				
				// if textfield show other value , add number after the value
				else{
				txt_showresult.setText( txt_showresult.getText() + "3");
				}		
			}
		});
		
		// number 4		
		JButton btn_number_4 = new JButton("4");
		btn_number_4.setBounds(195, 130, 44, 30);
		contentPane.add(btn_number_4);
		btn_number_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if textfield show 0 , turn it to the number
				if( txt_showresult.getText().equals( "0" )){ 
					txt_showresult.setText("4");
				}
				
				// if textfield show other value , add number after the value
				else{
				txt_showresult.setText( txt_showresult.getText() + "4");
				}
			}
		});
		
		// number 5		
		JButton btn_number_5 = new JButton("5");
		btn_number_5.setBounds(249, 130, 44, 30);
		contentPane.add(btn_number_5);		
		btn_number_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if textfield show 0 , turn it to the number
				if( txt_showresult.getText().equals( "0" )){ 
					txt_showresult.setText("5");
				}
				
				// if textfield show other value , add number after the value
				else{
				txt_showresult.setText( txt_showresult.getText() + "5");
				}	
			}
		});		
		
		// number 6		
		JButton btn_number_6 = new JButton("6");
		btn_number_6.setBounds(303, 130, 44, 30);
		contentPane.add(btn_number_6);
		btn_number_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if textfield show 0 , turn it to the number
				if( txt_showresult.getText().equals( "0" )){ 
					txt_showresult.setText("6");
				}
				
				// if textfield show other value , add number after the value
				else{
				txt_showresult.setText( txt_showresult.getText() + "6");
				}
			}
		});
		
		// number 7		
		JButton btn_number_7 = new JButton("7");
		btn_number_7.setBounds(195, 90, 44, 30);
		contentPane.add(btn_number_7);
		btn_number_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if textfield show 0 , turn it to the number
				if( txt_showresult.getText().equals( "0" )){ 
					txt_showresult.setText("7");
				}
				
				// if textfield show other value , add number after the value
				else{
				txt_showresult.setText( txt_showresult.getText() + "7");
				}	
			}
		});		
		
		// number 8		
		JButton btn_number_8 = new JButton("8");
		btn_number_8.setBounds(249, 90, 44, 30);
		contentPane.add(btn_number_8);
		btn_number_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if textfield show 0 , turn it to the number
				if( txt_showresult.getText().equals( "0" )){ 
					txt_showresult.setText("8");
				}
				
				// if textfield show other value , add number after the value
				else{
				txt_showresult.setText( txt_showresult.getText() + "8");
				}	
			}
		});
		
		// number 9		
		JButton btn_number_9 = new JButton("9");
		btn_number_9.setBounds(303, 90, 44, 30);
		contentPane.add(btn_number_9);
		btn_number_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if textfield show 0 , turn it to the number
				if( txt_showresult.getText().equals( "0" )){ 
					txt_showresult.setText("9");
				}
				
				// if textfield show other value , add number after the value
				else{
				txt_showresult.setText( txt_showresult.getText() + "9");
				}		
			}
		});		
		
		// number 0		
		JButton btn_number_0 = new JButton("0");
		btn_number_0.setBounds(195, 210, 44, 30);
		contentPane.add(btn_number_0);
		btn_number_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if textfield show 0 , do not change it
				if( txt_showresult.getText().equals( "0" )){ 
					txt_showresult.setText("0");
				}
				
				// if textfield show other value , add number after the value
				else{
				txt_showresult.setText( txt_showresult.getText() + "0");
				}	
			}
		});		
		
		// turn result to positive or negative
		JButton button_negative = new JButton("+ / -");
		button_negative.setBounds(249, 210, 98, 30);
		contentPane.add(button_negative);
		button_negative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// get result(String)
				get_result = txt_showresult.getText();
				
				txt_showresult.setText ( String.valueOf ( (-1) * ( Double.parseDouble( get_result ) ) ) );	
			}
		});			
		
		// plus
		JButton button_plus = new JButton("+");
		button_plus.setBounds(365, 50, 59, 30);
		contentPane.add(button_plus);
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				get_result = txt_showresult.getText();
				calculate_number = Double.parseDouble( get_result );				
				record_number( calculate_number );
				
				txt_showresult.setText("0");
				
				input_symbol = '+'; // record +
				record_symbol(input_symbol);

			}
		});			

		
		// minus		
		JButton button_minus = new JButton("-");
		button_minus.setBounds(365, 90, 59, 30);
		contentPane.add(button_minus);
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				get_result = txt_showresult.getText();
				calculate_number = Double.parseDouble( get_result );				
				record_number( calculate_number );
				
				txt_showresult.setText("0");
				
				input_symbol = '-'; // record -
				record_symbol(input_symbol);
				
			}
		});						
		
		// times	
		JButton button_times = new JButton("*");
		button_times.setBounds(365, 130, 59, 30);
		contentPane.add(button_times);
		button_times.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				get_result = txt_showresult.getText();
				calculate_number = Double.parseDouble( get_result );				
				record_number( calculate_number );
				
				txt_showresult.setText("0");
				
				input_symbol = '*'; // record *
				record_symbol(input_symbol);
				
			}
		});					
		
		// divide	
		JButton button_divide = new JButton("/");
		button_divide.setBounds(365, 170, 59, 30);
		contentPane.add(button_divide);
		button_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				get_result = txt_showresult.getText();
				calculate_number = Double.parseDouble( get_result );				
				record_number( calculate_number );
				
				txt_showresult.setText("0");
				
				input_symbol = '/'; // record /
				record_symbol(input_symbol);
				
			}
		});					
/*	
		// memory the result
		JButton button_memory = new JButton("MS");
		button_memory.setBounds(10, 50, 80, 30);
		contentPane.add(button_memory);
		button_memory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// get result(String)
				get_result = txt_showresult.getText();
				
				// turn result(String) to double , memory_number = result
				memory_number = Double.parseDouble( get_result );
			}
		});			
		
		// return result + memoried number
		JButton button_memory_plus = new JButton("M+");
		button_memory_plus.setBounds(100, 50, 80, 30);
		contentPane.add(button_memory_plus);
		button_memory_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// get result(String)
				get_result = txt_showresult.getText();

				// turn result(String) to double , calculate result + memory_number	, and show it			
				txt_showresult.setText ( String.valueOf ( ( Double.parseDouble( get_result ) + memory_number) ) );
			}
		});	
		
		// return result - memoried number		
		JButton button_memory_minus = new JButton("M-");
		button_memory_minus.setBounds(185, 50, 80, 30);
		contentPane.add(button_memory_minus);
		button_memory_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// get result(String)
				get_result = txt_showresult.getText();

				// turn result(String) to double , calculate result - memory_number	, and show it			
				txt_showresult.setText ( String.valueOf ( ( Double.parseDouble( get_result ) - memory_number ) ) );
			}
		});			
		
		// turn memoried number to 0
		JButton button_memory_clean = new JButton("MC");
		button_memory_clean.setBounds(275, 50, 80, 30);
		contentPane.add(button_memory_clean);
		button_memory_clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				memory_number = 0;
			}
		});			
*/		
		// get sin(x) of the result		
		JButton button_sin = new JButton("sin(x)");
		button_sin.setBounds(10, 130, 80, 30);
		contentPane.add(button_sin);
		button_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// get result(String)
				get_result = txt_showresult.getText();

				// turn result(String) to double , calculate it's sin() , and show it			
				txt_showresult.setText ( String.valueOf ( Math.sin(Double.parseDouble( get_result ) ) ) );
			}
		});			
		
		// get cos(x) of the result			
		JButton button_cos = new JButton("cos(x)");
		button_cos.setBounds(10, 170, 80, 30);
		contentPane.add(button_cos);
		button_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// get result(String)
				get_result = txt_showresult.getText();

				// turn result(String) to double , calculate it's cos() , and show it			
				txt_showresult.setText ( String.valueOf ( Math.cos(Double.parseDouble( get_result ) ) ) );
			}
		});			

		// get tan(x) of the result			
		JButton button_tan = new JButton("tan(x)");
		button_tan.setBounds(10, 210, 80, 30);
		contentPane.add(button_tan);
		button_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// get result(String)
				get_result = txt_showresult.getText();

				// turn result(String) to double , calculate it's tan() , and show it			
				txt_showresult.setText ( String.valueOf ( Math.tan(Double.parseDouble( get_result ) ) ) );
			}
		});	
		
		
		// get square root of the result
		JButton button_SquareRoot = new JButton("\u221A");
		button_SquareRoot.setBounds(100, 210, 80, 30);
		contentPane.add(button_SquareRoot);
		button_SquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// get result(String)
				get_result = txt_showresult.getText();

				// turn result(String) to double , calculate square Root , and show it			
				txt_showresult.setText ( String.valueOf ( Math.sqrt ( Double.parseDouble( get_result ) ) ) );
			}
		});					
		
		// get factorial of the result (only can be used when result is integer)
		JButton button_factorial = new JButton("x!");
		button_factorial.setBounds(100, 170, 80, 30);
		contentPane.add(button_factorial);
		button_factorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double factorial = 1;
				
				// get result(String)
				get_result = txt_showresult.getText();
				
				// get result(double)
				result = Double.parseDouble( get_result );
				
				// turn result(String) to double , calculate factorial			
				if (result == (int)result && result >= 0) { // if result is natural integer

					if( result == 0){
						
						 // if result == 0 , 0! = 1
						 txt_showresult.setText ( "1" ); 									
					}
					
					else{
						
						// if result != 0 , calculate it's factorial
						for(int i = (int)result ; i >= 1 ; i--){ 
							factorial = i * factorial;
						}
						
						// turn factorial(double) to string and show it	
					     txt_showresult.setText ( String.valueOf ( factorial ) );								
					}
				}
			}
		});			

		// get the reciprocal of the result	
		JButton button_reciprocal = new JButton("1 / x");
		button_reciprocal.setBounds(100, 130, 80, 30);
		contentPane.add(button_reciprocal);
		button_reciprocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// get result(String)
				get_result = txt_showresult.getText();

				// turn result(String) to double , calculate 1 / x , and show it			
				txt_showresult.setText ( String.valueOf ( 1 / ( Double.parseDouble( get_result ) ) ) );
			}
		});			
		
		// clean the result
		JButton button_clean = new JButton("C");
		button_clean.setBounds(10, 90, 170, 30);
		contentPane.add(button_clean);			
		button_clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt_showresult.setText ( "0" );
			}
		});	
	
		// show result
		JButton button_equal = new JButton("=");
		button_equal.setBounds(365, 207, 59, 33);
		contentPane.add(button_equal);
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if user already push +, -, * or /
				if( input_symbol == '+' || input_symbol == '-' || input_symbol == '*' || input_symbol == '/'){
					
					// get result(String)
					get_result = txt_showresult.getText();
					result = Double.parseDouble(get_result);
					
					calculate_equal();
				
				}
			}
		});	
		
	}
}

package Ethan.Kennedy.Chapter7.GradleJava.Project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField Numerator;
	private JTextField Denominator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Numerator = new JTextField();
		Numerator.setBounds(10, 11, 86, 20);
		frame.getContentPane().add(Numerator);
		Numerator.setColumns(10);
		
		Denominator = new JTextField();
		Denominator.setBounds(10, 42, 86, 20);
		frame.getContentPane().add(Denominator);
		Denominator.setColumns(10);
		
		JLabel Label = new JLabel("Result:");
		Label.setBounds(216, 12, 208, 50);
		frame.getContentPane().add(Label);
		
		JButton btnNewButton = new JButton("Calculate");
		
		btnNewButton.setBounds(117, 26, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double numerator = Double.parseDouble(Numerator.getText());
				double denominator = Double.parseDouble(Denominator.getText());
				
				SimpleMath simpleMath = new SimpleMath();
			
				
				
				try {
					Double result = simpleMath.divide(numerator, denominator);
					Label.setText(result.toString());
				} catch(ArithmeticException k) {
					Label.setText("Cannot divide by 0");
				}
			
			}
		});
	}
}

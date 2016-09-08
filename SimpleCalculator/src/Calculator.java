import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

	JTextField tfNum1, tfNum2;
	JButton btSum, btSubstraction, btMultiplication, btDivision;
	public double num1, num2;

	public Calculator() {

		setSize(400, 150);
		setTitle("Simple Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// intanciação de objetos
		tfNum1 = new JTextField(15);
		tfNum2 = new JTextField(15);
		btSum = new JButton("Sum");
		btSubstraction = new JButton("Subtraction");
		btMultiplication = new JButton("Multiplication");
		btDivision = new JButton("Division");

		// objetos em tela
		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));

		getContentPane().add(tfNum1);
		getContentPane().add(tfNum2);
		getContentPane().add(btSum);
		getContentPane().add(btSubstraction);
		getContentPane().add(btMultiplication);
		getContentPane().add(btDivision);

		// ações aos meus componentes
		btSum.addActionListener(this);
		btSubstraction.addActionListener(this);
		btMultiplication.addActionListener(this);
		btDivision.addActionListener(this);

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			num1 = Double.parseDouble(tfNum1.getText());
			num2 = Double.parseDouble(tfNum2.getText());
			
			if (e.getSource() == btSum) {
				JOptionPane.showMessageDialog(null, "The sum is: " + (num1 + num2));
			}
			if (e.getSource() == btSubstraction) {
				JOptionPane.showMessageDialog(null, "The substraction is: " + (num1 - num2));
			}
			if (e.getSource() == btMultiplication) {
				JOptionPane.showMessageDialog(null, "The multiplication is: " + (num1 * num2));
			}
			if (e.getSource() == btDivision) {
				JOptionPane.showMessageDialog(null, "The division is: " + (num1 / num2));
			}
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Enter valid values !");
		}
		
	}
}
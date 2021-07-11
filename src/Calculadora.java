
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import javax.swing.JTextField;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 256, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		textField = new JTextField();
		textField.setBounds(10, 48, 218, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("7");
				}
				else {
					
					textField.setText(textField.getText()+"7");
				}
			}
		});
		btn7.setBounds(10, 150, 47, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("8");
				}
				else {
					
					textField.setText(textField.getText()+"8");
				}
			}
		});
		btn8.setBounds(67, 150, 47, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("9");
				}
				else {
					
					textField.setText(textField.getText()+"9");
				}
			}
		});
		btn9.setBounds(124, 150, 47, 23);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("4");
				}
				else {
					
					textField.setText(textField.getText()+"4");
				}
			}
		});
		btn4.setBounds(10, 184, 47, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("5");
				}
				else {
					
					textField.setText(textField.getText()+"5");
				}
			}
		});
		btn5.setBounds(67, 184, 47, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("6");
				}
				else {
					
					textField.setText(textField.getText()+"6");
				}
			}
		});
		btn6.setBounds(124, 184, 47, 23);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("1");
				}
				else {
					
					textField.setText(textField.getText()+"1");
				}
			}
		});
		btn1.setBounds(10, 218, 47, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("2");
				}
				else {
					
					textField.setText(textField.getText()+"2");
				}
			}
		});
		btn2.setBounds(67, 218, 47, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("3");
				}
				else {
					
					textField.setText(textField.getText()+"3");
				}
			}
		});
		btn3.setBounds(124, 218, 47, 23);
		contentPane.add(btn3);
		
		JButton btnDividir = new JButton("\u00F7");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("/");
				}
				else {
					
					textField.setText(textField.getText()+"/");
				}
			}
		});
		btnDividir.setBounds(181, 150, 47, 23);
		contentPane.add(btnDividir);
		
		JButton btnMultiplicar = new JButton("x");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("*");
				}
				else {
					
					textField.setText(textField.getText()+"*");
				}
			}
		});
		btnMultiplicar.setBounds(181, 184, 47, 23);
		contentPane.add(btnMultiplicar);
		
		JButton btnRestar = new JButton("-");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("-");
				}
				else {
					
					textField.setText(textField.getText()+"-");
				}
			}
		});
		btnRestar.setBounds(181, 218, 47, 23);
		contentPane.add(btnRestar);
		
		JButton btnSumar = new JButton("+");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("+");
				}
				else {
					
					textField.setText(textField.getText()+"+");
				}
			}
		});
		btnSumar.setBounds(181, 252, 47, 23);
		contentPane.add(btnSumar);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("0");
				}
				else {
					
					textField.setText(textField.getText()+"0");
				}
			}
		});
		btn0.setBounds(67, 252, 47, 23);
		contentPane.add(btn0);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Expression expresion = new ExpressionBuilder(textField.getText()).build();
				double resultado = expresion.evaluate();
				textField.setText(String.valueOf(resultado));
						
			}
		});
		btnIgual.setBounds(10, 252, 47, 23);
		contentPane.add(btnIgual);
		
		JButton btnEliminarUno = new JButton("C");
		btnEliminarUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()==false) {
					
					textField.setText(textField.getText().substring(0, textField.getText().length()-1));
				}
				
			}
		});
		btnEliminarUno.setBounds(181, 116, 47, 23);
		contentPane.add(btnEliminarUno);
		
		JButton btnEliminarTodo = new JButton("CA");
		btnEliminarTodo.setHorizontalAlignment(SwingConstants.LEFT);
		btnEliminarTodo.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnEliminarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnEliminarTodo.setBounds(124, 116, 47, 23);
		contentPane.add(btnEliminarTodo);
		
		JButton btnParentesisD = new JButton(")");
		btnParentesisD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText(")");
				}
				else {
					
					textField.setText(textField.getText()+")");
				}
			}
		});
		btnParentesisD.setBounds(67, 116, 47, 23);
		contentPane.add(btnParentesisD);
		
		JButton btnParentesisI = new JButton("(");
		btnParentesisI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText("(");
				}
				else {
					
					textField.setText(textField.getText()+"(");
				}
			}
		});
		btnParentesisI.setBounds(10, 116, 47, 23);
		contentPane.add(btnParentesisI);
		
		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().isEmpty()) {
					
					textField.setText(".");
				}
				else {
					
					textField.setText(textField.getText()+".");
				}	
			}
			
		});
		btnPunto.setBounds(124, 252, 47, 23);
		contentPane.add(btnPunto);
	}
}

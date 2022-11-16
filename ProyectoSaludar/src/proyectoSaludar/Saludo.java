package proyectoSaludar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Saludo extends JFrame {

	private JPanel contentPane;
	private JTextField cajaNombre;
	private JButton botonSaludar;
	private JButton botonDespedirse;
	private JLabel etiquetaSaludo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saludo frame = new Saludo();
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
	public Saludo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cajaNombre = new JTextField();
		cajaNombre.setBounds(42, 39, 96, 20);
		contentPane.add(cajaNombre);
		cajaNombre.setColumns(10);
		
		botonSaludar = new JButton("Saludar");
		botonSaludar.setBounds(192, 38, 106, 23);
		botonSaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				etiquetaSaludo.setText("Hola "+ cajaNombre.getText());
				cajaNombre.setText(null);
				cajaNombre.requestFocus();
				
			}
		});
		contentPane.add(botonSaludar);
		
		botonDespedirse = new JButton("Despedirse");
		botonDespedirse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				etiquetaSaludo.setText("Adiós, "+ cajaNombre.getText());
				cajaNombre.setText(null);
				cajaNombre.requestFocus();
				
			}
		});
		botonDespedirse.setBounds(192, 109, 106, 23);
		contentPane.add(botonDespedirse);
		
		etiquetaSaludo = new JLabel("");
		etiquetaSaludo.setBounds(42, 189, 96, 22);
		contentPane.add(etiquetaSaludo);
	}
}

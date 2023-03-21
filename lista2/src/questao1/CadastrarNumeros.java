package questao1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarNumeros extends JFrame {

	private JPanel contentPane;
	private JTextField textNumeroCadastro;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarNumeros frame = new CadastrarNumeros();
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
	public CadastrarNumeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNumeroCadastro = new JTextField();
		textNumeroCadastro.setBounds(122, 57, 86, 20);
		contentPane.add(textNumeroCadastro);
		textNumeroCadastro.setColumns(10);
		
		textResultado = new JTextField();
		textResultado.setEditable(false);
		textResultado.setBounds(284, 57, 86, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		JLabel lblNumero = new JLabel("Cadastro de Numero");
		lblNumero.setBounds(10, 60, 102, 14);
		contentPane.add(lblNumero);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(225, 60, 68, 14);
		contentPane.add(lblResultado);
		
		JButton btnCadastro = new JButton("CADASTRAR");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnCadastro.setBounds(117, 88, 102, 23);
		contentPane.add(btnCadastro);
		
		JButton btnExibir = new JButton("EXIBIR");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnExibir.setBounds(283, 88, 102, 23);
		contentPane.add(btnExibir);
	}
}

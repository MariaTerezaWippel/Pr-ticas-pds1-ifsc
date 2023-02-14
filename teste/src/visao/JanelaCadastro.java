package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionario;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtCPF;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastro frame = new JanelaCadastro();
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
	public JanelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(180, 126, 89, 23);
		btnSalvar.setForeground(new Color(255, 0, 0));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = txtNome.getText();
				String cpf = txtCPF.getText();

				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
				}
				if (cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum CPF preenchido!");

				}
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCpf(Long.valueOf(cpf));

				FuncionarioDAO bancoDeDados = FuncionarioDAO.getInstance();
				bancoDeDados.inserir(func);
			}
		});

		contentPane.setLayout(null);
		contentPane.add(btnSalvar);

		txtCPF = new JTextField();
		txtCPF.setBounds(180, 93, 86, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		txtNome = new JTextField();
		txtNome.setBounds(180, 62, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(134, 65, 46, 14);
		lblNome.setForeground(new Color(0, 64, 128));
		contentPane.add(lblNome);

		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(134, 96, 46, 14);
		lblCPF.setForeground(new Color(0, 64, 128));
		contentPane.add(lblCPF);
	}
}

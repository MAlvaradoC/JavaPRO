package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class VentanaLogin extends JFrame {

	private JPanel contenedor;
	private JTextField textUser;
	private JPasswordField textPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
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
	public VentanaLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaLogin.class.getResource("/resources/login.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contenedor = new JPanel();
		setContentPane(contenedor);
		contenedor.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel etUsuario = new JLabel("USUARIO:");
		etUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		etUsuario.setForeground(Color.YELLOW);
		etUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		etUsuario.setBounds(36, 192, 60, 15);
		contenedor.add(etUsuario);
		
		JLabel etPassword = new JLabel("PASSWORD:");
		etPassword.setHorizontalAlignment(SwingConstants.CENTER);
		etPassword.setForeground(Color.YELLOW);
		etPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		etPassword.setBounds(20, 226, 76, 15);
		contenedor.add(etPassword);
		
		textUser = new JTextField();
		textUser.setColumns(20);
		textUser.setBounds(106, 190, 166, 20);
		contenedor.add(textUser);
		
		textPass = new JPasswordField();
		textPass.setColumns(20);
		textPass.setBounds(106, 224, 166, 20);
		contenedor.add(textPass);
		
		JButton btnLogin = new JButton("ENTRAR");
		btnLogin.setFocusPainted(false);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLogin.setIcon(new ImageIcon(VentanaLogin.class.getResource("/resources/iniciar.png")));
		btnLogin.setBounds(305, 218, 104, 32);
		contenedor.add(btnLogin);
		
		JLabel etFondo = new JLabel("");
		etFondo.setIcon(new ImageIcon(VentanaLogin.class.getResource("/resources/unmsm_oficial.jpg")));	
		etFondo.setBounds(0, 0, 594, 272);
		contenedor.add(etFondo);
		
	}
}

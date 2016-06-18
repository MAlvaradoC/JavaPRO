package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contenedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/resources/logo_infiem.png")));
		setTitle("INFIEM :::: SOFTWARE DE APOYO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contenedor = new JPanel();
		setContentPane(contenedor);
		contenedor.setLayout(null);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 794, 21);
		contenedor.add(menuBar);
		
		JMenu mnAlumnos = new JMenu("Alumnos");
		menuBar.add(mnAlumnos);
		
		JMenu mnEmpresas = new JMenu("Empresas");
		menuBar.add(mnEmpresas);
		
		JMenu mnAdministradores = new JMenu("Administradores");
		menuBar.add(mnAdministradores);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JButton btnMostrarAlumnos = new JButton("MOSTRAR ALUMNOS");
		btnMostrarAlumnos.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/resources/alumno.png")));
		btnMostrarAlumnos.setFocusPainted(false);
		btnMostrarAlumnos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnMostrarAlumnos.setBounds(12, 142, 168, 32);
		contenedor.add(btnMostrarAlumnos);
		
		JButton btnRegistrarAlumno = new JButton("REGISTRAR ALUMNO");
		btnRegistrarAlumno.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/resources/addAlumno.png")));
		btnRegistrarAlumno.setFocusPainted(false);
		btnRegistrarAlumno.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegistrarAlumno.setBounds(12, 185, 168, 32);
		contenedor.add(btnRegistrarAlumno);
		
		JButton btnMostrarEmpresas = new JButton("MOSTRAR EMPRESAS");
		btnMostrarEmpresas.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/resources/empresa.png")));
		btnMostrarEmpresas.setFocusPainted(false);
		btnMostrarEmpresas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnMostrarEmpresas.setBounds(616, 142, 168, 32);
		contenedor.add(btnMostrarEmpresas);
		
		JButton btnRegistrarEmpresa = new JButton("REGISTRAR EMPRESA");
		btnRegistrarEmpresa.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/resources/addEmpresa.png")));
		btnRegistrarEmpresa.setFocusPainted(false);
		btnRegistrarEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegistrarEmpresa.setBounds(616, 185, 168, 32);
		contenedor.add(btnRegistrarEmpresa);
		
		JLabel etFondo = new JLabel("");
		etFondo.setFocusable(false);
		etFondo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/resources/fisi_unmsm.jpg")));
		etFondo.setBounds(0, 21, 794, 551);
		contenedor.add(etFondo);
	}
}

package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaEmpresaNueva extends JDialog {
	JLabel Añadir;
	JLabel nombre;
	JLabel area;
	JLabel direccion;
	JLabel telefono;
	JTextField CNombre;
	JTextField CArea;
	JTextField CDireccion;
	JTextField CTelefono;
	JPanel p1, p2, p3, p4;
	JButton guardarE;

	public VentanaEmpresaNueva(VentanaEmpresa a, boolean modal) {
		super(a, "Nueva Empresa ", modal);
		setLayout(new BorderLayout());
		setSize(800, 600);
		JPanel norte = panel1();
		JPanel centro = panel4();

		add(norte, BorderLayout.NORTH);
		add(centro, BorderLayout.CENTER);
		setLocationRelativeTo(null);

	}

	public JPanel panel1() {
		p1 = new JPanel(new FlowLayout());
		Añadir = new JLabel("Llenado de datos de la Empresa");
		p1.add(Añadir);
		return p1;

	}

	public JPanel panel2() {
		p2 = new JPanel(new GridLayout(4, 2));
		nombre = new JLabel("Nombre:");
		CNombre = new JTextField(20);
		area = new JLabel("Area:");
		CArea = new JTextField(20);
		direccion = new JLabel("Direccion:");
		CDireccion = new JTextField(20);
		telefono = new JLabel("Telefono");
		CTelefono = new JTextField(20);
		p2.add(nombre);
		p2.add(CNombre);
		p2.add(area);
		p2.add(CArea);
		p2.add(direccion);
		p2.add(CDireccion);
		p2.add(telefono);
		p2.add(CTelefono);

		return p2;

	}

	public JPanel panel3() {
		p3 = new JPanel(new FlowLayout());
		guardarE = new JButton("Guardar");
		p3.add(guardarE);
		return p3;
	}

	public JPanel panel4() {
		p4 = new JPanel(new BorderLayout());
		JPanel norte = panel2();
		JPanel centro = panel3();
		p4.add(norte, BorderLayout.NORTH);
		p4.add(centro, BorderLayout.SOUTH);
		return p4;

	}

	class ManejadordeBBuscar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == guardarE) {

			}
		}

	}

}

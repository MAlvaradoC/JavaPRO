package interfaz;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class VentanaNuevoAlumno extends JDialog 
{
	private JLabel lNombre, lCodigo, lCiclo, lFechaNacimiento, lAnioIngreso, lEscuela;
	private JTextField tfNombre, tfCodigo, tfCiclo, tfFechaNacimiento, tfAnioIngreso, tfEscuela;
	private Border border;
	private JButton bGuardar;

	public VentanaNuevoAlumno(VentanaAlumno miVentanaAlumno, boolean modal)
	{
		super(miVentanaAlumno, modal);
		setTitle("NUEVO ALUMNO");
		
		Container contenedor = getContentPane();
		contenedor.setLayout(new BorderLayout());
		
		border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		
		JPanel pNorte = crearPNorte();
		contenedor.add(pNorte, BorderLayout.NORTH);
		
		JPanel pCentro = crearPCentro();
		contenedor.add(pCentro, BorderLayout.CENTER);
		
		JPanel pSur = crearPSur();
		contenedor.add(pSur, BorderLayout.SOUTH);
		
		setSize(800,600);
		setLocationRelativeTo(null);
	}
	public JPanel crearPNorte()
	{
		JPanel p = new JPanel(new GridLayout(6,2));
		TitledBorder title = BorderFactory.createTitledBorder(border,"Datos personales");
		p.setBorder(title);
		
		lNombre = new JLabel("Nombres y apellidos:");
		lCodigo = new JLabel("Código de matricula:");
		lFechaNacimiento = new JLabel("Fecha de nacimiento:");
		lEscuela = new JLabel("Escuela Académico Profesional:");
		lAnioIngreso = new JLabel("Año de ingreso:");
		lCiclo = new JLabel("Ciclo en curso:");
		
		tfNombre = new JTextField();
		tfCodigo = new JTextField();
		tfFechaNacimiento = new JTextField();
		tfEscuela = new JTextField();
		tfAnioIngreso = new JTextField();
		tfCiclo = new JTextField();
		
		p.add(lNombre);
		p.add(tfNombre);
		p.add(lCodigo);
		p.add(tfCodigo);
		p.add(lFechaNacimiento);
		p.add(tfFechaNacimiento);
		p.add(lEscuela);
		p.add(tfEscuela);
		p.add(lAnioIngreso);
		p.add(tfAnioIngreso);
		p.add(lCiclo);
		p.add(tfCiclo);
		
		return p;
		
	}
	public JPanel crearPCentro()
	{
		JPanel p = new JPanel(new BorderLayout());
		TitledBorder title = BorderFactory.createTitledBorder(border,"Conocimientos");
		p.setBorder(title);
		
		p.add(new JLabel(".......FALTA COMPLETAR......."), BorderLayout.CENTER);
		
		return p;
	}
	public JPanel crearPSur()
	{
		JPanel p = new JPanel(new BorderLayout());
		
		bGuardar = new JButton("GUARDAR ALUMNO");
		p.add(bGuardar, BorderLayout.SOUTH);
		
		return p;
	}
	
}

package interfaz;

import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class VentanaAlumno extends JDialog {
	private JButton bNuevo, bBuscar, bBuscarCodigo, bBuscarNombre, bBuscarCiclo;
	private JTextField tBuscar;
	private JTable tbTabla;
	private Border border;
	private VentanaNuevoAlumno miVentanaNuevoAlumno;
	
	public VentanaAlumno(VentanaPrincipal miVentanaPrincipal, boolean modal)
	{
		super(miVentanaPrincipal,modal);
		setTitle("VENTANA ALUMNO");
		
		Container contenedor = getContentPane();
		contenedor.setLayout(new BorderLayout());
		
		//Definimos el borde que utlizaremos en todos los paneles
		border=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		
		//Creamos el panel norte del BORDERLAYOUT. Instanciandolo en un metodo aparte para mayor orden
		JPanel pNorte = crearPNorte();
		
		//Agregamos el panel norte al contenedor
		contenedor.add(pNorte, BorderLayout.NORTH);
		
		//Creamos el panel centro
		JPanel pCentro= crearPCentro();
		contenedor.add(pCentro, BorderLayout.CENTER);
		
		miVentanaNuevoAlumno= new VentanaNuevoAlumno(this, true);
		
		setSize(800,600);
		setLocationRelativeTo(null);
		
	}
	public JPanel crearPNorte()
	{
		JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		//Se instancia un titleBorder con el titulo y con el obejto Border creado en el constructor
		TitledBorder title=BorderFactory.createTitledBorder(border,"NUEVO");
		
		//añadimos el borde al panel
		p.setBorder(title);
		
		bNuevo = new JButton("INGRESAR ALUMNO");
		bNuevo.addActionListener(al);
		p.add(bNuevo);
		
		return p;
	}
	public JPanel crearPCentro()
	{
		JPanel p = new JPanel(new BorderLayout());
		
		TitledBorder title = BorderFactory.createTitledBorder(border,"BUSCAR");
		p.setBorder(title);
		
		JPanel pNorte = crearPNorte2();
		p.add(pNorte, BorderLayout.NORTH);
		
		JPanel pCentro = crearPCentro2();
		p.add(pCentro, BorderLayout.CENTER);
		
		return p;
	}
	public JPanel crearPNorte2()
	{
		JPanel p = new JPanel(new GridLayout(2,1));
		
		TitledBorder title = BorderFactory.createTitledBorder(border,"Según");
		p.setBorder(title);
		
		JPanel p1 = crearFila1();
		p.add(p1);
		
		JPanel p2 = crearFila2();
		p.add(p2);
		
		return p;
	}
	public JPanel crearFila1()
	{
		JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		bBuscarNombre = new JButton("Nombre");
		p.add(bBuscarNombre);
		
		bBuscarCodigo = new JButton("Código");
		p.add(bBuscarCodigo);
		
		bBuscarCiclo = new JButton("Ciclo");
		p.add(bBuscarCiclo);
		
		return p;
	}
	public JPanel crearFila2()
	{
		JPanel p = new JPanel(new BorderLayout());
		
		tBuscar = new JTextField();
		p.add(tBuscar, BorderLayout.CENTER);
		
		bBuscar = new JButton("Buscar");
		p.add(bBuscar, BorderLayout.EAST);
		
		return p;
	}
	public JPanel crearPCentro2()
	{
		JPanel p = new JPanel(new BorderLayout());
		
		TitledBorder title = BorderFactory.createTitledBorder(border,"Resultado(s)");
		p.setBorder(title);
		
		Object [][] datos = new Object[100][4];
		String[] cabeceras = new String[]{"Código","Nombre","Ciclo","Promedio"};
		tbTabla = new JTable(datos, cabeceras);
		JScrollPane scroll = new JScrollPane(tbTabla);
		
		p.add(scroll, BorderLayout.CENTER);
		
		return p;
	}
	private ActionListener al = new ActionListener(){
		public void actionPerformed(ActionEvent evt)
		{
			if(evt.getSource()==bNuevo)
			{
				miVentanaNuevoAlumno.setVisible(true);
			}
		}
		
	};
	
	
}

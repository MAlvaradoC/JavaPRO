package interfaz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
public class VentanaEmpresa extends JDialog {
	VentanaEmpresaNueva NEmpresa;
	JButton buscar,modificar,eliminar,añadir;
	JComboBox buscarpor;
	JTextField text;
	JTable listEmpresas;
	JScrollPane splista;
	JPanel p1,p2,p3,p4,p5;
	String [] por = {"buscar por ","codigo","nombre","area"};
	Border blackline;
	TitledBorder title5,title4;
	public VentanaEmpresa(VentanaPrincipal miVentanaPrincipal, boolean modal){
		super(miVentanaPrincipal,modal);
		setTitle("VENTANA EMPRESA");
		setSize(800,600);
        getContentPane().setLayout(new BorderLayout());
		NEmpresa=new VentanaEmpresaNueva(this,true);
		JPanel Norte = PanelNorte();
		JPanel Centro=PanelCentro();
		blackline = BorderFactory.createLineBorder(Color.black);
		title5 = BorderFactory.createTitledBorder(blackline, "Añadir");
		title4 = BorderFactory.createTitledBorder(blackline, "Mostrar");
	 
		add(Norte,BorderLayout.NORTH);
		add(Centro,BorderLayout.CENTER);
		Norte.setBorder(title5);
	    Centro.setBorder(title4);
	
		setLocationRelativeTo(null);
		
	}
	public JPanel PanelNorte(){
		p1=new JPanel(new FlowLayout());
		añadir =new JButton("NuevaEmpresa");
		p1.add(añadir);
		añadir.addActionListener(new ManejodeBAñadir());
		return p1;
		
	}
	public JPanel Panel2(){
		
		p2=new JPanel(new BorderLayout());
        buscarpor =new JComboBox(por);
		text =new JTextField();
		buscar=new JButton("Buscar");
		p2.add(buscarpor,BorderLayout.WEST);
		p2.add(text,BorderLayout.CENTER);
		p2.add(buscar,BorderLayout.EAST);
		return p2;
		
	}
	public JPanel Panel3(){
		p3=new JPanel(new FlowLayout());
		modificar=new JButton("Modificar");
		eliminar=new JButton ("Eliminar");
		p3.add(modificar);
		p3.add(eliminar);
		return p3;
		
	}
	public JPanel Panel4(){
		p4=new JPanel(new BorderLayout());
		Object [][] datos = new Object[500][4];
		String[] items = new String[]{"Codigo","Nombre","Area","Telefono"};
		listEmpresas = new JTable(datos, items);
		splista=new JScrollPane(listEmpresas);
		p4.add(splista,BorderLayout.CENTER);
		return p4;
		
	}
	public JPanel PanelCentro(){
		p5=new JPanel(new BorderLayout());
		JPanel norte = Panel2();
		JPanel este = Panel3();
		JPanel centro=Panel4();
		p5.add(norte,BorderLayout.NORTH);
		p5.add(este,BorderLayout.SOUTH);
		p5.add(centro,BorderLayout.CENTER);
		return p5;
			
	}
	class ManejodeBAñadir implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == añadir){
				NEmpresa.setVisible(true);
				
			}
			
		}
		
	}
	

	
	
		
	
	

}

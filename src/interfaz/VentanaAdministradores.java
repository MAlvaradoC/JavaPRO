package interfaz;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaAdministradores extends JDialog {
	private JPanel contenedor; // creamos un panel para añadir los componentes ahi
	private JLabel labelTitulo;

	public VentanaAdministradores(VentanaPrincipal miVentanaPrincipal, boolean modal) {
		/**
		 * Al llamar al constructor super(), le enviamos el JFrame Padre y la
		 * propiedad booleana que determina que es hija
		 */
		super(miVentanaPrincipal, modal);
		iniciarComponentes();
		
		setTitle("VENTANA ADMINISTRADORES");
		setSize(400, 200);
		setLocationRelativeTo(null);
	}
	
	private void iniciarComponentes(){
		contenedor = new JPanel();
		contenedor.setLayout(null);
		
		labelTitulo = new JLabel();
		labelTitulo.setText("AÑADIR COMPONENTES");
		labelTitulo.setBounds(20, 20, 180, 23);

		contenedor.add(labelTitulo);
		
		add(contenedor);//añadimos el panel a nuestra ventana (JDialog)
	}
}

package interfaz;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaAcercaDe extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAcercaDe dialog = new VentanaAcercaDe();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public VentanaAcercaDe() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblInfiemVb = new JLabel("INFIEM v0.1b");
		lblInfiemVb.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblInfiemVb.setBounds(184, 86, 66, 14);
		getContentPane().add(lblInfiemVb);
		
		JLabel lblProgramaDesarrolladoPor = new JLabel("PROGRAMA DESARROLLADO POR:");
		lblProgramaDesarrolladoPor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblProgramaDesarrolladoPor.setBounds(133, 131, 168, 14);
		getContentPane().add(lblProgramaDesarrolladoPor);
		
		JLabel lblUniversidadNacionalMayor = new JLabel("UNIVERSIDAD NACIONAL MAYOR DE SAN MARCOS");
		lblUniversidadNacionalMayor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUniversidadNacionalMayor.setBounds(94, 11, 247, 14);
		getContentPane().add(lblUniversidadNacionalMayor);
		
		JLabel lblFacultadDeIngenieria = new JLabel("FACULTAD DE INGENIERIA DE SISTEMAS E INFORMATICA");
		lblFacultadDeIngenieria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFacultadDeIngenieria.setBounds(77, 33, 281, 14);
		getContentPane().add(lblFacultadDeIngenieria);
		
		JLabel lblJunio = new JLabel("JUNIO 2016");
		lblJunio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblJunio.setBounds(366, 237, 58, 14);
		getContentPane().add(lblJunio);
		
		JLabel lblAraujoBravoJuan = new JLabel("Araujo Bravo, Juan El\u00EDas");
		lblAraujoBravoJuan.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAraujoBravoJuan.setBounds(159, 178, 117, 14);
		getContentPane().add(lblAraujoBravoJuan);
		
		JLabel lblAlvaradoChaupisMiguel = new JLabel("Alvarado Chaupis, Miguel Angel");
		lblAlvaradoChaupisMiguel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAlvaradoChaupisMiguel.setBounds(142, 159, 151, 14);
		getContentPane().add(lblAlvaradoChaupisMiguel);
		
		JLabel lblArtegaQuicoAlisson = new JLabel("Arteaga Quico, Alisson Diane");
		lblArtegaQuicoAlisson.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblArtegaQuicoAlisson.setBounds(148, 197, 139, 14);
		getContentPane().add(lblArtegaQuicoAlisson);
		
		JLabel lblCaballeroFonsecaRal = new JLabel("Caballero Fonseca, Ra\u00FAl Omar");
		lblCaballeroFonsecaRal.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCaballeroFonsecaRal.setBounds(145, 216, 145, 14);
		getContentPane().add(lblCaballeroFonsecaRal);

	}

}

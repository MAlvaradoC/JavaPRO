package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConectToDB {
	
	Connection miConexion;
	PreparedStatement consulta;
	ResultSet datos;

	public Connection getConnection(String DB, String usuario, String password){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String servidor = "jdbc:mysql://localhost/" + DB;
			
			miConexion = DriverManager.getConnection(DB, usuario, password);
			
		}catch(ClassNotFoundException e ){
			System.out.println("No se encontro Driver");
			miConexion = null;
		}catch(SQLException e1){
			System.out.println("No se pudo conectar a la base de datos");
			miConexion = null;
		}
		return miConexion;
	}
	
	public void consulta(){
		try{
			miConexion = (Connection) getConnection("db-infiem", "root", "szfjRqhrWyw7A3N5");
			consulta = miConexion.prepareStatement("SELECT usuario, edad FROM curso.tabla");
			datos = consulta.executeQuery();
			
			while(datos.next()){
				System.out.println("Usuario: " + datos.getString("usuarios"));
				System.out.println("\n");
			}
			
		}catch(Exception e){
			
		}
	}
	
}

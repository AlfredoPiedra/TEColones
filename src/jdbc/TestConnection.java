package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/tecolonesdb";
		String user = "tecolonesconnection";
		String pass = "tecolonesconnection";
		
		try{
			
			System.out.println(".....Conectando a la base");
			Connection conn = 
					DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Conexion exitosa");
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}

}

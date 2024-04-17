package dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DaoConexion {
	Connection cnn;
	public DaoConexion(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public Connection conectar() throws Exception {
		Properties pr = new Properties();
		InputStream configInput=null;
		try {
			configInput = new FileInputStream("cnf.properties");
			pr.load(configInput);
			cnn = DriverManager.getConnection(pr.getProperty("url"), pr.getProperty("user"), pr.getProperty("pass"));
			return cnn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		throw new Exception("error");
	}
	
	public void desconectar() throws Exception{
		try {
			cnn.close();
		}catch(Exception ex){
			throw new Exception("error");
		}
	}
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import controller.Articulo;

public class DaoArticulos implements IDao<Articulo> {
	DaoConexion cnn;
	DaoArticulos(){
		cnn=new DaoConexion();
	}
	@Override
	public void agregar(Articulo art) throws Exception{
		try {
			Connection conx = cnn.conectar();
			PreparedStatement comando=conx.prepareStatement("insert into articulos (nombre,cantidad) values (?,?)");
			comando.setString(1,art.getNombre());
			comando.setInt(2,art.getCantidad());
			comando.executeUpdate();
			cnn.desconectar();
		} catch (Exception e) {
			
		}
	}
	public void eliminar(int id) throws Exception{}
	public Articulo buscar(int id) throws Exception{
		
		return new Articulo();
	}
	public List<Articulo> listar() throws Exception{
		
		return new List<Articulo>();
	}
}

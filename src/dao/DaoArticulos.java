package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import controller.Articulo;

public class DaoArticulos implements IDao<Articulo> {
	DaoConexion cnn;
	public DaoArticulos(){
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
			e.printStackTrace();
		}
	}
	public void eliminar(int id) throws Exception{
		try {
			Connection conx = cnn.conectar();
			PreparedStatement comando=conx.prepareStatement("DELETE FROM articulos WHERE id_codigo=?");
			comando.setInt(1,id);
			comando.executeUpdate();
			cnn.desconectar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Articulo buscar(int id) throws Exception{
		try {
			Articulo articulo;
			Connection conx = cnn.conectar();
			PreparedStatement comando=conx.prepareStatement("Select * FROM articulos WHERE id_codigo=?");
			comando.setInt(1,id);
			ResultSet resultado = comando.executeQuery();
			if(resultado.next()) {
				articulo = new Articulo(id,resultado.getString(2),resultado.getInt(3));
				resultado.close();
				cnn.desconectar();
				return articulo;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		throw new Exception("Error buscando");
	}
	public List<Articulo> listar() throws Exception{
		List<Articulo> articulos = new ArrayList<Articulo>();
		try {
		Connection conx = cnn.conectar();
		PreparedStatement comando = conx.prepareStatement("select * from articulos");
		ResultSet registro = comando.executeQuery();
		while(registro.next()){
			Articulo articulo = new Articulo(registro.getInt(1),registro.getString(2),registro.getInt(3));
			articulos.add(articulo);
		}
		registro.close();
		cnn.desconectar();
		return articulos;
		}catch(Exception e) {
			e.printStackTrace();
		}
		throw new Exception("Error listando");
	}
}

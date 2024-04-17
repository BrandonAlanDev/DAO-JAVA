package dao;

import java.util.List;

public interface IDao<T> {
	void agregar(T art)throws Exception;
	void eliminar(int id)throws Exception;
	T buscar(int id)throws Exception;
	List<T> listar()throws Exception;
}

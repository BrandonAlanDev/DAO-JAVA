package controller;

public class Articulo {
	private int id_codigo;
	private String nombre;
	private int cantidad;
	
	public Articulo(int id,String nombre,int cantidad){
		this.id_codigo=id;
		this.nombre=nombre;
		this.cantidad=cantidad;
	}
	public int getCodigo() {return this.id_codigo;}
	public String getNombre() {return this.nombre;}
	public int getCantidad() {return this.cantidad;}
	public void setCodigo(int id) {this.id_codigo=id;}
	public void setNombre(String nombre) {this.nombre=nombre;}
	public void setCantidad(int cantidad) {this.cantidad=cantidad;}
}

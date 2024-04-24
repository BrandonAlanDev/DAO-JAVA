package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import dao.DaoArticulos;
import view.MainView;

public class controladora {
	MainView ventana;
	DaoArticulos daoarticulos;
	ActionListener acAgregar;
	ActionListener acBuscar;
	ActionListener acModificar;
	ActionListener acEliminar;
	
	public controladora(MainView vista) {
		ventana=vista;
		daoarticulos=new DaoArticulos();
	}
	public void listar() {
		ventana.modelo.clear();
		try {
			List<Articulo> lista = daoarticulos.listar();
			for(Articulo a : lista) {
				ventana.modelo.addElement(a);
			}
		}catch(Exception e){
			ventana.setTitle(e.toString());
		}
	}
	public void iniciar() {
		acAgregar=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				Articulo articulo = new Articulo(0,ventana.nombreTF.getText(),Integer.parseInt( ventana.nombreTF.getText()));
				daoarticulos.agregar(articulo);
				listar();
				}catch(Exception ex){
					ventana.setTitle(ex.toString());
				}
			}
		};
		
		acBuscar=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Articulo articulo = daoarticulos.buscar(Integer.parseInt(ventana.codigoTF.getText()));
					ventana.lblNombreResultado.setText(articulo.getNombre());
					ventana.lblCantidadResultado.setText(String.valueOf(articulo.getCantidad()));
					ventana.lblCodigoResultado.setText(String.valueOf(articulo.getCodigo()));
					}catch(Exception ex){
						ventana.setTitle(ex.toString());
					}
				
			}
		};
		
		acModificar=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		acEliminar=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		ventana.btnAgregar.addActionListener(acAgregar);
		ventana.btnBuscar.addActionListener(acAgregar);
		ventana.btnEliminar.addActionListener(acAgregar);
		ventana.btnModificar.addActionListener(acAgregar);
		ventana.setVisible(true);
	}
}

package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Articulo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel container;
	public JTextField nombreTF;
	public JTextField cantidadTF;
	public JTextField codigoTF;
	public JButton btnBuscar;
	public JButton btnEliminar;
	public JButton btnModificar;
	public JButton btnAgregar;
	public JLabel lblNombreResultado;
	public JLabel lblCodigoResultado;
	public JLabel lblCantidadResultado;
	public JList<Articulo> list= new JList<>(new DefaultListModel<>());
	public DefaultListModel<Articulo> modelo = (DefaultListModel<Articulo>) list.getModel();
	
	

	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		container = new JPanel();
		container.setForeground(new Color(255, 255, 255));
		container.setBackground(new Color(38, 82, 91));
		container.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(container);
		container.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel izquierda = new JPanel();
		izquierda.setForeground(new Color(255, 255, 255));
		izquierda.setBackground(new Color(38, 82, 91));
		container.add(izquierda);
		izquierda.setLayout(new BoxLayout(izquierda, BoxLayout.Y_AXIS));
		
		JPanel panelNombre = new JPanel();
		izquierda.add(panelNombre);
		panelNombre.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelNombre.setBackground(new Color(38, 82, 91));
		
		JLabel lblNombre = new JLabel("Nombre : ");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelNombre.add(lblNombre);
		
		nombreTF = new JTextField();
		panelNombre.add(nombreTF);
		nombreTF.setColumns(10);
		
		JPanel panelCantidad = new JPanel();
		izquierda.add(panelCantidad);
		panelCantidad.setBackground(new Color(38, 82, 91));
		
		JLabel lblCantidad = new JLabel("Cantidad : ");
		panelCantidad.add(lblCantidad);
		lblCantidad.setForeground(new Color(255, 255, 255));
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		cantidadTF = new JTextField();
		cantidadTF.setColumns(10);
		panelCantidad.add(cantidadTF);
		
		JPanel panelA = new JPanel();
		izquierda.add(panelA);
		panelA.setBackground(new Color(38, 82, 91));
		
		btnAgregar = new JButton("Agregar");
		panelA.add(btnAgregar);
		
		JPanel panelCodigo = new JPanel();
		izquierda.add(panelCodigo);
		panelCodigo.setBackground(new Color(38, 82, 91));
		
		JLabel lblCodigo = new JLabel("Codigo : ");
		panelCodigo.add(lblCodigo);
		lblCodigo.setForeground(new Color(255, 255, 255));
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		codigoTF = new JTextField();
		codigoTF.setColumns(10);
		panelCodigo.add(codigoTF);
		
		JPanel panelBEM = new JPanel();
		izquierda.add(panelBEM);
		panelBEM.setBackground(new Color(38, 82, 91));
		
		btnBuscar = new JButton("Buscar");
		panelBEM.add(btnBuscar);
		
		btnEliminar = new JButton("Eliminar");
		panelBEM.add(btnEliminar);
		
		btnModificar = new JButton("Modificar");
		panelBEM.add(btnModificar);
		
		JPanel panelNombreInfo = new JPanel();
		izquierda.add(panelNombreInfo);
		panelNombreInfo.setBackground(new Color(38, 82, 91));
		
		JLabel lblNombreInf = new JLabel("Nombre : ");
		panelNombreInfo.add(lblNombreInf);
		lblNombreInf.setForeground(new Color(255, 255, 255));
		lblNombreInf.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblNombreResultado = new JLabel("Mi Nombre");
		panelNombreInfo.add(lblNombreResultado);
		lblNombreResultado.setForeground(new Color(255, 255, 255));
		lblNombreResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblCantidadResultado = new JLabel("Cantidad");
		lblCantidadResultado.setForeground(Color.WHITE);
		lblCantidadResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelNombreInfo.add(lblCantidadResultado);
		
		JPanel panelCodigoInfo = new JPanel();
		izquierda.add(panelCodigoInfo);
		panelCodigoInfo.setBackground(new Color(38, 82, 91));
		
		JLabel lblCodigoInf = new JLabel("Codigo : ");
		panelCodigoInfo.add(lblCodigoInf);
		lblCodigoInf.setForeground(new Color(255, 255, 255));
		lblCodigoInf.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblCodigoResultado = new JLabel("Mi Codigo");
		panelCodigoInfo.add(lblCodigoResultado);
		lblCodigoResultado.setForeground(new Color(255, 255, 255));
		lblCodigoResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel derecha = new JPanel();
		derecha.setForeground(new Color(255, 255, 255));
		derecha.setBackground(new Color(38, 82, 91));
		container.add(derecha);
		
		derecha.add(list);
	}

}

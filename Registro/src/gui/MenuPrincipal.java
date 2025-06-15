package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setTitle("Menú Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 633, 28);
		contentPane.add(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento ");
		menuBar.add(mnMantenimiento);
		
		JMenu mnAlumno = new JMenu("Alumno");
		mnMantenimiento.add(mnAlumno);
		
		JMenuItem mntmAdicionar = new JMenuItem("Adicionar");
		mntmAdicionar.setSelected(true);
		mnAlumno.add(mntmAdicionar);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mnAlumno.add(mntmConsultar);
		
		JMenuItem mntmModificar = new JMenuItem(" Modificar");
		mntmModificar.setSelected(true);
		mnAlumno.add(mntmModificar);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mnAlumno.add(mntmEliminar);
		
		JMenu mnCurso = new JMenu("Curso");
		mnMantenimiento.add(mnCurso);
		
		JMenuItem mntmAdicionar_1 = new JMenuItem("Adicionar");
		mntmAdicionar_1.setSelected(true);
		mnCurso.add(mntmAdicionar_1);
		
		JMenuItem mntmConsultar_1 = new JMenuItem("Consultar");
		mnCurso.add(mntmConsultar_1);
		
		JMenuItem mntmModificar_1 = new JMenuItem(" Modificar");
		mntmModificar_1.setSelected(true);
		mnCurso.add(mntmModificar_1);
		
		JMenuItem mntmEliminar_1 = new JMenuItem("Eliminar");
		mnCurso.add(mntmEliminar_1);
		
		JMenu mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		JMenu mnMatrícula = new JMenu("Matrícula");
		mnRegistro.add(mnMatrícula);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Adicionar");
		mnMatrícula.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Consultar, Modificar, Eliminar");
		mnMatrícula.add(mntmNewMenuItem);
		
		JMenu mnRetiro = new JMenu("Retiro");
		mnRegistro.add(mnRetiro);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Consultar, Modificar, Eliminar");
		mnRetiro.add(mntmNewMenuItem_6);
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Alumno y curso");
		mnConsulta.add(mntmNewMenuItem_4);
		
		JMenuItem mntmMatricula_y_Retiro = new JMenuItem("Matrícula y retiro");
		mnConsulta.add(mntmMatricula_y_Retiro);
		
		JMenu mnReporte = new JMenu("Reporte");
		menuBar.add(mnReporte);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Alumnos con matrícula pendiente");
		mnReporte.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Alumnos con matrícula vigente");
		mnReporte.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Alumnos matrículados por curso");
		mnReporte.add(mntmNewMenuItem_3);
		
		setVisible(true);
	}
}

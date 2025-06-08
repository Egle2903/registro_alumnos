package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;

public class menu_principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_principal frame = new menu_principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menu_principal() {
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
		
		JMenu mnRetiro = new JMenu("Retiro");
		mnRegistro.add(mnRetiro);
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenu mnAlumnosCursos = new JMenu(" Alumnos y Cursos");
		mnConsulta.add(mnAlumnosCursos);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnConsulta.add(mntmNewMenuItem_2);
	}
}

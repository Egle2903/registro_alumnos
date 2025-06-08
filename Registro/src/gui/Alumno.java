package gui;

public class Alumno {
	
	private int codAlumno, edad,celular,estado;
	private String nombres,apellidos,dni;
	
	public Alumno (String nombres, String apellidos, String dni, int edad, int codAlumno, int estado, int celular) {
		this.nombres =nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.codAlumno = codAlumno;
		this.estado = 0;
		this.celular = celular;
		
	}
}

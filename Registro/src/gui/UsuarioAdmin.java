package gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UsuarioAdmin {
	
	 private static final String RUTA = "usuarios.txt";
	 
	 public static boolean validarUsuario(String usuario, String clave) {
		 try (BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	            }
	     }
		 
		 catch (IOException e) {
	            e.printStackTrace();
	        }
		return false;
		 
		
		 
	 }
	    
	    

	 }

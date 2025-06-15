package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.io.*;
import java.util.*;

public class Login extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private int intentos = 0;
    private final int MAX_INTENTOS = 3;
    private final String RUTA_ARCHIVO = "usuarios.txt";
    private Map<String, String> usuariosMap;

    public Login() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        cargarUsuarios();

        txtUsuario = new JTextField(15);
        txtPassword = new JPasswordField(15);
        JButton btnLogin = new JButton("Ingresar");

        btnLogin.addActionListener(e -> validarLogin());

        setLayout(new GridLayout(3, 2));
        add(new JLabel("Usuario:"));
        add(txtUsuario);
        add(new JLabel("Contraseña:"));
        add(txtPassword);
        add(new JLabel(""));
        add(btnLogin);

        setVisible(true);
    }

    private void cargarUsuarios() {
        usuariosMap = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(":");
                if (partes.length == 2) {
                    usuariosMap.put(partes[0].trim(), partes[1].trim());
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo de usuarios."+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    private void validarLogin() {
        String usuario = txtUsuario.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();

        // Validación de campos vacíos
        
        if (usuario.isEmpty() && password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor introduzca el usuario y clave.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor introduzca el usuario.", "Campo usuario vacío", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor introduzca la contraseña.", "Campo contraseña vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Verificación de usuario y contraseña 
        
        String mensajeError;

        if (usuariosMap.containsKey(usuario)) {
            if (usuariosMap.get(usuario).equals(password)) {
                JOptionPane.showMessageDialog(this, "Login exitoso.");
                this.dispose();
                new MenuPrincipal();
                return;
            } else {
                mensajeError = "Contraseña incorrecta para el usuario '" + usuario + "'.";
            }
        } else {
            mensajeError = "El usuario '" + usuario + "' no existe.";
        }

        intentos++;

        if (intentos >= MAX_INTENTOS) {
            JOptionPane.showMessageDialog(this,
                "Ha superado el número máximo de intentos permitidos.\n" + mensajeError,
                "Login Fallido", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(this,
                mensajeError + "\nIntento " + intentos + " de " + MAX_INTENTOS,
                "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
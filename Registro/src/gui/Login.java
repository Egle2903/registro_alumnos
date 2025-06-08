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

        if (usuariosMap.containsKey(usuario) && usuariosMap.get(usuario).equals(password)) {
            JOptionPane.showMessageDialog(this, "Login exitoso.");
            this.dispose();
            JFrame menuPrincipal = new MenuPrincipal();
        } else {
            intentos++;
            if (intentos >= MAX_INTENTOS) {
                JOptionPane.showMessageDialog(this, "Ha superado el número máximo de intentos.", "Login Fallido", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos. Intento " + intentos + " de " + MAX_INTENTOS, "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

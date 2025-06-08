/**
 * 
 */
package main;

import java.awt.EventQueue;

import gui.Login;

/**
 * 
 */
public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login login = new Login();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

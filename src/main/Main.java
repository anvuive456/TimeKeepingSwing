package main;

import java.awt.EventQueue;

import model.User;
import screen.HomeScreen;
import screen.LoginScreen;

public class Main {
	public enum Role {
		staff, manager
	}

	public static User currentUser = null;
	public static Role currentRole = null;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if (currentUser == null) {
						LoginScreen login = new LoginScreen();
						login.setVisible(true);
					} else {
						HomeScreen home = new HomeScreen();
						home.setVisible(true);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

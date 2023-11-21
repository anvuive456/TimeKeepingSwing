package screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class HomeScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnLoginButton;
	private JTextField textFieldUsername;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordField;
	private JPanel panel1;
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public HomeScreen() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		getContentPane().setLayout(null);

		btnLoginButton = new JButton("Đăng nhập");
		btnLoginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnLoginButton.setBounds(173, 210, 117, 29);
		contentPane.add(btnLoginButton);

		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(98, 63, 238, 26);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);

		lblNewLabel = new JLabel("Tài khoản");
		lblNewLabel.setBounds(25, 68, 71, 16);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Mật khẩu");
		lblNewLabel_1.setBounds(25, 106, 61, 16);
		contentPane.add(lblNewLabel_1);

		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(98, 101, 238, 26);
		contentPane.add(passwordField);
	}

	void login() {
		final String username = this.textFieldUsername.getText().trim();
		final String password = String.valueOf(passwordField.getPassword()).trim();

		if ("admin".equals(username) && "password".equals(password)) {
			JOptionPane.showMessageDialog(null, username + " " + password, "Thanh cong", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, username + " " + password, "That bai", JOptionPane.ERROR_MESSAGE);
		}
	}

}

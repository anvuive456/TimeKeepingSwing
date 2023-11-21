package screen;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dto.EmployeeDao;
import main.Main;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.Action;
import javax.swing.JButton;

public class LoginScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsername;
	private JPasswordField tfPassword;
	private EmployeeDao employeeDao = new EmployeeDao();

	/**
	 * Create the frame.
	 */
	public LoginScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		tfUsername = new JTextField();
		tfUsername.setBounds(153, 58, 275, 26);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);

		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setBounds(19, 63, 93, 16);
		contentPane.add(lblNewLabel);

		tfPassword = new JPasswordField();
		tfPassword.setBounds(153, 96, 275, 26);
		contentPane.add(tfPassword);

		JLabel lblNewLabel_1 = new JLabel("Mật khẩu");
		lblNewLabel_1.setBounds(19, 101, 93, 16);
		contentPane.add(lblNewLabel_1);

		JComboBox<Main.Role> cbxRole = new JComboBox<Main.Role>();
		cbxRole.setBounds(153, 144, 275, 27);
		contentPane.add(cbxRole);

		JButton btnLogin = new JButton("Đăng nhập");
		btnLogin.setBounds(153, 205, 117, 29);
		contentPane.add(btnLogin);
		cbxRole.addItem(Main.Role.manager);
		cbxRole.addItem(Main.Role.staff);

		cbxRole.addItemListener(e -> {
			Main.Role item = (Main.Role) cbxRole.getSelectedItem();
			Main.currentRole = item;
		});

		btnLogin.addActionListener(e -> {
			String username = tfUsername.getText();
			String password = tfPassword.getPassword().toString();

			switch (Main.currentRole) {
			// TODO: get current user with initialized Role
//			case staff:
//				employeeDao.
//				break;
//			case manager:
//				break;
			}
		});
	}
}

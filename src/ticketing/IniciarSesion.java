package ticketing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IniciarSesion extends JFrame {
	private JPasswordField password;
	private JTextField usuario;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			IniciarSesion is = new IniciarSesion();
			is.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			is.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public IniciarSesion() {
		String[] correos = { "alumndodepeter@gmail.com", "estudiamos@conpeter.com", "desarrollo@deinterfaces.com",
				"desarrolla@conpeter.com" };
		String[] passwords = { "1111", "2222", "3333", "4444" };

		setBounds(100, 100, 342, 447);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 0, 0);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		getContentPane().setBackground(new Color(136, 185, 244));
		getContentPane().setLayout(null);

		password = new JPasswordField();
		password.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				password.setText(null);
			}
		});
		password.setToolTipText("");
		password.setBounds(60, 259, 205, 31);
		getContentPane().add(password);

		JLabel etiquetaContrasenya = new JLabel("Contraseña:");
		etiquetaContrasenya.setBounds(60, 234, 110, 14);
		getContentPane().add(etiquetaContrasenya);

		usuario = new JTextField();
		usuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				usuario.setText(null);
			}
		});

		usuario.setBounds(60, 192, 205, 31);
		getContentPane().add(usuario);
		usuario.setColumns(10);

		JLabel etiquetaUsuario = new JLabel("Usuario:");
		etiquetaUsuario.setBounds(60, 159, 130, 22);
		getContentPane().add(etiquetaUsuario);

		JLabel lblError = new JLabel("");
		lblError.setBounds(60, 301, 153, 70);
		getContentPane().add(lblError);

		JLabel imagen = new JLabel("");
		imagen.setBackground(new Color(255, 255, 255));
		imagen.setIcon(new ImageIcon("./User.png"));
		imagen.setBounds(112, 32, 91, 116);
		getContentPane().add(imagen);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			String texto;
			int contador=0;
			public void actionPerformed(ActionEvent e) {
				lblError.setText(null);
				contador++;
				for (int i = 0; i < passwords.length; i++) {
					if (usuario.getText().equals(correos[i]) && password.getText().equals(passwords[i])) {
						GestionTicketing gt = new GestionTicketing();
						gt.setVisible(true);
						dispose();
					} else if(!usuario.getText().equals(correos[i]) && !password.getText().equals(passwords[i])){
						texto="<html><body>Usuario o contraseña <br>incorrectos</body></html>";
						lblError.setForeground(Color.red);
						lblError.setText(texto);
					}
				}

				if(contador==3) {
					contador=0;
					lblError.setForeground(Color.red);
					texto= "<html><body>Error. Has fallado <br>muchas veces.<br> Ponte en contacto<br>con el administrador</body></html>";
					lblError.setText(texto);
					usuario.disable();
					password.disable();
					btnAceptar.setEnabled(false);
				}
				
				
			}
		});
		btnAceptar.setBounds(223, 317, 89, 23);

		getContentPane().add(btnAceptar);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(223, 351, 89, 23);
		getContentPane().add(btnCerrar);

	}
}

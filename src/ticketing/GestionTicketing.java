package ticketing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class GestionTicketing extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIncidencias;
	private JTextField textFieldNumero;
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JTextField textFieldFecha;
	private JTextField textFieldCategoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestionTicketing dialog = new GestionTicketing();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestionTicketing() {
		setBounds(100, 100, 868, 562);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(136, 185, 244));
		contentPanel.setBounds(new Rectangle(2, 2, 2, 2));
		contentPanel.setForeground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtIncidencias = new JTextField();
		txtIncidencias.setHorizontalAlignment(SwingConstants.CENTER);
		txtIncidencias.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtIncidencias.setText("INCIDENCIAS");
		txtIncidencias.setEditable(false);
		txtIncidencias.setBounds(48, 40, 745, 37);
		contentPanel.add(txtIncidencias);
		txtIncidencias.setColumns(10);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldNumero.setBounds(184, 119, 609, 37);
		contentPanel.add(textFieldNumero);
		textFieldNumero.setColumns(10);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldTitulo.setColumns(10);
		textFieldTitulo.setBounds(184, 178, 609, 37);
		contentPanel.add(textFieldTitulo);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldAutor.setColumns(10);
		textFieldAutor.setBounds(184, 245, 609, 37);
		contentPanel.add(textFieldAutor);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldFecha.setColumns(10);
		textFieldFecha.setBounds(184, 308, 609, 37);
		contentPanel.add(textFieldFecha);
		
		textFieldCategoria = new JTextField();
		textFieldCategoria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldCategoria.setColumns(10);
		textFieldCategoria.setBounds(184, 375, 609, 37);
		contentPanel.add(textFieldCategoria);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(618, 453, 109, 37);
		contentPanel.add(btnBuscar);
		
		JLabel lblNumero = new JLabel("N º");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumero.setBounds(48, 119, 154, 37);
		contentPanel.add(lblNumero);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAutor.setBounds(48, 245, 154, 37);
		contentPanel.add(lblAutor);
		
		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setBounds(48, 178, 154, 37);
		contentPanel.add(lblTitulo);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFecha.setBounds(48, 308, 154, 37);
		contentPanel.add(lblFecha);
		
		JLabel lblCategoria = new JLabel("Categoría");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCategoria.setBounds(48, 375, 154, 37);
		contentPanel.add(lblCategoria);
	}
}

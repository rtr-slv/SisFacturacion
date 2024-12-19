package Formulario;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmCrearCliente extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textCedula;
	private JTextField textNombres;
	private JTextField textApellidos;

	
	public FrmCrearCliente() {
		setTitle("Crear Cliente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblCedula = new JLabel("Cédula");
		lblCedula.setBounds(48, 11, 46, 14);
		getContentPane().add(lblCedula);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(48, 36, 46, 14);
		getContentPane().add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(48, 61, 46, 14);
		getContentPane().add(lblApellidos);
		
		textCedula = new JTextField();
		textCedula.setBounds(104, 8, 86, 20);
		getContentPane().add(textCedula);
		textCedula.setColumns(10);
		
		textNombres = new JTextField();
		textNombres.setBounds(104, 33, 86, 20);
		getContentPane().add(textNombres);
		textNombres.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(104, 58, 86, 20);
		getContentPane().add(textApellidos);
		textApellidos.setColumns(10);

	}
}

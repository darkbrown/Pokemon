package pokemon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import imagenes.imagenes;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtVida;
	private JTextField txtPuntos;
	private JTextField txtApodo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\cris_\\Desktop\\250px-Pikachu_SSB4.png"));
		setTitle("Formulario Pokemon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null); //Centrar ventana
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelImage = new JPanel();
		panelImage.setBounds(10, 11, 263, 339);
		contentPane.add(panelImage);
		panelImage.setLayout(null);
		
		
		Border border = BorderFactory.createLineBorder(Color.black, 1);
		JLabel lblImage = new JLabel();
		lblImage.setBounds(10, 11, 243, 233);
		lblImage.setBorder(border);
		panelImage.add(lblImage);
		//Cargo la imagen de imagen no disponibe.
		Icon imagen = new ImageIcon(imagenes.getImgLogo().getImage().getScaledInstance(lblImage.getWidth(),
				lblImage.getHeight(), Image.SCALE_DEFAULT));
		lblImage.setText(null);
		lblImage.setIcon(imagen);
		
		
		JButton btnImage = new JButton("Subir Imagen");
		btnImage.setBounds(74, 273, 109, 30);
		panelImage.add(btnImage);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBounds(283, 11, 391, 339);
		contentPane.add(panelDatos);
		panelDatos.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(122, 11, 226, 30);
		panelDatos.add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setBounds(122, 52, 226, 30);
		panelDatos.add(cboTipo);
		
		JSpinner spiPeso = new JSpinner();
		spiPeso.setBounds(122, 93, 50, 30);
		panelDatos.add(spiPeso);
		
		JSpinner spiAltura = new JSpinner();
		spiAltura.setBounds(265, 93, 50, 30);
		panelDatos.add(spiAltura);
		
		txtVida = new JTextField();
		txtVida.setBounds(122, 134, 226, 30);
		panelDatos.add(txtVida);
		txtVida.setColumns(10);
		
		txtPuntos = new JTextField();
		txtPuntos.setBounds(150, 177, 198, 30);
		panelDatos.add(txtPuntos);
		txtPuntos.setColumns(10);
		
		txtApodo = new JTextField();
		txtApodo.setBounds(150, 218, 198, 30);
		panelDatos.add(txtApodo);
		txtApodo.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(122, 270, 109, 30);
		panelDatos.add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(239, 270, 109, 30);
		panelDatos.add(btnGuardar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(54, 11, 59, 30);
		panelDatos.add(lblNombre);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipo.setBounds(77, 52, 35, 30);
		panelDatos.add(lblTipo);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPeso.setBounds(77, 93, 35, 30);
		panelDatos.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAltura.setBounds(217, 93, 50, 30);
		panelDatos.add(lblAltura);
		
		JLabel lblKg = new JLabel("kg");
		lblKg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKg.setBounds(176, 93, 22, 30);
		panelDatos.add(lblKg);
		
		JLabel lblMetros = new JLabel("metros");
		lblMetros.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMetros.setBounds(318, 93, 46, 30);
		panelDatos.add(lblMetros);
		
		JLabel lblVida = new JLabel("Vida");
		lblVida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVida.setBounds(78, 132, 35, 30);
		panelDatos.add(lblVida);
		
		JLabel lblPuntos = new JLabel("Puntos de combate");
		lblPuntos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPuntos.setBounds(10, 177, 127, 30);
		panelDatos.add(lblPuntos);
		
		JLabel lblApodo = new JLabel("Apodo / Alias");
		lblApodo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApodo.setBounds(55, 218, 85, 30);
		panelDatos.add(lblApodo);
	}
}

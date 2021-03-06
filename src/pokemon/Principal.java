package pokemon;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import imagenes.imagenes;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
@SuppressWarnings("serial")
public class Principal extends JFrame {

	private JPanel contentPane;
	private static JTable tblPokemons;

	/**
	 * Launch the application.
	 */
	public static void llenarTabla(Object[] fila){
		DefaultTableModel model;
		model = new DefaultTableModel();
		model.addColumn("Nombre");
		model.addColumn("Tipo");
		model.addColumn("Peso");
		model.addColumn("Altura");
		model.addColumn("Vida");
		model.addColumn("Puntos Combate");
		model.addColumn("Apodo");
		
		tblPokemons.getTableHeader().setReorderingAllowed(false);
		tblPokemons.setModel(model);
		
		model.addRow(fila);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setIconImage(imagenes.getIconoAplicacion());
		
		setTitle("Base de Datos Pokemon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 664, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNuevo = new JButton("Nuevo Pokemon");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNuevo.setBounds(223, 11, 131, 31);
		panel.add(btnNuevo);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditar.setBounds(364, 11, 109, 31);
		panel.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(483, 11, 109, 31);
		panel.add(btnEliminar);
		
				
		JLabel lblTitulo = new JLabel("Pokemons Registrados ");
		lblTitulo.setBounds(10, 4, 180, 40);
		panel.add(lblTitulo);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 664, 274);
		contentPane.add(scrollPane);
		
		tblPokemons = new JTable();
		scrollPane.setViewportView(tblPokemons);
		DefaultTableModel model;
		model = new DefaultTableModel();
		model.addColumn("Nombre");
		model.addColumn("Tipo");
		model.addColumn("Peso");
		model.addColumn("Altura");
		model.addColumn("Vida");
		model.addColumn("Puntos Combate");
		model.addColumn("Apodo");
		
		tblPokemons.getTableHeader().setReorderingAllowed(false);
		tblPokemons.setModel(model);
		
		
		
	}
}

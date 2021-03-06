package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAdministrador = new JMenu("Administrador");
		menuBar.add(mnAdministrador);
		
		JMenuItem mntmCliente = new JMenuItem("cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCliente viewCliente = new ViewCliente();
				viewCliente.setVisible(true);
			}
		});
		mnAdministrador.add(mntmCliente);
		
		JMenuItem mntmReparacion = new JMenuItem("Reparac\u00F3n");
		mntmReparacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ViewReparacion repar = new ViewReparacion();
			repar.setVisible(true);
			}
		});
		mnAdministrador.add(mntmReparacion);
		
		JMenuItem mntmTipoArreglo = new JMenuItem("Tipo Arreglo");
		mntmTipoArreglo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewTipoAreglo tipoar = new ViewTipoAreglo();
				tipoar.setVisible(true);
			}
		});
		mnAdministrador.add(mntmTipoArreglo);
		
		JMenuItem mntmUsuario = new JMenuItem("Usuario");
		mntmUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewUsuario usua = new ViewUsuario();
				usua.setVisible(true);
			}
		});
		mnAdministrador.add(mntmUsuario);
		
		JMenuItem mntmRol = new JMenuItem("Rol");
		mntmRol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRol rol = new ViewRol();
				rol.setVisible(true); 
			}
		});
		mnAdministrador.add(mntmRol);
		
		JMenu mnSalir = new JMenu("Salir");
		menuBar.add(mnSalir);
		
		JMenuItem mntmOk = new JMenuItem("OK");
		mntmOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int respuesta = JOptionPane.showConfirmDialog(null, "Desea salir de esta ventana de Menu?","Salir",JOptionPane.YES_NO_OPTION);
				if(respuesta == JOptionPane.YES_NO_OPTION){
					
					dispose();
				}
			}
		});
		mnSalir.add(mntmOk);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 251, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}

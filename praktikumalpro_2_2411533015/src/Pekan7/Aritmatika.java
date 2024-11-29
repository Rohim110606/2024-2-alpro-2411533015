package Pekan7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aritmatika {

	private JFrame frame;
	private JTextField A;
	private JTextField B;
	private JTextField C;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aritmatika window = new Aritmatika();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aritmatika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		A = new JTextField();
		A.setBounds(177, 39, 96, 19);
		frame.getContentPane().add(A);
		A.setColumns(10);
		
		B = new JTextField();
		B.setBounds(177, 91, 96, 19);
		frame.getContentPane().add(B);
		B.setColumns(10);
		
		JComboBox OPcb = new JComboBox();
		OPcb.setModel(new DefaultComboBoxModel(new String[] {"PILIH", "+", "-", "*", "/", "%"}));
		OPcb.setBounds(210, 68, 29, 21);
		frame.getContentPane().add(OPcb);
		
		JButton btnNewButton = new JButton("PROSES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int A1= Integer.parseInt(A.getText());
				int A2= Integer.parseInt(B.getText());
				int hasil;
				int op= OPcb.getSelectedIndex();
				if(op == 1) {
					hasil = A1+A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 2) {
					hasil = A1-A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 3) {
					hasil = A1*A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 4) {
					hasil = A1/A2;
					C.setText(String.valueOf(hasil));
				}
				if(op == 5) {
					hasil = A1%A2;
					C.setText(String.valueOf(hasil));
			}
			}
		});
		btnNewButton.setBounds(188, 140, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		C = new JTextField();
		C.setBounds(177, 177, 96, 19);
		frame.getContentPane().add(C);
		C.setColumns(10);
	}
}

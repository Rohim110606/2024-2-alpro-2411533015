package Pekan8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class quizz2 {

	private JFrame frame;
	private JTextField Nama;
	private JTextField Umur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quizz2 window = new quizz2();
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
	public quizz2() {
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
		
		JLabel lblNewLabel = new JLabel("Aplikasi Razia Motor Online");
		lblNewLabel.setBounds(138, 11, 156, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nama");
		lblNewLabel_1.setBounds(21, 42, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Umur");
		lblNewLabel_2.setBounds(21, 87, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SIM C");
		lblNewLabel_3.setBounds(21, 130, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel hasil = new JLabel("");
		hasil.setBounds(21, 201, 389, 22);
		frame.getContentPane().add(hasil);
		
		Nama = new JTextField();
		Nama.setBounds(138, 36, 156, 20);
		frame.getContentPane().add(Nama);
		Nama.setColumns(10);
		
		Umur = new JTextField();
		Umur.setBounds(138, 84, 156, 20);
		frame.getContentPane().add(Umur);
		Umur.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pilih", "Iya", "Tidak"}));
		comboBox.setBounds(138, 126, 86, 22);
		frame.getContentPane().add(comboBox);
		
		JButton ProsesTombol = new JButton("Proses");
		ProsesTombol.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			        String inputnama = Nama.getText();
			        int inputumur = Integer.parseInt(Umur.getText());
			        String StatusSimC = (String) comboBox.getSelectedItem();
			        
			        if (inputumur >= 17 && StatusSimC.equals("Iya")) {
			            hasil.setText(inputnama + " Anda sudah boleh membawa motor.");
			        } else if (inputumur < 17 && StatusSimC.equals("Iya")) {
			            hasil.setText(inputnama + " Anda belum cukup umur ");
			        } else if (inputumur >= 17 && StatusSimC.equals("Tidak")) {
			            hasil.setText(inputnama + " Anda sudah dewasa tetapi belum boleh membawa motor. ");
			        } else {
			            hasil.setText(inputnama + " Anda belum cukup umur untuk punya SIM.");
			        }
			 }
		});
		ProsesTombol.setBounds(98, 167, 89, 23);
		frame.getContentPane().add(ProsesTombol);
		
		JButton ResetTombol = new JButton("Reset");
		ResetTombol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Nama.setText("");
			        Umur.setText("");
			        comboBox.setSelectedIndex(0);
			        hasil.setText("");
			}
		});
		ResetTombol.setBounds(276, 167, 89, 23);
		frame.getContentPane().add(ResetTombol);
		
		
	}
}
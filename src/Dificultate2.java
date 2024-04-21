import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dificultate2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dificultate2 frame = new Dificultate2();
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
	public Dificultate2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PaginaPrincipala().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 229, 76, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 133, 65, 42);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(298, 133, 32, 42);
		contentPane.add(lblNewLabel_4);
		
		JButton btnMediu = new JButton("Mediu");
		btnMediu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Istorie2().setVisible(true);
				dispose();
			}
		});
		btnMediu.setBounds(147, 133, 128, 42);
		btnMediu.setBackground(new Color(255, 250, 205));
		btnMediu.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(btnMediu);
		
		JLabel lblNewLabel = new JLabel("Alege o dificultate");
		lblNewLabel.setBounds(81, 25, 299, 51);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Usor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Istorie1().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(0, 133, 128, 42);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(102, 205, 170));
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(btnNewButton);
		
		JButton btnGreu = new JButton("Greu");
		btnGreu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Istorie3().setVisible(true);
				dispose();
			}
		});
		btnGreu.setBounds(298, 133, 128, 42);
		btnGreu.setBackground(new Color(255, 127, 80));
		btnGreu.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(btnGreu);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(147, 138, 65, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LogIn.class.getResource("/Istorie5.jpg")));
		lblNewLabel_1.setBounds(0, 0, 436, 263);
		contentPane.add(lblNewLabel_1);
	}
}

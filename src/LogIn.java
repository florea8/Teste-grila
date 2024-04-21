import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import jdk.incubator.vector.VectorOperators.Test;

import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTabbedPane;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSeparator;
import javax.swing.JOptionPane;
public class LogIn extends JFrame {


	private JPanel contentPane;
	private JTextField txtIntroducetiNumele;
	private JPasswordField pwdIntroducetiParola;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(SystemColor.activeCaption, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
		lblNewLabel_1.setBounds(614, 118, 134, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(614, 212, 134, 29);
		contentPane.add(lblNewLabel_1_1);
		
		txtIntroducetiNumele = new JTextField();
	/*	txtIntroducetiNumele.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusGained(FocusEvent e) {
				txtIntroducetiNumele.setText("");
				String username= txtIntroducetiNumele.getText();
			}
		});
		
		*/
		txtIntroducetiNumele.setText("");
		txtIntroducetiNumele.setBounds(614, 148, 162, 29);
		contentPane.add(txtIntroducetiNumele);
		txtIntroducetiNumele.setColumns(10);
		
		pwdIntroducetiParola = new JPasswordField();
		/* pwdIntroducetiParola.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pwdIntroducetiParola.setText("");
				String password= pwdIntroducetiParola.getText();
			}
		});
		*/
		pwdIntroducetiParola.setBounds(614, 241, 162, 29);
		contentPane.add(pwdIntroducetiParola);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(LogIn.class.getResource("/User1.png")));
		lblNewLabel_2.setBounds(572, 148, 32, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(LogIn.class.getResource("/Key.png")));
		lblNewLabel_3.setBounds(567, 237, 37, 36);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Bun venit!");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Candara Light", Font.BOLD, 30));
		lblNewLabel_5.setBounds(553, 33, 201, 57);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						try{

					          if (txtIntroducetiNumele.getText().equals("florin") && pwdIntroducetiParola.getText().equals("parola")) {
					        	   new PaginaPrincipala().setVisible(true);
					               dispose();
					            }
					          else if (txtIntroducetiNumele.getText().equals("") && pwdIntroducetiParola.getText().equals(""))
					             JOptionPane.showMessageDialog(null,"Introduceti username si parola","Eroare",JOptionPane.ERROR_MESSAGE); 
					          else
					              JOptionPane.showMessageDialog(null,"Username sau parola incorecte","Eroare",JOptionPane.ERROR_MESSAGE);

					            }
					           catch(Exception arg0)
					        {
					            JOptionPane.showMessageDialog(null, arg0.getMessage());
					        }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(640, 292, 111, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setIcon(new ImageIcon(LogIn.class.getResource("/Fundal8.jpg")));
		lblNewLabel_4.setBounds(0, 0, 800, 500);
		contentPane.add(lblNewLabel_4);
		
	}
}

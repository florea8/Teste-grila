
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Istorie3 implements ActionListener{
	
	String[] questions = 	{
			"1.Pe teritoriul carei tari actuale se gasea regatul antic Lidia?",
			"2.Care este ultima batalie in care a fost folosit Focul Grecesc?",
			"3.Cine a castigat Batalia de la Marengo?",
			"4.Mama carei personalitati istorice a fost Perictione?",
			"5.Ce monarh se afla pe tronul Angliei, in perioada ciumei din 1665?",
			"6.Ce grad militar a primit Ecaterina Teodoroiu in 1917?",
			"7.In timpul domniei carui domnitor a fost infiintata prima biblioteca din Bucuresti?",
			"8.Al cui fiu a fost Bogdan 4?",
			"9.Unde se gaseste tronul regilor din Romania, folosit pana in 1947?",
			"10.Care a fost prima Capitala a Moldovei?",
			"11.Sotia catui rege a fost Eleanor de Aquitania?"
		};
String[][] options = 	{
			{"Romania","Grecia","Croatia","Turcia"},
			{"Termopile","Caderea Contantinopolului","Waterloo","Primul Razboi Mondial"},
			{"Iosif Stalin","Napoleon Bonaparte","Julius Caesar","Nero"},
			{"Aristotel","Socrate","Herodot","Platon"},
			{"Carol 2","Eadred al Angliei","Henric al 2-lea","Richard 1"},
			{"Colonel", "Ofiter", "General","Sublocotenent"},
			{"Radu Voda","Vlad Tepes","Mircea cel Batran","Stefan cel Mare"},
			{"Basarab 1","Neagoe Basarab","Alexandru Lapusneanul","Petru 1"},
			{"Vaslui","Golesti","Viseu de Sus","Arad"},
			{"Chisinau","Baia","Floresti","Tiraspol"},
			{"Henric al 2-lea", "William 1","Eduard 1", "Filip"}
			
		};
char[] answers = 		{
			'D',
			'B',
			'B',
			'D',
			'A',
			'D',
			'C',
			'B',
			'B',
			'A'
		};
	char guess;
	char answer;
	int index;
	int correct_guesses =0;
	int total_questions = questions.length;
	int result;
	int seconds=100;
	int seconds1=10;
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	JProgressBar progressBar = new JProgressBar();
	Timer timer = new Timer(1000, new ActionListener() {
    public void actionPerformed(ActionEvent e) {
			
			JButton btnNewButton = new JButton("Meniu");
			btnNewButton.setVisible(false);
			btnNewButton.setBounds(288, 429, 132, 33);
			frame.getContentPane().add(btnNewButton);
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new PaginaPrincipala().setVisible(true);
					frame.setVisible(false);
				}
			});

			
			txtTimpulAExpirat = new JTextField();
			txtTimpulAExpirat.setVisible(false);
			txtTimpulAExpirat.setHorizontalAlignment(SwingConstants.CENTER);
			txtTimpulAExpirat.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
			txtTimpulAExpirat.setText("Timpul a expirat!");
			txtTimpulAExpirat.setOpaque(true);
			txtTimpulAExpirat.setBounds(178, 211, 369, 89);
			frame.getContentPane().add(txtTimpulAExpirat);
			txtTimpulAExpirat.setColumns(10);
			
			
			progressBar.setString(String.valueOf(seconds));
			progressBar.setValue(seconds);
            if(seconds!=0) {
                 seconds--;
			System.out.println(seconds);
            } else if(seconds==0) {
            	btnNewButton.setVisible(true);
				txtTimpulAExpirat.setVisible(true);
				buttonA.setVisible(false);
				buttonB.setVisible(false);
				buttonC.setVisible(false);
				buttonD.setVisible(false);
				textfield.setVisible(false);
				textarea.setVisible(false);
				answer_labelA.setVisible(false);
				answer_labelB.setVisible(false);
				answer_labelC.setVisible(false);
				answer_labelD.setVisible(false);
				progressBar.setVisible(false);
            	
            	
			}
		}
		});
	private JTextField txtTimpulAExpirat;
	private final JButton btnMeniu = new JButton("Meniu");
 

	public Istorie3() {
		frame.getContentPane().setLocation(new Point(200, 100));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setBounds(200, 50, 800, 600);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.getContentPane().setLayout(null);
		frame.setResizable(true);
		
		textfield.setBounds(0,65,786,50);
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(0, 128, 128));
		textfield.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		textarea.setBounds(0,112,786,50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(25,25,25));
		textarea.setForeground(new Color(0, 128, 128));
		textarea.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		buttonA.setBounds(0,163,100,100);
		buttonA.setFont(new Font("Baskerville Old Face", Font.BOLD, 35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0,263,100,100);
		buttonB.setFont(new Font("Baskerville Old Face", Font.BOLD, 35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,362,100,100);
		buttonC.setFont(new Font("Baskerville Old Face", Font.BOLD, 35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,463,100,100);
		buttonD.setFont(new Font("Baskerville Old Face", Font.BOLD, 35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		answer_labelA.setBounds(125,163,500,100);
		answer_labelA.setBackground(new Color(50,50,50));
		answer_labelA.setForeground(Color.GREEN);
		answer_labelA.setFont(new Font("Baskerville Old Face", Font.BOLD, 35));
		
		answer_labelB.setBounds(125,263,500,100);
		answer_labelB.setBackground(new Color(50,50,50));
		answer_labelB.setForeground(Color.GREEN);
		answer_labelB.setFont(new Font("Baskerville Old Face", Font.PLAIN, 35));
		
		answer_labelC.setBounds(125,362,500,100);
		answer_labelC.setBackground(new Color(50,50,50));
		answer_labelC.setForeground(Color.GREEN);
		answer_labelC.setFont(new Font("Baskerville Old Face", Font.PLAIN, 35));
		
		answer_labelD.setBounds(125,463,500,100);
		answer_labelD.setBackground(new Color(50,50,50));
		answer_labelD.setForeground(Color.GREEN);
		answer_labelD.setFont(new Font("Baskerville Old Face", Font.PLAIN, 35));
		
		
		number_right.setBounds(225,225,200,100);
		number_right.setBackground(new Color(25,25,25));
		number_right.setForeground(new Color(25,255,0));
		number_right.setFont(new Font("Ink Free",Font.BOLD,50));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		percentage.setBounds(225,325,200,100);
		percentage.setBackground(new Color(25,25,25));
		percentage.setForeground(new Color(25,255,0));
		percentage.setFont(new Font("Ink Free",Font.BOLD,50));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
		frame.getContentPane().add(time_label);
		frame.getContentPane().add(seconds_left);
		frame.getContentPane().add(answer_labelA);
		frame.getContentPane().add(answer_labelB);
		frame.getContentPane().add(answer_labelC);
		frame.getContentPane().add(answer_labelD);
		frame.getContentPane().add(buttonA);
		frame.getContentPane().add(buttonB);
		frame.getContentPane().add(buttonC);
		frame.getContentPane().add(buttonD);
		frame.getContentPane().add(textarea);
		frame.getContentPane().add(textfield);
		frame.setVisible(true);
		progressBar.setIgnoreRepaint(true);
		progressBar.setString("0\u00A0");
		progressBar.setStringPainted(true);
		progressBar.setBounds(0, 0, 786, 69);
		
		frame.getContentPane().add(progressBar);
		btnMeniu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PaginaPrincipala().setVisible(true);
				frame.dispose();
			}
		});
		btnMeniu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMeniu.setBounds(295, 473, 89, 23);
		btnMeniu.setVisible(false);
		
		frame.getContentPane().add(btnMeniu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(100, 163, 686, 400);
		frame.getContentPane().add(lblNewLabel);
		timer.start();
		

		
      
		
		nextQuestion();
	}
	protected void dispose() {
		// TODO Auto-generated method stub
	}
	public void nextQuestion() {
		
		progressBar.setString(String.valueOf(seconds));
		progressBar.setValue(seconds);
		
		if(index>=total_questions) {
			results();
		}
		else {
			textfield.setText("Intrebarea "+(index+1)+"/11");
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			buttonA.setEnabled(false);
			buttonB.setEnabled(false);
			buttonC.setEnabled(false);
			buttonD.setEnabled(false);
			
			if(e.getSource()==buttonA) {
				answer= 'A';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonB) {
				answer= 'B';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonC) {
				answer= 'C';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonD) {
				answer= 'D';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			displayAnswer();
	}
	public void displayAnswer() {
	
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(answers[index] != 'A')
			answer_labelA.setForeground(new Color(255,0,0));
		if(answers[index] != 'B')
			answer_labelB.setForeground(new Color(255,0,0));
		if(answers[index] != 'C')
			answer_labelC.setForeground(new Color(255,0,0));
		if(answers[index] != 'D')
			answer_labelD.setForeground(new Color(255,0,0));
		
		Timer pause = new Timer(2000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				answer_labelA.setForeground(new Color(25,255,0));
				answer_labelB.setForeground(new Color(25,255,0));
				answer_labelC.setForeground(new Color(25,255,0));
				answer_labelD.setForeground(new Color(25,255,0));
				
				answer = ' ';
				seconds1=10;
				seconds_left.setText(String.valueOf(seconds1));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
			}
		});
		pause.setRepeats(false);
		pause.start();
	}
	public void results(){
		buttonA.setVisible(false);
		buttonB.setVisible(false);
		buttonC.setVisible(false);
		buttonD.setVisible(false);
		
		result = (int)((correct_guesses/(double)total_questions)*100);
		
		textfield.setText("Rezultat!");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		number_right.setText("("+correct_guesses+"/"+total_questions+")");
		percentage.setVisible(false);
		
		frame.getContentPane().add(number_right);
		frame.getContentPane().add(percentage);
		progressBar.setVisible(false);
		btnMeniu.setVisible(true);
		textarea.setVisible(false);
		textfield.setVisible(false);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

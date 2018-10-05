import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//import java swing to use the Jframe etc
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MathQuiz extends JFrame implements ActionListener {

	JCheckBox answer1 = new JCheckBox(); // checkbozx for answer 1
	JCheckBox answer2 = new JCheckBox(); // checkbozx for answer 2
	JCheckBox answer3 = new JCheckBox(); // checkbozx for answer 3
	JTextArea textArea = new JTextArea();// text area for question
	JButton exit = new JButton(); // button to exit quiz
	JButton calculator = new JButton(); // button to open calculator
	JLabel image = new JLabel(); // adds background image

	// Some names which will be associated with numbers.
	int answer;
	int questionnumber;

	/**
	 * This bit of code starts the process of showing the window.
	 **/
	public MathQuiz() {
		// Drop down to the code labeled 'initComponents' below.

		try {
			initComponents();
		} catch (Exception e) {
		}

	}

	/**
	 * This bit of code is the first bit that's run.
	 **/
	static public void main(String[] args) {
		MathQuiz frame = new MathQuiz(); //

		// The following code puts the Window on your screen.

		frame.setVisible(true); // allows the jframe to be visible
		frame.showQuestion(1);// shows the first question
		frame.setSize(378, 383);// sets the size of the frame

	}

	/**
	 * This bit of code sets up how the Window looks.
	 **/
	public void initComponents() throws Exception {

		// edits the checkboxes for the answers

		answer1.setSize(new Dimension(80, 20)); // set size of answer 1 checkbox
		answer1.setVisible(true); // sets visible to answer 1 checkbox
		answer1.setLocation(new Point(20, 180)); // set location answer 1 checkbox
		Font font1 = new Font("Verdana", Font.BOLD, 14);
		answer1.setFont(font1);
		answer1.setForeground(Color.RED);

		answer2.setSize(new Dimension(80, 20)); // set size of answer 2 checkbox
		answer2.setVisible(true);// sets visible to answer 2 checkbox
		answer2.setLocation(new Point(20, 210)); // set location answer 2 checkbox
		Font font2 = new Font("Verdana", Font.BOLD, 14);
		answer2.setFont(font2);
		answer2.setForeground(Color.RED);

		answer3.setSize(new Dimension(80, 20)); // set size of answer 3 checkbox
		answer3.setVisible(true);// sets visible to answer 3 checkbox
		answer3.setLocation(new Point(20, 240)); // set location answer 3 checkbox
		Font font3 = new Font("Verdana", Font.BOLD, 14);
		answer3.setFont(font3);
		answer3.setForeground(Color.RED);

		// code to edit the text area on the JFrame
		textArea.setSize(new Dimension(330, 60)); // set size of text ares
		textArea.setLineWrap(true);
		textArea.setVisible(true); // sets visible to text area
		textArea.setLocation(new Point(20, 50)); // set location of text area
		textArea.setEditable(false);
		Font font4 = new Font("Verdana", Font.BOLD, 14);
		textArea.setFont(font4);
		textArea.setForeground(Color.RED);

		// code to edit the exit button on the JFrame
		exit.setSize(new Dimension(104, 40)); // set size of button
		exit.setVisible(true); // sets visible to button
		exit.setLocation(new Point(230, 170)); // set location of button
		exit.setText("Exit");

		// code to edit the exit button on the JFrame
		calculator.setSize(new Dimension(104, 40)); // set size of button
		calculator.setVisible(true); // sets visible to button
		calculator.setLocation(new Point(230, 220)); // set location of button
		calculator.setText("Calculator");

		// code to edit the background image on the JFrame
		image.setIcon(new ImageIcon("maths.jpg"));
		image.setVisible(true);
		image.setSize(new Dimension(370, 350)); // set size of button

		setSize(new Dimension(430, 292));
		setResizable(false);
		getContentPane().setLayout(null);
		setTitle("Multiple Choice Math Quiz!");
		setLocation(new Point(200, 200));
		getContentPane().add(answer1);
		getContentPane().add(answer2);
		getContentPane().add(answer3);
		getContentPane().add(textArea);
		getContentPane().add(exit);
		getContentPane().add(calculator);
		getContentPane().add(image);

		// This makes sure you can shut the window by clicking
		// on the close cross.

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				thisWindowClosing(e);
			}
		});

		// This makes sure the checkboxes can let the
		// program know when they've been clicked on.

		answer1.addActionListener(this);
		answer2.addActionListener(this);
		answer3.addActionListener(this);

	}

	/**
	 * This code happens when someone clicks on the close window cross. It shuts the
	 * window down.
	 **/
	void thisWindowClosing(WindowEvent e) {
		setVisible(false);
		dispose();
		System.exit(0);
	}

	/**
	 * This code happens when someone clicks an answer checkbox. It checks the
	 * answer and responds appropriately.
	 **/
	public void actionPerformed(ActionEvent ae) {

		if (((ae.getSource()).equals(answer1)) && (answer == 1)) {
			correct();
		} else if (((ae.getSource()).equals(answer2)) && (answer == 2)) {
			correct();
		} else if (((ae.getSource()).equals(answer3)) && (answer == 3)) {
			correct();
		} else {
			wrong();
		}

	}

	/**
	 * Code done if right answer given.
	 **/
	private void correct() {

		textArea.setText("Correct!\n\n");
		showQuestion(questionnumber);

	}

	/**
	 * Code done if wrong answer given.
	 **/
	private void wrong() {

		textArea.setText("Wrong Answer!\n\n");
		showQuestion(questionnumber);

	}

	/**
	 * Code to show questions.
	 **/
	private void showQuestion(int question) {

		// Show a quote, depending on a number.

		switch (question) {

		case 1:
			textArea.setText(textArea.getText() + "Question 1) 50 + 154?");
			answer1.setText("104");
			answer2.setText("175");
			answer3.setText("204");
			answer = 3;
			questionnumber = 2;
			answer1.setSelected(false);
			answer2.setSelected(false);
			answer3.setSelected(false);
			break;
		case 2:
			textArea.setText(textArea.getText() + "Question 2) 75 / 3?");
			answer1.setText("25");
			answer2.setText("34");
			answer3.setText("225");
			answer = 1;
			questionnumber = 3;
			answer1.setSelected(false);
			answer2.setSelected(false);
			answer3.setSelected(false);
			break;
		case 3:
			textArea.setText(textArea.getText() + "Question 3) 12 * 12?");
			answer1.setText("128");
			answer2.setText("24");
			answer3.setText("144");
			answer = 3;
			questionnumber = 4;
			answer1.setSelected(false);
			answer2.setSelected(false);
			answer3.setSelected(false);
			break;
		case 4:
			textArea.setText(textArea.getText() + "Question 4) 1256 / 4?");
			answer1.setText("400");
			answer2.setText("378");
			answer3.setText("314");
			answer = 3;
			questionnumber = 5;
			answer1.setSelected(false);
			answer2.setSelected(false);
			answer3.setSelected(false);
			break;
		case 5:
			textArea.setText(textArea.getText() + "Question 5) 135 * 7?");
			answer1.setText("854");
			answer2.setText("945");
			answer3.setText("1045");
			answer = 2;
			questionnumber = 6;
			answer1.setSelected(false);
			answer2.setSelected(false);
			answer3.setSelected(false);
			break;
		case 6:
			textArea.setText(textArea.getText() + "Question 6) 100 / 4?");
			answer1.setText("25");
			answer2.setText("20");
			answer3.setText("30");
			answer = 1;
			questionnumber = 7;
			answer1.setSelected(false);
			answer2.setSelected(false);
			answer3.setSelected(false);
			break;
		case 7:
			textArea.setText(textArea.getText() + "Question 7) 100 / 10?");
			answer1.setText("20");
			answer2.setText("0");
			answer3.setText("10");
			answer = 3;
			questionnumber = 1;
			answer1.setSelected(false);
			answer2.setSelected(false);
			answer3.setSelected(false);
			break;

		} // End of switch

	} // End of 'quiz'

	// End of code.
}
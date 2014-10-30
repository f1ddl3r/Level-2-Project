import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Background_UI implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	JLabel label = new JLabel();
	AroundTheWorld atw = new AroundTheWorld();
	public int Index;
	public char lastLetter;
	public char firstLetter;
	public Random rand = new Random();
	public static StringBuffer previousGuesses = new StringBuffer("");
	
	public int numberOfUserGuesses = 0;
	public int numberOfComputerGuesses = 0;

	public static void main(String[] args) {
		new Background_UI().methodyaaay();

		JOptionPane
				.showMessageDialog(
						null,
						"You are trying to beat the master who knows all the countries of the world, the computer!\n"
								+ " Type in a valid country to start the game.\n"
								+ " The computer will respond with a country beginning with the same letter as the last letter of your country.\n"
								+ " After the computer has responded, you must think of a country beginning with the last letter of the COMPUTER'S country.\n"
								+ " If you repeat a country twice, you are cheating! See how far you can get against the computer!");

	}

	public void methodyaaay() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension dim = new Dimension(250, 28);

		text.setPreferredSize(dim);

		JButton button = new JButton();

		button.setText("Submit");

		frame.add(panel);

		panel.add(text);
		
		panel.add(label);

		panel.add(button);

		frame.setSize(500, 500);

		frame.setTitle("Around The World v3.0");

		button.addActionListener(this);
		
		frame.setVisible(true);
	}

	public void getComputerResponse() {
		for (int z = 0; z < 100; z++) {
			int countryIndex = rand.nextInt(atw.Countries.length);
			String country = atw.Countries[countryIndex];
			System.out.println(country);
			char firstLetter = country.charAt(0);
			
			if (new String("" + firstLetter).equalsIgnoreCase((new String(""
					+ lastLetter)))) {
				if (previousGuesses.toString().contains(country)) {
					continue;
				}
				previousGuesses.append(country);
				JOptionPane.showMessageDialog(null, "Computer's Response is: "
						+ country);
				lastLetter = country.charAt(country.length()-1);
				return;
			}

		}

	}

	public void winConditions() {
		// frame.setBackground(Color.GREEN);

		// playSound("Triumph.wav");

		// JOptionPane.showMessageDialog(null, "YOU BEAT THE MASTER!");
	}

	public void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public void processCorrectInput(){
		  frame.setBackground(Color.GREEN);
	      previousGuesses.append(text.getText());
	      //label.setText(previousGuesses.toString());
	      playSound("DingSound.wav");
	      Index = text.getText().length()-1;
			lastLetter = text.getText().charAt(Index);
		//System.out.println(lastLetter);
			numberOfUserGuesses++;
			JOptionPane.showMessageDialog(null, "Computers Turn!");
			getComputerResponse();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(atw.ValidCountry(text.getText()) == true){
			char firstLetter = text.getText().charAt(0);
			
			if(numberOfUserGuesses == 0){
				processCorrectInput();
				return;
			}
			
			if((new String("" + firstLetter).equalsIgnoreCase((new String("" + lastLetter))))){
				  if(previousGuesses.toString().contains(text.getText())){
			 		frame.setBackground(Color.ORANGE);
			    	playSound("EPIC FAIIIL.wav");				    
					JOptionPane.showMessageDialog(null, "NO CHEATING! THAT COUNTRY WAS ALREADY USED!");
				    return;
				  }
				  processCorrectInput();
				  return;
		    }
			else{
				System.out.println(lastLetter);
				frame.setBackground(Color.RED);
				playSound("EPIC FAIIIL.wav");
				JOptionPane.showMessageDialog(null,"THAT COUNTRY DOESN'T BEGIN WITH THE LAST LETTER OF THE COMPUTER'S RESPONSE! TRY AGAIN!" );
				frame.setVisible(true);
			}			 
		}
		
		else{
			frame.setBackground(Color.RED);	
			playSound("EPIC FAIIIL.wav");	
			JOptionPane.showMessageDialog(null,"NOT A VALID COUNTRY, TRY AGAIN" );
			
		}

		
		
	}

	public void repeatCheck(String countryInput) {

	}

}

package day5;

import javax.swing.JOptionPane;

public class quizgame {
public static void main(String[] args) {
	int score = 0;
	
	String ball = JOptionPane.showInputDialog("who is the character who is in every movie in every original star wars alive, 1-6?");
	if(ball.equals("Anakin Skywalker")){
		score ++ ;
		JOptionPane.showMessageDialog(null,"yes");
	}
	else{
	score --;
	JOptionPane.showMessageDialog(null,"no, the answer is Anakin Skywalker");
	}
	
	String ok = JOptionPane.showInputDialog("what were the first form of storm troopers called?");
	if(ok.equals("Clone Troopers")){
		score +=1 ;
		JOptionPane.showMessageDialog(null,"yes");
	}
	else{
	score -=3;
	JOptionPane.showMessageDialog(null,"no, the answer is Clone Troopers");
	}
	
	String kk = JOptionPane.showInputDialog("who was the chosen one?");
	if(kk.equals("Anakin Skywalker")){
		score ++ ;
		JOptionPane.showMessageDialog(null,"yes");
	}
	else{
	score -=500;
	JOptionPane.showMessageDialog(null,"no, the answer is Anakin Skywalker");
	}
	String l = JOptionPane.showInputDialog("who killed Darth Sideous?");
	if(l.equals("Darth Vader")){
		score ++ ;
		JOptionPane.showMessageDialog(null,"yes");
	}
	else{
	score --;
	JOptionPane.showMessageDialog(null,"no, the answer is Darth Vader");
	}
	String b = JOptionPane.showInputDialog("Who is the first character to utter any kind of speech in the original 'Star Wars'?");
	if(b.equals("C-3PO")){
		score +=500 ;
		JOptionPane.showMessageDialog(null,"yes");
	}
	else{
	score -=1;
	JOptionPane.showMessageDialog(null,"no, the answer is C-3PO, with 'Did you hear that?"
			+ " They shut down the main reactor. "
			+ "We'll be destroyed for sure. This is madness',"
			+ " but you should just put C-3PO if you want the correct answer");
	}
	String ba = JOptionPane.showInputDialog("who are the main villans in star wars 6");
	if(ba.equals("Darth Vader and Darth Sideous ")){
		score +=500 ;
		JOptionPane.showMessageDialog(null,"yes");
	}
	else{
	score --;
	JOptionPane.showMessageDialog(null,"no, the answer is Darth Vader and Darth Sideous");
	}
	
	JOptionPane.showMessageDialog(null, "your score is "+score);
	
	
	
	
}
}

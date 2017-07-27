package day5;

import java.util.Random;

import javax.swing.JOptionPane;

public class magic8ball {
public static void main(String[] args) {
	

		// 1. Make a main method that includes all the steps below….

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	
	int r = 0;
// 3. Print out this variable
System.out.println(r); 
		// 4. Get the user to enter a question for the 8 ball
for (int i = 0; i < 5.5; i++) {
	 r = new Random().nextInt(7);
	String ball = JOptionPane.showInputDialog("enter a question for the magical 8 ball");


		
// 5. If the random number is 0
if (r == 0){
	JOptionPane.showMessageDialog(null,"yes");
	
}
		// -- tell the user "Yes"

		// 6. If the random number is 1
if (r == 1){
	JOptionPane.showMessageDialog(null,"No");
	
}
		// -- tell the user "No"

		// 7. If the random number is 2
if (r == 2){
	JOptionPane.showMessageDialog(null,"maybe ask siri?");
	
}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
if (r == 3){
	JOptionPane.showMessageDialog(null,"don't expect a yes or a no, i dunno");
}	
if (r == 4){
	JOptionPane.showMessageDialog(null,"ask the person next to you?");
}

if (r == 5){
	JOptionPane.showMessageDialog(null,"find inner peace and you shall find out");
}
if (r == 6){
	JOptionPane.showMessageDialog(null,"get rid of your enimies by high fiving them and they shall tell you");
}
}
		// -- write your own answer
}
	}




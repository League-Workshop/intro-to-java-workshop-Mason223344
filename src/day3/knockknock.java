package day3;

import javax.swing.JOptionPane;

public class knockknock {
	public static void main(String[] args) {
		speak("knockknock");
		String sentence = JOptionPane.showInputDialog("knock knock");
		if (sentence.equals("who's there")) {
		} else {
			speak("no, it is, who's there");
		}
		speak("boo");
		String who = JOptionPane.showInputDialog("boo");
		if (!who.equals("boo who")){
			speak("no, it is boo who");
		}
		speak("boo who, why are you crying, it is just a joke");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
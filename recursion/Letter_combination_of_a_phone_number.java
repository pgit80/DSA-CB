package recursion;

public class Letter_combination_of_a_phone_number {
	/*
	 ***************************************************************************
	 * Leetcode- 17
	 * Imagine a keypad phone We want to generate all the possible words on the
	 * combination of key digits
	 * Ex- for digit - 23, words can be- ad, ae, af, bd, be, bf, cd, ce, cf    *
	 ***************************************************************************
	 */
	static String[] code = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String button = "23";
		printLetterCombination(button, "");
	}
	static void printLetterCombination(String button, String word){
		if(button.length()==0) {
			System.out.println(word);
			return;
		}
		// picking out the character
		char ch = button.charAt(0);
		// finding the respective string of pressed digit button
		String pressed = code[ch-'0']; // convert char to int
		// looping over respective string of pressed button
		for(int i=0; i<pressed.length(); i++)
		printLetterCombination(button.substring(1), word+pressed.charAt(i));
	}
}

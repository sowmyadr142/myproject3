package com.pgm.logic;

public class FindWord {

	public static void main(String[] args) {

		String word = "umbrella";
		boolean w=false;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'e') {
				w=true;
				break;
			}
		}
		System.out.println(w);
			}
		
}
	


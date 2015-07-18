package net.dictionary.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Dictionary {
	private List<String> enWords;
	private List<String> bgWords;
	
	public Dictionary(String enWord, String bgWord) {
		this.enWords = new ArrayList<>();
		this.bgWords = new ArrayList<>();
		
		this.init(enWord, bgWord); 
		
	}
	
	public void addTranslation(String wordEN, String wordBG) {
		this.enWords.add(wordEN);
		this.bgWords.add(wordBG);
	}
	
	public List<String> charSearch(char letter) {
		List<String> charList = new LinkedList<>();
		
		for (Iterator iterator = bgWords.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if (letter == string.charAt(0)) {
				charList.add(string);
			}
		}
		
		for (Iterator iterator = enWords.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if (letter == string.charAt(0)) {
				charList.add(string);
			}
		}
		
		return charList;
	}
	
	public void lookup(String wordEN) {
		for (int i = 0; i < enWords.size(); i++) {
			if (enWords.get(i).equalsIgnoreCase(wordEN)) {
				System.out.println(bgWords.get(i)); break;
			}
		}
		
	}
	
	public void lookupEN(String wordBG) {
		for (int i = 0; i < bgWords.size(); i++) {
			if (bgWords.get(i).equalsIgnoreCase(wordBG)) {
				System.out.println(enWords.get(i)); break;
			}
		}
		
	}
	
	private void init(String enWord, String bgWord) {
		this.addTranslation(enWord, bgWord);
	}

}


package com.jam.solutions;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Googlerese {

	public static void googlerese(String[] args) throws Exception {
		String name = "A-small-practice";
		String path = "S:\\Documents\\Coding\\eclipse_workspace\\CodeJam\\src\\Inputs\\";

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(new File(path + name + ".in"));
		PrintWriter pw = new PrintWriter(path + name + ".out");

		int testCases = sc.nextInt() + 1;
		
		Map<Character, Character> languageMap = new HashMap<Character, Character>();
		String test_input = "ejp mysljylc kd kxveddknmc re jsicpdrysi " + 
						"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd " +
						"de kr kd eoya kw aej tysr re ujdr lkgc jv";
		
		String test_output = "our language is impossible to understand " +
						"there are twenty six factorial possibilities " +
						"so it is okay if you want to just give up";
		
		languageMap.put(new Character('o'), new Character('e'));
		languageMap.put(new Character('z'), new Character('q'));
		languageMap.put(new Character('q'), new Character('z'));
		for(int i = 0; i < test_input.length(); i++){
			
			Character inputCharacter = new Character(test_input.charAt(i));
			if(inputCharacter.charValue() != ' '){
				Character outputCharacter = new Character(test_output.charAt(i));
				try{
					languageMap.put(inputCharacter, outputCharacter);
					//System.out.println(inputCharacter + " = " + outputCharacter);
				}catch(Exception e){
					//Move on with life
				}
				
			}
		}
		
		/*
		for (Map.Entry<Character,Character> entry : languageMap.entrySet()) {
			  Character key = entry.getKey();
			  Character value = entry.getValue();
			  System.out.println(key.charValue() + " = " + value.charValue());
		}*/
		
		for (int testCase = 1; testCase <= testCases; testCase++) {
			
			StringBuilder line = new StringBuilder(sc.nextLine());
			//System.out.println(line);
			for(int i = 0; i < line.length(); i++){
				if(line.charAt(i) != ' '){
					line.setCharAt(i, languageMap.get(new Character(line.charAt(i)).charValue()));
				}
			}
			int caseNumber = testCase - 1;
			
			if(caseNumber > 0)
				pw.printf("Case #" + caseNumber + ": %s\n", line);
			pw.flush();	
			
		}
		pw.close();
		sc.close();
	
	}
	
}
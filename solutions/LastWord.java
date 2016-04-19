package com.jam.solutions;
//package com.jam.solutions;
import java.io.File;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastWord {

	//public static void main(String[] args) throws Exception {
	public static void lastWord(String[] args) throws Exception {
		String name = "A-large";
		String path = "S:\\Documents\\Coding\\eclipse_workspace\\CodeJam\\src\\Inputs\\";

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(new File(path + name + ".in"));
		PrintWriter pw = new PrintWriter(path + name + ".out");

		int testCases = sc.nextInt();
		
		
		for (int testCase = 1; testCase <= testCases; testCase++) {
			
			String word = sc.next();
			String output = "";
			
			for(int i = 0; i < word.length(); i++){
				if(i == 0){
					output += word.charAt(i);
				}
				else{
					if((byte) word.charAt(i) < (byte) word.charAt(0)){
						output += word.charAt(i);
					}
					else if((byte) word.charAt(i) >= (byte) word.charAt(0) && (byte) word.charAt(i) >= (byte) output.charAt(0)){
						output = word.charAt(i) + output;
					}else{
						output += word.charAt(i);
					}
				}
			}
			
			
			//Print final output
			pw.printf("Case #" + testCase + ": %s\n", output);
			pw.flush();	
			
		}
		pw.close();
		sc.close();
	
	}
	
	public Matcher useRegex(String exp, String inputString){
		
		Pattern regex = Pattern.compile(exp);
		Matcher regMatcher = regex.matcher(inputString);
		
		return regMatcher;
		/*
		while(regMatcher.find()){
			if(regMatcher.group().length() != 0){
				return regMatcher.start(), .end(), .group(), .replaceAll();
			}
		}*/
		
		
		
		
	}
}
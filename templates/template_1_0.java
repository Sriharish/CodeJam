package com.jam.templates;
//package com.jam.solutions;
import java.io.File;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class template_1_0 {

	//public static void main(String[] args) throws Exception {
	public static void googlerese(String[] args) throws Exception {
		String name = "A-small";
		String path = "S:\\Documents\\Coding\\eclipse_workspace\\CodeJam\\src\\Inputs\\";

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(new File(path + name + ".in"));
		PrintWriter pw = new PrintWriter(path + name + ".out");

		int testCases = sc.nextInt();
		
		
		for (int testCase = 1; testCase <= testCases; testCase++) {
			
			//Do stuff
			
			//Print final output
			//pw.printf("Case #" + testCase + ": %s\n", line);
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
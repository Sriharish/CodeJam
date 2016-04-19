package com.jam.unsolved;
//package com.jam.solutions;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RankFile {

	//public static void main(String[] args) throws Exception {
	public static void main(String[] args) throws Exception {
		String name = "A-small";
		String path = "S:\\Documents\\Coding\\eclipse_workspace\\CodeJam\\src\\Inputs\\";

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(new File(path + name + ".in"));
		PrintWriter pw = new PrintWriter(path + name + ".out");

		int testCases = sc.nextInt();
		
		
		for (int testCase = 1; testCase <= testCases; testCase++) {
			
			int N = (sc.nextInt() * 2);
			ArrayList<String> lines = new ArrayList<String>();
			for(int i = 0; i < N; i++){
				lines.add(sc.nextLine());
			}
			Collections.sort(lines);
			
			ArrayList<String> rows = new ArrayList<String>();
			ArrayList<String> columns = new ArrayList<String>();
			for(int i = 0; i < lines.size(); i++){
				if(i % 2 == 0){
					//System.out.println(lines.get(i));
					rows.add(lines.get(i));
				}else{
					columns.add(lines.get(i));
				}
			}
			rows.remove(0);
			System.out.println(rows.toString());
			System.out.println(columns.toString());
			
			String output = "";
			String lastCol = columns.get(columns.size() - 1);
			String upCol = columns.get(columns.size() - 2);
			System.out.println(lastCol);
			System.out.println(upCol);
			
			Scanner numScanner = new Scanner(lastCol);
			Scanner numScanner2 = new Scanner(upCol);
			
			for(int i = 0; i < lastCol.length(); i++){
				int num1 = Integer.parseInt(numScanner.next());
				int num2 = Integer.parseInt(numScanner2.next());
				int num3 = num1 - 1;
				int diff = num1 - num2;
				if(diff == 1){
					String n = Integer.toString(num1);
					output += n + " "; 
				}else if(diff > 1){
					String n = Integer.toString(num3);
					output += n + " ";
				}
			}
			
			numScanner.close();
			numScanner2.close();
			
			System.out.println("Case #" + testCase + ": " + output + "\n");
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
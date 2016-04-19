package com.jam.unsolved;
//package com.jam.solutions;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//NOT SOLVED

public class Checkerboard {

	public static void checkerboard(String[] args) throws Exception {
		String name = "A-small";
		String path = "S:\\Documents\\Coding\\eclipse_workspace\\CodeJam\\src\\Inputs\\";

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(new File(path + name + ".in"));
		PrintWriter pw = new PrintWriter(path + name + ".out");

		int testCases = sc.nextInt();
		
		
		for (int testCase = 1; testCase <= testCases; testCase++) {
			
			//Do stuff
			int N = 2 * sc.nextInt();
			int minSwaps = 0;
			
			ArrayList<String> checkerboard = new ArrayList<String>();
			
			for(int i = 0; i < N; i++){
				checkerboard.add(sc.nextLine());
			}
			
			//Check rows for 0's and check columns for 1's (checking for even count)
			for(int i = 0; i < N; i++){
				int oneCount = 0;
				int zeroCount = 0;
				for(int j = 0; j < N; j++){
					if(checkerboard.get(i).charAt(j) == '0'){
						zeroCount++;
					}else if(checkerboard.get(j).charAt(i) == '1'){
						oneCount++;
					}
				}
				if(zeroCount != oneCount){
					pw.printf("Case #" + testCase + ": %s\n", "IMPOSSIBLE");
					break;
				}
			}
			
			//solve for min swaps
			/*
			for(int i = 0; i < N - 1; i++){
				
				for(int j = 0; j < N - 1; j++){
					if(checkerboard.get(i).charAt(j) == )
				}
				
			}*/
			
			
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
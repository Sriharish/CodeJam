package com.jam.solutions;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Pancakes {

	public static void pancake(String[] args) throws Exception {
		String name = "B-small";
		String path = "S:\\Documents\\Coding\\eclipse_workspace\\CodeJam\\src\\";

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(new File(path + name + ".in"));
		PrintWriter pw = new PrintWriter(path + name + ".out");

		int testCases = sc.nextInt();
	
		for (int testCase = 1; testCase <= testCases; testCase++) {
			ArrayList<Boolean> stack = new ArrayList<Boolean>();
			String input = sc.next();
			for(int i = 0; i < input.length(); i++){
				if(input.charAt(i) == '+'){
					stack.add(Boolean.TRUE);
				}
				else{
					stack.add(Boolean.FALSE);
				}
			}
			
			int numFlips = 0;
			while(stack.contains(Boolean.FALSE)){
				for(int j = stack.size() - 1; j >= 0; j--){
					if(stack.get(j) == Boolean.FALSE){
						numFlips++;
						for(int k = 0; k <= j; k++){
							stack.set(k, !stack.get(k));
						}
					}
				}
				
			}
			
			pw.printf("Case #" + testCase + ": %d\n", numFlips);
			pw.flush();	
		}
		pw.close();
		sc.close();
	
	}
	
}
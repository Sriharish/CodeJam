package com.jam.unsolved;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//NOT SOLVED

public class RopeIntranet {

	public static void ropeIntranet(String[] args) throws Exception {
		String name = "A-small";
		String path = "S:\\Documents\\Coding\\eclipse_workspace\\CodeJam\\src\\Inputs\\";

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(new File(path + name + ".in"));
		PrintWriter pw = new PrintWriter(path + name + ".out");

		int testCases = sc.nextInt();
		
		for (int testCase = 1; testCase <= testCases; testCase++) {
			
			Map<Integer, Integer> numWiresPerLevel = new HashMap<Integer, Integer>();
			//Do stuff
			int numWires = sc.nextInt();
			for(int i = 0; i < numWires; i++){
				Integer a1 = sc.nextInt();
				Integer a2 = sc.nextInt();
				if(a1 == a2){
					//Extra check to make sure no window has more than one wire
					if(!numWiresPerLevel.containsKey(a1)){
						numWiresPerLevel.put(a1, new Integer(1));
					}else{
						Integer newNumOnLevel = new Integer(numWiresPerLevel.get(a1) + 1);
						numWiresPerLevel.put(a1, newNumOnLevel);
					}
				}else{
					int n1 = a1.intValue();
					int n2 = a2.intValue();
					
					if(n1 < n2){
						for(int j = n1 + 1; j < n2; j++){
							Integer newKey = new Integer(j);
							if(numWiresPerLevel.get(newKey) != null){
								//System.out.print("In here!!!");
								Integer newNumOnLevel = new Integer(numWiresPerLevel.get(newKey) + 1);
								numWiresPerLevel.put(newKey, newNumOnLevel);
							}else{
								numWiresPerLevel.put(newKey, new Integer(1));
							}
						}
					}
					else{
						for(int j = n1 - 1; j > n2; j--){
							Integer newKey = new Integer(j);
							if(numWiresPerLevel.get(newKey) != null){
								//System.out.print("In here!!!");
								Integer newNumOnLevel = new Integer(numWiresPerLevel.get(newKey) + 1);
								numWiresPerLevel.put(newKey, newNumOnLevel);
							}else{
								numWiresPerLevel.put(newKey, new Integer(1));
							}
						}
					}
					
					
				}
				
			}
			
			int totalIntersections = 0;
			for (Map.Entry<Integer,Integer> entry : numWiresPerLevel.entrySet()) {
				  
				  //System.out.println(entry.getKey() + " = " + entry.getValue());
				  int numIntersections = entry.getValue().intValue() - 1;
				  if(numIntersections > 0){
					  totalIntersections += numIntersections;
				  }
			}
			if(totalIntersections > 1)
				totalIntersections = (int) Math.floor((double) totalIntersections / (double) numWires);
			
			
			//Print final output
			pw.printf("Case #" + testCase + ": %d\n", totalIntersections);
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
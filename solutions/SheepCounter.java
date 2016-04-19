package com.jam.solutions;
/*import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SheepCounter {

	public static void main(String[] args) throws Exception {
		//long start = System.currentTimeMillis();
		String name = "A-large";
		String path = "S:\\Documents\\Coding\\eclipse_workspace\\CodeJam\\src\\";

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(new File(path + name + ".in"));
		PrintWriter pw = new PrintWriter(path + name + ".out");
//		Scanner sc = new Scanner(System.in);
//		PrintWriter pw = new PrintWriter(System.out);


		
		int testCases = sc.nextInt();

		
		for (int testCase = 1; testCase <= testCases; testCase++) {
			boolean[] numSeen = new boolean[10];
			Arrays.fill(numSeen, Boolean.FALSE);
			int n = sc.nextInt();
			if(n == 0){
				pw.printf("Case #" + testCase + ": INSOMNIA\n");
				pw.flush();
			}
			else{
				for(int i = 1; i < 2000000; i++){
					int currentNum = n * i;
					if(CheckArray(numSeen)){
						String digitsRead = Integer.toString(currentNum);
						//System.out.println(digitsRead);
						for(int j = 0; j < digitsRead.length(); j++){
							byte asciiVal = (byte) digitsRead.charAt(j);
							//System.out.println(asciiVal);
							numSeen[asciiVal - 48] = true;
						}
					}
					else{
						currentNum = n * (i - 1);
						pw.printf("Case #" + testCase + ": %d\n", currentNum);
						pw.flush();
						break;
					}
				}
				
			}
		}
		pw.close();
		sc.close();
	
	}
	
	public static boolean CheckArray(boolean[] array){
		for(boolean val: array){
			  //return true if false is found
			  if(!val){ return true;}
			}
			return false;
	}
}*/
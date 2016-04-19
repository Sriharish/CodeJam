package com.jam.unsolved;
//package com.jam.solutions;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//NOT SOLVED

public class Rotate {

	//public static void main(String[] args) throws Exception {
	public static void rotate(String[] args) throws Exception {
		String name = "A-small";
		String path = "S:\\Documents\\Coding\\eclipse_workspace\\CodeJam\\src\\Inputs\\";

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(new File(path + name + ".in"));
		PrintWriter pw = new PrintWriter(path + name + ".out");

		int testCases = sc.nextInt();
		
		
		for (int testCase = 1; testCase <= testCases; testCase++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			char[][] board = new char[N][N];
			
			//Print final output
			//pw.printf("Case #" + testCase + ": %s\n", line);
			pw.flush();	
			
		}
		pw.close();
		sc.close();
	
	}
	
	public static String checkWinner(char[][] b, int n, int k){
		
		String output = "";
		int rCountHor = 0;
		int bCountHor = 0;
		int rCountVer = 0;
		int bCountVer = 0;
		int rCountDi = 0;
		int bCountDi = 0;
		
		
		//Check horizontal
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(b[i][j] == 'R'){
					rCountHor++;
				}else if(b[i][j] == 'B'){
					bCountHor++;
				}
				
				if(b[j][i] == 'R'){
					rCountVer++;
				}else if(b[j][i] == 'B'){
					bCountVer++;
				}
			}
			if(rCountHor >= k || rCountVer >= k || rCountDi >= k){
				output += "R";
			}
			if(bCountHor >= k || bCountVer >= k || bCountDi >= k){
				output += "B";
			}
			rCountHor = 0;
			bCountHor = 0;
			rCountVer = 0;
			bCountVer = 0;
			rCountDi = 0;
			bCountDi = 0;
		}
		
		//check Vertical
		
		
		//Check diagonal
		
		
		return "";
	}
}
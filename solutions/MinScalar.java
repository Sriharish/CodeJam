package com.jam.solutions;
import java.io.File;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class MinScalar {

	public static void main(String[] args) throws Exception {
		String name = "A-large-practice";
		String path = "S:\\Documents\\Coding\\eclipse_workspace\\CodeJam\\src\\Inputs\\";

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(new File(path + name + ".in"));
		PrintWriter pw = new PrintWriter(path + name + ".out");

		int testCases = sc.nextInt();
	
		for (int testCase = 1; testCase <= testCases; testCase++) {
			
			ArrayList<BigInteger> v1 = new ArrayList<BigInteger>();
			ArrayList<BigInteger> v2 = new ArrayList<BigInteger>();
			int vSize = sc.nextInt();
			
			for(int i = 0; i < vSize; i++){
				v1.add(new BigInteger(sc.next()));
			}
			for(int i = 0; i < vSize; i++){
				v2.add(new BigInteger(sc.next()));
			}
			
			Collections.sort(v1);
			Collections.sort(v2);
			Collections.reverse(v2);
			
			BigInteger minScalar = BigInteger.ZERO;
			for(int i = 0; i < vSize; i++){
				minScalar = minScalar.add(v1.get(i).multiply(v2.get(i)));
			}
			
			pw.printf("Case #" + testCase + ": %d\n", minScalar);
			pw.flush();	
		}
		pw.close();
		sc.close();
	
	}
	
}
package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public final static String SPLIT =" ";
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writ = new BufferedWriter(new OutputStreamWriter(System.out));
		int numLine = Integer.parseInt(read.readLine()); 
		String[] numberArrays;
		double[] numbArray;
		for(int j=1;j< numLine;j++) {
			String text = read.readLine();
			numberArrays = text.split(SPLIT);
			int countain = numberArrays.length;
			numbArray = new double[countain]; 
			for(int i = 0; i < countain; i++) {
				numbArray[j] = Double.parseDouble(numberArrays[j]);	
			}
			
		}
		
	}

}

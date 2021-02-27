package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Main {
	public final static String SPLIT =" ";
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String answer ="";
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writ = new BufferedWriter(new OutputStreamWriter(System.out));
		int numLine = Integer.parseInt(read.readLine()); 
		String[] numberArrays;
		double[] numbArray;
		for(int j=0;j< numLine;j++) {
			numberArrays = read.readLine().split(SPLIT); 
			int countain = numberArrays.length;
			numbArray = new double[countain]; 
			for(int i = 0; i < countain; i++) {
				numbArray[i] = Double.parseDouble(numberArrays[i]);	
			}
		answer +=bubleSort(numbArray);
		}
		writ.write(answer);
		read.close();
		writ.close();
	}
	public static String bubleSort(double[] arrayNumber) {
		int change = 0;	
		int countan = 0;
		double total = 0;
		String message = "";
		for(int i = 1; i<arrayNumber.length;i++) {
			total += change;
			change = 0;
			for(int j= 0; j<arrayNumber.length-i;j++) {
				
				if(arrayNumber[j]>arrayNumber[j+1]) {
					double temp =  arrayNumber[j];
					arrayNumber[j] = arrayNumber[j+1];
					arrayNumber[j+1]= temp;
					change++;
					
					
				}
				
			}
			countan++;
			
			
		}
		for(int i= 0; i<arrayNumber.length; i++) {
			message += arrayNumber[i]+" ";
		}
		total = total/countan;
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(total)+"-"+message+"\n";
	}
}

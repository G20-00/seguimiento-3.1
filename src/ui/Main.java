package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
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
			numbArray=bubleSort(numbArray);
			 answer += answer(numbArray)+"\n"; 
		}
		System.out.println("llego2asdadasd \n ");
		writ.write(answer);
		read.close();
		System.out.println("llegoasadasd2 \n ");
		writ.close();
	}
	public static double[] bubleSort(double[] arrayNumber) {
		double[] countainArray = new double[arrayNumber.length] ;
		double total = 0;
		int change = 1;	
		
		for(int i = 1; i<arrayNumber.length;i++) {
			change = 0;
			for(int j= 0; j<arrayNumber.length-i;j++) {
		
				if(arrayNumber[j]>arrayNumber[j+1]) {
					double temp =  arrayNumber[j];
					arrayNumber[j] = arrayNumber[j+1];
					arrayNumber[j+1]= temp;
					change++;
				}
			}
			total +=change;
		}
		total /=(arrayNumber.length-1);
		
		countainArray[0]= total;
		for(int i=1;i < arrayNumber.length;i++) {
			countainArray[i] = arrayNumber[i-1];
		}
		return countainArray;
	}
	public static  String answer(double[] arrayNumber) {
		DecimalFormat dF = new DecimalFormat("#.00");
		String answer = ""; 
		double aux = (arrayNumber[0]-arrayNumber[0]+0.001);
		System.out.println(arrayNumber[0]+ "\n ");
		String aux2 = aux+"";
		if(arrayNumber[0] % 1 == 0) {
			answer = ((arrayNumber[0]*1e2)/1e2)+"-";
		}
		else if(aux2.charAt(3)=='0') {
			System.out.println("llego1 \n ");
			answer = dF.format(arrayNumber[0]);
			answer = answer.substring(0,answer.length()-1)+"-";
		}
		else {
			dF.setRoundingMode(RoundingMode.DOWN);
			answer = dF.format(arrayNumber[0]+"-");
			System.out.println("llego2 \n ");
		}	
			for(int i = 1;i<arrayNumber.length;i++) {
				answer+=arrayNumber[i]+" ";
				System.out.println("llego3 \n ");
		}
			answer =answer.replaceAll(",",".");
			answer =answer.substring(0,answer.length()-1);
			
			System.out.println("llego43 \n ");
		    return answer;
		    
		    
		    
	}
	
}

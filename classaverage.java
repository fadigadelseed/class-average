package LABS;

import java.util.Scanner;

public class classaverage {

	public static void main(String[] args) {
		int test1, test2, testavg; 
		int labavg,total=0, lab_ct, lab, percentage;
		//   
	    System.out.println("this program calculates your class average");
        Scanner input = new Scanner(System.in);
		System.out.println("what is the score of the first test?");
        test1=input.nextInt();
        
        System.out.println("what is the score of the second test?");
        test2=input.nextInt();
        
       testavg= (int) (0.5*(test1+test2)/2);
	
	   //
       System.out.println("how many labs do you have?");
	   lab_ct = input.nextInt();
	
	   for(int i=1; i<=lab_ct; i++)
	   { System.out.println("enter the score of your next lab");
	     lab=input.nextInt();
	
         total=total+lab;
	   }
	   labavg= (int) ((total/lab_ct)*10*.5); 
	   
	  percentage= labavg+testavg;
	  
	  System.out.println("the class percentage is %"+percentage);
	}
	

}

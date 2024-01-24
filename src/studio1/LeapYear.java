package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is the year?");
		int year = in.nextInt();
		boolean y= (year%4)==0;
		boolean ye= (year%100)!=0;
		boolean yea=(year%400)==0;
		boolean r=(y)&&(ye)||(yea);
		System.out.println(r);
		
		
		
		// TODO Auto-generated method stub

	}

}

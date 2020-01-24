package commandsdemo;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, reverse=0;
		
	    System.out.print("Enter an number to reverse: ");
	    Scanner sc = new Scanner(System.in);
	    number = sc.nextInt();

	    while(number != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + number%10;
	      number = number/10;
	    }

	    System.out.print("Reverse of the number is: " + reverse);
	    sc.close();
	}
}
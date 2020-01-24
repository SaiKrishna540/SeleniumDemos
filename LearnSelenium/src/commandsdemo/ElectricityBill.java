package commandsdemo;

import java.util.Scanner;

public class ElectricityBill {
	
	public static void main(String[] args) 
	{
		int Pre_read, Curr_read, Units; 
		double Amount;

		Scanner sc = new Scanner(System.in);
		Curr_read = sc.nextInt();
		Pre_read = sc.nextInt();
		Units = sc.nextInt();

		System.out.println("Previous Units are: "+Pre_read);
		System.out.println("Current Units are: "+Curr_read);
		
		if(Curr_read > Pre_read) {
			Units= Curr_read - Pre_read;
			System.out.println("Total Number of Units Consumed this month:"+Units);

			if (Units==1 && Units <= 30)
		  	{
		        Amount = Units * 2.50;
		  	} 
		  	else if (Units>30 && Units <= 70)
		  	{
		  		Amount = Units * 3.5;
		  	}
		  	else
		  	{
		  		Amount = Units * 4.5;
		  	}

			System.out.println("\n Electricity Bill  =  " +Amount);
		}

		else {
			System.out.println("Invalid Value");
		}

		sc.close();
	}
}

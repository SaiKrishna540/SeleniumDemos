package commandsdemo;

import java.util.*;

public class Runrate {
    Scanner scan=new Scanner(System.in);

    float runs, overs, runRate, reqrunrate; 
    public void input(){

    	try{
            System.out.println("Enter Runs Scored: ");
            runs=scan.nextFloat();
            System.out.println("Enter Number of overs: ");
            overs=scan.nextFloat();
            runRate=runs/overs;
            System.out.println("Score is "+runs+" runs in "+overs+" with the Run Rate of "+runRate+".");
//            System.out.println("Number of Overs: "+overs);
    	}

    	catch(NumberFormatException e){
            System.out.println("Error Code: "+e);
            System.exit(0);
        }
    }

    public void compute(){
        reqrunrate=(runs+1)/overs;
        System.out.println("Required Runrate is: "+reqrunrate);
    }

    public static void main(String[] args){
        Runrate obj=new Runrate();
        obj.input();
        obj.compute();
    }
}


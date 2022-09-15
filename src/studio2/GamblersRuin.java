package studio2;

import java.util.Scanner;

public class GamblersRuin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert your starting amount");
		double startAmount = in.nextDouble();
		System.out.println("Please enter your win chance");
		double winChance = in.nextDouble();
		System.out.println("Please enter your win limit");
		double winLimit = in.nextDouble();
		
	
		while (startAmount>0 && startAmount<winLimit)
		{
			if (Math.random()>winChance)
			{
				startAmount= startAmount+1;
				System.out.println(startAmount);
			} else if (Math.random()<winChance) {
				startAmount= startAmount-1;
				System.out.println(startAmount);	
			}
		}
		
				
	}

}

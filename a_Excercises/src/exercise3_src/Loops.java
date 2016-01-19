package exercise3_src;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Loops 
{

	public static void main(String[] args) 
	{
		int i=0;
		while(i<6)
		{
			System.out.println( i);
			i++;
		}
		
		int iOdd = 0;
		int iCounter =1;
		
		System.out.println("\n");
		while(iCounter<6)
		{
			if(iOdd%2 == 0)
			{
				iCounter++;
				iOdd++;
				System.out.println( iOdd);
			}
			else
			{
				iOdd++;
			}
		}
		
		System.out.println("\n");
		int messages = 6;
		i=1;
		Scanner scanner = new Scanner(System.in);
		while(i<messages)
		{
			System.out.println("Enter Text");
			String sMessage = scanner.nextLine();
			System.out.println(sMessage.toUpperCase());
			i++;
		}

		System.out.println("C'est Tout");
		String sCity;
		do{
			
			System.out.println("Enter City");
			sCity = scanner.nextLine().toUpperCase();
		}
		while (!(sCity.equals("PARIS")|| sCity.equals("LONDON")|| sCity.equals("NEW YORK")));
		
		iCounter=1;
		for(i=1; iCounter<6; i=i+2)
		{
			System.out.println(i);
			iCounter++;
		}
		
		System.out.println();
		
		iCounter=0;
		for( i=100; i>49; i=i-10)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		for( i=2; ; i++)
		{
			System.out.println("loopy Loopy");
		}
		
			

	}

}

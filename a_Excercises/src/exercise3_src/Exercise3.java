package exercise3_src;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Exercise3 
{
	
	public static void main(String[] args) 
	{
		//Part i - Factorials
		long lAnswer =1;
		String sBaseNumber = JOptionPane.showInputDialog("What Number would you like to make bigger?","");
		int iMakeItBigger = new Integer(sBaseNumber);
		for(int i=1; i<=iMakeItBigger; i++)
		{
			lAnswer *= i;
		}
		JOptionPane.showMessageDialog(null, lAnswer);
		
		//Part ii - Prime Numbers
		//checks whether an int is prime or not.
		//int n=999;
		for(int n=1; n<=1000; n++)
		{
		    //check if n is a multiple of 2
		    if (n%2==0) 
		    {
		    	//Not Prime
		    	continue;
		    }
		    //if not, then just check the odds
		    for(int i1=3;i1*i1<=n;i1+=2)
		    {
		        if(n%i1==0)
		        {
		            break;
		        }
		    }
		   System.out.println("Prime: " + n);
		}
		
		//Part iii - Times Tables
		Object[][] aTimesTables = new Object[10][10];
		for(int row=0; row<=aTimesTables.length-1; row++)
		{
			for(int column=0; column<=aTimesTables.length-1; column++)
			{
				aTimesTables[row][column] = (row+1)*(column+1);
			}
		}
		
		for(int grid=0; grid<aTimesTables.length; grid++)
		{
			for(int grid1=0; grid1<aTimesTables[grid].length; grid1++)
			{
				System.out.print(aTimesTables[grid][grid1] + " ");
				
			}
			System.out.println();
		}
		
		// part iv - Putting tables in a table
		// Set the frame characteristics
		JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setTitle("Times Tables");

	    Object columnNames[] = {"One", "Two", "Three","Four", "Five", "Six", "Seven","Eight", "Nine", "Ten"};
	    JTable table = new JTable(aTimesTables, columnNames);

	    JScrollPane scrollPane = new JScrollPane(table);
	    frame.add(scrollPane, BorderLayout.CENTER);
	    frame.setSize(600, 375);
	    frame.setVisible(true);
	}

} 

package lab1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class la1
{
	
	public static void main(String[] args) 
	{		
		boolean b = false;
		boolean debug = false;
		List <String> ints = new ArrayList<String>();
		
		for(String arg: args)
		{
			
			if(arg.equals("-d"))
			{
				debug = true;
			}
			else if (arg.equals("-h"))
			{
				methods f = new methods();
				f.helper();
			}
			
		}

		Scanner ob = new Scanner(System.in);
		String input = null;
		String s = "";
		StringBuffer str = new StringBuffer();
		int indexOfNum = 0;
		char charToChange = 0, tempChar = 0;
		while(true) 
		 {
	            System.out.println("\n1 - input");
	            System.out.println("2 - show input");
	            System.out.println("3 - calculate and show result");
	            System.out.println("4 - exit");
	            int num = ob.nextInt();
	      switch(num)
	      {
	      case 1:  
	    	  
	    	 System.out.println("Enter string, index and char:");
	    	  ob.nextLine();
              s = ob.nextLine()+" ";
              str.append(s);
              indexOfNum = ob.nextInt() - 1;
	   		try 
	   		{
	   			charToChange = (char)System.in.read();
	   		}
	   		catch (IOException e) 
	   		{
	   			e.printStackTrace();
	   		}
	   		break;
	      case 2:
			if(s!="" && str != null && indexOfNum >= 0)
			{
				System.out.println("Input was correct");
				System.out.println("String:" + s +"\nIndex of number is " + indexOfNum +
						"\nChar to change is " + charToChange);
			}
			else
			{
				System.out.println("Input is incorrect or absent");
			}
			break;
		case 3:
		 methods f = new methods();
		 f.calculate( tempChar, indexOfNum, str, charToChange, debug, s, ints);
		case 4:
			 System.out.println("\nSystem exited");
             System.exit(0);
         default:
             System.out.println("unknown command.");
	      }
	   }
	}
} 
class Debug
{
	public static void state(char tempChar,String temp,int currentLetter)
	{
		System.out.println("Number of letter that is checking\t" + currentLetter + "\nLetter that's checking\t" + tempChar + "\nWord that is checking\t"+ temp);
	}
}


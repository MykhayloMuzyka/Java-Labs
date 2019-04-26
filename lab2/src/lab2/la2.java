package lab2;


import java.util.Scanner;
import lab2.MyContainer;


public class la2 
{
	private static MyContainer c;
	private static Scanner ob;
	public static void main(String[] args) 
	{
		int command;
		ob = new Scanner(System.in);  
 	    String s = "";
	    while(true) 
		 {
	       System.out.println("\n1 - create container");
	       System.out.println("2 - fill container");
	       System.out.println("3 - clear container");
	       System.out.println("4 - show container");
	       System.out.println("5 - container menu");
	       System.out.println("6 - exit");
	       int num = ob.nextInt();
	       switch(num)
	      {
	      case 1:
	      {
	    	  System.out.println("Enter the size of container");
              c = new MyContainer(ob.nextInt());
              System.out.println("Container is created.");
	       }
	       case 2:
	       {
	    	   if(c != null) {
                   ob.nextLine();
                   System.out.println("Enter your sentences. Write '/stop', to stop.");
                   s = ob.nextLine();
                   while (!s.equals("/stop")) {
                       if (s.length() <= 0) {
                           System.out.println("String is EMPTY!!! Try again,please");
                       } else {
                           c.add(s);
                       }
                       s = ob.nextLine();
                   }
               }
               else{
                   System.out.println("Container is not created!!!");
               }
	    	   s="";
               break;
	       }
	
	       case 3:
	       {
	    	   if(c != null){
                   c.clear();
                   System.out.println("Container is cleaned!!!");
               }
               else{
                   System.out.println("Container is not created!!!");
               }
               break;
	       }	
	       
	       case 4:
	       {
	    	   if(c != null){
                   System.out.println(c.toString());
               }
               else{
                   System.out.println("Container is not created!!!");
               }
               break;
	      }
	       case 5:
	       {
	    	   if(c == null){
                   System.out.println("Container is not created!!!");
                   break;
               }
               System.out.println("1 - add element");
               System.out.println("2 - remove element");
               System.out.println("3 - current size");
               System.out.println("4 - write to file (serialize)");
               System.out.println("5 - read from file (deserialize)");
               System.out.println("6 - get element by index");
               System.out.println("7 - get element's index");
               System.out.println("8 - iterate through container");
               System.out.println("9 - calculate");
               System.out.println("10 - return");
               command = ob.nextInt();
               switch(command)
               {
               		case 1:
               		{
               			ob.nextLine();
               			System.out.println("Enter strings to add");
               			c.add(ob.nextLine());
               			break;
               		}
               		case 2:
               		{
               			ob.nextLine();
                        System.out.println("Pick what string you want to remove");
                        if(c.remove(ob.nextLine())){
                            System.out.println("String is removed from container!");
                        }
                        else{
                            System.out.println("String is not found!");
                        }
                        break;
               		}
               		case 3:
               		{
               			System.out.println("Size: " + c.size());
                        break;
               		}
               		case 4:
               		{
               			ob.nextLine();
                        System.out.println("Enter file name to create:");
                        if(c.serialize(ob.nextLine())){
                            System.out.println("Done!");
                        }
                        else{
                            System.out.println("Wrong input!");
                        }
                        break;
               		}
               		case 5:
               		{
               			ob.nextLine();
                        System.out.println("Enter file name to read it:");
                        if(c.deserialize(ob.nextLine())){
                            System.out.println("Data is getted!");
                        }
                        else{
                            System.out.println("Imposible to take data!!!");
                        }
                        break;
               		}
               		case 6:
               		{
               			System.out.println("Enter index:");
                        int w = ob.nextInt();
                        String str = c.get(w);
                        if(str != null){
                            System.out.println("There is your string: " + str);
                        }
                        else{
                            System.out.println("Element is not found!!!");
                        }
                        break;
               		}
               		case 7:
               		{
               		 ob.nextLine();
                     System.out.println("Enter your string:");
                     String str1 = ob.nextLine();
                     int id = c.get(str1);
                     if(id != -1){
                         System.out.println("Index: " + id);
                     }
                     else{
                         System.out.println("Element is not found!!!!");
                     }
                     break;
               		}
               		case 8:
               		{
               		 for(String s1 : c.toArray()){
                         System.out.println(s1+ " ");
                     }
                     break;
               		}
               		case 9:
               		{
               			c.calculate(c, s);
               		}
               		
               		case 10:
               		{
               			break;
               		}
               }
               break;
	       }
	       case 6:
	       {
	    	   System.out.println("System exited");
	    	   System.exit(0);
               break;
	       }
	    }
	}
	}
}


		 



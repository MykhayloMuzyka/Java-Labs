package lab7;

import java.util.Collections;
import java.util.Scanner;

public class la7 {
	 private static Scanner scan;

		public static void main(String[] args){
	       scan = new Scanner(System.in);
	       int num;
	       methods m = new methods();

	        while(true){
	            //System.out.println();
	            methods.help();
	            num = scan.nextInt();
	            switch(num){

	                case 1:
	                    m.printExcurce();
	                    break;
	                case 2:
	                    m.addExcurse();
	                    break;
	                case 3:
	                	m.printExcurce();
	                	System.out.println("Put number of the excursion you want to remove: ");
	                	int index = scan.nextInt();
	                	m.remove(index-1);
	                	break;
	                case 4:
	                	Collections.sort(m.excursion);
	                	break;
	                case 5:
	                	System.out.println("Put the name of the file: ");
	                	scan.nextLine();
	                	String fileName1  = scan.nextLine();
	                	System.out.println("Put number of the excursion you want to write: ");
	                	int i1 = scan.nextInt();
	                	m.WriteXML(fileName1, i1-1);
	                	break;
	                case 6:
	                	System.out.println("Put the name of the file: ");
	                	scan = new Scanner(System.in);
	                	String fileName2  = scan.nextLine();
	                	System.out.println("Put number of the excursion you want to write: ");
	                	int i2 = scan.nextInt();
	                	m.Writefile(fileName2, i2-1);
	                	break;
	                case 7:
	                	System.out.println("Put the name of the file you want to load from: ");
	                	scan = new Scanner(System.in);
	                	String filename1 = scan.nextLine();
	                    m.ReadXML(filename1);
	                    break;
	                case 8:
	                	System.out.println("Put the name of the file you want to load from: ");
	                	scan = new Scanner(System.in);
	                	String filename2  = scan.nextLine();
	                    m.Readfile(filename2);
	                    break;
	                case 9:
	                	System.out.println("System exited!!!");
	                    System.exit(0);
	                    break;
	            }
	        }
	    }
    }



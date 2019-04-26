package lab5;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

import java.beans.XMLEncoder;

public class la5 {
	
    public static void main(String[] args) {
        System.out.println("-WELCOME-");
        Locale.setDefault(new Locale("uk", "UA"));
        Scanner scan = new Scanner(in);

        boolean autoMode = false;
        if (args.length == 1 && (args[0].equals("auto") || args[0].equals("-a"))) {
            System.out.println("Auto mod enabled!");
            autoMode = true;
        }

        LinkedList<Excursion> excursions = new LinkedList<>();

        printMenu();
        while (true) {
            byte command = scan.nextByte();
            switch (command) {
                case 1:
                    if (autoMode) {
                        try(ObjectInputStream ois = new ObjectInputStream(
                                new FileInputStream("excursions.txt"))) {
                            LinkedList<Excursion> ex = (LinkedList<Excursion>) ois.readObject();
                            for (int i = 0; i < ex.size(); i++) {
                                excursions.add(ex.get(i));
                            }
                            System.out.println("��� ������ ������ � �����");
                        }
                        catch(Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                        autoMode = false;

                    } else {
                    	excursions.add(new Excursion());
                        int id = excursions.size()-1;
                        scan.nextLine();
                        System.out.print("����: ");
                        String str = scan.nextLine();
                        excursions.get(id).setDate(str);
                        System.out.print("��� �������: ");
                        String str1 = scan.nextLine();                        
                        excursions.get(id).setTime(str1);                       
                        System.out.print("��������� (� ��������): ");
                        excursions.get(id).setDuration(scan.nextInt());
                        scan.nextLine();
                        System.out.print("̳���: ");
                        excursions.get(id).setPlace(scan.nextLine());
                        System.out.print("����: ");
                        excursions.get(id).setDescription(scan.nextLine());
                        System.out.print("ʳ������ ��������: ");
                        int n = scan.nextInt();
                        excursions.get(id).setNumOfParticipants(n);
                        scan.nextLine();
                        for (int i = 1; i <= n; i++) {
                            System.out.print("������� �" + i + ": ");
                            String str2 = scan.nextLine();
                            if(str2.matches("\\D+"))
                            {
                            excursions.get(id).setParticipants(str2);
                            }
                            else {
                            	 System.out.println("�������!!! ������ ������ ���!!!!");
                                 break;
                            }
                        }
                    }                    
                    printMenu();
                    break;
                case 2:
                    for (int i = 1; i <= excursions.size(); i++) {
                        System.out.println("�" + i +": "+ excursions.get(i-1).getPlace()+"\n�������: "+
                    excursions.get(i-1).getDate()+" o "+excursions.get(i-1).getTime()+"\n���������: "+
                    excursions.get(i-1).getDuration()+"\n����: "+excursions.get(i-1).getDescription()+
                    "\nʳ������ ��������: "+excursions.get(i-1).getNumOfParticipants());
                    }
                    printMenu();
                    break;
                case 3:
                    for (int i = 1; i <= excursions.size(); i++) {
                        System.out.println("�" + i +": "+ excursions.get(i-1).getPlace());
                    }
                    System.out.println("������ ����� �������, ��� ������� ��������");
                    excursions.remove(scan.nextInt()-1);
                    System.out.println("�������� ������ ��������!");
                    printMenu();
                    break;
                case 4:
                	try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                            "D:\\Workspace\\lab5\\src\\excursions.xml"))){
                        LinkedList<Excursion> exc = excursions;
                        oos.writeObject(exc);
                    }
                    catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                  System.out.println("������ ��������!");
                    printMenu();
                    break;
                case 5:
                	try(ObjectInputStream ois = new ObjectInputStream(
                            new FileInputStream("D:\\Workspace\\lab5\\src\\excursions.xml"))) {
                        LinkedList<Excursion> ex = (LinkedList<Excursion>) ois.readObject();
                        for (int i = 0; i < ex.size(); i++) {
                            excursions.add(ex.get(i));
                        }
                        System.out.println("��� ������ ������ � �����");
                    }
                    catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    printMenu();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("��� ��������");
                    printMenu();
                    break;
            }
        }


    }
  
    public static void printMenu() {
        System.out.println("1 - �������� ���� ��������");
        System.out.println("2 - �������� ������ ��������");
        System.out.println("3 - �������� ��������");
        System.out.println("4 - ����������");
        System.out.println("5 - �������������");
        System.out.println("6 - ����� � ��������");
    }
}

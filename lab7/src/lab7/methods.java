package lab7;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class methods {
	Excursion e = new Excursion();
	ArrayList<Excursion> excursion = new ArrayList<>();
	Scanner ob = new Scanner(System.in);
	public static void help(){
        System.out.println( "1 - Show all excursions \n" +
                "2 - Add excursion \n" +
                "3 - Remove excursion\n"+
                "4 - Sort by place\n"+
                "5 - Save excursion in XML-file\n"+
                "6 - Save excursion in TXT-file\n"+
                "7 - Load excursions from XML-file\n"+
                "8 - Load excursions from TXT-file\n"+
                "9 - Exit");
    }
	public Scanner getScan() {
        return ob;
    }
    public void setScan(Scanner scan) {
        this.ob = scan;
    }
    public ArrayList<Excursion> getExcursion() {
        return excursion;
    }
    public void setExcursion(ArrayList<Excursion> excursion) {
        this.excursion = excursion;
    }	
	public void printExcurce(){
		int counter =1;
        if(!excursion.isEmpty()){
            for(Excursion x : excursion) {
                System.out.println("Excursion " + counter +"\n" +x.getDate() + "\n" + "Place: " + x.getPlace() +
                        "\n" + "Description: " + x.getDiscription() + "\nMembers: " + x.getMembers());
                counter++;
                System.out.println("\n");
            }
        }
        else System.out.println("There isn't any excursions!");
    }	
	public void addExcurse() {
		System.out.println("Enter date of the excursion:");
		String date = ob.nextLine();
		System.out.println("Enter time of the excursion:");
		String time = ob.nextLine();
		System.out.println("Enter duration of excursion:");
		int duration = Integer.valueOf(ob.nextLine());
		Date data = new Date (date,time,duration);
		System.out.println("Enter place of excursion:");
		String place = ob.nextLine();
		System.out.println("Enter discription of excursion:");
		String discription = ob.nextLine();
		System.out.println("Enter name and surname of members of the excursion:");
		String members = ob.nextLine();
		excursion.add(new Excursion(data, place, discription, members));
	}
	public void remove(int index) { 
		excursion.remove(index); 
	}
	public void sort(){
        excursion.sort(Comparator.comparing(Excursion::getPlace));
    }
	public void WriteXML(String filename, int i) {
        try(XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)))) {
            encoder.writeObject(excursion.get(i));
        }catch (FileNotFoundException e){
            System.out.println("Error");
        }
    }
	public void ReadXML(String filename) {
        try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)))) {
            Excursion object =  (Excursion) decoder.readObject();
            e = object;
            e.d = e.getDate();
            System.out.println(e.getPlace() +"\n"+ e.getDiscription()+"\n" + e.getMembers());
            System.out.println(e.d.getData() +"\n"+ e.d.getStartTime()+"\n" + e.d.getDuration());
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
	 public void Writefile(String fileName, int i){
	        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
	            oos.writeObject(excursion.get(i));
	            oos.flush();
	        }catch (IOException e){
	            System.out.println("can not write a file");
	        }
	    }
	 public void Readfile(String fileName){
	        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
	            e = (Excursion) ois.readObject();
	            e.d = e.getDate();
	            System.out.println(e.getPlace()+"\n" + e.getDiscription()+"\n" + e.getMembers());
	            System.out.println(e.d.getData()+"\n" + e.d.getStartTime()+"\n" + e.d.getDuration());
	        } catch (IOException e){
	            System.out.println("Error");
	        } catch (ClassNotFoundException e){
	            System.out.println("Error");
	        }
	    }
}

package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class methods {
	ArrayList<Excursion> excursion = new ArrayList<>();
	Scanner ob = new Scanner(System.in);
	public static void help(){
        System.out.println( "1 - Show all excursions \n" +
                "2 - Add excursion \n" +
                "3 - Save excursions\n"+
                "4 - Load excursions\n"+
                "5 - Exit");
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
                System.out.println("Excursion " + counter + "\nDate: " + x.getDate() + "\n" + "Place: " + x.getPlace() +
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
}

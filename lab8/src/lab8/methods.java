package lab8;

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
import javax.swing.JTextArea;

public class methods {
	public void remove(int index,ArrayList<Excursion> excursion) { 
		excursion.remove(index); 
	}
	public void sort(ArrayList<Excursion> excursion){
        excursion.sort(Comparator.comparing(Excursion::getPlace));
    }
	public void WriteXML(String filename, int index, JTextArea textArea,ArrayList<Excursion> excursion) {
		try(XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)))) {
            encoder.writeObject(excursion.get(index));
        }catch (FileNotFoundException e1){
        	textArea.setText("Error");
        }
    }
	public void ReadXML(String filename, JTextArea textArea) {
		try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)))) {
            Excursion object =  (Excursion) decoder.readObject();
            Excursion ex = new Excursion();
            ex = object;
            ex.d = ex.getDate();
            textArea.setText("Place: "+ex.getPlace()+"\nDiscription: " + ex.getDiscription()+"\n"+
    	            "Date: "+ex.d.getData()+"\nTime: " + ex.d.getStartTime()+"\nDuration: " + ex.d.getDuration()+" minutes");
        } catch (FileNotFoundException e1) {
        	textArea.setText("file not found");
        }
    }
	public void Writefile(String fileName, int index, JTextArea textArea,ArrayList<Excursion> excursion){
		 try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
	            oos.writeObject(excursion.get(index));
	            oos.flush();
	        }catch (IOException e1){
	        	textArea.setText("can not write a file");
	        }
	    }
	public void Readfile(String fileName, JTextArea textArea){
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
				Excursion ex = new Excursion();
	            ex = (Excursion) ois.readObject();
	            ex.d = ex.getDate();
	            textArea.setText("Place: "+ex.getPlace()+"\nDiscription: " + ex.getDiscription()+"\n"+
	            "Date: "+ex.d.getData()+"\nTime: " + ex.d.getStartTime()+"\nDuration: " + ex.d.getDuration()+" minutes");
	        } catch (IOException e1){
	        	textArea.setText("file not found");
	        } catch (ClassNotFoundException e1){
	        	textArea.setText("file not found");
	        }
	    }
	public void getPlaces(JTextArea textArea,ArrayList<Excursion> excursion) {
		 String m="", m1;
			int counter = 1;
	            for(Excursion x : excursion) {
	               m1=counter +" "+x.getPlace()+"\n";
	                counter++;
	                m+=m1;
	            }
	        textArea.setText(m);
	 }
    public void show(JTextArea textArea,ArrayList<Excursion> excursion) {
		 String t="", t1;
			int counter =1;
	        if(!excursion.isEmpty()){
	            for(Excursion x : excursion) {
	               t1="Excursion " + counter +"\n" + "Place: " + x.getPlace()+"\n" + x.getDate()+
	                        "\n" + "Description: " + x.getDiscription() + "\n" + "\n";
	                counter++;
	                t+=t1;
	            }
	            
	        }
			 if(!excursion.isEmpty())
				 textArea.setText(t);
			 else textArea.setText("There isn't any excursion!!!");
	 }
	 
}

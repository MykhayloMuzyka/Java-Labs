package lab2;

import java.io.*;
import java.util.Iterator;


public class MyContainer implements Serializable,Iterable<String>{
	private static final long serialVersionUID = -6071543564639542993L;
	private String[] words;
    private int length;
	private ObjectInputStream ois;
	public MyContainer(int len){
        if(len > 0){
            words = new String[len];
        }
        else{
            throw new ExceptionInInitializerError();
        }
    }
    public void add(String string){
        if(string != null){
            words[length++] = string;
        }
        else{
            throw new NullPointerException();
        }
    }   
    public void clear(){
        for(int i = 0;i < length;i++){
            words[i] = null;
        }
        length = 0;
    }    
    public boolean remove(String string){
        boolean checker = false;
        for(int i = 0; i < length;i++){
            if(checker){
                words[i-1] = words[i];
            }
            else if(string.equals(words[i])){
                checker = true;
            }
        }
        if(checker){
            length--;
            return true;
        }
        else return false;
    }    
    public boolean remove(int id){
        boolean checker = false;
        for(int i = 0; i < length;i++){
            if(checker){
                words[i-1] = words[i];
            }
            else if(this.get(id) != null){
                checker = true;
            }
        }
        if(checker){
            length--;
            return true;
        }
        else return false;
    }   
    public int size(){
        return length;
    }	
    public boolean serialize(String file){
        FileOutputStream fos;
        if (!(new File(file)).exists()) {
            File newFile = new File(file);
            try
            {
                if(newFile.createNewFile())
                    System.out.println("New file '"+file+"' has been created");
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
                return false;
            }
        }
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            return false;
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.flush();
            oos.close();
            fos.close();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public boolean deserialize(String filename) {
        FileInputStream fis;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return false;
        }
        try {
            ois = new ObjectInputStream(fis);
            MyContainer t = (MyContainer) ois.readObject();
            if (words.length > this.words.length) {
                System.out.println("Size of container is too large!");
                return false;
            }
            this.words = t.words;
            this.length = t.length;
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage() + "dsds");
            return false;
        } catch (ClassNotFoundException e) {
            System.out.println("Not Found!");
            return false;
        }
    }    
    public int get(String str) {
        for(int i = 0;i < length;i++){
            if(words[i].equals(str)){
                return i;
            }
        }
        return -1;
    }    
    public String get(int id) {
        if (id >= length)
            return null;
        else
            return words[id];
    }   
    public String[] toArray(){
        String[] arr = new String[length];
        System.arraycopy(words, 0, arr, 0, length);
        return arr;
    }
    public Iterator<String> iterator() {
        return (Iterator<String>) new MyIterator(this, length);
    }
	public String toString(){
	        return toString(". ");
	    }
	public String toString(String devid){
	        if(length == 0){
	            return null;
	        }
	        StringBuilder str = new StringBuilder();
	        for(int i = 0;i < length;i++){
	            str.append(words[i]).append(devid);
	        }
	        return str.toString();
	 }
	public void calculate(MyContainer c, String s) {
		 String alphabet = "abcdefghigklmnopqrstuvwxyz";
   		 String[] string =c.toString().split(" ");
   		 for(int word = 0;word <string.length;word++)
   	 	   {
   	 		   for(int ch = 0;ch<string[word].length();ch++)
   	 		   { 
   	 			   for(int l = 0;l<alphabet.length();l++)
   	 			   {
   	 				   if(alphabet.charAt(l) == string[word].charAt(ch))
   	 				   {
   	 					   s+=Integer.toString(l+1);
   	 					   s+=" ";
   	 					   break;
   	 				   }
   	 			   }
   	 			   System.out.print(string[word].charAt(ch));
   	 			   System.out.print(" ");
   	 		   }
   	 	   }
	   	    System.out.println("\n" + s);
	 }
}

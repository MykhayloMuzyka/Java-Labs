package lab3;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.Scanner;

public class la3 {

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
                    try(XMLEncoder encoder = new XMLEncoder(
                            new BufferedOutputStream(
                                    new FileOutputStream("Excurse.xml")))){
                        encoder.writeObject(m);

                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try( XMLDecoder decoder = new XMLDecoder(
                            new BufferedInputStream((
                                    new FileInputStream("Excurse.xml")))))
                    {
                        Object value = decoder.readObject();
                        decoder.close();

                        m = (methods) value;

                    } catch (Exception ex) {
                        System.out.println("Excurse is empty");
                    }
                    break;
                case 5:
                	System.out.println("System exited!!!");
                    System.exit(0);
                    break;
            }
        }
    }
}
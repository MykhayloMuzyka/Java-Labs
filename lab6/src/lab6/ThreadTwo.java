package lab6;

import java.util.ArrayList;

public class ThreadTwo extends Thread{
    public void run(){
        System.out.println("Початок роботи другого потоку");
        ArrayList<Long> arr1 = new ArrayList<>();
        for(int i = 0; i < 1000; i++){
            arr1.add((long) (Math.random() * 10000));
        }
        long min = arr1.get(0);
        for(int i = 1; i < arr1.size(); i++)
        {
            if(min > arr1.get(i))
            {
                min = arr1.get(i);
            }
            try
            {
                Thread.sleep(1);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Мінімальний опрацьований елемент - " + min);
        System.out.println("Другий потік завершив свою роботу");
    }
}

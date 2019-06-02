package lab6;

import java.util.ArrayList;

public class ThreadOne extends java.lang.Thread {
    public void run(){
        System.out.println("Початок роботи першого потоку");
        ArrayList<Long> arr1 = new ArrayList<>();
        for(int i = 0; i < 2000; i++){
            arr1.add((long) (Math.random() * 10000));
        }
        long max = arr1.get(0);
        for(int i = 1; i < arr1.size(); i++)
        {
            if(max < arr1.get(i))
            {
                max = arr1.get(i);
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
        System.out.println("Максимальний опрацьований елемент - " + max);
        System.out.println("Перший потік завершив свою роботу");
    }
}
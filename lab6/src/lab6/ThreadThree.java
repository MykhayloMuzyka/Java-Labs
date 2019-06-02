package lab6;

import java.util.ArrayList;

public class ThreadThree extends Thread{
    public void run(){
        System.out.println("Початок роботи третього потоку");
        ArrayList<Long> arr1 = new ArrayList<>();
        for(int i = 0; i < 2000; i++){
            arr1.add((long) (Math.random() * 10000));
        }
        long sum = 0;
        for(double i: arr1)
        {
            sum += i;
            try
            {
                Thread.sleep(1);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Сума - " + sum);
        System.out.println("Третій потік завершив свою роботу");
    }
}

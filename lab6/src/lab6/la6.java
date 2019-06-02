package lab6;

import java.util.Scanner;

public class la6 {

    private static Scanner scn;

	public static void main(String[] args) throws Exception {

        scn = new Scanner(System.in);
        ThreadOne thread1 = new ThreadOne();
        ThreadTwo thread2 = new ThreadTwo();
        ThreadThree thread3 = new ThreadThree();
        System.out.println("Виберіть тип виконання програми:\n" +
                "1)-Thrеad\n" +
                "2)-none");
        String str = scn.nextLine();
        System.out.println("Введіть максимальний час виконання в мс: ");
        Timeout time = new Timeout(scn.nextLong());
        time.start();
        long start = System.currentTimeMillis();
        if(str.equals("-Thread")) {
            thread1.start();
            thread2.start();
            thread3.start();
            thread1.join();
            thread2.join();
            thread3.join();
        }else if(str.equals("-none")){
            thread1.run();
            thread2.run();
            thread3.run();
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        long secs =  timeConsumedMillis/1000;
        long msecs = timeConsumedMillis%1000;
        String timeConsumedSecs = secs +"."+msecs;
        if(str.equals("-Thread")) {
            System.out.println("Потоковий час роботи: " +timeConsumedSecs+" с");
        }else if(str.equals("-none")){
            System.out.println("Безпотоковий час роботи: " +timeConsumedSecs+" с");
        }
        System.exit(0);
    }
}



package lab6;

public class Timeout extends Thread {
    private long limit;

    public Timeout(long limit){
        this.limit = limit;
    }
    @Override
    public void run() {
        long start  = System.currentTimeMillis();
        while (limit > System.currentTimeMillis() - start){
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Error!!!");
            }
        }
        System.out.println("Допустимий час виконання завершено");
        System.exit(0);
    }
}
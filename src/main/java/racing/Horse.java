package racing;

public class Horse extends Thread{
    @Override
    public void run(){
        for (int i =0;i<10000;i++){
            System.out.println("Horse2 "+i);
        }
    }
}

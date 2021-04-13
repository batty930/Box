package racing;

public class Racing {
    public static void main(String[] args) {
        Hourse h1 = new Hourse();
        Hourse h2 = new Hourse();
        h1.start();
        h2.start();
        Hourserunnable h3 = new Hourserunnable();
        Thread thread = new Thread(h3);
        thread.start();
    }
}

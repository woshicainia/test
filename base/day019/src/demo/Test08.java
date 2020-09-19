package demo;


public class Test08 {
    static boolean run = true;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (run) {

            }
        });
        thread.start();
        Thread.sleep(2000);
        System.out.println("让线程停下来");
        run = false;
    }
}

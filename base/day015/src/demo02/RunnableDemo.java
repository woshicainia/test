package demo02;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("HelloWrlod");
            }
        };
        Thread thread = new Thread(runnable);
        thread.setName("t1");
        thread.start();
        Runnable runnable1 = ()-> System.out.println("HelloWrold");
        Thread thread1 = new Thread(runnable1);
        thread1.setName("t2");
        thread1.start();

    }
}

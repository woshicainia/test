package demo02;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("HelloWrold");
            }
        };
        thread.setName("t1");
        thread.start();
        Thread thread1 = new Thread(()-> System.out.println("HelloWrold"));
        thread1.setName("t2");
        thread1.start();
    }
}

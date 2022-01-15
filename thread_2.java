public class thread_2 implements Runnable{
    public void run(){
        System.out.println("Thread");
    }

    public static void main(String[] args) {
        thread_2 t1 = new thread_2();
        Thread obj = new Thread(t1);
        obj.start();
        for (int i=10; i<= 15; i++){
            System.out.println(i);
        }
    }
}

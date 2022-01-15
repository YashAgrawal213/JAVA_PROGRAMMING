public class thread_3 extends Thread {
    public void run(){
        for (int i=1; i<=50; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        thread_3 t1 = new thread_3();
        t1.start();
        for (int i=100; i<= 150; i++){
            System.out.println(i);
        }
    }
}

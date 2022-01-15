public class thread_4 {
    public void run(){
        for (int i=1; i<=50; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        thread_3 t1 = new thread_3();
        t1.start();
        for (int i=100; i<= 110; i++){
            System.out.println(i);
        }
    }
}

public class thread_1 {
        public static void main(String[] args) {
            Thread obj = Thread.currentThread();
            obj.setPriority(Thread.MAX_PRIORITY);
            System.out.println(obj.getPriority());
        }
}

public class threads implements Runnable{
    public static void main(String[] args) {

        threads t1= new threads();
        Thread t2= new Thread(t1);
        t2.start();
        String name=Thread.currentThread().getName();
        System.out.println(name);
    }

        public void run(){
        String name=Thread.currentThread().getName();
            System.out.println(name);
    }
}
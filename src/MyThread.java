public class MyThread implements Runnable{
  private String name;
    public MyThread(String name){
        this.name=name;
    }

//    Map<Integer, String> map = ;

    @Override
    public void run() {
        System.out.println("start thread: "+name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ended thread: "+name);
    }
}

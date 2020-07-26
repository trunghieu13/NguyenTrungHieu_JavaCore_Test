public class MainThread {
    public static void main(String args[])
    {
        //khai bao thread1
        Thread1 thread1 = new Thread1();

        //khai bao thread2
        Thread2 a = new Thread2();
        Thread thread2 = new Thread(a);

        //start 2 thread

        //Phuong thuc join
        Thread1 thread3 = new Thread1();
        thread1.start();
        try{
            thread1.join();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        thread2.start();
        thread3.start();

        //Doi ten cho thread
        System.out.println("Truoc khi doi ten"+thread1.getName()+" "+thread2.getName()+" "+thread3.getName());
        thread1.setName("Thread_1");
        thread2.setName("Thread_2");
        thread3.setName("Thread_3");
        System.out.println("Sau khi doi ten"+thread1.getName()+" "+thread2.getName()+" "+thread3.getName());



    }
}

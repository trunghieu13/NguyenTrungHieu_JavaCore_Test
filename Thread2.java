public class Thread2 implements Runnable {
    //ghi de phuong thuc run
    @Override
    public void run() {
        for(int i =0;i<5;i++)
        {
            System.out.println("B"+i);
        }
    }


}

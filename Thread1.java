public class Thread1 extends Thread {
//ghi de phuong thuc run

//    @Override
//    public void run() {
//        for(int i =0;i<5;i++)
//        {
//            System.out.println("A"+i);
//        }
//    }
//------------------------------------------//
    //su dung sleep
@Override
public void run() {

    for(int i =0;i<5;i++)
    {
        try{
            Thread.sleep(500);
            System.out.println("A"+i);
        }catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

    }

}




}


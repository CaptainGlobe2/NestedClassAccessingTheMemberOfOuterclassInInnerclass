class database extends Thread {

    public void run(){//in the run method the thread start the excution 
        for(int i=0;i<5;i++){
            System.out.println("updating the db");
             try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class user extends Thread{//if we want to add the thread to the programm 
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("user "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadingdemo {
    public static void main(String [] args) throws InterruptedException{
        database db=new database();
        user u1=new user();
        db.start();
        u1.start();
        db.join();
        u1.join();//after using join the jvm cosider to complete the above thread
        System.out.println("last message");//but in the main method the thread start priniting this method at first because it consider the above both are programm of others and print this first if wee want to make it order use join
    }
}

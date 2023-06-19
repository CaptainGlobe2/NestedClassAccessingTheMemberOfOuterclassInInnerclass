class database implements Runnable {//what happend if we want the anoter class to extend this class multiple inheritace is not possible so use the interface

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
        Runnable db=new database();//we use runnable for creating the reference of database because of the runnable is the superclass
        user u1=new user();
        Thread t1 =new Thread(db);//after passing the db to thread it get to know where to start and what method we are calling 
        t1.start();//ater calling this method there was no relation between in the thread class to db
        //db.start(); after using runnable its not working  because they does not define anything in the runnable interface about the run method they use abstract method for run so we have to create the thread class in the main method
        u1.start();
        t1.join(); 
        //db.join();
        u1.join();//after using join the jvm cosider to complete the above thread
        System.out.println("last message");//but in the main method the thread start priniting this method at first because it consider the above both are programm of others and print this first if wee want to make it order use join
    }
}

class table{
    synchronized void multiply(int n){//sync is used to maintaine the flow of the one method used by multiple reference
        for(int i=1;i<=5;i++){ 
            System.out.println(i*n);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class add{
    void run(int n){
        for(int i=1;i<=5;i++){
            System.out.println(i+n);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class sync {
    public static void main (String [] args) throws InterruptedException{
        table t1 =new table();
        add a1=new add();
        //a1.run(2);
        Thread th1= new Thread(){
            public void run(){
                t1.multiply(5);
            }
        };
        Thread th2= new Thread(){
            public void run(){
                t1.multiply(10);
            }
        };
        th1.start();
        th2.start();
        th1.join();
        a1.run(2);
    }
}

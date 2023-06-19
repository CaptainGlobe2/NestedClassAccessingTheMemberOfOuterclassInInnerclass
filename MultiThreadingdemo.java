class database{

    public void display(){
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

class user{
    public void print(){
        for(int i=1;i<=5;i++){
            System.out.println("user "+i);
        }
    }
}

public class MultiThreadingdemo {
    public static void main(String [] args){
        database db=new database();
        user u1=new user();
        db.display();
        u1.print();
    }
}

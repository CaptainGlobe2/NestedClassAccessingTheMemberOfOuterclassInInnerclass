class database{
    public void display(){
        for(int i=0;i<5;i++){
            System.out.println("updating the db");
        }
    }
}

class user{
    public void print(){
        for(int i=0;i<5;i++){
            System.out.println("user "+i);
        }
    }
}

public class MultiThreadingdemo {
    public static void main(String [] args){
        database db=new database();
        user u1=new user();
    }
}

class ton{
    private static ton tonobj;

    private ton(){

    }
    public static ton getInstant(){
        if(tonobj==null){
            tonobj= new ton();
        }
        return tonobj;
    }
    public void message(){
        System.out.println("ton object is created");
    }
}

public class singleton {
    public static void main(String[] args){
        ton t1;
        t1=ton.getInstant();
        ton t2;
       // t1.getInstant();
        t2=ton.getInstant();
        t1.message();
        t2.message();
    }
}

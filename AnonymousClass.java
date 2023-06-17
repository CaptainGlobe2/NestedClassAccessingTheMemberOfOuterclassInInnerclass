class Sample{
    public void display(){
        System.out.println("this is the sample class");
    }

}

class AnonymousDemo{
   public void createClass(){
        Sample s1 =new Sample(){
            public void display(){
             System.out.println("it is anonymous class");
        }
    };
    s1.display();
   }
}

public class AnonymousClass {
    public static void main(String[]args){
        AnonymousDemo an= new AnonymousDemo();
        an.createClass();
    }
}

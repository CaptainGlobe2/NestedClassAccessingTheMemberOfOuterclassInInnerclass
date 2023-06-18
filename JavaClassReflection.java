import java.lang.reflect.Modifier;

class animal{

}
class dog extends animal{
    public void display(){
        System.out.println("this is dog");
    }
}


public class JavaClassReflection {
    public static void main (String[]args){
        try{
            dog d1 = new dog();//creation of object of dog class
            Class obj = d1.getClass();//creation of the object of Class
            String name = obj.getName();
            System.out.println("Name: "+name);
            int modifier = obj.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier :"+mod);
            Class supClass= obj.getSuperclass();
            System.out.println("superclass: "+supClass.getName());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
//the output of the program doesnot show the modifier becuase the class of dog is in the same class of main if you want a modifier public you have to make a seperate file of superclas and dog class of another file not in the main class file
//modifiers are int type consider by jvm so first i get modifer in modifier var and i changed using toString method 
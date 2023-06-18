enum SIZE{
    SMALL,MEDIUM,LARGE,EXTRALARGE
}

class test{
    SIZE pizzaSize;
    public test(SIZE pizzaSize){
        this.pizzaSize=pizzaSize;
    }
    public void orderPizza(){
        switch(pizzaSize){
            case SMALL:
            System.out.println("it's a small size pizza");
            break;
            case MEDIUM:
            System.out.println("it's a medium size pizza");
            break;
            default:
            System.out.println("pls select the given size");
        }
    }
}

public class Enum {
    public static void main (String[] args){
        test t1=new test(SIZE.MEDIUM);
        t1.orderPizza();
    }
}

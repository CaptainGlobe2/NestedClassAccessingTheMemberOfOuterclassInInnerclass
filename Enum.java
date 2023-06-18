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
//In Java, enum types are considered to be a special type of class.
//An enum class can include methods and fields just like regular classes.
//When we create an enum class, the compiler will create instances (objects) of each enum constants
// Also, all enum constant is always public static final by default.

/*
 * enum Size{
  SMALL, MEDIUM, LARGE, EXTRALARGE;

  public String getSize() {

    // this will refer to the object SMALL
    switch(this) {
      case SMALL:
        return "small";

      case MEDIUM:
        return "medium";

      case LARGE:
        return "large";

      case EXTRALARGE:
        return "extra large";

      default:
        return null;
      }
   }

  public static void main(String[] args) {

    // call getSize()
    // using the object SMALL
    System.out.println("The size of the pizza is " + Size.SMALL.getSize());
  }
}
 */
class Car{
    String carType;
    String carName;

    public Car(String name,String type){
        this.carName=name;
        this.carType=type;
    }

    private String getCarName(){
        return this.carName;
    }

    class Engine{// inner class
        String engineType;
        void setengine(){
            if(Car.this.carType.equals("4wd")){
                if(Car.this.getCarName().equals("crysler")){
                    this.engineType="smaller";
                }else{
                    this.engineType="bigger";
                }
                
            }else{
                this.engineType="bigger";
            }
        }
    }
}

public class NestedClassAccessingMembers {
    public static void main(String[] args){
        Car car = new Car("lambo", "8wd");//creating the object of the car
        Car.Engine engine = car.new Engine();//creating the object of the inner class
        engine.setengine();
        System.out.println("engine type for the car= "+engine.engineType+" name of the car "+car.carName);

        Car car1 = new Car("crysler", "4wd");
        Car.Engine engine1=car1.new Engine();
        engine1.setengine();
        System.out.println("engine type of the car= "+engine1.engineType+engine1.engineType+" name of the car "+car1.carName);
    }
}//static nested class can only access the class members and cannot access the other non static class or static class of the another member of the class
//only nested class can be static other we cannot have static at the top level class
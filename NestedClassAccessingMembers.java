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
        System.out.println("engine type for the car= "+engine.engineType);

        Car car1 = new Car("crysler", "4wd");
        Car.Engine engine1=car1.new Engine();
        engine1.setengine();
        System.out.println("engine type of the car= "+engine1.engineType);
    }
}

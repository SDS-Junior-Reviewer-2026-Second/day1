public class Car {
    void brake(){
        System.out.println("Brake!!!!!!!!!");
    }
    void move(){
        System.out.println("Car Move!");
    }
}
//
//class SuperCar extends Car{
//    @Override
//    void move(){
//        System.out.println("SuperCar Move!");
//    }
//}

class SportsCar extends Car{
    void move(){
        System.out.println("SuperCar Move!");
    }
}

class SUV extends Car{
    void move(){
        System.out.println("SuperCar Move!");
    }
}

class Sedan extends Car{
    void move(){
        System.out.println("SuperCar Move!");
    }
}

class TempCar extends Car{
    void move(){
        System.out.println("SuperCar Move!");
    }
}
public abstract class SuperCar {
    // 구조를 설명해주는 상위 분류 체계
    final static String PORSCHE = "Porsche";
    final static String FERRARI = "Ferrari";
    final static String AVANTEN = "AvanteN";
    String carName;
    public SuperCar(String carName) { this.carName = carName; }
    abstract void ride();
}

class 람보르기니 extends SuperCar{
    public 람보르기니(String carName) {
        super(carName);
    }

    @Override
    void ride(){
        System.out.println("다 추월해버림");
    }
}

class Porsche extends SuperCar{
    public Porsche(String carName) {
        super(carName);
    }

    @Override
    void ride() {
        System.out.println("포르르릉");
    }
}

class Ferrari extends SuperCar{
    public Ferrari(String carName) {
        super(carName);
    }

    @Override
    void ride() {
        System.out.println("쀄라~~~`");
    }
}

class AvanteN extends SuperCar{
    public AvanteN(String carName) {
        super(carName);
    }

    @Override
    void ride() {
        System.out.println("추천받습니다.");
    }
}

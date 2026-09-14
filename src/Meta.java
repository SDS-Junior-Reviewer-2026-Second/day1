public class Meta {
    void attack(){
        System.out.println("몸통 박치기!");
    }
}
class Pika extends Meta {
    @Override
    void attack(){
        System.out.println("100만볼트!");
    }
}
class Turtle extends Meta {
    @Override
    void attack(){
        System.out.println("물대포!!!!!");
    }
}
class Fire extends Meta {
    @Override
    void attack(){
        System.out.println("물대포!!!!!");
    }
}

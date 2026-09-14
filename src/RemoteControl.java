public interface RemoteControl {
    public void turnOn();
    public void turnOff();
}

interface Flyable{
    public void fly();

}

class TV implements RemoteControl{
    @Override
    public void turnOn() {

    }
    @Override
    public void turnOff() {

    }
}

class Drone implements RemoteControl, Flyable{
    @Override
    public void turnOn() {

    }
    @Override
    public void turnOff() {

    }

    @Override
    public void fly() {

    }
}
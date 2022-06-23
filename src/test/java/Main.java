public class Main{
    public static void main(String[] args) {
        Handler car = new Car(500);
        Handler bus = new Bus(300);
        Handler train = new Train(400);
        Handler plane = new Plane(1000);
        car.setNextHandler(bus);
        bus.setNextHandler(train);
        train.setNextHandler(plane);

        car.buy(500);

    }
}

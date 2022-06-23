public class Car extends Handler{
    private int value;

    public Car(int value) {
        this.value = value;
    }
    public void buy(int budget) {
        if (value <= budget) {
            System.out.println(this.getClass().getName());
        }
        nextHandler.buy(budget);
    }
}

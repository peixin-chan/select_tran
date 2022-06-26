public class Plane extends Handler{
    private final int value;

    public Plane(int value) {
        this.value = value;
    }

    public void buy(int budget) {
        if (value <= budget) {
            System.out.println(this.getClass().getName());
        }
    }
}

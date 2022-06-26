public class Train extends Handler{
    private final int value;

    public Train(int value) {
        this.value = value;
    }

    public void buy(int budget) {
        if (value <= budget) {
            System.out.println(this.getClass().getName());
        }
        nextHandler.buy(budget);
    }
}

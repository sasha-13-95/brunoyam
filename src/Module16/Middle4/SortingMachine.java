package Module16.Middle4;

public class SortingMachine {
    private Strategy strategy;

    public SortingMachine(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sorted(int[] array) {
        strategy.sorted(array);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}

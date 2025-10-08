package Strategy;

public class MyList {
    private SortStrategy strategy;

    public MyList() {
        this.strategy = new QuickSort();
    }

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        strategy.sort(this);
    }
}

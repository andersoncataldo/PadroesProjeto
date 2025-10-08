package Strategy;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.sort();

        SortStrategy sortStrategy = new ShellSort();
        list.setSortStrategy(sortStrategy);
        list.sort();

        sortStrategy = new HeapSort();
        list.setSortStrategy(sortStrategy);
        list.sort();
    }
}

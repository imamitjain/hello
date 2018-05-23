package behavioral.strategy;

/**
 * Created by amit.jain on 07/12/14.
 */
public class Main {

    public static void main(String args[]) {
        Context context1 = new Context(new QuickSort());
        context1.execute();

        Context context2 = new Context(new MergeSort());
        context2.execute();
    }
}

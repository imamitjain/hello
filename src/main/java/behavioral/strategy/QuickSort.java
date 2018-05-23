package behavioral.strategy;

/**
 * Created by amit.jain on 07/12/14.
 */
public class QuickSort implements Sort {

    @Override
    public void operation(Context context) {
        System.out.println("QuickSort: sort: I'm now sorted");
    }
}

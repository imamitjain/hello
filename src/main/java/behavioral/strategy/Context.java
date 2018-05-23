package behavioral.strategy;

/**
 * Created by amit.jain on 07/12/14.
 */

public class Context {

    public void execute() {
        sort.operation(this);
    }
    public Context(Sort sort) {
        this.sort = sort;
    }

    private Sort sort;


}

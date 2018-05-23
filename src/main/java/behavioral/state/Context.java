package behavioral.state;

/**
 * Created by amit.jain on 07/12/14.
 */
public class Context {

    public Context() {
        state = FirstState.getInstance();
    }

    public void start() {
        state.solveFirst(this);
    }

    public void stop() {
        state.solveSecond(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    private State state;
}

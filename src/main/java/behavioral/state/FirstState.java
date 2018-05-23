package behavioral.state;

/**
 * Created by amit.jain on 07/12/14.
 */
public class FirstState extends State {

    @Override
    public void solveFirst(Context context) {
        System.out.println("FirstState: solveFirst()");
        context.setState(SecondState.getInstance());
    }

    private static FirstState INSTANCE;

    public static FirstState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new FirstState();
        }
        return INSTANCE;
    }

    private FirstState() {}

}

package behavioral.state;

/**
 * Created by amit.jain on 07/12/14.
 */
public class SecondState extends State{

    @Override
    public void solveSecond(Context context) {
        System.out.println("SecondState: solveSecond()");
        context.setState(null);
    }

    private static SecondState INSTANCE;

    public static SecondState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SecondState();
        }
        return INSTANCE;
    }

    private SecondState() {}

}

package structural.decorator;

/**
 * Created by amit.jain on 19/02/15.
 */
public class Main {
    
    public static void main(String[] args) {
        Graphic graphic = new VaDecorator(new Panel());
        graphic.draw();
    }

}

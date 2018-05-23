package structural.proxy;

/**
 * Created by amit.jain on 05/02/15.
 */
public class Main {
    
    public static void main(String[] args) {
        Graphic graphic = new ImageProxy();
        graphic.draw();
    }
}

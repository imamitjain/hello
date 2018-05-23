package structural.decorator;

/**
 * Created by amit.jain on 19/02/15.
 */
public class Panel implements Graphic {
    
    @Override
    public void draw() {
        System.out.println("I'm Panel");
    }
}

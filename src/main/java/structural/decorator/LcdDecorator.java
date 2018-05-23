package structural.decorator;

/**
 * Created by amit.jain on 19/02/15.
 */
public class LcdDecorator extends ScreenDecorator {
    
    public LcdDecorator(Graphic component) {
        super(component);
    }
    
    @Override
    public void draw() {
        System.out.println("I'm LCD decorator");
        component.draw();
    }
}

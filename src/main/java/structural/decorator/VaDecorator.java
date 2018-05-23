package structural.decorator;

/**
 * Created by amit.jain on 19/02/15.
 */
public class VaDecorator extends ScreenDecorator {
    
    public VaDecorator(Graphic component) {
        super(component);
    }
    
    @Override
    public void draw() {
        System.out.println("I'm VA decorator");
        component.draw();
    }
}

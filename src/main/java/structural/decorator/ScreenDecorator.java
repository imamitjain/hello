package structural.decorator;

/**
 * Created by amit.jain on 19/02/15.
 */
public abstract class ScreenDecorator implements Graphic {
    
    public ScreenDecorator(Graphic component) {
        this.component = component;
    }
    
    @Override
    public void draw() {
        component.draw();
    }
    
    
    protected Graphic component;
}

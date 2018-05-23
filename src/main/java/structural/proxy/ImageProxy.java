package structural.proxy;

/**
 * Created by amit.jain on 05/02/15.
 */
public class ImageProxy implements Graphic {
    
    private Image image;
    
    @Override
    public void draw() {
        if(image == null) {
            image = new Image();
        }
        image.draw();
    }
}

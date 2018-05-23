package structural.proxy;

/**
 * Created by amit.jain on 05/02/15.
 */
public class Image implements Graphic {

    @Override
    public void draw() {
        System.out.println("Let's draw the image dude!");
    }
}

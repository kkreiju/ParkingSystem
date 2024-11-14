package Data;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ResourcesRendering {
    ImageIcon car = new ImageIcon(System.getProperty("user.dir") + "/resources/car.png");
    public Image carImage = car.getImage();
    
    ImageIcon motorcycle = new ImageIcon(System.getProperty("user.dir") + "/resources/motorcycle.png");
    public Image motorcycleImage = motorcycle.getImage();
}

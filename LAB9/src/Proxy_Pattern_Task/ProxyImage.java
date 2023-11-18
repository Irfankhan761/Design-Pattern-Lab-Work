package Proxy_Pattern_Task;

/**
 *
 * @author TECHNIFI 1
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String imageType;
    private String supportedTypes;
    private String fileName;

    public ProxyImage(String fileName, String imageType){
        this.fileName = fileName;
        this.imageType = imageType;
        supportedTypes = "png,svg";
    }

    @Override
    public void display(String imageType) {
        if(supportedTypes.contains(imageType)){
            realImage = new RealImage(fileName);
            realImage.display(imageType);
        }
        else{
            System.out.println("Displaying fake version of "+imageType);
        }
    }
}

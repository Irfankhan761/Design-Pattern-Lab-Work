package Proxy_Pattern_Task;

/**
 *
 * @author Irfan Khan
 */
// If source of files is correct then load them otherwise provide fake display
public class RemoteProxyImage implements Image{
    private String remoteSource;
    public RemoteProxyImage(String rSource){
        this.remoteSource = rSource;
    }
    @Override
    public void display(String rSource) {
        if(remoteSource.equals(rSource)){
            new RemoteImage().display(rSource);
        }
        else{
            System.out.println("Loaing image from fake source of type "+ rSource);
        }
    }
}
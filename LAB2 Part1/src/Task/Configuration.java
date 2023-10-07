
package Task;
/**
 *
 * @author Irfan Khan
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

//To make the given example of SingeltonFA20Homework thread-safe, we can synchronize the getInstance() method. 
//This will ensure that only one thread can access the instance of the Configuration class at a time.
//Here is a modified version of the Configuration class with the getInstance() method synchronized:

public class Configuration {
    private static Configuration instance;
    private HashMap<String,String> config = new HashMap<String,String>();

    private Configuration(){
        try {
            File file = new File("config.properties");
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
            fileInput.close();

            Enumeration<Object> enuKeys = properties.keys();

            while (enuKeys.hasMoreElements()) {
                String key = (String) enuKeys.nextElement();
                String value = properties.getProperty(key);
                config.put(key,value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key){
        String value = null;
        if(config.containsKey(key)){
            value = config.get(key);
        }
        return value;
    }

    public synchronized static Configuration getInstance(){
        if(instance == null)
            instance = new Configuration();
        return instance;
    }
}

//With this modification, the Configuration class is now thread-safe. This means that multiple threads can safely access the instance of the class without any problems.

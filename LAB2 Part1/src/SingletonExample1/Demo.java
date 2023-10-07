
package SingletonExample1;
/**
 *
 * @author Irfan Khan
 */
public class Demo {
    public static void main(String[] args) {
        Connection c = Connection.getInstance();
        
          
           
        c.getData();
     
        
    }
    
}

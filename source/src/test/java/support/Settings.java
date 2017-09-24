package support;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Sang Nguyen on 7/7/2017.
 */
public class Settings {
    private static final String propFile = "./src/test/java/data/config.properties";
    private static InputStream input = null;

    public static String getParam(String param) {
        Properties prop = new Properties();
        try {
            input = new FileInputStream(propFile);
            // load a properties file
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(input!=null){
                try {
                    input.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return prop.getProperty(param);
    }
}

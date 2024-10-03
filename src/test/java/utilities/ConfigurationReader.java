package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFile;// declaring the configFile
    private static Properties properties = new Properties();

    // static block gets loaded first thing in the memory
    static {
        System.out.println("static is executed ");
        String path = "src/test/resources/configuration.properties";
        try {
            //loading the file
            FileInputStream fileInputStream = new FileInputStream(path);
            configFile = new Properties(); //we are instantiating the configFile object
            //configFile.load(fileInputStream);
            properties.load(fileInputStream);
            fileInputStream.close(); //close the stream
             } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }


    /**
     * This method will return the value of the key that was passed as a parameter
     * from the property file
      * @param key: from property file
     * @return
     */

    //create method to read this property
    public static String getPropertyValue(String key) {
        //return configFile.getProperty(key);
        return properties.getProperty(key);
    }

    }


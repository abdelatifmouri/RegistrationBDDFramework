package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        // filePath- the directory of your properties file

        String filePath = "src/test/resources/configurations.properties";

        // FileInputStream -  a class that enables you to read property files
        FileInputStream input = null;

        try {
            input = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            System.out.println("File not found");
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static String getPropertiesValue(String key) {
        return properties.getProperty(key);
    }

}

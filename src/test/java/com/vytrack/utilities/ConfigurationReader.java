package com.vytrack.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {//single responsability of this class is to read: "configuration.properties"

    private static Properties properties;

    static {

        try{//what file to read
            String path="configuration.properties";
            //read the file into java, finds the file usingthe string path
            FileInputStream input = new FileInputStream(path);
            //properties -> class that store properties in key /value format
            properties = new Properties();
            //the values from the file input is loaded / fed into the properties object
            properties.load(input);
            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
    //method that accepts the key from  configuration.properties
    public static String get(String keyName) {
        return properties.getProperty(keyName);
    }
}

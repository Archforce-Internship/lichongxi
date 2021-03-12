package myclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties pros=new Properties();
        FileInputStream fis=new FileInputStream("jdbc.properties");
        pros.load(fis);
        String name = pros.getProperty("name");
        String age = pros.getProperty("age");
        System.out.println("name="+name+"age="+age);
    }
}


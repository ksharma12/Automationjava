package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;


public class ConfigFileReader {

    public String getReportConfigPath() throws IOException {
        Properties prop = new Properties();
        prop.load(Files.newInputStream(Paths.get("Configuration.properties")));
        return prop.getProperty("reportConfigPath");
    }

    public static void main(String[] args) throws IOException {
        ConfigFileReader obj = new ConfigFileReader();
        System.out.println(obj.getReportConfigPath());
    }
}

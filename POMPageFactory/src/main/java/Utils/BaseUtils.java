package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class BaseUtils {
	
	public static String  getConfigValue(String key) throws IOException {
		Properties property = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config.properties");
		property.load(file);
		
	return property.getProperty(key);

}
	public static String getScreenShotPath(WebDriver driver, String pageName) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/target/image_" +pageName+ ".png";
		FileUtils.copyFile(source, new File(path));
		return path;
		
	}
	
}
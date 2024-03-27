package com.demowebshop.qa.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.demowebshop.qa.HomePage.HomePage;

public class ScreenshotUtility extends HomePage {

	public static String takesScreenshot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/opera.png");
		 
		 FileUtils.copyFile(srcFile, destFile);
		 
		 String targetpath = destFile.getAbsolutePath();
		 return targetpath;
	}
}

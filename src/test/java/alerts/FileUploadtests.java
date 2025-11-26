package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadtests extends BaseTests {
@Test
public void testFileUpload(){
    var uploadPage = homePage.clickFileUpload();
    uploadPage.uploadFile("C:\\Users\\DIVINE\\Desktop\\qa\\webdriver_java\\webdriver_java\\resources\\chromedriver.exe");
    assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe","Uploaded");
}
}

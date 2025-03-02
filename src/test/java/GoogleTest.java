import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

@Test
  public void testUrl()
  {
    WebDriver driver=new ChromeDriver();
// test
    driver.get("https://www.google.com");
    Assert.assertEquals("https://www.google.com/",driver.getCurrentUrl());
  }
}

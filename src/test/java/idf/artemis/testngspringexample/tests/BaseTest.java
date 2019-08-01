package idf.artemis.testngspringexample.tests;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import idf.artemis.testngspringexample.config.SpringConfig;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

@ContextConfiguration(classes = SpringConfig.class)
public abstract class BaseTest extends AbstractTestNGSpringContextTests {

  @Autowired
  private WebDriver webDrive;

  @BeforeMethod
  public void setUp() {
    webDrive.get("https://testng.org/doc/");
  }
}

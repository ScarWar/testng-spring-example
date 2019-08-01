package idf.artemis.testngspringexample.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasePage {

  @Autowired
  WebDriver webDriver;

  @Autowired
  FluentWait<WebDriver> fluentWait;
}

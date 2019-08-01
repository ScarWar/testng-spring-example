package idf.artemis.testngspringexample.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DocumentationPage extends BasePage {

  @Autowired
  private FluentWait<WebDriver> fluentWait;

  public int getTextContentLength() {
    return fluentWait.until(DocumentationPage::apply)
        .getText()
        .length();
  }

  private static WebElement apply(WebDriver driver) {
    return driver.findElement(By.id("table-of-contents"));
  }
}

package idf.artemis.testngspringexample.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class DocumentationPage extends BasePage {

  private static WebElement getTableOfContent(WebDriver driver) {
    return driver.findElement(By.id("table-of-contents"));
  }

  public int getTextContentLength() {
    return fluentWait.until(DocumentationPage::getTableOfContent)
        .getText()
        .length();
  }
}

package idf.artemis.testngspringexample.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage {

  @Autowired
  private DocumentationPage documentationPage;

  @Autowired
  private FluentWait<WebDriver> fluentWait;

  private static WebElement getDocumentationLink(WebDriver driver) {
    return driver.findElement(By.partialLinkText("Documentation"));
  }

  public DocumentationPage goToDocumentationPage() {
    fluentWait.until(HomePage::getDocumentationLink)
        .click();
    return documentationPage;
  }

}

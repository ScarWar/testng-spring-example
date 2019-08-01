package idf.artemis.testngspringexample.tests;

import idf.artemis.testngspringexample.config.SpringConfig;
import idf.artemis.testngspringexample.page.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@ContextConfiguration(classes = SpringConfig.class)
public class DocumentationPageTest extends BaseTest {

  @Autowired
  private HomePage homePage;

  @Test
  public void checkContentLengthOfTable() {
    int textContentLength = homePage.goToDocumentationPage()
        .getTextContentLength();
    assertEquals(textContentLength, 1539);
  }

}

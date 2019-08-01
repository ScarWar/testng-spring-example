package idf.artemis.testngspringexample.config;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class WebDriverConfig {
  @Bean
  public WebDriver webDrive() {
    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--headless");
    chromeOptions.addArguments("--no-sandbox");
    chromeOptions.addArguments("--disable-infobar");
    chromeOptions.setHeadless(false);
    return new ChromeDriver(chromeOptions);
  }

  @Bean
  public FluentWait<WebDriver> fluentWait(WebDriver webDriver) {
    return new FluentWait<>(webDriver)
        .withTimeout(Duration.ofSeconds(2))
        .pollingEvery(Duration.ofMillis(250))
        .ignoring(NoSuchElementException.class);
  }
}

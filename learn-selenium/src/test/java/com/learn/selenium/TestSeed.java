package com.learn.selenium;

import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestSeed {

  private static final Logger LOGGER = Logger.getLogger(TestSeed.class.getName());
  private WebDriver webDriver;
  private static final String FOLDER_PATH = "/Users/vchidamb/Softwares/pet_projects/learn-selenium/learn-selenium/src/main/resources/testpages/";
  private static final String FILE_PATH = "mytestfile.html";
  private static final String FILE = "file://" + FOLDER_PATH + FILE_PATH;

  @BeforeEach
  void setUp() {
    this.webDriver = new ChromeDriver();
    webDriver.get(FILE);
  }


  @AfterEach
  void tearDown() {
    webDriver.close();
    webDriver.quit();
  }

}

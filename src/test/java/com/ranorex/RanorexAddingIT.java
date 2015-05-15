package com.ranorex;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 18.04.15.
 */
public class RanorexAddingIT {

   /* @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Examples\\ranorex\\drivers\\chromedriver.exe");
        System.setProperty("browserName","CHROME");

    }*/
    @Test
    public void addPersonToRanorexDataBase(){
         System.setProperty("webdriver.chrome.driver","C:\\Examples\\ranorex\\drivers\\chromedriver.exe");
         System.setProperty("browserName","Chrome");
         //WebDriver webDriver = new FirefoxDriver();
         WebDriver webDriver = BrowserFactory.createDriver();
         RanorexMainPage page = PageFactory.initElements(webDriver,RanorexMainPage.class);
         page.open();
         page.addPeople("Anna", "Pedko");
         page.addPeople("An", "Ped");
         page.addPeople("A","Pe");
         page.deletePeople(3);



    }






}

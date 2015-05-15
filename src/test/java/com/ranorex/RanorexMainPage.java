package com.ranorex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by User on 18.04.15.
 */
public class RanorexMainPage {
    DataTable t;
    @FindBy (id="FirstName")
    WebElement firstName;

    @FindBy (id="LastName")
    WebElement lastName;

    @FindBy (css="value=\"female\"")
    WebElement radioButtonFemale;

    @FindBy (css="value=\"male\"")
    WebElement radioButtonMale;

    @FindBy (id="Category")
    WebElement selectCategory;

    @FindBy (id="Add")
    WebElement buttonAdd;

    @FindBy(id="Delete")
    WebElement buttonDelete;

    @FindBy(id="Load")
    WebElement buttonLoad;

    @FindBy(id="Save")
    WebElement buttonSave;

    @FindBy(id="Clear")
    WebElement buttonClear;
    @FindBy (id="VIPs")
    WebElement tablePeoples;


    private WebDriver driver;

public RanorexMainPage(WebDriver driver){
    this.driver = driver;
    initPage();}

    public void initPage(){
     t= new DataTable(tablePeoples);
        //t.selectRaw(4);
    }


 public void open(){driver.get("http://www.ranorex.com/web-testing-examples/vip/");
  }

 public void addPeople(String nameFirst, String nameLast){
     firstName.sendKeys(nameFirst);
     lastName.sendKeys(nameLast);
     buttonAdd.click();

 }

public void deletePeople(int raw){
    t.selectRaw(raw);
    buttonDelete.click();

}






}





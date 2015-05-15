package com.ranorex;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by anna on 13.05.2015.
 */
public class DataTable {
   private WebElement webElement;
   public static final String RAW_PATH="//tbody/tr";

     public DataTable (WebElement webElement) {
     this.webElement=webElement;
    }

    public void selectRaw(int raw){
    System.out.print(webElement);
    webElement.findElement(By.xpath(RAW_PATH + "[" + raw + "]/td[1]"));
    }

   /* public int getSize(){
     return webElement.f
    }*/

 /*public class Cell{
     private int raw;
     private int col;

     public Cell(int raw, int col) {
         this.raw = raw;
         this.col = col;
     }
 }

    public Cell getCell(int raw,int col){
        return new Cell(raw, col);

    }*/

}
